package lesson7;

import java.util.Scanner;

public class Automat {

    Product[] products = {
            new Product("Lays", 5, 21),
            new Product("Snickers", 3, 12),
            new Product("Bonaqua", 7, 6),
            new Product("Oreo", 4, 9),
            new Product("Orbit", 6, 5)
    };

    public void printMainMenu() {
        int num = 1;
        for (Product product : products) {
            if (product.count > 0) {
                System.out.println(" " + num + ": " + product.name + "[" + product.count + "]");
                num++;
            }
        }
        System.out.println("Please select product number:");
    }

    public int readProductNumber() {
        Scanner scanner = new Scanner(System.in);
        int num;
        int cash;
        boolean isNumberCorrect, isCashCorrect;

        do {
            num = scanner.nextInt();
            isNumberCorrect = num >= 1 && num <= products.length;

            if (isNumberCorrect) {
                Product product = products[num - 1];
                isNumberCorrect = product.count > 0;
            }
            if (!isNumberCorrect) {
                System.out.println("No such product number!!!!!!!!");
                System.out.println("Please select product number: ");
            }

        } while (!isNumberCorrect) ;
        System.out.println("please insert cash: ");
        cash = scanner.nextInt();
        //TODO:
        isCashCorrect = cash >= Product.price;
        do {
        if (!isCashCorrect) {
            System.out.println("not enough money:(");
        }
        } while(!isCashCorrect);
            cash = cash - Product.price;
            String name = products[num - 1].name;
            System.out.println("You have selected product " + name);
            return num;
        }

    public void takeProduct(int productNum) {
        Product product  = products[productNum - 1];
        product.count--;
        System.out.println("Take your " + product.name + ", please!");
        System.out.println("remain " + product.count + " of " + product.name);
    }
}

