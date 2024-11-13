import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner (System.in);
         while(true)
        {
            System.out.println("Enter a positive number: ");
            number = sc.nextInt();
            int sum = 0;

            while ( number > 0) {
                int digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            } 
            System.out.println("Sum of digits: " + sum);
        }System.out.println("");
    }
}
