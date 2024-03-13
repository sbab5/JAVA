import java.util.Scanner;
public class squareno {

    public static void main(String[] args) {
        int n,i;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to  find square");
        n=scn.nextInt();
        int sq=n*n;
        System.out.println("Square of the number is:" + sq);
    }
    
}
