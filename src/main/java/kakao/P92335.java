package kakao;

/**
 * k 진수에서 소수 구하기
 * https://programmers.co.kr/learn/courses/30/lessons/92335
 */
public class P92335 {

    public int solution(int n, int k) {
        int answer = -1;

        String convertResult = convert(n, k);

        // 211020101011
        // 0110011
        // 110011
        for (int i = 0; i < convertResult.length(); i++) {
            StringBuffer stringBuffer = new StringBuffer();
            String currentStr = convertResult.substring(i, i + 1);

            if (currentStr.equals("0")) {
                if (stringBuffer.toString().equals("1")) {

                } else {

                }
            } else {
                stringBuffer.append(currentStr);
            }

            if (i == 0) {
                // 첫 문자열
            } else if (i == convertResult.length()) {
                // 마지막 문자열
            } else {
                // 중간 문자열
            }
        }

        return answer;
    }

    public int solution2(int n, int k) {
        int answer = 0, i, j;
        String s = convert(n,k);
        for (i = 0; i < s.length(); i = j) {
            for (j = i + 1; j < s.length() && s.charAt(j) != '0'; j++);
            if(isPrime(Integer.parseInt(s.substring(i,j)))) {
                answer++;
            }
        }
        return answer;
    }

    // 진법변환
    private String convert(int n, int k) {
        String result = "";
        while (n > 0) {
            result = (n % k) + result;
            n /= k;
        }
        return result;
    }

    // 소수체크
    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

}
