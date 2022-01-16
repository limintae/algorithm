import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programmers.dfs.TargetNumber;
import programmers.dfs.WordConvert;
import programmers.graph.FarthestNode;
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
    @DisplayName("[DFS/BFS] 단어 변환")
    void targetNumberTest() {
        assertThat(new TargetNumber().solution(new int[]{1, 1, 1, 1, 1}, 3)).isEqualTo(5);
    }

    @Test
    @DisplayName("[DFS/BFS] 단어 변환")
    void wordConvertTest() {
        assertThat(new WordConvert().solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"})).isEqualTo(4);
        assertThat(new WordConvert().solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log"})).isEqualTo(0);
    }

    @Test
    @DisplayName("[DFS/BFS] 가장 먼 노드")
    void farthestNode() {
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        assertThat(new FarthestNode().solution(6, edge)).isEqualTo(3);
    }

}
