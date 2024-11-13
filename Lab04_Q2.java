import java.util.Scanner;
public class Lab04_Q2 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner (System.in);

        boolean correct = 2 < 3;
         while(correct)
         {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
            int sum = 0;
            if(number > 0) {
                while ( number > 0) {
                    int digit = number % 10;
                    sum = sum + digit;
                    number = number / 10;
                }
                System.out.println("Sum of digits: " + sum);
            }
            
            else {
                System.out.println("Program finished.");
                System.exit(0);
            }
        } 
        sc.close();
        
    }
}
