import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programmers.dfs.WordConvert;
import programmers.greedy.GymSuit;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgrammersTest {

    @Test
    @DisplayName("[Greedy] 체육복")
    void gymSuitTest() {
        assertThat(GymSuit.solution(5, new int[] {2,4},new int[] {1,3,5})).isEqualTo(5);
        assertThat(GymSuit.solution(5, new int[] {2,4},new int[] {3})).isEqualTo(4);
        assertThat(GymSuit.solution(3, new int[] {3},new int[] {1})).isEqualTo(2);
        assertThat(GymSuit.solution(4, new int[] {4,2},new int[] {3,5})).isEqualTo(4);
        assertThat(GymSuit.solution(3, new int[] {1,2},new int[] {2,3})).isEqualTo(2);
    }

    @Test
    @DisplayName("단어 변환")
    void wordConvertTest() {
        assertThat(new WordConvert().solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"})).isEqualTo(4);
//        assertThat(new WordConvert().solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log"})).isEqualTo(0);
    }

}
