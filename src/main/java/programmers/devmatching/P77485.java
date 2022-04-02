package programmers.devmatching;

/**
 * 행렬 테두리 회전하기
 * https://programmers.co.kr/learn/courses/30/lessons/77485
 */
public class P77485 {

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        int[][] map = createMap(rows, columns);

        // {2,2,5,4}
        getQueriesMap(map, queries[0]);


        return answer;
    }

    private int[][] createMap(int rows, int columns) {
        int[][] map = new int[rows][columns];
        int value = 1;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                map[i][j] = value++;
            }
        }
        return map;
    }

    private int[][] getQueriesMap(int[][] target, int[] query) {
        MoveType status = MoveType.RIGHT;
        int x1 = query[0] - 1;
        int y1 = query[1] - 1;
        int x2 = query[2] - 1;
        int y2 = query[3] - 1;

        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[0].length; j++) {
                if (i >= x1 && j >= y1 && i <= x2 && j <= y2) {
                    System.out.println(target[i][j]);
                    if (status == MoveType.RIGHT) {

                    } else if (status == MoveType.DOWN) {

                    } else if (status == MoveType.LEFT) {

                    } else if (status == MoveType.UP) {

                    } else {

                    }
                }
            }
        }
        return null;
    }

    private enum MoveType {
        RIGHT,
        DOWN,
        LEFT,
        UP;
    }

}
