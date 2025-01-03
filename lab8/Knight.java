package lab8;
public class Knight 
{
    // Instance Variables
    private int yCoordinate;  // y-coordinate of the Knight
    private int healthPoints; // current health points of the Knight
    private char symbolKnight; // visual symbol of the Knight

    /*
     * Initializes the Knight with a specified y position, health, and a visual symbol. It sets the 
     * health using the setHealth() method to ensure the value is non-negative.
     */
    public Knight(int y, int health, char symbol) 
    {
        yCoordinate = y;
        healthPoints = health;
        symbolKnight = symbol;

    }

    /*
     * Returns true if the Knight’s health is greater than zero, meaning the Knight is still alive; 
     * otherwise, returns false.
     */
    public boolean isAlive() 
    {
        if (healthPoints > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
     * Returns a string representation of the Knight, including its symbol and a visual representation
     * of its health using the ‘*’ symbol. The number of asterisks corresponds to the Knight's health.
     */
    public String toString() 
    {
        String healthPointString = "";
        for (int i = 0; i < healthPoints ; i ++) {
            healthPointString += "*";
        }
        return "Knight Symbol"  + (symbolKnight) + "," + "health" + (healthPointString);
    }

    // Getters & Setters
    public int getHealth() 
    {
        return healthPoints;
    }

    public int getY() 
    {
        return yCoordinate;
    }

    public char getSymbol() 
    {
        return symbolKnight;
    }

    public void setY(int y) 
    {
        this.yCoordinate = y;
    }

    /*
     * Sets the Knight’s health to the provided value, but ensures the health is never set to a value 
     * below 0 using Math.max(health, 0)
     */
    public void setHealth(int health) 
    {
        healthPoints = Math.max(0,health);   
    }
}