package part5.task23;

public class Task23 {
     public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int x = nums[i];
            nums[i] = nums[j];
            nums[j] = x;
        }
        for (int a = 0; a < nums.length; a++){
            System.out.print(" " + nums[a]);
        }
    }
}