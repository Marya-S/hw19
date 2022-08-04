package pro.sky.checkout;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Scope("prototype")
public class CheckoutServiceImpl implements CheckoutService {
    private final Cart tempCart;

    public CheckoutServiceImpl(Cart cart) {
        tempCart = cart;
    }

    @Override
    public void add(List<Integer> items) {
        items.forEach(tempCart::addId);
    }

    @Override
    public List<Item> getCart() {
        return tempCart.getIdList();
    }
}
