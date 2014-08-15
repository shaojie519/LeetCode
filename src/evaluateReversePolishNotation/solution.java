package evaluateReversePolishNotation;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: shaojie
 * Date: 14-3-19
 * Time: 下午10:58
 * To change this template use File | Settings | File Templates.
 */
public class Solution {

    public static void main(String[] args) {
        //System.out.println(new Solution().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(new Solution().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stackData = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (!isOperator(tokens[i])) {
                stackData.push(Integer.valueOf(tokens[i]));
            } else {
                int secondVal = stackData.pop();
                int firstVal = stackData.pop();
                int result = calculator(firstVal, secondVal, tokens[i]);
                stackData.push(result);
            }
        }
        return stackData.pop();
    }

    public int calculator(int firstVal, int secondVal, String operation) {
        int result = 0;
        switch (operation.charAt(0)) {
            case '+':
                result = firstVal + secondVal;
                break;
            case '-':
                result = firstVal - secondVal;
                break;
            case '*':
                result = firstVal * secondVal;
                break;
            case '/':
                result = firstVal / secondVal;
                break;
        }
        return result;
    }

    public boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
