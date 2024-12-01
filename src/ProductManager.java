import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
//        Electronics lenovoLaptop = new Electronics("Lenovo laptop", 999.89);
//        Electronics iphone16 = new Electronics("Iphone 16", 899.00);
//        Electronics alienwareMonitor = new Electronics("Alienware monitor", 312.20);
//
//        lenovoLaptop.displayInfo();
//        iphone16.displayInfo();
//        alienwareMonitor.displayInfo();
//
//        Category category1 = new Category("Electronics");
//        category1.addProducts(lenovoLaptop);
//        category1.addProducts(iphone16);
//        category1.addProducts(alienwareMonitor);
//
//        System.out.println(category1);

        private ArrayList<Category> categories = new ArrayList<>();

        public void addCategory (Category newCategory){
            categories.add(newCategory);
        }

        public void addProductToCategory (String categoryName, Product newProduct){
            for (int i = 0; i < categories.size(); i++){
                if (categories.get(i).getName().equals(categoryName)){
                    categories.get(i).addProducts(newProduct);
                }
            }
        }

        public boolean findCategory (String categoryName){
            boolean find = false;
            for (int i = 0; i < categories.size(); i++){
                if (categories.get(i).getName().equals(categoryName)){
                    find = true;
                }
            }
            if (find == true)
                return true;
            else
                return false;
        }

    public void searchProduct(String name){
        for (int i = 0; i < categories.size(); i++){
            ArrayList<Product> products = categories.get(i).returnProductList();

            for (int j = 0; j < products.size(); j++){
                if (products.get(j).getName().contains(name)){
                    products.get(j).displayInfo();
                }
            }
        }
    }
    public void printProducts(){
        ArrayList<Product> products;

        for (int i = 0; i < categories.size(); i++){
            products = categories.get(i).returnProductList();


            System.out.println("+-------------------+------------+");
            System.out.print("| ");
            System.out.print(String.format("%-30s", categories.get(i).getName()));
            System.out.println(" |");
            System.out.println("+-------------------+------------+");
            System.out.println("|      Product      |   Price    |");
            System.out.println("+-------------------+------------+");

            for (int j = 0; j < products.size(); j++){
                System.out.print("| ");
                System.out.print(String.format("%-17s", products.get(j).getName()));
                System.out.print(" | ");
                System.out.print(String.format("%-10.2f", products.get(j).getPrice()));
                System.out.println(" |");

            }
            System.out.println("+-------------------+------------+");
        }
    }

    public void filterProductsByCategory(String categoryName){
        ArrayList<Product> products;

        for (int i = 0; i < categories.size(); i++){
            if (categories.get(i).getName().equals(categoryName)){
                products = categories.get(i).returnProductList();

                System.out.println("+-------------------+------------+");
                System.out.println("|      Product      |   Price    |");
                System.out.println("+-------------------+------------+");

                for(int j = 0; j < products.size(); j++){
                    System.out.print("| ");
                    System.out.print(String.format("%-17s", products.get(j).getName()));
                    System.out.print(" | ");
                    System.out.print(String.format("%-10.2f", products.get(j).getPrice()));
                    System.out.println(" |");
                }

                System.out.println("+-------------------+------------+");

                return;
            }
        }
        System.out.println("Nieko nerasta");
    }
    public void filterByPrice(double minPrice, double maxPrice)
    {
        ArrayList<Product> products;

        for (int i = 0; i < categories.size(); i++){
            products = categories.get(i).returnProductList();
            System.out.println("+-------------------+------------+");
            System.out.print("| ");
            System.out.print(String.format("%-30s", categories.get(i).getName()));
            System.out.println(" |");
            System.out.println("+-------------------+------------+");
            System.out.println("|      Product      |   Price    |");
            System.out.println("+-------------------+------------+");

            for (int j = 0; j < products.size(); j++){
                if (products.get(j).getPrice() > minPrice && products.get(j).getPrice() < maxPrice)
                {
                    System.out.print("| ");
                    System.out.print(String.format("%-17s", products.get(j).getName()));
                    System.out.print(" | ");
                    System.out.print(String.format("%-10.2f", products.get(j).getPrice()));
                    System.out.println(" |");
                }

            }
            System.out.println("+-------------------+------------+");
        }
    }
    public void sortByPrice(char type){
        ArrayList<Product> products;

        for (int i = 0; i < categories.size(); i++)
        {
            products = categories.get(i).returnProductList();

            if (type == 'B')
            {
                products.sort(Comparator.comparing(Product::getPrice).reversed());
            }
            else
            {
                products.sort(Comparator.comparing(Product::getPrice));
            }



            System.out.println("+-------------------+------------+");
            System.out.print("| ");
            System.out.print(String.format("%-30s", categories.get(i).getName()));
            System.out.println(" |");
            System.out.println("+-------------------+------------+");
            System.out.println("|      Product      |   Price    |");
            System.out.println("+-------------------+------------+");

            for (int j = 0; j < products.size(); j++)
            {
                System.out.print("| ");
                System.out.print(String.format("%-17s", products.get(j).getName()));
                System.out.print(" | ");
                System.out.print(String.format("%-10.2f", products.get(j).getPrice()));
                System.out.println(" |");

            }
            System.out.println("+-------------------+------------+");
        }
    }
}
