package kakao;

public class P60059B {

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

    private boolean search(int[][] key, int[][] lock) {
        int interval = key.length;
        for (int i = 0; i < interval; i++) {
            for (int j = 0; j < interval; j++) {
                movedKey(i - interval + 1, j - interval + 1, key);
//                if (isMatched(movedKey(i, j, key), lock)) {
//                    return true;
//                }
            }
        }
        return false;
    }

    private int[][] movedKey(int posX, int posY, int[][] key) {
        int[][] movedKey = new int[key.length][key.length];
        for (int i = 0; i < movedKey.length; i++) {
            for (int j = 0; j < movedKey.length; j++) {
                if (i + posX < 0 || i + posX >= movedKey.length) {
                    continue;
                }
                if (j + posY < 0 || j + posY >= movedKey.length) {
                    continue;
                }
                movedKey[i][j] = key[i - posX][j - posY];
            }
        }
        return movedKey;
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

}
