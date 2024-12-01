import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    ProductManager manager = new ProductManager();

    boolean exit = false;

        System.out.println("1 - Pridėti kategoriją (Electronics, Food, Clothing)");
        System.out.println("2 - Pridėti prekę");
        System.out.println("3 - Ieškoti prekių pagal pavadinimą");
        System.out.println("4 - Filtruoti prekes pagal kategoriją");
        System.out.println("5 - Filtruoti prekes pagal kainą");
        System.out.println("6 - Rūšiuoti prekes pagal kainą");
        System.out.println("7 - Rodyti visas prekes");
        System.out.println("8 - Išeiti");

    do {
        System.out.println("\n Pasirinkite veiksmą: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.println("Iveskite kategorijos pavadinima: ");
                String name = scanner2.nextLine();

                if (name.equals("Electronics")){
                    System.out.println("Kategorija pridėta");
                }
                else if (name.equals("Food")){
                    System.out.println("Kategorija pridėta");
                }
                else if (name.equals("Clothing")){
                    System.out.println("Kategorija pridėta");
                }
                else {
                    System.out.println("Kategorija negalima");
                }
                manager.addCategory(new Category(name));
                break;
            case 2:
                System.out.println("Iveskite kategorijos pavadinima: ");
                String catName = scanner2.nextLine();

                if (manager.findCategory(catName) == true) {
                    if (catName.equals("Electronics")) {
                        System.out.println("Iveskite produkto pavadinima: ");
                        String product = scanner2.nextLine();

                        System.out.println("Iveskite produkto kaina: ");
                        double price = scanner2.nextDouble();

                        manager.addProductToCategory(catName, new Electronics(product, price));
                    } else if (catName.equals("Food")) {
                        System.out.println("Iveskite produkto pavadinima: ");
                        String product = scanner2.nextLine();

                        System.out.println("Iveskite produkto kaina: ");
                        double price = scanner2.nextDouble();

                        manager.addProductToCategory(catName, new Food(product, price));
                    } else if (catName.equals("Clothing")) {
                        System.out.println("Iveskite produkto pavadinima: ");
                        String product = scanner2.nextLine();

                        System.out.println("Iveskite produkto kaina: ");
                        double price = scanner2.nextDouble();

                        manager.addProductToCategory(catName, new Clothing(product, price));
                    } else {
                        System.out.println("Kategorija negalima");
                    }
                }
                else
                    System.out.println("Tokia kategorija nepridėta");
                break;
            case 3:
                String productName;

                System.out.println("Iveskite produkto pavadinima: ");
                productName = scanner2.nextLine();

                manager.searchProduct(productName);
                    break;
            case 4:
                System.out.println("Iveskite kategorijos pavadinima: ");
                catName = scanner2.nextLine();

                manager.filterProductsByCategory(catName);
                    break;
            case 5:
                double minn;
                double maxx;

                System.out.println("Iveskite min kaina: ");
                minn = scanner2.nextDouble();

                scanner2.nextLine();

                System.out.println("Iveskite max kaina: ");
                maxx = scanner2.nextDouble();

                scanner2.nextLine();

                manager.filterByPrice(minn, maxx);
                    break;
            case 6:
                System.out.println("Pasirinkite, rusiuoti nuo pigiausisios: 'P', rusiuoti nuo brangiausios: 'B': ");
                char type = scanner2.next().charAt(0);

                manager.sortByPrice(type);
                    break;
            case 7:
                manager.printProducts();
                    break;
            case 8:
                System.out.println("Exit");
                exit = true;
                    break;
        }
    }
    while (exit == false);
  }
}