package lesson6;

public class ForExample {
    public static void main(String[] args) {
        String arg1 = args[0];
        int maxValue = Integer.parseInt(arg1);
        for(int i = 0;i < maxValue;i++){
            //do smth
            System.out.println("do something" + i);
            if ( i >= 100) {
                break;
            }
        }
    }
}
