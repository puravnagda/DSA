import java.util.Scanner;

public class PrintNTimes {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int count = sc.nextInt();
        System.out.println();
        System.out.println("Print "+count+" Times:");
        printNTimes(count);
        System.out.println();
        System.out.println("Print 1 to N:");
        print1ToN(count);
        System.out.println();
        System.out.println("Print N to 1:");
        printNto1(count);
    }

    private static void printNto1(int count) {
        if(count == 0)  return;
        System.out.printf("%d %n",count);
        printNto1(--count);
    }

    private static void print1ToN(int count) {
        if(count == 0)  return;
        print1ToN(--count);
        System.out.printf("%d %n",count+1);
    }

    private static void printNTimes(int count) {
        if(count == 0)   return;
        System.out.printf("Recursive call %n");
        printNTimes(--count);
    }


}
