import java.util.Scanner;

public class RecursiveSum {
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int nos = sc.nextInt();
        int sum = recuriveSumParameter(0,nos);
        System.out.println("Recursive Sum of n numbers parameterized way :" + sum);
        sum = recuriveSumFunctional(nos);
        System.out.println("Recursive Sum of n numbers functional way :" + sum);
    }

    private static int recuriveSumFunctional(int nos) {
        if(nos == 1)    return 1;
        return nos + recuriveSumFunctional(--nos);
    }

    private static int recuriveSumParameter(int sum, int nos) {
        if(nos == 1)    return sum+1;
        return recuriveSumParameter(sum+nos,--nos);
    }
}
