package part6.task26;

import java.util.Scanner;

public class ATM {
    private static int twenty;
    private static int fifty;
    private static int oneHundred;

    public ATM(int twenty, int fifty, int oneHundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneHundred = oneHundred;
    }
    public static int getBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ATM have: \nhundreds: " + oneHundred + "\nfifties: " + fifty + "\ntwenties: " + twenty + ".");
        System.out.println("Please, insert count of money, which you would take: ");
        int Balance = sc.nextInt();
        boolean isCorrect;
        do { isCorrect = Balance % 10 == 0 && Balance != 10 && Balance != 30;
            if (isCorrect)
                System.out.println("you can withdraw your money");
            else {
                System.out.println("Please, enter the correct amount of money!");
                Balance = sc.nextInt();
            }
        }
        while(!isCorrect);
        return Balance;
    }
    public static void withdraw(int Balance){
        int getHundred = 0; int getFifty = 0; int getTwenty = 0;
        while(Balance !=0) {
            while (Balance - 100 >= 50 && oneHundred!=0){
                Balance = Balance - 100;
                oneHundred--;
                getHundred++;
            }if (Balance - 50 >= 0 && fifty != 0 && Balance - 50  != 20){
                Balance = Balance - 50;
                fifty--;
                getFifty++;
            }
            else if (Balance - 20 >= 0 && twenty !=0) {
                Balance = Balance - 20;
                twenty--;
                getTwenty++;
            } else {
                System.out.println("ATM don`t have enough money.");
                break;
            }
        }
        System.out.println("You withdraw: \nhundreds:" + getHundred + "\nfifties: " + getFifty + "\ntwenties: " + getTwenty + ".");
    }
    public static void  inputMoney() {
        Scanner sc = new Scanner(System.in);
        int bill;
        System.out.println("input your bill: ");
        bill = sc.nextInt();
        boolean isCorrectIn;
        do {
            isCorrectIn = bill == 20 || bill == 50 || bill == 100;
            if (isCorrectIn && bill == 20) {
                System.out.println("you can input your bill.");
                twenty ++;
                System.out.println("quantity of twenty: " + twenty);
            }
            if (isCorrectIn && bill == 50){
                System.out.println("you can input your bill.");
                fifty ++;
                System.out.println("quantity of fifty: " + fifty);
            }
            if (isCorrectIn && bill == 100){
                System.out.println("you can input your bill.");
                oneHundred ++;
                System.out.println("quantity of hundreds: " + oneHundred);
            }
            if (!isCorrectIn){
                System.out.println("please, input correct bill:");
                bill = sc.nextInt();
            }
        } while(!isCorrectIn);
    }

}

