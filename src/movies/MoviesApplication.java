package movies;

import util.Input;

public class MoviesApplication {

    public static void movieOptions() {
        System.out.println("\nWhat would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in teh scifi category\n");
    }

    public static void allMovies(Movie[] movies){
        for(Movie movie : movies){
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void movieCategory(Movie[] movies, String category){
        for(Movie movie : movies){
            if(movie.getCategory().equals(category)){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        Input input = new Input();

        do {
            movieOptions();
            System.out.println("Enter your choice:");
            int userInput = input.getIntChoice();

            if(userInput == 1) {
                allMovies(movies);
            } else if (userInput == 2){
                movieCategory(movies, "animated");
            } else if (userInput == 3){
                movieCategory(movies, "drama");
            } else if (userInput == 4){
                movieCategory(movies, "horror");
            } else if (userInput == 5){
                movieCategory(movies, "scifi");
            }
        } while(input.yesNo());
        System.out.println("See you next time!");
    }


}
