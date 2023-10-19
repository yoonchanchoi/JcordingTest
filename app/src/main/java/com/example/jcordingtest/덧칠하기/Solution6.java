package com.example.jcordingtest.덧칠하기;

public class Solution6 {
    public int solution(int n, int m, int[] section) {
        //그리다 알고리즘 활용
        //각각의 칸수에 해당 처음부터 칠해야되는 길이 안에 해당 칸이 있는지 없는지 확인하고 있으면 넘어가고 없으면 다음 칸을 기준으로 다시 재서 구한다.
        int answer = 0;

        int start = section[0];
        answer++;

        for (int item : section) {
            if (start + m > item) {
                continue;
            }

            start = item;
            answer++;
        }

        return answer;
    }


//    public int solution2(int n, int m, int[] section) {
//        int start = section[0];   2
//        int end = section[0] + (m-1);  5
//        int ans = 1;
//
//        for(int i : section){
//            if(i>=start && i<=end)
//                continue;
//            else{
//                start = i;
//                end = i + (m-1);
//                ans++;
//            }
//
//        }
//        return ans;
//    }
}
