import java.util.Arrays;

public class BubbleSort {
    public static void main(String ...args) {
        int[] arr = {2,5,13,8,99,4,20,54,32,9};
        //When array is sorted no swap will happen and TC reduces to O(n) with didSwap logic.
        //int[] arr = {2,5,13};
        bubbleSort(arr);
        System.out.println("Sorted Array : ");
        Arrays.stream(arr).forEach(x -> System.out.printf("%d \t",x));
    }

    private static void bubbleSort(int[] arr) {
        int len = arr.length;
        boolean didSwap = false;
        for(int i = len-1; i >= 0; i--){
            for(int j=0; j<i;j++){
                if(arr[j] > arr[j+1]) {
                    didSwap = true;
                    swap(arr, j, j + 1);
                }
            }
            if(didSwap == false)
                break;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
