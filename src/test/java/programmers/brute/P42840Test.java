package programmers.brute;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class P42840Test {

    private P42840 test = new P42840();

    @ParameterizedTest
    @MethodSource
    void solutionTest(int[] input, int[] result) {
        assertThat(test.solution(input)).isEqualTo(result);
    }

    static Stream<Arguments> solutionTest() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,4,5}, new int[] {1}),
                Arguments.of(new int[] {1,3,2,4,2}, new int[] {1,2,3}),
                Arguments.of(new int[] {1,2,3,4,5,1,2,3,4,5}, new int[] {1})
        );
    }

}