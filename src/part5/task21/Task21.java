package part5.task21;

public class Task21 {
    public static void main(String[] args) {
        int[] m = new int[10];
        int max = m[0];
        for (int i = 0;i<10;i++) {
            m[i] = (int)(Math.random()*100+1);
            System.out.print(" " + m[i]);
            if ( max < m[i]) {
                max = m[i];
            }
        }
        System.out.println(" \n" + " max value is " + max);

    }
}
