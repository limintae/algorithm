package kakao;

import java.util.Arrays;

/**
 * 자물쇠와 열쇠
 * https://programmers.co.kr/learn/courses/30/lessons/60059
 */
public class P60059 {

    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = false;
        int[][] rotatedKey = key;
        for (int i = 0; i < 4; i++) {
            if (i != 0) {
                rotatedKey = rotate(rotatedKey);
            }
            answer = search(rotatedKey, lock);
            if (answer) {
                break;
            }
        }
        return answer;
    }

    private boolean isMatched(int[][] key, int[][] lock) {
        for (int i = 0; i < lock.length; i++) {
            for (int j = 0; j < lock.length; j++) {
                if (lock[i][j] == 1 && key[i][j] == 1) {
                    // 홈이 아닌데 열쇠의 돌기일 경우
                    return false;
                }
                if (lock[i][j] == 0 && key[i][j] == 0) {
                    // 홈이지만 열쇠 돌기가 아닐 경우
                    return false;
                }
            }
        }
        return true;
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

    public boolean search(int[][] key, int[][] lock) {
        int keyLength = key.length;
        int padSize = (keyLength - 1) * 2;
        int keyMapSize = keyLength + padSize;
        int[][] keyMap = new int[keyMapSize][keyMapSize];

        for (int i = 0; i < keyMap.length; i++) {
            for (int j = 0; j < keyMap.length; j++) {
                if (i > keyMap.length - i + 1 || j > keyMap.length - j + 1) {
                    continue;
                }
                int startX = i;
                int startY = j;
                int endX = i + keyLength;
                int endY = j + keyLength;
                keyMap = new int[keyMapSize][keyMapSize];
                int[][] newKey = newKey(startX, startY, endX, endY, key, keyMap);
                if(isMatched(newKey, lock)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[][] newKey(int startX, int startY, int endX, int endY, int[][] key, int[][] keyMap) {
        int[][] newKey = new int[key.length][key.length];
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                keyMap[i][j] = key[i - startX][j - startY];
            }
        }
        int xIdx = 0;
        int yIdx = 0;
        for (int i = newKey.length - 1; i < (newKey.length - 1) + newKey.length; i++) {
            for (int j = newKey.length - 1; j < (newKey.length - 1) + newKey.length; j++) {
                newKey[xIdx][yIdx] = keyMap[i][j];
                yIdx++;
            }
            xIdx++;
            yIdx = 0;
        }
        return newKey;
    }

}