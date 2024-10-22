package assignment1;

class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;

    private CinemaConfig() { }

    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
}