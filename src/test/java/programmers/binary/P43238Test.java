package programmers.binary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class P43238Test {

    @ParameterizedTest
    @MethodSource
    @DisplayName("[이분탐색] 입국심사")
    void immigration(int n, int[] times, long result) {
        assertThat(new P43238().solution(n, times)).isEqualTo(result);
    }

    static Stream<Arguments> immigration() {
        return Stream.of(
                Arguments.of(6, new int[] {7,10}, 28)
        );
    }

}