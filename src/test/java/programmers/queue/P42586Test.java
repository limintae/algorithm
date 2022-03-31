package programmers.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class P42586Test {

    @Test
    void solution() {
        Assertions.assertThat(new P42586().solution(new int[] {93, 30, 55}, new int[] {1, 30, 5})).isEqualTo(new int[] {2, 1});
    }

}