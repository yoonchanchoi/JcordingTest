package com.example.jcordingtest.단계2.영어끝말잇기;

import java.util.ArrayList;

public class Solution29 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        boolean check = true;

//        ArrayList<String> userStr = new ArrayList<>();
        ArrayList<String> wordstr = new ArrayList<>();

        for(int i =0; i<words.length; i++){
            if(wordstr.contains(words[i])){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                check = false;
                break;
            }else if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                check = false;
                break;
            }else{
                wordstr.add(words[i]);
            }
        }
        if(check){
            answer[0]= 0;
            answer[1]= 0;
        }
        return answer;
    }
}
