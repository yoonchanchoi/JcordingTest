package com.example.jcordingtest.완전탐색;

import java.util.ArrayList;

public class Solution4 {
    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}

//dfs
//class Solution {
//    public static boolean check[];
//    public static int ans = 0;
//
//    public int solution(int k, int[][] dungeons) {
//        check = new boolean[dungeons.length];
//
//        dfs(k, dungeons, 0);
//
//        return ans;
//    }
//    public static void dfs(int tired, int[][] dungeons, int cnt){
//        for(int i=0; i<dungeons.length; i++){
//            if(!check[i] && dungeons[i][0]<=tired){
//                check[i] = true;
//                dfs(tired-dungeons[i][1], dungeons, cnt+1);
//                check[i] = false;
//            }
//        }
//        ans = Math.max(ans, cnt);
//    }
//}
