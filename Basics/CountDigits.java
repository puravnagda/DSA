import java.util.Scanner;

public class CountDigits{
    public static void main(String ...args){
        System.out.println("Enter nos : ");
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt();
        int countByLoop = countDigitsByLoop(nos);
        int countByString = countDigitsByString(nos);
        int countByLog = countDigitsByLog(nos);
        System.out.println("Count of Digits using loop : " +countByLoop);
        System.out.println("Count of Digits by string conversion : " +countByString);
        System.out.println("Count of Digits by log10 : " +countByLog);
    }

    private static int countDigitsByLog(int nos) {
        if(nos == 0)    return 1;
        else if(nos < 0)    nos *= -1;
        return (int) Math.log10(nos) + 1;
    }

    private static int countDigitsByString(int nos) {
        if(nos == 0)    return 1;
        else if(nos < 0)    nos *= -1;
        return String.valueOf(nos).length();
    }

    private static int countDigitsByLoop(int nos) {
        if(nos == 0)    return 1;
        int counter = 0;
        while(nos != 0){
            counter++;
            nos /= 10;
        }
        return counter;
    }
}