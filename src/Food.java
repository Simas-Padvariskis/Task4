public class Food extends Product {

    Food (String name, double price) {
        super(name, price);
    }

    public void displayInfo(){
        System.out.println ("Food: " + name + ", Price: " + price);
    }
}