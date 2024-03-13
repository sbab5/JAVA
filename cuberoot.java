//FIND THE CUBE ROOT OF A NUMBER
import java.util.Scanner;
public class cuberoot {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER WANT TO KNOW CUBE ROOT");
        int n=scn.nextInt();
        double cbrt=0;
        for(int i=1;i*i*i<=n;i++){
            if(i*i*i==n){
                cbrt=i;
            }

        }
        System.out.println("cube root of number is:" + cbrt);

    }
    
}
