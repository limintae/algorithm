package programmers.binary;

import java.util.Arrays;

public class Bridge {

    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks);
        int left = 1;
        int right = distance;
        while(left <= right){
            int mid = (left + right)/2;
            if(getRemovedRockCnt(rocks, mid, distance) <= n) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public int getRemovedRockCnt(int[] rocks, int minDistance, int distance){
        int start = 0;
        int removedRocksCnt = 0;
        int mid = minDistance;
        for (int i = 0; i < rocks.length; i++) {
            // 바위 간 거리
            int distanceBetweenRocks = rocks[i] - start;
            if(distanceBetweenRocks < mid) {
                removedRocksCnt++;
                continue;
            }
            start = rocks[i];
        }
        if(distance - start < mid) removedRocksCnt++;

        return removedRocksCnt;
    }

}