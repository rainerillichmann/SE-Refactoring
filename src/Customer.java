
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector _rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {

        Enumeration enum_rentals = _rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {

            Rental each = (Rental) enum_rentals.nextElement();



            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each._movie.Price.getCharge(each.getDaysRented())) + "\n";

        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(GetTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(GetTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private double GetTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each._movie.Price.getCharge(each.getDaysRented());
        }
        return result;
    }

    private int GetTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each._movie.Price.getFrequentRenterPoints(each.getFrequentRenterPoints());
        }
        return result;
    }
}
    