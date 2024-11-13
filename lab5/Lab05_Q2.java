package lab5;
import java.util.Random;

public class Lab05_Q2 
{
    public static void main(String[] args) 
    {
        String cardDeck = "";
        Random random = new Random ();
        int red = 0;
        int green = 0;
        int blue = 0;
        int magenta = 0;
        int yellow = 0;

        while (cardDeck.length ()< 125) 
        {
            int choice = random.nextInt(5);

            if (choice == 0 && red < 25) {
                cardDeck += "R";
                red ++;
            }
            
            else if (choice == 1 && green < 25) {
                cardDeck += "G";
                green ++;
            }
            else if ( choice == 2 && blue < 25) {
                cardDeck += "B";
                blue ++;
            }
            else if ( choice == 3 && magenta < 25) {
                cardDeck +="M";
                magenta ++;
            }
            else if ( choice == 4 && yellow < 25) {
                cardDeck += "Y";
                yellow ++;
            } 
        }

        System.out.print("Welcome!\nLet's shuffle a deck: ");
        System.out.print(cardDeck+"\n");
        
        System.out.println("Game begins!");

        int playerNumber = 0;
        int cardCount = 0;
        String playerOne = "";
        String playerTwo = "";
        String playerThree = "";

        while ( playerNumber <= 3 && cardCount < 5)
        {
            int chosenCard = 0;
            while (chosenCard < 5) 
            {
                String card = "";
            
                if (playerNumber == 1)
                {
                    card = cardDeck.substring(chosenCard,chosenCard + 1);
                    playerOne += card;
                }
                cardDeck = cardDeck.replaceFirst(playerOne , "");

                if (playerNumber == 2) 
                {
                    card = cardDeck.substring(chosenCard, chosenCard + 1);
                    playerTwo += card;
                }
                cardDeck = cardDeck.replaceFirst(playerTwo, "");

                if (playerNumber == 3)
                {
                    card = cardDeck.substring(chosenCard, chosenCard + 1);
                    playerThree += card;
                }
                cardDeck = cardDeck.replaceFirst(playerThree, "");
                
                chosenCard ++;
                cardCount ++;          
            }
            playerNumber ++;
            cardCount = 0;
        }

        System.out.println("Player 1: " + playerOne);
        System.out.println("Player 2: " + playerTwo);
        System.out.println("Player 3: " + playerThree);

        int gameRound = 1 ;
        int playerCount = 0; 
        boolean continueGame = true;
        String playerOneRouteTwo = "";
        String playerOneRouteThree = "";
        String playerOneRouteFour = "";
        String playerOneRouteFive = "";
        String playerOneRouteSix = "";
        String playerTwoRouteTwo = "";
        String playerTwoRouteThree = "";
        String playerTwoRouteFour = "";
        String playerTwoRouteFive = "";
        String playerTwoRouteSix = "";
        String playerThreeRouteTwo = "";
        String playerThreeRouteThree = "";
        String playerThreeRouteFour = "";
        String playerThreeRouteFive = "";
        String playerThreeRouteSix = "";
        

        while (continueGame) 
        {
            System.out.printf("%6s %10s %2s %s", "######", "Game round", gameRound, "\n");
            for (playerCount = 1 ; playerCount <= 3 ; playerCount ++) 
            {
                System.out.printf("%4s %6s %s %4s","##", "Player",playerCount,"##\n");
                if (playerCount == 1) 
                {
                    System.out.printf("%4s %15s %5s %s", " ","Previous Hand: " , playerOne,"\n");

                    if (findRepated(playerOne)) {
                        if(checkForSix(playerOne, printRepeated(playerOne))&& playerOneRouteSix.isEmpty()) 
                        {
                            playerOneRouteSix += printRepeated(playerOne);
                            playerOne = playerOne.replace(findRepeatedString(playerOne),"");
                        }

                        else if (checkforFive(playerOne, printRepeated(playerOne))&& playerOneRouteFive.isEmpty())
                        {
                            playerOneRouteFive += printRepeated(playerOne);
                            playerOne = playerOne.replace(findRepeatedString(playerOne),"");
                        }

                        else if(checkForFour(playerOne, printRepeated(playerOne))&& playerOneRouteFour.isEmpty()) 
                        {
                            playerOneRouteFour += printRepeated(playerOne);
                            playerOne = playerOne.replace(findRepeatedString(playerOne),"");
                        }

                        else if(checkForThree(playerOne, printRepeated(playerOne))&& playerOneRouteThree.isEmpty())
                        {
                            playerOneRouteThree += printRepeated(playerOne) ;
                            playerOne = playerOne.replace(findRepeatedString(playerOne),"");
                        }
                
                        else if  (checkForTwo(playerOne, printRepeated(playerOne)) && playerOneRouteTwo.isEmpty())
                        {
                            playerOneRouteTwo += printRepeated(playerOne);
                            playerOne = playerOne.replace(findRepeatedString(playerOne),"");
                        }
                        

                        System.out.printf("%4s %16s ", " ", "Route Completed!\n");
                        System.out.printf("%4s %14s %5s %s","","Current Hand: ",playerOne , "\n");
                        System.out.printf("%4s %14s %5s %s","","Route#2: ",playerOneRouteTwo, "\n");
                        System.out.printf("%4s %14s %5s %s","","Route#3: ",playerOneRouteThree, "\n");
                        System.out.printf("%4s %14s %5s %s","","Route#4: ",playerOneRouteFour, "\n");
                        System.out.printf("%4s %14s %5s %s","","Route#5: ",playerOneRouteFive, "\n");
                        System.out.printf("%4s %14s %5s %s","","Route#6: ",playerOneRouteSix, "\n");
                        
                    }
                else {
                    System.out.println(playerOne);
                    String selected = selectCard(cardDeck, 3);
                    playerOne += selected;
                    System.out.println(playerOne);
                    cardDeck = cardDeck.replaceFirst(selected, "");
                }
                    if (!playerOneRouteTwo.equals("") && !playerOneRouteThree.equals("") && !playerOneRouteFour.equals("") && !playerOneRouteFive.equals("") && !playerOneRouteSix.equals(""))
                    {
                        continueGame = false;
                    }
                }
        
        if (playerCount ==2) 
        {
            System.out.printf("%4s %15s %5s %s", " ","Previous Hand: " , playerTwo,"\n");

            if (findRepated(playerTwo)) {
                if(checkForSix(playerTwo, printRepeated(playerTwo))&& playerTwoRouteSix.isEmpty()) 
                {
                    playerTwoRouteSix += printRepeated(playerTwo);
                    playerTwo = playerTwo.replace(findRepeatedString(playerTwo),"");
                }

                else if (checkforFive(playerTwo, printRepeated(playerTwo))&& playerTwoRouteFive.isEmpty())
                {
                    playerTwoRouteFive += printRepeated(playerTwo);
                    playerTwo = playerTwo.replace(findRepeatedString(playerTwo),"");
                }

                else if(checkForFour(playerTwo, printRepeated(playerTwo))&& playerTwoRouteFour.isEmpty()) 
                {
                    playerTwoRouteFour += printRepeated(playerTwo);
                    playerTwo = playerTwo.replace(findRepeatedString(playerTwo),"");
                }

                else if(checkForThree(playerTwo, printRepeated(playerTwo))&& playerTwoRouteThree.isEmpty())
                {
                    playerTwoRouteThree += printRepeated(playerTwo) ;
                    playerTwo = playerTwo.replace(findRepeatedString(playerTwo),"");
                }
        
                else if  (checkForTwo(playerTwo, printRepeated(playerTwo)) && playerTwoRouteTwo.isEmpty())
                {
                    playerTwoRouteTwo += printRepeated(playerTwo);
                    playerTwo = playerTwo.replace(findRepeatedString(playerTwo),"");
                }
                

                System.out.printf("%4s %16s ", " ", "Route Completed!\n");
                System.out.printf("%4s %14s %5s %s","","Current Hand: ",playerTwo , "\n");
                System.out.printf("%4s %14s %5s %s","","Route#2: ",playerTwoRouteTwo, "\n");
                System.out.printf("%4s %14s %5s %s","","Route#3: ",playerTwoRouteThree, "\n");
                System.out.printf("%4s %14s %5s %s","","Route#4: ",playerTwoRouteFour, "\n");
                System.out.printf("%4s %14s %5s %s","","Route#5: ",playerTwoRouteFive, "\n");
                System.out.printf("%4s %14s %5s %s","","Route#6: ",playerTwoRouteSix, "\n");
            }
                    
        }

        if (playerCount == 3)
        {
            System.out.printf("%4s %15s %5s %s", " ","Previous Hand: " , playerThree,"\n");

            if (findRepated(playerThree)) {
                if(checkForSix(playerThree, printRepeated(playerThree))&& playerThreeRouteSix.isEmpty()) 
                {
                    playerThreeRouteSix += printRepeated(playerThree);
                    playerThree = playerThree.replace(findRepeatedString(playerThree),"");
                }

                else if (checkforFive(playerThree, printRepeated(playerThree))&& playerThreeRouteFive.isEmpty())
                {
                    playerThreeRouteFive += printRepeated(playerThree);
                    playerThree = playerThree.replace(findRepeatedString(playerThree),"");
                }

                else if(checkForFour(playerThree, printRepeated(playerThree))&& playerThreeRouteFour.isEmpty()) 
                {
                    playerThreeRouteFour += printRepeated(playerThree);
                    playerThree = playerThree.replace(findRepeatedString(playerThree),"");
                }

                else if(checkForThree(playerThree, printRepeated(playerThree))&& playerThreeRouteThree.isEmpty())
                {
                    playerThreeRouteThree += printRepeated(playerThree) ;
                    playerThree = playerThree.replace(findRepeatedString(playerThree),"");
                }
        
                else if  (checkForTwo(playerThree, printRepeated(playerThree)) && playerThreeRouteTwo.isEmpty())
                {
                    playerThreeRouteTwo += printRepeated(playerThree);
                    playerThree = playerThree.replace(findRepeatedString(playerThree),"");
                }
                

                System.out.printf("%4s %16s ", " ", "Route Completed!\n");
                System.out.printf("%4s %14s %5s %s","","Current Hand: ",playerThree , "\n");
                System.out.printf("%4s %14s %5s %s","","Route#2: ",playerThreeRouteTwo, "\n");
                System.out.printf("%4s %14s %5s %s","","Route#3: ",playerThreeRouteThree, "\n");
                System.out.printf("%4s %14s %5s %s","","Route#4: ",playerThreeRouteFour, "\n");
                System.out.printf("%4s %14s %5s %s","","Route#5: ",playerThreeRouteFive, "\n");
                System.out.printf("%4s %14s %5s %s","","Route#6: ",playerThreeRouteSix, "\n");
                        
            }
            
            
            if (!playerThreeRouteTwo.equals("") && !playerThreeRouteThree.equals("") && !playerThreeRouteFour.equals("") && !playerThreeRouteFive.equals("") && !playerThreeRouteSix.equals(""))
            {
                continueGame = false;
            }
        } 
        }
        gameRound ++;
        boolean playerOneFinish = !playerOneRouteTwo.equals("") && !playerOneRouteThree.equals("") && !playerOneRouteFour.equals("") && !playerOneRouteFive.equals("") && !playerOneRouteSix.equals("");
        boolean playerTwoFinish = !playerOneRouteTwo.equals("") && !playerOneRouteThree.equals("") && !playerOneRouteFour.equals("") && !playerOneRouteFive.equals("") && !playerOneRouteSix.equals("");
        boolean playerThreeFinish = !playerThreeRouteTwo.equals("") && !playerThreeRouteThree.equals("") && !playerThreeRouteFour.equals("") && !playerThreeRouteFive.equals("") && !playerThreeRouteSix.equals("");
        if (playerOneFinish || playerTwoFinish || playerThreeFinish) {
            continueGame = false;
            System.out.println("*********************");
            System.out.println("Game finished!\n");

            System.out.println("Player1 total route points: " + playerOneRouteTwo.length() + playerOneRouteThree.length() + playerOneRouteFour.length()+ 
            playerOneRouteFive.length() + playerOneRouteSix.length());
            System.out.println("Player1's remaining card count in hand: " + playerOne.length() + "\n");

            System.out.println("Player 2 total route points: "+ playerTwoRouteTwo.length() + playerTwoRouteThree.length() + playerTwoRouteFour.length()+ 
            playerTwoRouteFive.length() + playerTwoRouteSix.length());
            System.out.println("Player2's remaining card count in hand: " + playerTwo.length() + "\n");

            System.out.println("Player 3 total route points: " + playerThreeRouteTwo.length() + playerThreeRouteThree.length() + playerThreeRouteFour.length()+ 
            playerThreeRouteFive.length() + playerThreeRouteSix.length());
            System.out.println("Player 3's remaining card count in hand: " + playerThree.length() + "\n");

            System.out.println("Number of remaining cards on deck " + cardDeck.length());
            System.out.println("TOTAL= " + playerTwoRouteTwo.length() + playerTwoRouteThree.length() + playerTwoRouteFour.length()+ 
            playerTwoRouteFive.length() + playerTwoRouteSix.length() + playerTwoRouteTwo.length() + playerTwoRouteThree.length() + 
            playerTwoRouteFour.length()+ playerTwoRouteFive.length() + playerTwoRouteSix.length() + playerThreeRouteTwo.length() + 
            playerThreeRouteThree.length() + playerThreeRouteFour.length()+ playerThreeRouteFive.length() + playerThreeRouteSix.length()
            + playerOne.length() + playerTwo.length() + playerThree.length() + cardDeck.length());
        }
    }
        
    }

    public static String selectCard (String deck, int noOfCards) {
        String selectedCards = deck.substring(0, noOfCards);
        return selectedCards;
    }
       
    public static String reviseDeck (String deck, int noOfCards) {
        String selectedCards = selectCard(deck, noOfCards);
        String newDeck = deck.replaceFirst(selectedCards, "");
        return newDeck;
    }

    public static boolean checkAvailable (String route, int length ){
        boolean available = true;
        if ( route.length() == length) {
        available = false;
    }
    return available; }

    public static String findRepeatedString(String hand) {
        String repeated = "";
        int repeatCount = 0;
    
        for (int a = 0; a < hand.length(); a++) {
            char card = hand.charAt(a);
            int count = 0;
    
            for (int b = 0; b < hand.length(); b++) {
                if (hand.charAt(b) == card) {
                    count++;
                }
            }
    
            if (count > repeatCount) {
                repeatCount = count;
                repeated = String.valueOf(card);
            }
        }
    
        if (repeatCount <= 1) {
            repeated="";
        }
    
        return repeated;
    }
    public static int countRepeatedCharacter (String hand) {
        String repeat = findRepeatedString(hand);
        char repeatedCard = repeat.charAt(0);
        int position = 0;
        int count = 0;

        while (position < hand.length()){
            char card = hand.charAt(position);
            if (card == repeatedCard) {
                count ++;
            }

        position ++;
        }
        return count;
    }
    public static String printRepeated (String hand) {
        int repeat = countRepeatedCharacter(hand);
        String repeatedCard = findRepeatedString(hand);
        String printed = "";
        for ( int count = 0; count < repeat ; count ++) {
            printed += repeatedCard;
        }
        return printed;
    }
    public static String removeRepeated (String hand) {
        String repeat = findRepeatedString(hand);
        String newHand ="";
        if (!repeat.isEmpty()){
            newHand += hand.replace(repeat, "");
        }
        return newHand;

    }

    public static boolean findRepated (String hand) {
        boolean isRepeated = true;
        if (findRepeatedString(hand).isEmpty()) {
            isRepeated = false;
        }
        return isRepeated;
    }

    public static boolean checkForSix (String hand, String playerNumberRouteSix) {
        boolean routesix = false;
        if (printRepeated(hand).length() == 6){
            routesix = true;
        }
        return routesix;
    }

    public static boolean checkforFive(String hand,String playerNumberRouteFive) {
        boolean routefive = false;
        if (printRepeated(hand).length() == 5){
            routefive = true;
        }
        return routefive;
    }
    

    public static boolean checkForFour (String hand, String playerNumberRouteFour) {
        boolean routefour = false;
        if (printRepeated(hand).length() == 4){
            routefour = true;
        }
        return routefour;
    }

    public static boolean checkForThree (String hand, String playerNumberRouteThree) {
        boolean routethree = false;
        if (printRepeated(hand).length() == 3){
            routethree = true;
        }
        return routethree;
    }

    public static boolean checkForTwo (String hand, String playerNumberRouteTwo) 
    {
        boolean routetwo = false;
        if (printRepeated(hand).length() == 2){
            routetwo = true;
        }
        return routetwo;
    }

}