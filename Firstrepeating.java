import java.util.*;
public class Firstrepeating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
                return;
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println("No repeating element");
    }
}
