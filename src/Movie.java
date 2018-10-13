public class Movie {

    private String title;
    private int year;
    private String genre;
    private String director;

    Movie() {}

    Movie(String title, int year, String genre, String director) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    void show() {
        System.out.printf("%s %d %s %s", title, year, genre, director);
    }
}
