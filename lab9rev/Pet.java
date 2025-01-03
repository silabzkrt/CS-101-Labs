package lab9rev;


public class Pet {
    // attributes
    private String name;
    private String type;
    private int health;
    private int happiness;
    private String mood;
    private User owner;
    private double age;


    //constructor

    public Pet ( String petName,String petType,User petOwner) {
        this.name = petName;
        this.type = petType;
        this.health = 50;
        this.happiness = 50;
        this.mood = "Playful";
        this.owner = petOwner; // should only be changed when pet is relased by user's assosicated method
    }
    public Pet (String petName) {
        this(petName , null , null);
    }

    //methods
    public void feedPet () {
        this.health += 10;
        health = Math.min(health,100);
        if (health == 100){
            System.out.println("Health is Max!");
        }
        this.happiness += 5;
        if (happiness == 100) {
            System.out.println("Happiness is max!");
        }
        this.age += age * 0.25;
        changeMood(happiness, mood);
    }
    public void playWithPet () {
        this.happiness += 15;
        happiness = Math.min(happiness,100);
        if (happiness == 100) {
            System.out.println("Happiness is max!");
        }
        this.age += age * 0.25;
        changeMood(happiness, mood);
    }
    public void groomPet () {
        this.health += 10;
        health = Math.min(health,100);
        if (health == 100){
            System.out.println("Health is Max!");
        }
        this.age += age * 0.25;
    }
    public void changeMood (int happiness, String mood) {
        if (happiness < 50) {
            mood = "Sad";
        }
        else if(50 <= happiness && happiness < 70){
            mood = "Playful";
        }
        else if(happiness <= 70) {
            mood = "Happy";
        }
    }
    public void checkforOld (String petName, String petType, int age, boolean isOld) {
        if (petType.equals("Cat")){
            if (age >= 10) {
                isOld = true;
            }
        }
        else if(petType.equals("Dog")){
            if (age >= 8){
                isOld = true;
            }
        }
        else if (petType.equals("Rabbit")){
            if (age >= 6) {
                isOld = true;
            }
        }
    }
    // getter methods
    public String getMood(){
        return this.mood;
    } 
    public String getName(){
        return this.name;
    }
    public int getHealth (){
        return this.health;
    }
    public int getHappiness(){
        return this.happiness;
    }
    public double getAge(){
        return this.age;
    }
    public User getOwner(){
        return this.owner;
    }
    
    // toString method
    public String toString(){
        return "Pet Name: " +this.name + " , Pet Type: " + this.type + " , Health: " + this.health + " , Happiness: " + this.happiness
        + " , Mood: " + this.mood;
    }

    public String getPetStatus (){
        return this.toString();
    }
}
