package programmers.greedy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P42861Test {

    @Test
    @DisplayName("[Greedy] 섬 연결하기")
    void P42861() {
        assertThat(new P42861().solution(4, new int[][] {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}})).isEqualTo(4);
    }

}