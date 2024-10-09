// import Scanner
import java.util.Scanner;

public class Lab02_Q1 {
    public static void main(String[] args) {
        System.out.print("Enter volume of sphere: " );
        Scanner sc = new Scanner (System.in);
        //input volume
        double V = sc.nextDouble();

        // find and print radius
        double r = Math.cbrt ((3 * V) / (4 * Math.PI));
        System.out.print("The radius of the sphere is: " );
        System.out.printf("%.1f %n",r);

        // find and print surface area
        double A = 4 * Math.PI * Math.sqrt(r);
        System.out.print("The surface area of the sphere is: ");
        System.err.printf("%.2f%n", A);

        sc.close();




    }
}
