import java.util.List;

public class EuropeShopping implements Shopping{

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
                p = p + ((p / 1000) * 15) + 11 + 5;
            else
                p = p+  ((p / 1000) * 15) + 11;

            sum += p;

        }

        return sum;

    }

    @Override
    public Currency getCurrency() {
        return Currency.EUR;
    }
}
