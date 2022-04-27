package practice.leecode;

public class ShuffleString {

    public static void main(String[] args) {
        String inputString = "CBA";
        int[] inputIndices = new int[] {2,1,0};
        String result = restoreString(inputString, inputIndices);
        if (result.equals("ABC")) {
            System.out.println("succeed : " + result);
        } else {
            System.out.println("failed : " + result);
        }
    }

    public static String restoreString(String s, int[] indices) {
        // S = "CBA", indices = [2,1,0] do restore

        char[] arrChar = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            arrChar[indices[i]] = s.charAt(i);
        }

        return String.valueOf(arrChar);
    }

}
