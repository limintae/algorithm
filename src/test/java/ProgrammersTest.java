import kakao.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programmers.binary.Bridge;
import programmers.binary.Immigration;
import programmers.dfs.Network;
import programmers.dfs.TargetNumber;
import programmers.dfs.WordConvert;
import programmers.dp.P42895;
import programmers.etc.P77486;
import programmers.graph.FarthestNode;
import programmers.greedy.GymSuit;
import programmers.greedy.P42861;

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
//        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
//        assertThat(new FarthestNode().solution(6, edge)).isEqualTo(3);
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}, {6, 7}};
        assertThat(new FarthestNode().solution(7, edge)).isEqualTo(1);
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

    @Test
    @DisplayName("[2022 KAKAO BLIND] k진수에서 소수 개수 구하기")
    void p92335() {
        assertThat(new P92335().solution(437674, 3)).isEqualTo(3);
        assertThat(new P92335().solution(110011, 10)).isEqualTo(2);
        assertThat(new P92335().solution(797161, 3)).isEqualTo(1);
    }

    @Test
    @DisplayName("[DFS/BFS] 네트워크")
    void network() {
        assertThat(new Network().solution(3, new int[][] {{1,1,0},{1,1,0},{0,0,1}})).isEqualTo(2);
        assertThat(new Network().solution(3, new int[][] {{1,1,0},{1,1,1},{0,1,1}})).isEqualTo(1);
    }

    @Test
    @DisplayName("[2022 KAKAO BLIND] 양궁대회")
    void p92342() {
        assertThat(new P92342().solution(5, new int[] {2,1,1,1,0,0,0,0,0,0,0})).isEqualTo(new int[] {0,2,2,0,1,0,0,0,0,0,0});
        assertThat(new P92342().solution(1, new int[] {1,0,0,0,0,0,0,0,0,0,0})).isEqualTo(new int[] {-1});
        assertThat(new P92342().solution(9, new int[] {0,0,1,2,0,1,1,1,1,1,1})).isEqualTo(new int[] {1,1,2,0,1,2,2,0,0,0,0});
        assertThat(new P92342().solution(10, new int[] {0,0,0,0,0,0,0,0,3,4,3})).isEqualTo(new int[] {1,1,1,1,1,1,1,1,0,0,2});

    }

    @Test
    @DisplayName("[DP] N으로 표현")
    void p42895() {
        assertThat(new P42895().solution(5, 12)).isEqualTo(4);
        assertThat(new P42895().solution(2, 11)).isEqualTo(3);
    }

    @Test
    @DisplayName("[Greedy] 섬 연결하기")
    void P42861() {
        assertThat(new P42861().solution(4, new int[][] {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}})).isEqualTo(4);
    }

    @Test
    @DisplayName("[2021 Dev-Matching: 웹 백엔드 개발] 다단계 칫솔 판매")
    void P77486() {
        assertThat(new P77486().solution(
                new String[] {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"},
                new String[] {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"},
                new String[] {"young", "john", "tod", "emily", "mary"},
                new int[] {12, 4, 2, 5, 10})
        ).isEqualTo(new int[] {360, 958, 108, 0, 450, 18, 180, 1080});
    }

    @Test
    @DisplayName("[2020 KAKAO BLIND] 자물쇠와 열쇠")
    void P60059() {
        assertThat(new P60059().solution(
                new int[][] {
                        {0,0,0},
                        {1,0,0},
                        {0,1,1}
                        },
                new int[][] {
                        {1,1,1},
                        {1,1,0},
                        {1,0,1}
                })
        ).isTrue();
        assertThat(new P60059().solution(
                new int[][] {
                        {0,0,0},
                        {0,0,0},
                        {0,1,1}
                },
                new int[][] {
                        {1,0,1},
                        {1,0,1},
                        {1,0,1}
                })
        ).isFalse();
    }

}
