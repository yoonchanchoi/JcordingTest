package com.example.jcordingtest.단계1.둘만의암호;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution10 {

    //정답 풀이
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //해당 증가값을 반복문으로 처리해서 증가값을 조절함...;
            for (int j = 0; j < index; j++) {
                c += 1;
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            answer += c;
        }

        return answer;
    }

    //내가푼 틀린답
    public String solution2(String s, String skip, int index) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        ArrayList<String> arrayListAlphabet = new ArrayList<>(Stream.of(alphabet).collect(Collectors.toList()));

        String answer = "";


        for(int i =0; i<s.length();i++){
            int strIndex = arrayListAlphabet.indexOf(String.valueOf(s.charAt(i)));
            int changeIndex=strIndex+index;

            for(int j =0; j<skip.length();j++){
                int skipIndex = arrayListAlphabet.indexOf(String.valueOf(skip.charAt(j)));
                if(strIndex<=skipIndex && changeIndex>=skipIndex){
                    changeIndex++;
                }

            }
            if(changeIndex>arrayListAlphabet.size()-1){
                changeIndex-=arrayListAlphabet.size();
            }
            answer+=arrayListAlphabet.get(changeIndex);
        }

        return answer;
    }
}
