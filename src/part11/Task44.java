package part11;

public class Task44 {
    public static void main(String[] args) {
        try{
           Integer i  = null;
           i = i +1;
            System.out.println(i);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("i равняется null");
        }
    }
}
