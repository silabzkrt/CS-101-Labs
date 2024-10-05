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
        
        System.out.format("                          " + "VENUS\t\t"  + "MARS\t\t" +  "JUPITER\t\t" + "PLUTO\t\t\n");
        System.out.print("EARTHLING ONE"+ "(" + earthling1 + " kg" + ")");
        System.out.print("    ");
        System.out.printf("%.2f", earthling1venus);
        System.out.print("         ");
        System.out.printf( "%.2f" ,earthling1mars);
        System.out.print("           ");
        System.out.printf( "%.2f" ,earthling1jupiter);
        System.out.print("           ");
        System.out.printf("%.2f%n" ,earthling1pluton );

        System.out.print("EARTHLING TWO"+ "(" + earthling2 + " kg" + ")");
        System.out.print("   ");
        System.out.printf("%.2f", earthling2venus);
        System.out.print("        ");
        System.out.printf( "%.2f" ,earthling2mars);
        System.out.print("           ");
        System.out.printf( "%.2f" ,earthling2jupiter);
        System.out.print("           ");
        System.out.printf("%.2f " ,earthling2pluton );
        
        sc.close();   





    }
   
   
}
