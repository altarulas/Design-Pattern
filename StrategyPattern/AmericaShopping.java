package SecondOne;

import SecondOne.Model.Currency;
import SecondOne.Model.Product;
import SecondOne.Model.Size;

import java.util.List;

public class AmericaShopping implements Shopping{

    Product price;

    @Override
    public double calculatePrice(List<Product> products)
    {
        int count = 0;
        int sum = 0;

        while(count < 3)
        {
            price = products.get(count);
            double p = price.getPrice();
            count++;

            if(products.equals(Size.XL))
                p = p + (p / 100) + 15 + ((p / 10000) * 75) + 10;
            else
                p =  p + (p / 100) + 15 + ((p / 10000) * 75) + 5;

            sum += p;

        }

        return sum;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}
