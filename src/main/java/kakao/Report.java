package kakao;

import java.util.*;

/**
 * 2022 카카오 블라인드
 * https://programmers.co.kr/learn/courses/30/lessons/92334
 */
public class Report {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 각 유저별로 신고당한 횟수
        int[] reportedCount = new int[id_list.length];
        // 각 유저별로 신고한 유저 리스트배열
        List<List<String>> reportIdFromSpecificUser = new ArrayList<>();

        // id별 인덱스 정보를 저장하고 들어가자
        Map<String, Integer> idIndexMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idIndexMap.put(id_list[i], i);
            reportIdFromSpecificUser.add(new ArrayList<>());
        }

        // 중복 제거 신고리스트로 필터링
        String[] noDupReport = new HashSet<>(Arrays.asList(report)).toArray(new String[0]);

        for (int i = 0; i < noDupReport.length; i++) {
            String[] reportInfo = noDupReport[i].split(" ");
            String reporterId = reportInfo[0];
            String targetId = reportInfo[1];

            // 신고자와 신고대상의 관계를 저장
            reportIdFromSpecificUser.get(idIndexMap.get(reporterId)).add(targetId);

            int nextReportCount = reportedCount[idIndexMap.get(targetId)] + 1;
            if (nextReportCount >= k) {
                reportedCount[idIndexMap.get(targetId)] += 1;
            } else {
                reportedCount[idIndexMap.get(targetId)] += 1;
            }
        }

        for (int i = 0; i < reportedCount.length; i++) {
            if (reportedCount[i] >= k) {
                // 신고된 사용자리스트에서 k번이상 신고된 사용자만 로직 수행
                String targetId = id_list[i];
                for (int j = 0; j < reportIdFromSpecificUser.size(); j++) {
                    // 정지예정인 아이디를 가지고있는 신고자들에게 메일카운트 +1
                    if (reportIdFromSpecificUser.get(j).contains(targetId)) {
                        // 신고한 ID 중 정지되는 ID를 포함하고 있는 경우
                        answer[j] += 1;
                    }
                }
            }
        }
        return answer;
    }

}
