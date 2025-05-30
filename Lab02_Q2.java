import java.util.Scanner;

public class Lab02_Q2 {
    public static void main(String[] args) {
            final double earthgravity = 1.0;
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter the weight of first Earthling: ");
            double earthling1 = sc.nextDouble()*earthgravity;
    
            System.out.print( "Enter the weight of second earthling: ");
            double earthling2 = sc.nextDouble()*earthgravity;
            
            final double venusgravity = 0.91;
            final double marsgravity = 0.38;
            final double jupitergravity = 2.34;
            final double plutogravity = 0.06;
    
            double earthling1venus = earthling1 * venusgravity;
            double earthling1mars =  earthling1 * marsgravity;
            double earthling1jupiter = earthling1 * jupitergravity;
            double earthling1pluton = earthling1 * plutogravity;
    
            double earthling2venus = earthling2 * venusgravity;
            double earthling2mars =  earthling2 * marsgravity;
            double earthling2jupiter = earthling2 * jupitergravity;
            double earthling2pluton = earthling2 * plutogravity;

            String A = "EARTHLING ONE "+ "(" + earthling1 + " kg" + ")";
            String B = "EARTHLING TWO "+ "(" + earthling2 + " kg" + ")";
            
    
        System.out.printf("%30s %10s %10s %10s %11s%n", "", "VENUS", "MARS", "JUPITER", "PLUTO");
        System.out.printf("%30s %10.2f %10.2f %10.2f %10.2f%n", A, earthling1venus, earthling1mars, earthling1jupiter, earthling1pluton);
        System.out.printf("%30s %10.2f %10.2f %10.2f %10.2f%n", B, earthling2venus, earthling2mars, earthling2jupiter, earthling2pluton);

        
        sc.close();   

    }
}
