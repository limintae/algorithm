package programmers.devmatching;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class P77485Test {

    @Test
    void runTest() {
        Assertions.assertThat(new P77485().solution(6, 6, new int[][] {{2,2,5,4}, {3,3,6,6}, {5,1,6,3}}))
                .isEqualTo(new int[] {8, 10, 25});
    }

}