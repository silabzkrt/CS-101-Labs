public class Lab01_Q3 {
    // We are given the total area of the world 
    /*We are expected to find :
    - Turkey's dryland and water
    -World's dryland and water
    -Dryland outside of Turkey (in percentages)
    -Waterland outside Turkey (also in percentages) */
 
    //So first we should find Turkey's total area also distribution of the dryland and the water
 
 public static void main(String[] args) {
     final double worldtotalarea = 510072000;
     final double turkeytotalarea = worldtotalarea / 6510.42;
     double turkeydryland = (turkeytotalarea * 76) / 77;
     double turkeywater = turkeytotalarea - turkeydryland;
     System.out.println("Turkey has " + (int)turkeydryland + " km2 dryland" + " and " + (int)turkeywater + " km2 water.");
     
     // now we should find world's distribution of water and dryland 
 
     double worlddryland = (worldtotalarea * 29.2) / 100;
     double worldwater = worldtotalarea - worlddryland;
     System.out.println("Earth has" + " " + (int)worlddryland + " km2 dryland" + " and " + (int)worldwater + " km2 water.");
 
     // then we should find the percentage of Turkey's dryland compared to the Earth
 
     double turkeydrypercentage = ((int)turkeydryland / worlddryland) * 100;
     System.out.println("Turkey has " + turkeydrypercentage + " percent of the Earth's dryland");
 
     // we should do the same for water
 
     double turkeywaterpercentage = turkeywater / worldwater * 100;
     double restoftheworldwater = 100 - turkeywaterpercentage;
     System.out.println("Percentage of Earth water outside Turkey is " + restoftheworldwater+ " percentage.");
 
 
 
 
 
 }
 
 }