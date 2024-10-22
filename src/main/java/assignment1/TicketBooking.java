package assignment1;

class TicketBooking {
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    private TicketBooking(Builder builder) {
        this.movieTitle = builder.movieTitle;
        this.seatNumber = builder.seatNumber;
        this.snackCombo = builder.snackCombo;
    }

    public static class Builder {
        private String movieTitle;
        private String seatNumber;
        private String snackCombo;

        public Builder setMovieTitle(String movieTitle) {
            this.movieTitle = movieTitle;
            return this;
        }

        public Builder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public Builder setSnackCombo(String snackCombo) {
            this.snackCombo = snackCombo;
            return this;
        }

        public TicketBooking build() {
            return new TicketBooking(this);
        }
    }

    @Override
    public String toString() {
        return "TicketBooking [movieTitle=" + movieTitle + ", seatNumber=" + seatNumber + ", snackCombo=" + snackCombo + "]";
    }
}