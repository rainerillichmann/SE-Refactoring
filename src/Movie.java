public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;

    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }
    public int getPriceCode() {
        return Price.getPriceCode();
    }
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                Price = new RegularPrice();
                break;
            case CHILDRENS:
                Price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                Price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    Price Price;

    public String getTitle (){
        return title;
    };

    double getCharge(int daysRented) {
        return Price.getCharge(daysRented);
    }

    int getFrequentRenterPoints(int daysRented) {
        // add frequent renter points

        // add bonus for a two day new release rental
        if ((getPriceCode() == NEW_RELEASE) && daysRented > 1)
            return 2;
        else return 1;
}
}