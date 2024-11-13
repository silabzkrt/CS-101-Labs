import java.util.Scanner;
// 
public class Lab04_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    while (true){
        System.out.print("Enter a positive number: ");
        int positivenumber = sc.nextInt();
        int number = positivenumber;
       
        if (positivenumber > 99999999 || positivenumber <= 0) {
            if (positivenumber > 99999999) {
                System.out.println("Number exceeds 8 digits.");
            }
            System.out.println("Program is finished.");
            System.exit(0);
        }

        else {
        int reversedNumber = 0;
        int sum = 0;

            while ( positivenumber != 0){
                int digita = positivenumber % 10; // we find the last digit
                reversedNumber = reversedNumber * 10 + digita;
                positivenumber /= 10; // with this we can remove the last digit
                if (number > 0) {
                    int digitb = number % 10;
                    sum = sum + digitb;
                    number = number / 10;
                }
            }
        System.out.println("Reversed number: " + reversedNumber+ "\nSum of digits: " + sum);
        }
        
        System.exit(0);
    }
    
    }
    
}
