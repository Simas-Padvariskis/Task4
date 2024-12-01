abstract public class Product {
    protected String name;
    protected double price;

    Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName (){
        return name;
    }

    public double getPrice (){
        return price;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {

        return name + ": " + price;
    }
}