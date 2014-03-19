package reverseWordsInaString;

/**
 * Created with IntelliJ IDEA.
 * User: shaojie
 * Date: 14-3-19
 * Time: 下午7:23
 * To change this template use File | Settings | File Templates.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords(" 1"));
    }

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] array = s.split(" ");
        System.out.println("length->" + array.length);
        if (array.length == 0 || array.length == 1) {
            return s.trim();
        }
        for (int i = array.length; i > 0; i--) {
            if (!array[i - 1].equals("")) {
                sb.append(array[i - 1]);
                sb.append(" ");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }
}
