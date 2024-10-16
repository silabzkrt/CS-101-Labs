import java.util.Scanner;

public class Lab02_Q3 {
  public static void main(String[] args) {
    // we define and open the Scanner
    Scanner sc = new Scanner (System.in);
    //ask user for input
    System.out.println("Enter date and time: ");
    //we'll read input and trim spaces
    String input = sc.nextLine().trim();
    // incase the user inputs spaces, we remove the axtra spaces by replace
    String newInput = input.replace(" ","" );
    
    //we'll define where to find slashes, commas and dashes
    int firstPart = newInput.indexOf('/');
    int secondPart = newInput.indexOf('/', firstPart + 1);
    int thirdPart = newInput.indexOf(',');
    int fourthPart = newInput.indexOf('-');

    //now we'll begin extracting month, day and year from the input; wel'll also trim the spaces

    String year = newInput.substring(0, firstPart).trim();
    String month = newInput.substring(firstPart + 1, secondPart).trim();
    String day = newInput.substring(secondPart + 1, thirdPart).trim();
    String weekday = newInput.substring( thirdPart + 1, fourthPart);
    String time = newInput.substring(fourthPart + 1);

    // to be able to get the desired result we have to find a way to split time to hours and minutes
    int colon = time.indexOf(':');
    String minute= time.substring(colon + 1);
    String hour = time.substring(0, colon);

    //we print the substring as asked of us

    System.out.println("Date: " + day);
    System.out.println("Day: " + weekday);
    System.out.println("Month: "+ month);
    System.out.println("Year: " + year);
    System.out.println("Time: " + minute + " minutes after " + hour );

    sc.close();

  }  
}
