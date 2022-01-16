package SecondOne;

import SecondOne.Model.Product;
import SecondOne.Model.Region;
import SecondOne.Model.Size;

public class Main {
    public static void main(String[] args) {
        Shopping shopping;
        Region region = Region.EUR;

        if(region == Region.EUR) {
            shopping = new AmericaShopping();
        }
        else {
            shopping = new EuropeShopping();
        }

        Cart cart = new Cart(shopping);
        cart.addProduct(new Product(0, "Dell", 125, Size.L));
        cart.addProduct(new Product(1, "Iphone", 1235, Size.S));
        cart.addProduct(new Product(2, "TV", 535, Size.XL));

        double totalPrice = cart.getTotalPrice();
        System.out.println("Total price : " + totalPrice + " " + shopping.getCurrency());
    }
}
