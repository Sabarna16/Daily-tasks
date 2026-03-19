import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); 

        int n = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[n] != arr[i]){
                n++;
                arr[n] = arr[i];
            }
        }
        for(int j = 0; j <= n; j++){
            System.out.print(arr[j] + " ");
        }
    }
}