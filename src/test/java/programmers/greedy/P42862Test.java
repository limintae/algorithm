package programmers.greedy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P42862Test {

    @DisplayName("[Greedy] 체육복")
    @Test
    void gymSuitTest() {
        assertThat(P42862.solution(5, new int[] {2,4},new int[] {1,3,5})).isEqualTo(5);
        assertThat(P42862.solution(5, new int[] {2,4},new int[] {3})).isEqualTo(4);
        assertThat(P42862.solution(3, new int[] {3},new int[] {1})).isEqualTo(2);
        assertThat(P42862.solution(4, new int[] {4,2},new int[] {3,5})).isEqualTo(4);
        assertThat(P42862.solution(3, new int[] {1,2},new int[] {2,3})).isEqualTo(2);
    }

}