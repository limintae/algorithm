package programmers.etc;

import java.util.HashMap;
import java.util.Map;

/**
 * 다단계 칫솔 판매
 * https://programmers.co.kr/learn/courses/30/lessons/77486
 */
public class P77486 {

    private int[] answer;

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        this.answer = new int[enroll.length];

        // 부모 자식의 매핑정보 생성
        Map<String, Member> sellerInfo = new HashMap<>();

        // 판매원의 추천인과 판매원 인덱스를 기록한다
        for (int i = 0; i < enroll.length; i++) {
            sellerInfo.put(enroll[i], new Member(referral[i], i));
        }

        for (int i = 0; i < seller.length; i++) {
            calProfit(sellerInfo, seller[i], amount[i] * 100);
        }

        return answer;
    }

    private void calProfit(Map<String, Member> sellerInfo, String sellerName, int profit) {
        if (sellerName.equals("-")) {
            return;
        }

        int parentProfit = profit / 10;
        int remainProfit = profit - parentProfit;
        this.answer[sellerInfo.get(sellerName).getIndex()] += remainProfit;

        profit /= 10;
        // 10%의 금액이 1원 미만
        if (profit < 1) {
            return;
        }
        calProfit(sellerInfo, sellerInfo.get(sellerName).getReferral(), profit);
    }

    class Member {

        private final String referral;
        private final int index;

        Member(String referral, int index) {
            this.referral = referral;
            this.index = index;
        }

        public String getReferral() {
            return this.referral;
        }

        public int getIndex() {
            return this.index;
        }

    }

}
