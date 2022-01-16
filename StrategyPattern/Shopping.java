package SecondOne;

import SecondOne.Model.Currency;
import SecondOne.Model.Product;

import java.util.List;

public interface Shopping {

    double calculatePrice(List<Product> products);
    Currency getCurrency();
}