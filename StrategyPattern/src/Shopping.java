import java.util.List;

public interface Shopping {

    double calculatePrice(List<Product> products);
    Currency getCurrency();
}