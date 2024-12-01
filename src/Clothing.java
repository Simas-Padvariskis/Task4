public class Clothing extends Product {

    Clothing (String name, double price) {
        super (name, price);
    }

    public void displayInfo(){
        System.out.println ("Clothing: " + name + ", Price: " + price);
    }
}
