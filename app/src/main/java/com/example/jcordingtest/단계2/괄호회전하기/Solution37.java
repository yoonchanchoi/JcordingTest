package com.example.jcordingtest.단계2.괄호회전하기;


import java.util.*;

public class Solution37 {
    public int solution(String s) {
        int answer = 0;
//        Stack<Character> stack = new Stack<>();

        for(int j=0; j<s.length();j++){
            char lastChar = s.charAt(s.length()-1);
            StringBuilder sb = new StringBuilder(s.substring(0,s.length()-1));
            sb.insert(0,lastChar);
            s=sb.toString();
            answer+=check(s);
        }
        return answer;
    }
    public int check(String s){
        int count =0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length();i++){
            if(stack.empty()){
                stack.push(s.charAt(i));
            }else{
                switch (stack.peek()){
                    case '[':
                        if(s.charAt(i)==']'){
                            stack.pop();
                        }else{
                            stack.push(s.charAt(i));
                        }
                        break;
                    case '{':
                        if(s.charAt(i)=='}'){
                            stack.pop();
                        }else{
                            stack.push(s.charAt(i));
                        }
                        break;
                    case '(':
                        if(s.charAt(i)==')'){
                            stack.pop();
                        }else{
                            stack.push(s.charAt(i));
                        }
                        break;
                    default:
                        stack.push(s.charAt(i));
                }
            }
        }
        if(stack.empty()){
            count++;
        }
        return count;
    }
}
