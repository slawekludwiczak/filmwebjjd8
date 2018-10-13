import java.util.Scanner;

public class Filmweb {
    public static void main(String[] args) {
        Movie[] movies = new Movie[5];
        movies[0] = new Movie("Titanic", 1997, "Dramat", "James Cameron");

        System.out.println("Dodaj film");
        Scanner scanner = new Scanner(System.in);
        movies[1] = new Movie();
        System.out.println("Podaj tytuł");
        movies[1].setTitle(scanner.nextLine());
        System.out.println("Podaj rok");
        movies[1].setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj gatunek");
        movies[1].setGenre(scanner.nextLine());
        System.out.println("Podaj reżysera");
        movies[1].setDirector(scanner.nextLine());

        movies[0].show();
    }
}
