package practice.binarysearch;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        // 이진 탐색을 구현해보세요 입력값은 [5,4,3,2,1,10,9,8,7]이며 9를 찾아보세요

        int result = binarySearch(new int[] {5,4,3,2,1,10,9,8,7}, 9);
        System.out.println(result);

    }

    private static int binarySearch(int[] input, int target) {
        int left = 0;
        int right = input.length - 1;
        int mid;
        int searchCount = 0;

        Arrays.sort(input);

        while (left <= right) {
            searchCount++;
            mid = (left + right) / 2;

            if (input[mid] == target) {
                System.out.println(searchCount);
                return input[mid];
            }

            if (input[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;
    }

}
