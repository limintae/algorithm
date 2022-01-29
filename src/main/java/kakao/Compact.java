package kakao;

public class Compact {

    public int solution(String s) {
        int min = s.length();
        for (int compactLength = 1; compactLength <= s.length() / 2; compactLength++) {
            StringBuilder compactResultString = new StringBuilder();
            String current = "";
            String next = "";
            int compactCount = 1;
            for (int j = 0; j <= s.length() + compactLength; j++) {
                int currentLastIndex = j + compactLength;
                int nextLastIndex = j + (compactLength * 2);
                if (nextLastIndex > s.length()) {
                    // 다음 문자열의 길이를 넘어가 더이상 압축의 여지가 없을 경우
                    if (compactCount == 1) {
                        // 압축을 안하고 있었을경우 j ~ 끝까지 문자열을 모두 더해준다
                        compactResultString.append(s.substring(j));
                    } else {
                        // 압축된 결과가 있었을 경우 압축카운트 + 압축문자열 + 남은 문자열
                        compactResultString.append(compactCount);
                        compactResultString.append(current);
                        compactResultString.append(s.substring(j + compactLength - 1));
                    }
                    break;
                }
                // 현재 문자열
                current = s.substring(j, currentLastIndex);
                // 비교할 다음 문자열
                next = s.substring(j + compactLength, nextLastIndex);
                // System.out.println("current : " + current + ", next : " + next);

                if (current.equals(next)) {
                    // 압축이 가능할 경우 카운트 증가
                    compactCount += 1;
                    j = j + compactLength;
                } else {
                    if (compactCount == 1) {
                        // 압축필요없음
                        compactResultString.append(current.substring(0, 1));
                    } else {
                        // 더이상 압축이 불가능하므로 compactCount만큼 압축
                        compactResultString.append(compactCount);
                        compactResultString.append(current.substring(0, 1));
                        // 압축횟수 초기화
                        compactCount = 1;
                    }
                }
            }
            int compactResultStringLength = compactResultString.toString().length();
            if (compactResultStringLength < min) {
                min = compactResultStringLength;
            }
        }
        return min;
    }

    public int solution2(String s) {
        int min = s.length();
        for (int i = 1; i <= s.length() / 2; i++) {
            int compLeng = compression(s, i).length();
            min = Math.min(min, compLeng);
        }
        return min;
    }

    private String compression(String str, int i) {
        int count = 1;
        String compression = "";
        String pattern = "";
        for (int j = 0; j <= str.length() + i; j += i) {
            String nowStr;
            // 전 문자열과 비교할 현재 문자열
            if (j >= str.length()) { // 현재 문자열이 없을 때
                nowStr = "";
            } else if (str.length() < j + i) { // 마지막 현재 문자열일 때
                nowStr = str.substring(j);
            } else {
                nowStr = str.substring(j, j + i); // 그 외
            }
            // 1. 전 문자열이랑 똑같은지 비교한다. (맨 처음이면 비교 X)
            if (j != 0) {
                if (nowStr.equals(pattern)) { // 똑같으면
                    count++;
                } else if (count >= 2) { // 다르고 count가 2회 이상이면 압축 가능
                    compression += count + pattern;
                    count = 1;
                } else { // 압축 불가능하면 그냥 그대로 문자열 이어붙이기
                    compression += pattern;
                }
            }
            // 2. i 길이만큼 문자열을 자른다.
            pattern = nowStr;
        }
        return compression;
    }

}
