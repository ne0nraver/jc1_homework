package part6.task26;

public class Main {
    public static void main(String[] args) {
        ATM bank1 = new ATM(1,4,2);
        int Balance = ATM.getBalance();
        ATM.withdraw(Balance);
        ATM.inputMoney();
    }
}
