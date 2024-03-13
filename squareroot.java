// FIND SQUARE ROOT OF A NUMBER 
import java.util.Scanner;
public class squareroot {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to know the square root");
        int n=scn.nextInt();
        double sqrt=0;
        for(int i=1;i*i<=n;i++){
            
            if(i*i==n){
                sqrt=i;   
            }
        }
        System.out.println("square root of number is:" + sqrt);

    }
    
}
