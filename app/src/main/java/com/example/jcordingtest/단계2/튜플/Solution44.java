package com.example.jcordingtest.단계2.튜플;

import java.util.*;
import java.util.stream.Stream;

public class Solution44 {
    public static int[] solution(String s) {
        s = s.replaceAll("\\{", "");
        String[] sArr = s.substring(0, s.length() - 2).split("\\}\\,");
        Arrays.sort(sArr, Comparator.comparingInt(String::length));

        HashSet<Integer> duplicate = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < sArr.length; i++) {
            int[] tuple = Stream.of(sArr[i].split(",")).mapToInt(Integer::parseInt).toArray();
            for (int num : tuple) {
                if (!duplicate.contains(num)) {
                    result.add(num);
                }
                duplicate.add(num);
            }
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
