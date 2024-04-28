import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fibonacci nos you wish to calculate: ");
        int nos = sc.nextInt();
        long start1 = System.nanoTime();
        System.out.println("Fibonacci using recurrsion : "+ fibonacci(nos));
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in nano secs for recurssion: "+ (end1-start1));
        System.out.println();
        start1 = System.nanoTime();
        System.out.println("Fibonacci using DP : "+ fibonacciDP(nos));
        end1 = System.nanoTime();
        System.out.println("Elapsed Time in nano secs for DP: "+ (end1-start1));
    }

    //recurssion
    static int fibonacci(int nos){
        if(nos <= 1)    return nos;
        return fibonacci(nos-1) + fibonacci(nos - 2);
    }

    //DP
    static Integer memo[] = new Integer[100];
    static int fibonacciDP(int n){
        if(memo[n] != null) return memo[n];
        if(n == 0 || n == 1) return n;
        memo[n] = fibonacciDP(n-1) + fibonacciDP(n-2);
        return memo[n];
    }
}
