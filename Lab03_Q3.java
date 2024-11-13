import java.util.Scanner;
public class Lab03_Q3 {
    public static void main(String[] args) {
    /*our goal is to create a program where the user can log in manage their inventory and log out
     so first we have to define a correct username and password
     our user: "manager"
     our password: "inverntory"
     our 3 predefined customers: PrimeTech
                                 EcoGoods
                                 Peak
    Items in the stores will also be defines as Strings
    2 items: Item104:Laptop
             Item125: Monitor
    IDs are followed by a column and then a short name
     */
    String manager = "manager";
    String inventory = "inventory";
    String username;
    String password;
    String customers = "PrimeTech, Peak, EcoGoods,";
    String customer1= customers.substring(0, 9);
    String customer2 = customers.substring(11,15 );
    String customer3 = customers.substring(17, 25);
    String items = "Item104:Laptop Item125:Monitor";
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your username: ");
    username= sc.next();

    if ( username.equals(manager)){
        System.out.print("Enter your password: ");
        password = sc.next();
        
        if ( password.equals(inventory)) {
            System.out.println(" 1- Add customer\n 2- Delete customer\n 3- Add item\n 4- Delete Item\n 5- Logout\n Select an operation: ");

            String input = sc.next();
            if( input.equals("1")){
                System.out.println("--Add Customer");
                System.out.print("Add customer name: ");
                String newcustomer = sc.next();
                int check1 = customers.indexOf(newcustomer);

                if (check1 >= 0){
                    System.out.println("This customer is already in your list!");
                }
                else {
                    System.out.println("New customer " + newcustomer + " is added!\n Your customers: " + "(" + customers + newcustomer + ",)");
                }
            }
            if( input.equals("2")){
                System.out.println("--Delete Customers--");
                System.out.print("Enter customer name wh,ch you want to delete:");
                String deletedcustomer = sc.next();
                int check2 = customers.indexOf(deletedcustomer);
    
                    if (check2 > 0){
                        System.out.println("Enter customer name: " + deletedcustomer);
                        System.out.println(deletedcustomer + " is deleted from customers");
                        if (deletedcustomer.equals(customer1)) {
                            System.out.println("Your customers: (" + customer2 + ","+ customer3 + ")");
                        }
                        else if ( deletedcustomer.equals(customer2)) {
                            System.out.println("Your customers: (" + customer1 + "," + customer3 + "," + ")");
                        }
                        else if (deletedcustomer.equals(customer3)) {
                            System.out.println("Your customers: " + customer1 + "," + customer2 +"," +")");
                        }
                    }
                    if (check2 < 0) {
                        System.out.println("You dont' have any customer whose name is " + deletedcustomer + "\nYour customers: " + customers);
                    }   
                }
            if (input.equals("3")){
                System.out.println("--Add Item--");
                System.out.print("Enter item name: ");
                String item3 = sc.next();
                int check3 = items.indexOf(item3);

                if (check3 >= 0){
                        System.out.println("There is an item with the id " + item3 + ", you cannot add a new item with the same id!\n Your items: " + items);
                }                    
                else if (check3 < 0){
                        double item3id = 1000 * Math.random();
                        item3 = "Item " + (int)item3id + ":" + item3;
                        System.out.println("New item id " + (int)item3id + " is added!\n Your items:" + items + " " + item3);
                }
            }
            if(input.equals("4")){
                System.out.print("--Delete Item--\nEnter itemId which you want to delete: ");
                String deleteditem= sc.next();

                int check4= items.indexOf("Item" + deleteditem);

                if (check4 <= 0)
                {
                    deleteditem=items.substring(check4, check4 + items.indexOf(" ")+1);
                    items= items.replace(deleteditem, "");
                    System.out.println("The item with the id " + deleteditem + " is deleted succesfully!\nYour items: " + items);
                }

                else 
                System.out.println("You don't have any item with the id " + deleteditem +"!\nYour Items: " + items);
                }

            if (input.equals("5")){
                System.out.println("Logged out successfully!");
            } 
        }
        else {
            System.out.println("Incorrect password! Goodbye!");
        }   
    }
    else {
        System.out.println("Username not found! Goodbye!");
    }
       else {
       System.out.println ("Wrong password!); }

       sc.close();
}    
}




