package pro.sky.checkout;

import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;
@Scope("prototype")
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
