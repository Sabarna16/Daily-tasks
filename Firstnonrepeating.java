import java.util.*;

public class Firstnonrepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int result = -1; 
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                result = num;
                break; 
            }
        }
        System.out.println(result);
    }
}
