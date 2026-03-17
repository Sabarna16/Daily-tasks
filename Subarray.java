import java.util.Scanner;
public class Subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int temp = curr + arr[i];
            if(temp<arr[i]){
                curr = arr[i];
            }else{
                curr = temp;
            }
            if(max<curr){
                max = curr;
            }
        }
        System.out.println(max);
    }
}
