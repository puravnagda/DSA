import java.util.Arrays;

public class SelectionSort {
    public static void main(String ...args) {
        int[] arr = {2,5,13,8,99,4,20,54,32,9};
        selectionSort(arr);
        System.out.println("Sorted Array : ");
        Arrays.stream(arr).forEach(x -> System.out.printf("%d \t",x));
    }

    private static void selectionSort(int[] arr) {
        int min = 0;
        int len = arr.length;
        for(int i = 0; i<len; i++){
            min = i;
            for(int j=i;j<len;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }

    private static void swap(int[] arr, int min, int i) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
