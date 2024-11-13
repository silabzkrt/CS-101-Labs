import java.util.Scanner ;
public class Lab04_04
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int inputNumber ;
        int primeCount ;
        int sum ;
        String feedback = "yes" ; 
        //start the loop when entered yes
        while (feedback.equals("yes")) {
        System.out.print("Enter a positive number: ") ;
        inputNumber = sc.nextInt() ;
        System.out.print("Prime numbers: ") ;
        int divided = 1 ; 
        primeCount = 0 ; // how many prime numbers do we have we'll increase this count everytime we encounter a prime number
        sum = 0 ;
            while (divided < inputNumber )
            {   int divisorNumber = 0 ;
                int divisor = 1 ;
                while (divisor < divided)
                {
                    if (divided%divisor == 0)
                    {
                    divisorNumber++ ;
                    }
                    divisor++ ;
                    
                }
                if (divisorNumber == 1) // if it's a prime number
                    {
                        primeCount++ ; // since we have found a prime number we increment the count
                        sum += divided ; // we add our number to the sum of the other prime numbers we found if we found any
                        System.out.print(" " + divided) ; // we print it on the list
                    }
                divided++ ;
            }
            // we print the sum of primes, count of them and ask the user whether to continue again
            System.out.printf("%nSum of primes: " + sum) ; 
            System.out.printf("%nCount of primes: " + primeCount) ;
            System.out.printf("%nDo you want to calculate again? (yes/no): ") ;
            feedback = sc.next() ; // since we had defined what feedback is in the beginning we dont have to define it again
        }
        if (feedback.equals("no"))
        // the program would be over when we enter no
        System.out.print("Program finished.") ;

        sc.close();
    }
}
