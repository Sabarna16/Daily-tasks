import java.util.Scanner;
import java.util.ArrayList;
public class Intersectionarr{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]num1 = new int[n];
        for(int i=0;i<n;i++){
            num1[i]=sc.nextInt();
        }
        int a = sc.nextInt();
        int[]num2 = new int[a];
        for(int i=0;i<a;i++){
            num2[i]=sc.nextInt();
        }
        ArrayList<Integer> intersection = new ArrayList<>();
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    intersection.add(num1[i]);
                    break;
                }
            }
        }
        System.out.println(intersection);
        
    }
}