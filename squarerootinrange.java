import java.util.Scanner;
public class squarerootinrange{
public static void main(String[] args) {
    int n1,n2,num;
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the value of n1 and n2: ");
     n1=scn.nextInt();
     n2=scn.nextInt();
     
   // int  sqrt=0;
    for(int i=n1;i<=n2;i++){
        double squareRoot = Math.sqrt(i);
        if (squareRoot == (int) squareRoot)
            System.out.println("perfect number :" + i);

        }


    }

}
