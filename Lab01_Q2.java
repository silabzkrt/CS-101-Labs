public class Lab01_Q2 {
    // We should form a main String that contains all the information we will print on the terminal window
      
    public static void main(String[] args) {
      //First we would show the calculations necessary for expression1 and print it
  
     double expression1 = ((4.3 + 22) * (5.1 - 7.7)) / (( 32.2 / 17 ) - 22);
     System.out.println("Expression 1  evaluates to: " + expression1); 
     
     //Then we would do the same for expression 2 and 3
     
     // For 2 and 3 however we would use Math.pow command to evaluate expressions that contain a power of an integer or double
     
     // To be able to calculate 2^3 we use Math.pow(2,3) as our expression
  
     double expression2 = (Math.pow(2, 3) * (18 - (3.5 * 4.66))) / (Math.pow(2, 4) - 34);
     System.out.println("Expression 2 evaluates to: " + expression2);
  
     //In order to express (24-0.222)^-1/6 we have to use Math.pow command as well
  
     double expression3 = 3 * Math.pow((24 - 0.222), (- 1 / 6));
     System.out.println("Expression 3 evaluates to: " + expression3); }
    
}
