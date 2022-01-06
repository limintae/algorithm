package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class SortSolution {

    public static void main(String arg[]) {

        Solution s = new Solution();
        String answer = s.solution2(new int[]{9111, 912, 913, 9});
        System.out.println(answer);

    }

    static class Solution {

        public String solution(int[] numbers) {
            String answer = "";

            int[] firstNumbers = new int[]{};
            for (int i = 0; i < numbers.length; i++) {
                int length;
                if (numbers[i] < 10) {
                    length = 1;
                } else {
                    length = (int) (Math.log10(numbers[i]) + 1);
                }

                int firstNumber = (int) (numbers[i] / Math.pow(10, length - 1));
                System.out.println(length);
            }

            return answer;
        }

        public String solution2(int[] numbers) {
            /**
             * 해답
             */
            String answer = "";
            boolean isAllZero = true;
            String[] str = new String[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                str[i] = Integer.toString(numbers[i]);
            }

            Arrays.sort(str, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return (o2 + o1).compareTo(o1 + o2);
                }
            });

            for (int i = 0; i < str.length; i++) {
                if (!str[i].equals("0")) {
                    isAllZero = false;
                }
                answer += str[i];
            }

            if (isAllZero) {
                answer = "0";
            }

            return answer;
        }
    }

}
