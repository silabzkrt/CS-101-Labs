package lab6;
import java.util.Scanner;

public class Lab06_Q2 {
    public static boolean validateEmail (String email) {
        boolean validated = true;
        if (!email.endsWith(".edu.tr") || !email.contains("@") || !email.contains(".")) {validated = false;}

        int firstDot = email.indexOf('.');
        int atSymbol = email.indexOf('@');
        int lastDot = email.indexOf('.');

        if (firstDot < 0 || atSymbol < 0 || lastDot < 0) {
            validated = false;
        }
        return validated;
    }
    public static boolean checkForLetters ( String email) {
        boolean hasLetters = true;
        for (int i = 0; i < email.length(); i++) {
            if(!Character.isLetter(email.charAt(i))) { hasLetters = false;}
        }
        return hasLetters;
    }

    public static boolean checkPassword(String password) {
        if (password.length() < 8) {
            System.out.println("The password is not valid, please enter another password.");
            return false;
        }
    
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
    
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
    
            if (isUpperCase(ch)) {
                hasUppercase = true;
            } else if (isLowerCase(ch)) {
                hasLowercase = true;
            } else if (ch >= '0' && ch <= '9') {  
                hasDigit = true;
            }
    
            if (hasUppercase && hasLowercase && hasDigit) {
                System.out.println("The password is valid.");
                return true;
            }
        }
    
        System.out.println("The password is not valid, please enter another password.");
        return false;
    }
    public static String capitalizeFirstLetter (String name) {
        String upperCase = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return upperCase;
    }
    public static boolean isUpperCase(char ch) {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return uppercaseLetters.indexOf(ch) != -1;
    }
    public static boolean isLowerCase(char ch) {
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        return lowercaseLetters.indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email: ");
        String email = sc.next();
        while (!validateEmail(email)) {
            System.out.println("The email is not valid, please enter a valid email");
            System.out.print("Enter the email: ");
            email = sc.next();
        }
        int firstDot = email.indexOf('.');
        int atSymbol = email.indexOf('@');
        int lastDot = email.lastIndexOf('.');

        String studentName = email.substring(0, firstDot);
        String studentSurname = email.substring(firstDot + 1, atSymbol);
        String universtyName = email.substring(atSymbol+1, lastDot);
        universtyName = universtyName.replace(".edu", "");
        System.out.println("Student name: " + capitalizeFirstLetter(studentName));
        System.out.println("Student surname: " + capitalizeFirstLetter(studentSurname));
        System.out.println("Universty Name: " + capitalizeFirstLetter(universtyName));
        System.out.print("Enter the password: ");
        String password = sc.next();

        while (!checkPassword(password)){
            System.out.println("The password is not valid, please enter another password");
            System.out.print("Enter the password: ");
            password = sc.next();
        }
        System.out.println("The password is valid");
        System.out.println("Registiration is successfull");
    }
}
