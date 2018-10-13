import java.util.Scanner;

public class UIService {

    private Scanner scanner = new Scanner(System.in);;

    Movie readMovie() {
        Movie movie = new Movie();
        System.out.println("Podaj unikalne ID");
        movie.setId(readInt());
        System.out.println("Podaj tytuł");
        movie.setTitle(scanner.nextLine());
        System.out.println("Podaj rok");
        movie.setYear(readInt());
        System.out.println("Podaj gatunek");
        movie.setGenre(scanner.nextLine());
        System.out.println("Podaj reżysera");
        movie.setDirector(scanner.nextLine());
        return movie;
    }

    int readOption() {
        System.out.println("Podaj numer opcji");
        return readInt();
    }

    int readMovieId() {
        System.out.println("Podaj ID filmu");
        return readInt();
    }

    private int readInt() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

}
