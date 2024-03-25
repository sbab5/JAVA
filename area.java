import java.util.Scanner;
public class area {
    public static void main(String[] args) {
       // int n;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a choice");
        int choice=scn.nextInt();
        System.out.println("1:circle");
        System.out.println("2.rectagle");
        System.out.println("3.square");
        System.out.println("4.triangle");

        double area;
        switch(choice){
            case 1:
            System.out.println("Enter the value of radius of circle:");
            double r =scn.nextDouble();
            double areacircle = Math.PI * r * r;

            System.out.println("area of circle is :" + areacircle);
            break;
        
        case 2:
        System.out.println("Enter the value of length and breadth of regtangle:");
        double l=scn.nextDouble();
        double b=scn.nextDouble();
        area = l*b;
        System.out.println("area of rectangle is:" + area);
        break;

        case 3:
        System.out.println("Enter the value of side of square:");
        double a=scn.nextInt();
        area = a*a;
        System.out.println("are of square is:" + area);
        break;

        case 4:
        System.out.println("Enter the value of length,breadth and height of triangle:");
        double L=scn.nextDouble();
        double B=scn.nextDouble();
        double h=scn.nextDouble();
        area = L*B*h;
        System.out.println("are of triangle is:" + area);
        break;
        default :
        System.out.println("INVALID CHOICE");

        
    }
}
}
    

