package assignment1;

public class StandardSchedule implements MovieSchedule {
    private Movie movie;
    private String time;

    public StandardSchedule() {}

    @Override
    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public Movie getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return "StandardSchedule [Time=" + time + ", Movie=" + (movie != null ? movie.getTitle() : "None") + "]";
    }
}
