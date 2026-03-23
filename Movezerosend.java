import java.util.*;
public class Movezerosend{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index = 0;
        for(int num:arr){
            if(num!=0){
                arr[index++]=num;
            }
        }
        while(index<n){
            arr[index++]=0;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}