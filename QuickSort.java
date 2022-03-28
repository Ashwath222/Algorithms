package algorithms;

public class QuickSort {

    public void sort(int[] arr, int start, int end) {
        if(start < end) {
            int p = partition(arr, start, end);
            sort(arr, start, p-1);
            sort(arr, p+1, end);
        }
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = arr[end], i = start - 1, temp;
        for (int j = start ; j <= end; j++) {
            if (arr[j] < pivot) {
                temp = arr[j];
                arr[j] = arr[++i];
                arr[i] = temp;
            }
        }
        temp = arr[++i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
