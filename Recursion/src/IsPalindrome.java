import java.util.Arrays;
import java.util.Scanner;

public class IsPalindrome {
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to check palindrome: ");
        String str = sc.next();
        boolean palindrome = isPalindrome(str.toCharArray(),0,str.length()-1);
        System.out.println("Palindrome string : "+palindrome);
    }

    private static boolean isPalindrome(char[] arr, int start, int end) {
        if(start > end) return true;
        else if(arr[start] != arr[end]) return false;
        return isPalindrome(arr,++start,--end);
    }
}
