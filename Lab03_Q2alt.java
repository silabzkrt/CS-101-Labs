import java.util.Scanner;
public class Lab03_Q2alt {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the student's GPA: ");
        double gpa = sc.nextDouble();
        System.out.print("Enter the total number of completed credit hours: ");
        int completedcredithours= sc.nextInt();
        System.out.print("Enter the extracurricular activity hours: ");
        int extracurricularhours= sc.nextInt();
        System.out.print("Enter the number of academic honors recieved: ");
        int academichonors= sc.nextInt();
        System.out.print("Enter the total annual family income: ");
        double annualfamilyincome = sc.nextDouble();
    
        //Instead of using if and else by using Math.min fınction we can easily use the maximum amount necessary
        double scorecredithours = Math.min(15 * completedcredithours, 600);
        double scoreextracurricular = Math.min(10 * extracurricularhours,300);
        double scoreacademichonors = Math.min(20*academichonors, 100);
    
        //we calculate the scholarship score
        double scholarshipscore = 200 + scoreextracurricular+ scoreacademichonors + scorecredithours- 5 * (annualfamilyincome / 5000);
    
        System.out.println("Scholarship score is: " + (int)scholarshipscore);
    
        //we find the eligiblity by using a boolean, if all of these conditions are not met, student id declared uneligible by our code
        boolean eligible = (gpa >= 3.5 && completedcredithours >= 30 && extracurricularhours >= 20 && annualfamilyincome <= 75000 && scholarshipscore >=900);
        
        //if eligible print it else print uneligible with the reasons
        if(eligible) {
            System.out.println("The student is eligible for scholarship");
        }
    
        else {
            System.out.println("The student is not eligible for scholarship. Reason:");
            if (gpa < 3.5){
                System.out.println("GPA is below 3.5");
            }
    
            if (completedcredithours < 30) {
                System.out.println("Fewer than 30 completed credit hours");
            }
    
            if (extracurricularhours < 20) {
                System.out.println("Fewer than 20 extracurricular activity hours");
            }
    
            if (annualfamilyincome > 75000) {
                System.out.println("Family income exceed 75000$.");
            }
    
            if (scholarshipscore < 900) {
                System.out.println("Total scholarship score is below 900");
            }
            
        }
        
        sc.close();
    }
    
    }
