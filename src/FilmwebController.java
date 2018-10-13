import java.util.Scanner;

public class FilmwebController {

    private static final int ADD_MOVIE = 1;
    private static final int REMOVE_MOVIE = 2;
    private static final int SEARCH_MOVIE = 3;
    private static final int EXIT = 4;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numer opcji:");
        int optionNumber = scanner.nextInt();
        return optionNumber;
    }

    void executeOption(int opt) {
        switch (opt) {
            case ADD_MOVIE:

                break;
            case REMOVE_MOVIE:

                break;
            case SEARCH_MOVIE:

                break;
            case EXIT:
                break;
            default:
                System.out.println("Nieznana opcja");
        }
    }

}
