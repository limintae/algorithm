package kakao;

import java.util.Arrays;

public class P60059A {

    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = false;
        int[][] paddedLock = padding(lock);
        int[][] rotatedKey = key;
        for (int i = 0; i < 4; i++) {
            if (i != 0) {
                rotatedKey = rotate(rotatedKey);
            }
            answer = search(rotatedKey, paddedLock);
            if (answer) {
                break;
            }
        }
        return answer;
    }

    private boolean search(int[][] key, int[][] lock) {
        int maxStart = key.length;
        for (int i = 0; i < lock.length - maxStart; i++) {
            for (int j = 0; j < lock[i].length - maxStart; j++) {
                if (isMatched(i, j, key, lock)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[][] movedKey(int startX, int startY, int[][] key) {
        // startX = -1
        // startY = -1
        int[][] movedKey = new int[key.length][key.length];
        for (int i = 0; i < movedKey.length; i++) {
            for (int j = 0; j < movedKey.length; j++) {
                if (i + startX < 0 || i + startX > movedKey.length) {
                    continue;
                }
                if (j + startY < 0 || j + startY > movedKey.length) {
                    continue;
                }
                movedKey[i][j] = key[i + startX][j + startY];
            }
        }
        return movedKey;
    }

    private boolean isMatched(int startX, int startY, int[][] key, int[][] lock) {
        if (startX == 2 && startY == 3) {
            System.out.println("tt");
        }
        for (int i = startX; i < startX + key.length; i++) {
            for (int j = startY; j < startY + key.length; j++) {
                if (lock[i][j] == 1 && key[i - startX][j - startY] == 1) {
                    // 홈이 아닌데 열쇠의 돌기일 경우
                    return false;
                }
                if (lock[i][j] == 0 && key[i - startX][j - startY] == 0) {
                    // 홈이지만 열쇠 돌기가 아닐 경우
                    return false;
                }
            }
        }
        return true;
    }

    private int[][] padding(int[][] array) {
        int size = (array.length * 3);
        int[][] paddingArray = new int[size][size];
        for (int i = 0; i < paddingArray.length; i++) {
            Arrays.fill(paddingArray[i], 1);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                paddingArray[i + array.length][j + array.length] = array[i][j];
            }
        }
        return paddingArray;
    }

    private int[][] rotate(int[][] array) {
        // 행, 열의 길이가 같은 정사각행렬이므로 같은 사이즈로 정의
        int size = array.length;
        int[][] rotatedArray = new int[size][size];
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                rotatedArray[i][j] = array[size - 1 - j][i];
            }
        }
        return rotatedArray;
    }

}
