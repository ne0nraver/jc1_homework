package lesson7;

public class Main {
    public static void main(String[] args) {
        Automat automat = new Automat();
        while (true) {
            //Task46 menu
            automat.printMainMenu();
            //Select product
            int productNum = automat.readProductNumber();
            //Get product
            automat.takeProduct(productNum);
        }
    }
}
