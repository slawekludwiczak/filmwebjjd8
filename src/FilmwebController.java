import java.util.Scanner;

public class FilmwebController {

    private static final int ADD_MOVIE = 1;
    private static final int REMOVE_MOVIE = 2;
    private static final int SEARCH_MOVIE = 3;
    private static final int EXIT = 4;

    private MovieDatabase database = new MovieDatabase();
    private UIService uiService = new UIService();

    void mainLoop() {
        int option;
        do {
            showOptions();
            option = readOption();
            executeOption(option);
        } while (option != EXIT);
    }

    void showOptions() {
        System.out.println(ADD_MOVIE + " = Dodanie filmu");
        System.out.println(REMOVE_MOVIE + " = Usuwanie filmu");
        System.out.println(SEARCH_MOVIE + " = Wyszukaj film");
        System.out.println(EXIT + " = Koniec programu");
    }

    int readOption() {
        int optionNumber = uiService.readOption();
        return optionNumber;
    }

    void executeOption(int opt) {
        switch (opt) {
            case ADD_MOVIE:
                addMovie();
                break;
            case REMOVE_MOVIE:
                removeMovie();
                break;
            case SEARCH_MOVIE:
                break;
            case EXIT:
                break;
            default:
                System.out.println("Nieznana opcja");
        }
    }

    private void addMovie() {
        Movie movie = uiService.readMovie();
        database.add(movie);
    }

    private void removeMovie() {
        int movieId = uiService.readMovieId();
        database.removeById(movieId);
    }

}
