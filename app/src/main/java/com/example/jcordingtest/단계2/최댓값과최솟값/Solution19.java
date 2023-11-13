package com.example.jcordingtest.단계2.최댓값과최솟값;

public class Solution19 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        int maxInt = Integer.MIN_VALUE;
        int minInt = Integer.MAX_VALUE;

        for(int i = 0; i<str.length; i++){
            if(maxInt<=Integer.parseInt(str[i])){
                maxInt=Integer.parseInt(str[i]);
            }
            if(minInt>=Integer.parseInt(str[i])){
                minInt=Integer.parseInt(str[i]);
            }
        }

        answer = minInt + " " + maxInt;


        return answer;
    }
}
