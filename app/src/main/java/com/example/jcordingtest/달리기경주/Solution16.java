package com.example.jcordingtest.달리기경주;

import java.util.*;


public class Solution16 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        HashMap<String, Integer> mapPlayer = new HashMap<>();
        HashMap<Integer, String> mapRank = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            mapPlayer.put(players[i], i + 1);
            mapRank.put(i + 1, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            int tempRank = mapPlayer.get(callings[i]);
            String tempPlayer = callings[i];

            String fontPlayer = mapRank.get(tempRank-1);

            mapPlayer.put(tempPlayer, tempRank-1);
            mapPlayer.put(fontPlayer, tempRank);

            mapRank.put(tempRank-1,tempPlayer);
            mapRank.put(tempRank,fontPlayer);
        }
        for(int i=0; i<answer.length;i++){
            answer[i]=mapRank.get(i+1);

        }


        return answer;
    }
//    public String[] solution(String[] players, String[] callings) {
//        String[] answer = new String[players.length];
//
//        HashMap<String, Integer> mappedByPlayer = new HashMap<>();
//        HashMap<Integer, String> mappedByRank = new HashMap<>();
//
//        // 각각의 맵을 초기화
//        for (int i = 0; i < players.length; i++) {
//            mappedByPlayer.put(players[i], i);
//            mappedByRank.put(i, players[i]);
//        }
//
//        for (int i = 0; i < callings.length; i++) {
//
//            // 추월한 유저 순위
//            // 추월한 유저 이름
//            int currentRank = mappedByPlayer.get(callings[i]);
//            String player = mappedByRank.get(currentRank);
//
//            // 바로 앞 플레이어
//            String frontPlayer = mappedByRank.get(currentRank - 1);
//
//            // swap
//            mappedByPlayer.put(player, currentRank - 1);
//            mappedByPlayer.put(frontPlayer, currentRank);
//
//            mappedByRank.put(currentRank - 1, player);
//            mappedByRank.put(currentRank, frontPlayer);
//        }
//
//        for (int i = 0; i < players.length; i++) {
//            answer[i] = mappedByRank.get(i);
//        }
//
//        return answer;
//    }
}
