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

    double getCharge() {
        return _movie.Price.getCharge(_daysRented);
    }

    int getFrequentRenterPoints() {
        return _movie.Price.getFrequentRenterPoints(_daysRented);
    }
}