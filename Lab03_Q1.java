import java.util.Scanner;
public class Lab03_Q1 {
    public static void main(String[] args) {
        System.out.print("Enter your weight in kilograms: ");
        Scanner sc = new Scanner (System.in);
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: " + "%.2f%n ", bmi);
        
        if ( bmi < 18.5 ){
            System.out.println("You are underweight");
        }

        if ( bmi >= 18.5 && bmi < 24.9){
            System.out.println("You are normal weight");
        }

        if ( bmi >= 24.9 && bmi < 29.9){
            System.out.println("You're overweight");
        }

        else {
            System.out.println("Your BMI indicates that you are above the recommended range");
        }

        sc.close();

    }
    
}
