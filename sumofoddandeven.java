import java.util.Scanner;
public class sumofoddandeven {
    public static void main(String[]args){
        int n,i;
        int evencount=0;
        int oddcount=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=scn.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0){
                evencount++;
            }
            else 
            {
                oddcount++;   
            }
        }
    
    System.out.println("Number of odd numbers: " + oddcount);
        System.out.println("Number of even numbers: " + evencount);
    }
    
}
