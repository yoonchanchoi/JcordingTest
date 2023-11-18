package com.example.jcordingtest.단계2.짝지어제거하기;

import java.util.Stack;

public class Solution27 {
    public int solution(String s)
    {
        char[] c = s.toCharArray();
        Stack<Character> charStack = new Stack<>();

        for(int i =0; i<c.length;i++){
            char tempChar = c[i];

            if(charStack.empty()){
                charStack.push(tempChar);
            }else{
                if(charStack.peek()==tempChar){
                    charStack.pop();
                }else{
                    charStack.push(tempChar);
                }
            }

        }

        return charStack.empty() ? 1:0;

    }
}
