package algorithms;

public class BubbleSort {

    public void sort(int[] arr) {
        int temp;
        for (int i = 0 ; i < arr.length-1 ; i++) {
            for (int j = 1 ; j < arr.length ; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
