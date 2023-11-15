package com.example.jcordingtest.단계2.올바른괄호;

import java.util.Stack;

public class Solution22 {


    //완전탐색 풀이법 난 개인적으로 이것을 먼저 생각햇음.
    boolean solution(String s) {
        boolean answer = true;
        int start =0;
        int end = 0;

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                start++;
            }else if (s.charAt(i)==')'){
                end++;
            }
            if(start<end){
                return false;
            }
        }
        if(start==end){
            return true;
        }

        return false;
    }

    //스택을 이용한 풀이법
    //스택에 해당 괄호값을 저장해놓고 해당 닫는 괄호가 나오면 열리는 괄호를 pop하여 stack을 비운다.
    //결과적으로 괄호가 완성되었을때 ("()"이런 경우 짝꿍이 이루어진경우) stack에서 빠지게 되므로
    //괄호가 완성되려면 결과 stack의 값이 비어있어야된다. 이것을 가지고 판별.
    boolean solution2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
