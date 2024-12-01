import java.util.ArrayList;
import java.util.Arrays;

public class Category {
    private String name;
    private ArrayList<Product> list = new ArrayList<>();

    Category(String name) {
        this.name = name;
    }
    public void addProducts (Product product) {
        list.add(product);
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Product> returnProductList()
    {
        return list;
    }

    @Override
    public String toString() {

        return name + " products: " + list;
    }
}
