package start;

import my_pattern_with_data.Movie;

/**
 * 16M-OOP
 * 19 10 : 31
 */
public class Test {
    public static void main(String[] args) {
        Movie movie1 = new Movie(
                "Титаник",
                "Кэмерон",
                "Хороший,все умирают",
                "мелодрама",
                200,
                2_000_000);

        //System.out.println(movie1.toDisplay());
        Movie movie2 = new Movie(
                "Гари Потер",
                "НеМихалков",
                "Очень хороший, не все умирают",
                "детский",
                100,
                300_000
        );

        Movie[] netflix = new Movie[]{movie1, movie2};

        Movie.movieArrayGenreToDisplay(netflix, "детский");
        Movie[] amazonPrime = new Movie[0];
        my_pattern_with_data.Movie.movieArrayGenreToDisplay(amazonPrime, "ужас");

        /*
        img + anons + awtor
         */
    }
}
