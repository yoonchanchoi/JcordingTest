package com.example.jcordingtest.단계2.이진변환반복하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution23 {
    public int[] solution(String s) {
        int[] answer = new int[2];
//        ArrayList<String> arrayStr = new ArrayList<>(Arrays.asList(s));
//        for(int i=0; i<arrayStr.size();i++){
//
//        }
        int binaryCnt =0;
        int removeZero=0;

        while (!Objects.equals(s, "1")){
            int cnt=0;
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)!='0'){
                    cnt++;
                }else if (s.charAt(i)=='0'){
                    removeZero++;
                }
            }
            s=Integer.toBinaryString(cnt);
            binaryCnt++;
        }


        answer[0]=binaryCnt;
        answer[1]=removeZero;
        return answer;
    }
}
