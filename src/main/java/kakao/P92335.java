package kakao;

/**
 * k 진수에서 소수 구하기
 * https://programmers.co.kr/learn/courses/30/lessons/92335
 */
public class P92335 {

    public int solution(int n, int k) {
        int answer = 0;
        String convertResult = convert(n, k);
        String[] arrTarget = convertResult.split("0");
        for (int i = 0; i < arrTarget.length; i++) {
            String item = arrTarget[i];
            if (item.equals("1") || item.equals("")) {
                continue;
            }
            long num = Long.parseLong(item);
            if (isPrime(num)) {
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
    private boolean isPrime(long n) {
        if(n <= 1) return false;
        else if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }

}
