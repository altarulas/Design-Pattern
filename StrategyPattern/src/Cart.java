import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Shopping shopping;
    List<Product> products = new ArrayList<>();

    public Cart(Shopping shopping)
    {
        this.shopping = shopping;
    }

    public void addProduct(Product product)
    {
        this.products.add(product);
    }

    public double getTotalPrice()
    {
        return shopping.calculatePrice(products);
    }
}
