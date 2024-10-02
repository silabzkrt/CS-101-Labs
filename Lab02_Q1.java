// import Scanner
import java.util.Scanner;

public class Lab02_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter volume of sphere: ");
        

        // define and input volume 
        double V = sc.nextDouble();
        System.out.print(V);

        // find and print radius
        double r = Math.pow (((3 * V) / (4 * Math.PI)), 1 / 3 );
        System.out.println("The radius of the sphere is: " +  r);

        // find and print surface area
        double A = 4 * Math.PI * Math.sqrt(r);
        System.out.println("The surface area of the sphere is: " + A);




    }
}
