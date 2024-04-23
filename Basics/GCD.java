import java.util.Scanner;

public class GCD {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first nos : ");
        int num1 = sc.nextInt();
        System.out.print("Enter first nos : ");
        int num2 = sc.nextInt();
        int gcd = calculateGCDRecurssion(num1,num2);
        int gcdLoop = calculateGCDLoop(num1,num2);
        System.out.println("GCD of " + num1 + " & " + num2+ " by Recurssion : " + gcd);
        System.out.println("GCD of " + num1 + " & " + num2+ " by Loop : " + gcdLoop);
    }

    private static int calculateGCDLoop(int num1, int num2) {
        int min = Math.min(num1,num2);
        for(int i = min; i>0; i--){
            if(num1 % i == 0 && num2 %i == 0) {
                return i;
            }
        }
        return 1;
    }

    private static int calculateGCDRecurssion(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
        return calculateGCDRecurssion(num2, num1%num2);
    }
}
