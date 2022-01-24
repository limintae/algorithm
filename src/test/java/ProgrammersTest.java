import kakao.Compact;
import kakao.Report;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programmers.binary.Bridge;
import programmers.binary.Immigration;
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

    @Test
    @DisplayName("[이분탐색] 입국심사")
    void immigration() {
        assertThat(new Immigration().solution(6, new int[]{7, 10})).isEqualTo(28);
    }

    @Test
    @DisplayName("[이분탐색] 징검다리")
    void bridge() {
        assertThat(new Bridge().solution(25, new int[] {2, 14, 11, 21, 17}, 2)).isEqualTo(4);
    }

    @Test
    @DisplayName("[2022 KAKAO BLIND] 신고 결과 받기")
    void report() {
        assertThat(new Report().solution(
                new String[] {"muzi", "frodo", "apeach", "neo"},
                new String[] {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                2
        )).isEqualTo(new int[] {2, 1, 1, 0});
        assertThat(new Report().solution(
                new String[] {"con", "ryan"},
                new String[] {"ryan con", "ryan con", "ryan con", "ryan con"},
                3
        )).isEqualTo(new int[] {0,0});
    }

    @Test
    @DisplayName("[2020 KAKAO BLIND] 문자열 압축")
    void compact() {
        assertThat(new Compact().solution2("ababccc")).isEqualTo(7);
    }

}
