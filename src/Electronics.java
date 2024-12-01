public class Electronics extends Product {

    Electronics (String name, double price) {
        super(name, price);
    }

    public void displayInfo(){
        System.out.println("Electronics: " + name + ", Price: " + price);
    }
}
