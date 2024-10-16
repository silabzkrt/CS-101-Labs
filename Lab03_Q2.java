import java.util.Scanner;
public class Lab03_Q2 {

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

    double scorecredithours;

    if ( completedcredithours < 40) {
        scorecredithours = 15 * completedcredithours; }

    else {
        scorecredithours = 600; }

    double scoreextracurricular;

    if ( extracurricularhours < 30) {
        scoreextracurricular = 10 * extracurricularhours; }

    else { 
        scoreextracurricular = 300; }

    double scoreacademichonors;

    if (academichonors < 5) {
        scoreacademichonors = 20 * academichonors;}

    else {
        scoreacademichonors = 100; }

    double scholarshipscore = 200 + scoreextracurricular+ scoreacademichonors + scorecredithours- 5 * (annualfamilyincome / 5000);

    System.out.println("Scholarship score is: " + (int)scholarshipscore);

    boolean eligible = (gpa >= 3.5 && completedcredithours >= 30 && extracurricularhours >= 20 && annualfamilyincome <= 75000 && scholarshipscore >=900);

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
