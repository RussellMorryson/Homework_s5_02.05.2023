package Task_3;

public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(arr, n, i);
        }

        int temp = 0;
        for (int i = n - 1; i >= 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heap(arr, i, 0);
        }
    }
    void heap(int arr[], int n, int i) {
        int large = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[large]) {
            large = left;
        }

        if (right < n && arr[right] > arr[large]) {
            large = right;
        }

        if (large != i) {
            int swap = arr[i];
            arr[i] = arr[large];
            arr[large] = swap;
            heap(arr, n, large);
        }
    }
    void printArray(int arr[]) {        
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]+" ");
        }        
    }
}
