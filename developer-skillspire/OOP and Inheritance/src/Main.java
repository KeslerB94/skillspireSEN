public class Main {
    public static void main(String[] args) {
        String[] movieCast = {"Actor A", "Actor B"};
        Movie movie = new Movie("Inception", "PG-13", "Christopher Nolan", movieCast, 148, "A mind-bending thriller", 829.89);

        String[] tvCast = {"Actor C", "Actor D"};
        TvShow tvShow = new TvShow("Breaking Bad", "MA", "Vince Gilligan", tvCast, 5, 62);

        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Grossing: $" + movie.getGrossing() + " million");

        System.out.println("TV Show Title: " + tvShow.getTitle());
        System.out.println("Seasons: " + tvShow.getSeasons());
    }
}
