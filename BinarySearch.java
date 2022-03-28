package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, 3));
    }

    public static int binarySearch(int[] arr, int search) {
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == search) {
                return mid + 1;
            }
            else if (arr[mid] < search) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
