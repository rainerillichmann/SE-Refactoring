/**
 * Created by z003dwcn on 02.05.2016.
 */
public class ChildrensPrice extends Price{
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    double getCharge(int daysRented){
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
