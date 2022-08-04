package pro.sky.checkout;

import java.util.List;
public interface CheckoutService {
    void add(List<Integer> items);

    List<Item> getCart();


}
