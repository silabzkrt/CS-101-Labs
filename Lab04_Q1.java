import java.util.Scanner;
public class Lab04_Q1 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    while (1<2) {
    int number = 1;
    int firstnumber=1;

    while ( number > 0){
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        int outputnumber = number;
        if (number > 0){
            while (number > 0) {
                int factorial  = number * firstnumber ;
                number= number - 1 ;
                if (number == 0){
                    System.out.println("Factorial of " + outputnumber + " is " + factorial);
                }
            }
           
        }
        else {
        System.out.println("Program finished.");
    }
    }
   
    }

}
}