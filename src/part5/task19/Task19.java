package part5.task19;

public class Task19 {
    public static void main(String[] args) {
        int m[] = new int[10];
        for (int i = 0; i < 10;i++){
            m[i] = (int)(Math.random()*100+1);
        }
        System.out.println(m[9]);
    }
}
