import java.util.Scanner;

public class Factorial {
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int nos = sc.nextInt();
        int factorial = factorial(nos);
        System.out.println("Factorial of n : " + factorial);
    }

    private static int factorial(int nos) {
        if(nos == 1)    return 1;
        return nos * factorial(nos-1);
    }
}
