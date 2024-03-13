import java.util.Scanner;

public class cuberootinrange{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the starting number: ");
    int n1 = scanner.nextInt();
    System.out.print("Enter the ending number: ");
    int n2 = scanner.nextInt();
    System.out.println("Cube roots between " + n1 + " and " + n2 + ":");
    for (int i = n1; i <= n2; i++) {
        double cubeRoot = Math.cbrt(i); 
        if (Math.pow(cubeRoot, 3) == i) {
            System.out.println(i);
        }
    }
}
}