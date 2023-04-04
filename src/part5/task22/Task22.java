package part5.task22;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class Task22 {
    public static void main(String[] args) {
        int [] m = {10,238,38,328,101,897,495,29,2439,58};
        int indexMin = 0; int Min = m[0];
        int indexMax = 0; int Max = m[0];
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (Min == m[i]) indexMin = min(indexMin,i);
            if (Min > m[i]) {
                Min = m[i];
                indexMin = i;
            }
            if (Max == m[i]) indexMax = max(indexMax, i);
            if (Max < m[i]){
                Max = m[i];
                indexMax = i;
            }
        }
        indexMax--;
        indexMin++;
        int start = min (indexMin, indexMax);
        int end = max (indexMin, indexMax);
        for (int index = start; index <= end; index++){
            sum+=m[index];
        }
        System.out.println("\n" + sum);
    }
}