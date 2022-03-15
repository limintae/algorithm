package programmers.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class P42884Test {

    @DisplayName("[Greedy] 단속카메라")
    @Test
    void runTest() {
        Assertions.assertThat(new P42884().solution(new int[][] {{-20, -15},{-14, -5},{-18, -13},{-5, -3}})).isEqualTo(2);
    }

}