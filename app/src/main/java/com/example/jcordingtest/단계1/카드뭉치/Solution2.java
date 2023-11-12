package com.example.jcordingtest.단계1.카드뭉치;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int card1Index = 0;
        int card2Index = 0;

        for (int i = 0; i < goal.length; i++) {
            if(card1Index < cards1.length && goal[i].equals(cards1[card1Index])) {
                card1Index++;
                continue;
            }

            if(card2Index < cards2.length && goal[i].equals(cards2[card2Index])) {
                card2Index++;
                continue;
            }

            answer = "No";
            return answer;
        }

        return answer;
    }

    //fail
//    public String solution(String[] cards1, String[] cards2, String[] goal) {
//        String answer = "";
//        Boolean check = true;
//
//        ArrayList<Integer> cardIndex1 = new ArrayList<Integer>();
//        ArrayList<Integer> cardIndex2 = new ArrayList<Integer>();
//
//        ArrayList<String> cards1ArrayList = new ArrayList<>(Arrays.asList(cards1));
//        ArrayList<String> cards2ArrayList = new ArrayList<>(Arrays.asList(cards2));
//
//
//        for(int i=0; i<goal.length; i++){
//            if(cards1ArrayList.contains(goal[i])){
//                cardIndex1.add(cards1ArrayList.indexOf(goal[i]));
//            }else if(cards2ArrayList.contains(goal[i])){
//                cardIndex2.add(cards2ArrayList.indexOf(goal[i]));
//            }
//        }
//
//        for(int i=0; i<cardIndex1.size(); i++){
//            if()
//        }
//        for(int i=0; i<cardIndex2.size(); i++){
//
//        }
//
//
//
//        return answer;
//    }
}
