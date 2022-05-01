package practice.codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        solution(new int[] {9,3,9,3,9,7,9});
    }

    private static int solution(int[] A) {
        // pairMap은 홀수값을 key로 중복건수를 count 로 가진다.
        Map<Integer, Integer> pairMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int pairValue = A[i];
            if (!pairMap.containsKey(pairValue)) {
                pairMap.put(pairValue, 1);
            } else {
                Integer dupCount = pairMap.get(pairValue);
                pairMap.put(pairValue, dupCount + 1);
            }
        }

        for (Integer key : pairMap.keySet()) {
            if (pairMap.get(key) % 2 != 0) {
                return key;
            }
        }

        return -1;
    }

}
