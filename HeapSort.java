package algorithms;

public class HeapSort {

    public void sort(int[] arr) {
        int n = arr.length, temp;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, n ,i);
        }
        for (int i = n - 1; i >= 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public void heapify(int[] arr, int n, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2, temp;
        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n , largest);
        }
    }
}
