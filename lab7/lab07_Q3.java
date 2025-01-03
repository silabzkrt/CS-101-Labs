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
            System.out.println((i+1) + ". " + movies.get(i));
        }
    }

    public static void displayReviews (ArrayList<String> movies,  ArrayList<ArrayList <String> > allReviews,
        ArrayList<Double>totalRatings, ArrayList<Integer>reviewCounts) {
        
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
                    if (movieList.isEmpty()) {
                        System.out.println("There's no movie available to delete!");
                        break;
                    }
                    displayMovies(movieList);
                    int removed = sc.nextInt() - 1;
                   if (removed >= 0 && removed < movieList.size()){
                    ArrayList <String> oldList = (ArrayList<String>)movieList.clone();
                    movieList.remove(removed);
                    allReviews.remove(removed);
                    totalRatings.remove(removed);
                    reviewCounts.remove(removed);
                    System.out.println(oldList.get(removed) + " has been removed.");
                   }
                    break;
                case 3:
                    System.out.println("Select a movie to review");
                    displayMovies(movieList);
                    System.out.print("Enter movie number: ");
                    int reviewNumber = sc.nextInt();
                    if (reviewNumber > 0 && reviewNumber <= movieList.size()) {
                        System.out.print("Enter you review: ");
                        String review = sc.next();
                        System.out.print("Enter your rating (1-5): ");
                        int rate = sc.nextInt();
                        while (rate > 5 && 1 > rate) {
                            System.out.println("Your rate should be between 1 and 5! \nTry again");
                            System.out.print("Enter your rating (1-5): ");
                            rate = sc.nextInt();
                        }
                        allReviews.get(reviewNumber).add(review);
                        totalRatings.set(reviewNumber, totalRatings.get(reviewNumber) + rate);
                        reviewCounts.set(reviewNumber, reviewCounts.get(reviewNumber) + 1);
                        System.out.println("Review and rating submitted!");
                    }
                    break;
                case 4:
                   if (movieList.isEmpty()) {
                    System.out.println("There's no movies view! Add movies and reviews first");
                    break;
                   }
                   else {
                    for (int i = 0; i < movieList.size(); i++){
                        System.out.println((i+1) + ". " + movieList.get(i));
                        double averageRate = totalRatings.get(i) / reviewCounts.get(i);
                        System.out.println("Average Rating: " + averageRate);
                        System.out.println("Reviews");
                        if (allReviews.isEmpty()) {
                            System.out.println("No reviews yet");
                        }
                        else {
                            for (String review : allReviews.get(i)) {
                            System.out.println("-" + review);  
                            }
                        }
                    }
                   }
                    break;
            }
        } while (selected != 5);
    }
}
