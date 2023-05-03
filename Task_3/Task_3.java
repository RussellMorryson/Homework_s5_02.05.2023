package Task_3;

public class Task_3 {
    public static void main(String args[]) {
        int arr[] = {11, 7, 1, 4, 9, 5};
        HeapSort ob = new HeapSort();
        ob.sort(arr);        
        ob.printArray(arr);
    }
}