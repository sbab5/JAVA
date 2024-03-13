import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:");
        n = scn.nextInt();
        
        System.out.println("Fibonacci series is:");
        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < n; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
