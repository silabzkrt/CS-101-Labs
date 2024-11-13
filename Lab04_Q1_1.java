import java.util.Scanner;

public class Lab04_Q1_1
{
    public static void main(String[] args) 
    {
        
    
    Scanner sc = new Scanner(System.in);
    while (true) 
    {
    System.out.print("Enter a number: ");
    int factorial = 1;
    int number = sc.nextInt();
    int prevNumber = number;
    if(number > 0)
    {
        while(number > 0)
        {
            factorial = number * factorial;
            number = number -1 ;

        }
       
    
    System.out.println("Factorial of " + prevNumber + " is " + factorial);
    }
    else
    {
        System.out.print("Program finished.");


    }
    sc.close();
   
    }
    }
}

