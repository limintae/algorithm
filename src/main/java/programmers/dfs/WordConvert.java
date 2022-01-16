package programmers.dfs;

public class WordConvert {

    private boolean[] visited;
    private int answer;
    private String target;
    private String[] words;

    public int solution(String begin, String target, String[] words) {
        this.answer = 0;
        this.visited = new boolean[words.length];
        this.target = target;
        this.words = words;

        if (this.checkWordsContainsAnswer(target)) {
            this.dfs(begin, 0);
        }
        return answer;
    }

    // words내에 target문자열이 없다면 바로 종료
    private boolean checkWordsContainsAnswer(String target) {
        for (String word : this.words) {
            if (word.equals(target)) {
                return true;
            }
        }
        return false;
    }

    private void dfs(String begin, int count) {
        if (begin.equals(target)) {
            // 방문 노드가 정답과 일치 할 경우 종료
            this.answer = count;
            return;
        }

        for (int i = 0; i < this.words.length; i++) {
            if (visited[i]) {
                continue;
            }

            String word = this.words[i];
            int sameWordCnt = 0;

            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == word.charAt(j)) {
                    sameWordCnt ++;
                }
            }

            if (sameWordCnt == begin.length() - 1) {
                this.visited[i] = true;
                this.dfs(word, count + 1);
                this.visited[i] = false;
            }
        }
    }

}
