package searchInRotatedSortedArray;

/**
 * Created with IntelliJ IDEA.
 * User: shaojie
 * Date: 14-3-18
 * Time: 下午10:36
 * To change this template use File | Settings | File Templates.
 * <p/>
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * <p/>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p/>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p/>
 * You may assume no duplicate exists in the array.
 */
public class Solution {
    public int search(int[] A, int target) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
