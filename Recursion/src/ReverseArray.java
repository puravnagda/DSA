import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String ...args) {
        int[] arr = {2,5,3,8,4};
        reverseArray(arr,0,arr.length-1);
        System.out.println("Reversed Array : ");
        Arrays.stream(arr).forEach(x -> System.out.printf("%d \t",x));
    }

    private static void reverseArray(int[] arr, int start, int end) {
        if(start > end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,++start,--end);
    }
}
