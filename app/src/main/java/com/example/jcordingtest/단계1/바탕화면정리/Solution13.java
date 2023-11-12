package com.example.jcordingtest.단계1.바탕화면정리;

public class Solution13 {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int minRow, minCol;
        int maxRow, maxCol;

        minRow = minCol = Integer.MAX_VALUE;
        maxRow = maxCol = Integer.MIN_VALUE;
        for(int r =0; r<wallpaper.length;r++){
            for(int c =0; c<wallpaper[r].length();c++){
                if (wallpaper[r].charAt(c) == '#') {
                    minRow = Math.min(minRow, r);
                    minCol = Math.min(minCol, c);
                    maxRow = Math.max(maxRow, r);
                    maxCol = Math.max(maxCol, c);
                }
            }
        }


        //max 값에 + 1을 하는 이유는 드래그를 하려면 끝점을 선택해야 함
        return new int[] {minRow, minCol, maxRow + 1, maxCol + 1};
    }
}
