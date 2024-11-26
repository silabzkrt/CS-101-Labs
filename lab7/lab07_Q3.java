package lab7;
import java.util.Scanner;
import java.util.ArrayList;

public class lab07_Q3 {
    public static int readUserChoice () {
        Scanner sc = new Scanner (System.in);
        System.out.println("1. Add a new movie");
        System.out.println("2. Remove a new movie");
        System.out.println("3. Submit a review and rating for a movie");
        System.out.println("4. View all movies, reviews, and average ratings");
        System.out.println("5. Exit");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public static void displayMovies (ArrayList<String> movies) {
        System.out.println("Movie List: ");
        for (int i = 0; i < movies.size(); i++){
            System.out.println("-" + movies.get(i));
        }
    }
   

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<String> movieList = new ArrayList<String>();
        ArrayList<ArrayList <String> > allReviews = new ArrayList<ArrayList <String>>();
        ArrayList<Double> totalRatings = new ArrayList<>();
        ArrayList<Integer> reviewCounts = new ArrayList<>();
        int selected;
        do
        {
            selected = readUserChoice();
            switch (selected)
            {
                case 1:
                    System.out.print("Enter movie title: ");
                    String movie = sc.next();
                    movieList.add(movie);
                    sc.nextLine(); // skip the rest of the line
                    allReviews.add(new ArrayList<>());
                    totalRatings.add(0.0);
                    reviewCounts.add(0);
                    System.out.println("Movie added!");
                    displayMovies(movieList);
                    break;
                case 2:
                    break;
                case 3:
                    
                    break;
                case 4:
                    //TODO
                    break;
            }
        } while (selected != 5);
    }
}
