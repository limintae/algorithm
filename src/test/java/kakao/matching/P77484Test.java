package kakao.matching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class P77484Test {

    private P77484 p77484 = new P77484();

    @ParameterizedTest
    @MethodSource
    void solutionTest(int[] lottos, int[] win_nums, int[] result) {
        assertThat(p77484.solution(lottos, win_nums)).isEqualTo(result);
    }

    static Stream<Arguments> solutionTest() {
        return Stream.of(
                Arguments.of(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19}, new int[] {3, 5}),
                Arguments.of(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25}, new int[] {1, 6}),
                Arguments.of(new int[] {45, 4, 35, 20, 3, 9}, new int[] {20, 9, 3, 45, 4, 35}, new int[] {1, 1})
        );
    }

}