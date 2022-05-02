package practice.codility;

import java.util.Arrays;

/**
 * https://app.codility.com
 */
public class PermMissingElem {

    public static void main(String[] args) {
        int answer = solution(new int[] {2,3,1,5});
        System.out.println(answer);
    }

    private static int solution(int[] A) {
        // 정렬 후 A의 index I의 값은 I + 1이어야한다는 규칙을 사용한다.
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            int expectedNumber =  i + 1;
            if (expectedNumber != A[i]) return expectedNumber;
        }
        return A.length + 1;
    }

}
