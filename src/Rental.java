class Rental {
    Movie _movie;
    private int _daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        _movie = newmovie;
        _daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return _daysRented;
    }
    public Movie getMovie() {
        return _movie;
    }

    int getFrequentRenterPoints() {
        // add frequent renter points

        // add bonus for a two day new release rental
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            return 2;
        else return 1;
}

    double getCharge() {
        return _movie.getCharge(_daysRented);
    }
}