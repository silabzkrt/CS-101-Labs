package lab9;
import java.util.Scanner;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Pet> pets;
    private int budget;

    // constructor

    public User (String userName, String userPassword){
        this.username = userName;
        this.password = userPassword;
        this.pets = new ArrayList<Pet>();
        this.budget = 100;
    }

    //methods
    public String getName(){
        return this.username;
    }
    public Pet getPetByName (String petName){
        Pet mypet = new Pet(petName);
        for (Pet pet : pets){
            if (pet.getName().equals(petName)){ // we expect different pet names from the users
                mypet = pet; 
            }
        }
        return mypet;
    }
    public boolean verifyPassword (String password){
        
        return true;
    }
    public void displayPets(){
        for (Pet pet : pets) {
            System.out.println(pet.toString());
        }
    }
    public void displayAverageHealthAndHappiness(){
        double totalhealth = 0;
        double totalHappiness = 0;
        int count = 0;
        for (Pet pet : pets) {
            totalhealth =+ pet.getHealth();
            totalHappiness += pet.getHappiness();
            count ++;
        }
        double averageHealth = totalhealth / count;
        double averageHappiness = totalHappiness / count;
        System.out.print("Average Health: " + averageHealth + ", Average Happiness: " + averageHappiness);
    }
    public void adoptPet(Scanner scanner){
        Scanner sc = new Scanner(System.in);
        String petName = sc.next();
        String petType= sc.next();
        User owner = new User(username, password);
        Pet pet = new Pet (petName,petType,owner);
        
        if (petType.equals("Cat")){
            if (budget - 30 < 0){
                System.out.println("Insufficent budget!");
            }
            else{
                budget -= 30;
                pets.add(pet);
            }
            
        }
        else if (petType.equals("Dog")){
            if (budget - 40 < 0){
                System.out.println("Insufficent budget!");
            }
            else{
                budget -= 40;
                pets.add(pet);
            }
        }
        else if (petType.equals("Rabbit")){
            if (budget - 40 < 0){
                System.out.println("Insufficent budget!");
            }
            else{
                budget -= 40;
                pets.add(pet);
            }
        }
    }
    public void adoptPet (Pet pet){
        if (pet.getOwner() == null) {
            pets.add(pet);
        }
    }
    public void adoptPet(String petName , String petType){
        User owner = new User(username, password);
        Pet pet = new Pet(petName,petType,owner);
        
        if (petType.equals("Cat")){
            if (budget - 30 < 0){
                System.out.println("Insufficent budget!");
            }
            else{
                budget -= 30;
                pets.add(pet);
            }
            
        }
        else if (petType.equals("Dog")){
            if (budget - 40 < 0){
                System.out.println("Insufficent budget!");
            }
            else{
                budget -= 40;
                pets.add(pet);
            }
        }
        else if (petType.equals("Rabbit")){
            if (budget - 40 < 0){
                System.out.println("Insufficent budget!");
            }
            else{
                budget -= 40;
                pets.add(pet);
            }
        }
    }

    public Pet releasePet(Pet pet){
        Pet relasedPet = pet;
        if (pets.contains(pet)) {
            pets.remove(pet);
            return relasedPet;
        }
        else {
            System.out.println("There's not such pet!");
            return null;
        }
    }
    public ArrayList<Pet> searchPetsByHealth(int health){
        ArrayList<Pet>healthyPets = new ArrayList<Pet>();
        for (Pet pet: pets) {
            if (pet.getHealth() >= health){
                healthyPets.add(pet);
            }
        }
        return healthyPets;
    }
    public ArrayList<Pet> searchPetsByHappiness(int happiness){
        ArrayList<Pet>happyPets = new ArrayList<Pet>();
        for (Pet pet: pets) {
            if (pet.getHappiness() >= happiness){
                happyPets.add(pet);
            }
        }
        return happyPets;
    }

}
