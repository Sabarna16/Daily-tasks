import java.util.*;

public class Twosum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1; 
        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                System.out.println(left + " " + right);
                return; 
            } else if (currentSum < target) {
                left++; 
            } else {
                right--; 
            }
        }

        System.out.println("-1 -1"); 
    }
}

