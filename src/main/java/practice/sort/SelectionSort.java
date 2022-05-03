package practice.sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] targets = new int[] {5,2,4,1,3};

        selectionSort(targets, targets.length);

        for (int value : targets) {
            System.out.println(value);
        }
    }

    public static void selectionSort(int[] a, int size) {

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            // a 배열에서 최소값을 찾는다
            // 정렬과정 후 마지막 인덱스틑 최대값이니 수행하지 않는다
            for (int j = i; j < size; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

    }

}
