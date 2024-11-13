package lab6;
import java.util.Scanner;

public class Lab6_Q1 {
    public static int greatestCommonMultipler (int a , int b) {
        while ( b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a ;
    }
    public static int leastCommonMultiple (int a , int b) {
        return (a*b) / greatestCommonMultipler(a, b);
    }

    public static boolean isRelativelyPrime (int a, int b) {
        boolean prime;
        if (greatestCommonMultipler(a, b) == 1) {
            prime = true;
        }
        else {
            prime = false;
        }
        return prime;
    }
    public static long binaryRepresentation (int a) {
        String binary = Integer.toBinaryString(a);
        return Long.parseLong(binary);
    }

    public static long binaryReversal (int a) {
        long binary = binaryRepresentation(a);
        String binaryString = Long.toString(binary);
        String reversedBinary = "";
        for (int i =binaryString.length() -1; i >= 0; i--){
            reversedBinary += binaryString.charAt(i);
        }
        return Long.parseLong(reversedBinary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        
        if (isRelativelyPrime(firstNumber, secondNumber) == true) {
            System.out.println(firstNumber + " and " + secondNumber + " are relatively prime." );
        }
        else {
            System.out.println(firstNumber + " and " + secondNumber + " are not relatively prime." );
        }

        System.out.println("Greatest common divisor of " + firstNumber + " and " + secondNumber + " is " + greatestCommonMultipler(firstNumber, secondNumber));
        System.out.println("Least common multiple of " + firstNumber + " and " + secondNumber + " is " + leastCommonMultiple(firstNumber, secondNumber));

        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        System.out.println("Binary representation of " + decimalNumber + " is " + binaryRepresentation(decimalNumber));
        System.out.println("Binary reversal of " + decimalNumber + " is " + binaryReversal(decimalNumber));
        
        sc.close();
    }
}
