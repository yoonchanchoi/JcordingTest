package com.example.jcordingtest.단계1.신고결과받기;


import java.util.*;

public class Solution17 {


    //이해가 잘되지않음..;;

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        //id_list의 이름을 name 변수에 저장하여 map과 idxMap에 저장
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }

        //report 배열의 인덱스를 split으로 쪼개고, map의 신고당한 유저(to)에 선언된
        //Set에 신고한 유저(from) 추가
        for (String s : report) {
            String[] str = s.split(" ");	//"muzi frodo"
            String from = str[0];			//str[0] = "muzi"
            String to = str[1];				//str[1] = "frodo"
            map.get(to).add(from);
        }

        //map에서 id_list 배열의 값을 키로 하여 값을 가져와
        //send Set에 담아주고, 2회 이상 등록된 유저의 인덱스를
        //idxMap에서 가져와 answer 배열의 값을 +!
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }



    public int[] solution2(String[] idList, String[] report, int k){
        // @param idList : 이용자의 ID를 담은 배열.
        // @param report : 신고한 이용자와 신고당한 이용자의 정보를 담은 배열. ex) "a b",.. -> a가 b를 신고
        // @param k      : 신고 횟수에 따른 정지 기준 정수값.
        // @return answer : id_list에 담긴 id 순서대로 각 유저가 받은 신고 결과 메일 개수 배열.
        int[] answer = new int[idList.length];
        HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
        HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        for(String reportInfo : reportSet){
            String reporter = reportInfo.split(" ")[0];  // 신고 한 사람
            String reported = reportInfo.split(" ")[1];  // 신고 당한 사람
            reporterInfoMap.putIfAbsent(reporter, new HashSet<String>(){{
                add(reported);
            }});
            reporterInfoMap.get(reporter).add(reported);
            reportedCountInfoMap.put(reported, reportedCountInfoMap.getOrDefault(reported, 0)+1);
        }

        for (String reported : reportedCountInfoMap.keySet()){
            int reportedCount = reportedCountInfoMap.get(reported);
            if(reportedCount >= k){
                // 메일 발송 대상
                for(int i=0; i<idList.length; i++){
                    if(reporterInfoMap.containsKey(idList[i]) && reporterInfoMap.get(idList[i]).contains(reported)) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }
}
