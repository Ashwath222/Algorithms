package algorithms;

public class MergeSort {

    public void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public void merge(int[] arr, int start, int mid, int end) {
        int i , j , k, n1, n2;
        n1 = mid - start + 1;
        n2 = end - mid;
        int[] left = new int[n1], right = new int[n2];
        for (i = 0; i < n1; i++) {
            left[i] = arr[start + i];
        }
        for (j = 0; j < n2 ; j++) {
            right[j] = arr [mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = start;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
}
