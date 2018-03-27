package leetcode.questions;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<String> operatorStack = new Stack();
        for(String charactor: s.split("")) {
            if(charactor.equals("(")) {
                operatorStack.push(charactor);
            } else if (charactor.equals(")")) {
                if (operatorStack.size() != 0) {
                    operatorStack.pop();
                } else {
                    return false;
                }
            }
        }
        return operatorStack.size() == 0;
    }
}
