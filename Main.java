package algorithms;

public class Main {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        SelectionSort s = new SelectionSort();
        MergeSort m = new MergeSort();
        QuickSort q = new QuickSort();
        HeapSort h = new HeapSort();
        int arr[] = {2, 4, 5, 1, 9, 6, 3, 7, 8};
        h.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
