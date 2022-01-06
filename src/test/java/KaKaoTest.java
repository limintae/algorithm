import kakao.GiftCard;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KaKaoTest {

    @Test
    @DisplayName("카카오 코테 문제1 GiftCard")
    void giftCardTest() throws Exception {
        int answer1 = GiftCard.solutionCase1(new int[]{4, 5, 3, 2, 1}, new int[]{2, 4, 4, 5, 1});
        assertThat(answer1).isEqualTo(1);

        int answer2 = GiftCard.solutionCase1(new int[]{5, 4, 5, 4, 5}, new int[]{1, 2, 3, 5, 4});
        assertThat(answer2).isEqualTo(3);
    }

}
