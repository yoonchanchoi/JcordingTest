package com.example.jcordingtest.단계2.다음큰숫자;

public class Solution25 {
    public int solution(int n) {
        int answer = 0;
        int temp=n;
        boolean check =true;

        while (check){
            int beforeCnt=0;
            int afterCnt=0;

            String before = Integer.toBinaryString(n);
            for(int i=0; i<before.length();i++){
                if(before.charAt(i)=='1'){
                    beforeCnt++;
                }
            }

            temp++;
            String after = Integer.toBinaryString(temp);
            for(int i=0; i<after.length();i++){
                if(after.charAt(i)=='1'){
                    afterCnt++;
                }
            }

            if(beforeCnt==afterCnt){
                check=false;
                answer=temp;
            }
        }

        return answer;
    }
}
