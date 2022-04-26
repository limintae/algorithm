package practice.sort;

public class Bubble {

    public static void main(String[] args) {
        int[] result = sort(new int[] {2,1,3,5,4,10,9,8,7,6});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] sort(int[] target) {
        for (int i = 0; i < target.length; i++) {
            for (int j = 1; j < target.length; j++) {
                if (target[j - 1] > target[j]) {
                    int temp = target[j - 1];
                    target[j - 1] = target[j];
                    target[j] = temp;
                }
            }
        }
        return target;
    }

}
