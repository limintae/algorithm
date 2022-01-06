package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GiftCard {

    public static int solutionCase1(int[] gift_cards, int[] wants) {
        int answer = 0; // 남은 기프트카드의 수 = 정답
        List<Integer> gift_cards_list = new ArrayList<>();
        List<Integer> wants_list = new ArrayList<>();

        // 원하는 상품권번호를 가지고 있는 사람 제외
        for (int i = 0; i < gift_cards.length; i++) {
            if (wants[i] != gift_cards[i]) {
                wants_list.add(wants[i]);
                gift_cards_list.add(gift_cards[i]);
            }
        }
        Collections.sort(gift_cards_list);

        for (int i = 0; i < wants_list.size(); i++) {
            // 교환이 필요함
            // want에 따라 gift_cards_list탐색하여 소모
            int card_number = wants_list.get(i);
            int start = 0;
            int end = gift_cards_list.size();

            while (start < end) {
                long t = 0;
                int mid = (start + end) / 2;

                t = gift_cards_list.get(mid);

                if (t == card_number) {
                    gift_cards_list.remove(mid);
                    break;
                }

                if (t < card_number) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }

        answer = gift_cards_list.size();
        return answer;
    }

    public static int solutionCase2(int[] gift_cards, int[] wants) {
        int answer = 0; // 더이상 교환할 카드가 없는사람 리스트
        // 남은 기프트카드의 수 = 정답
        List<Integer> gift_cards_list = new ArrayList<>();
        List<Integer> wants_list = new ArrayList<>();

//        for (int i = 0; i < wants.length; i++) {
//            wants_list.add(wants[i]);
//        }

        for (int i = 0; i < gift_cards.length; i++) {
            if (wants[i] != gift_cards[i]) {
                wants_list.add(wants[i]);
                gift_cards_list.add(gift_cards[i]);
            }
        }

        // 원하는 상품권번호를 가지고 있는 사람 제외
        for (int i = 0; i < wants_list.size(); i++) {
            if (wants_list.get(i) == gift_cards_list.get(i)) {
                // 원하는 카드를 가지고 있음
            } else {
                // 교환이 필요함
                // want에 따라 gift card가 소모만 되면된다
                for (int j = 0; j < gift_cards.length; j++) {

                }
                Arrays.sort(gift_cards);
                while (true) {

                }
            }
        }
        return answer;
    }

}
