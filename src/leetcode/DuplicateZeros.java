package leetcode;

public class DuplicateZeros {
    public void duplicateZeros1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i < arr.length - 1) {
                shift(arr, i + 1);
                arr[i + 1] = 0;
            }
        }
    }

    public void shift(int[] arr, int s) {
        for (int i = arr.length - 1; i > s; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length && j < arr.length; i++) {
            temp[j++] = arr[i];
            if (arr[i] == 0 && j < arr.length) {
                temp[j++] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}