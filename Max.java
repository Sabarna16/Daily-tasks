import java.util.Scanner;
public class Max{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int n : arr){
            if(n>first){
                second = first;
                first = n;
            }else if(n>second&&n!=first){
                second = n;
            }
        }
        System.out.println(second);
    }
}