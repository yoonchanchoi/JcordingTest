package com.example.jcordingtest.단계1.짝수와활수;

public class Solution18 {
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer="Even";
        }else{
            answer="Odd";
        }
        return answer;
    }
}
