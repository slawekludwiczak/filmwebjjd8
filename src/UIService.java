import java.util.Scanner;

public class UIService {

    private Scanner scanner = new Scanner(System.in);;

    Movie readMovie() {
        Movie movie = new Movie();
        System.out.println("Podaj tytuł");
        movie.setTitle(scanner.nextLine());
        System.out.println("Podaj rok");
        movie.setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj gatunek");
        movie.setGenre(scanner.nextLine());
        System.out.println("Podaj reżysera");
        movie.setDirector(scanner.nextLine());
        return movie;
    }

}
