package pro.sky.checkout;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Cart {
    private List<Item> IdList = new ArrayList<>();

    public List<Item> getIdList() {
        return IdList;
    }

    public void addId(int id) {
        Item item = new Item(id);
        IdList.add(item);
    }
}
