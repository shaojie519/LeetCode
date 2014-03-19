package SortList;

/**
 * Created with IntelliJ IDEA.
 * User: shaojie
 * Date: 14-3-18
 * Time: 下午10:39
 * To change this template use File | Settings | File Templates.
 *
 * Sort a linked list in O(n log n) time using constant space complexity.
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode a = head;
        ListNode b = head.next;
        while ((b != null) && (b.next != null)) {
            head = head.next;
            b = (b.next).next;
        }
        b = head.next;
        head.next = null;
        return merge(sortList(a), sortList(b));
    }

    public ListNode merge(ListNode a, ListNode b) {
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        ListNode c = head;
        while ((a != null) && (b != null)) {
            if (a.val <= b.val) {
                c.next = a;
                c = a;
                a = a.next;
            } else {
                c.next = b;
                c = b;
                b = b.next;
            }
        }
        c.next = (a == null) ? b : a;
        return head.next;
    }


    // second
    public ListNode merge_sort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = getMiddle(head);
        ListNode sHalf = middle.next;
        middle.next = null;
        return merge(merge_sort(head), merge_sort(sHalf));
    }

    public ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow, fast;
        slow = fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}
