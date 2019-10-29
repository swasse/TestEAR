package beans;

import javax.ejb.Stateless;
import java.util.LinkedList;

@Stateless(name = "CartEJB")
public class CartBean {

    private LinkedList<String> items;

    public CartBean() {
        items = new LinkedList<>();
    }

    public LinkedList<String> getItems() {
        return items;
    }


}
