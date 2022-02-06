package kakao;

/**
 * 양궁대회
 * https://programmers.co.kr/learn/courses/30/lessons/92342
 */
public class P92342 {

    private int[] lionBestInfo;
    private int maxScore;

    public int[] solution(int n, int[] info) {
        lionBestInfo = new int[11];
        maxScore = 0;
        dfs(info, n, 0, 0, 0, new int[11]);
        return maxScore == 0 ? new int[]{-1} : lionBestInfo;
    }

    public void dfs(int[] apeachInfo, int n, int lionScore, int apeachScore, int idx, int[] lionInfo) {
        if (idx == 10) {
            // 모든 화살을 사용하였을경우 판정
            if (lionScore - apeachScore >= maxScore) {
                lionInfo[idx] = n;
                if (maxScore < (lionScore - apeachScore)) {
                    lionBestInfo = lionInfo.clone();
                    maxScore = lionScore - apeachScore;
                } else if (maxScore == (lionScore - apeachScore)) {
                    if (checkSort(lionInfo)) {
                        // 가장 낮은점수를 리턴
                        lionBestInfo = lionInfo.clone();
                    }
                }
            }
            return;
        }

        if(apeachInfo[idx]<n) {
            // 이길 수 있는 점수
            int lionShootArrowCount = apeachInfo[idx]+1;
            int lionRemainArrowCount = n-(lionShootArrowCount);
            lionInfo[idx] = lionShootArrowCount;
            dfs(apeachInfo, lionRemainArrowCount, lionScore+(10 - idx), apeachScore, idx+1, lionInfo);
        }

        // 이길 수 없는 점수
        lionInfo[idx] = 0;
        int addApeachScore = (apeachInfo[idx] > 0?(10 - idx):0);
        dfs(apeachInfo, n, lionScore, apeachScore + addApeachScore, idx+1, lionInfo);
    }

    public boolean checkSort(int[] lionInfo) {
        for(int i=10 ; i>=0 ; i--) {
            if(lionBestInfo[i]==lionInfo[i]) {
                continue;
            } else if(lionBestInfo[i]<lionInfo[i]) {
                return true;
            } else {
                break;
            }
        }
        return false;
    }

}
