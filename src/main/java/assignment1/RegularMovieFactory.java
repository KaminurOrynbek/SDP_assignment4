package assignment1;

class RegularMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}