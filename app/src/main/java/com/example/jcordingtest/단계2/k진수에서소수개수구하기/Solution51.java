package com.example.jcordingtest.단계2.k진수에서소수개수구하기;

import java.util.*;

public class Solution51 {
    public int solution(int n, int k) {
        int answer = 0;
        String binary = Integer.toString(n, k); // n을 k 진법으로 변환
        List<String> nums = new ArrayList<>(List.of(binary.split("0")));

        for (String str : nums) {
            // 공백이 있으면 다음 인덱스로 넘어간다.
            if (str.equals("")) {
                continue;
            }
            long checkNum = Long.parseLong(str);
            if (checkDecimal(checkNum)) {
                answer++;
            }
        }

        return answer;
    }


    public boolean checkDecimal(long checkNum){
        // 1은 소수가 아니다.
        if (checkNum == 1) {
            return false;
        }

        // 에라토스테네스의 체
        for (int i = 2; i <= Math.sqrt(checkNum); i++) {
            if (checkNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
