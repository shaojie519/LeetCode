package insertionSortList;

/**
 * Created by shaojie on 14-3-27.
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode sortedList = null;
        while (head != null) {
            ListNode current = head;
            head = current.next;
            ListNode temp;
            ListNode previous = null;
            for (temp = sortedList; temp != null; temp = temp.next) {
                if (current.val < temp.val) {
                    break;
                }
                previous = temp;
            }

            if (previous == null) {
                current.next = sortedList;
                sortedList = current;
            } else {
                current.next = previous.next;
                previous.next = current;
            }
        }
        return sortedList;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
