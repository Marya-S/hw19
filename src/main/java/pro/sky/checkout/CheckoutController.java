package pro.sky.checkout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/order")
public class CheckoutController {
    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @GetMapping(path = "/add")
    public void addItems(@RequestParam(value = "items") List<Integer> items){
        checkoutService.add(items);
    }

    @GetMapping(path = "/get", headers = "Accept=application/json")
    public List<Item> getItems(){
        return checkoutService.getCart();
    }
}
