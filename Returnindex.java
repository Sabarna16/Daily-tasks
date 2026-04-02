import java.util.*;
public class Returnindex{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int low = 0;
        int high = num.length - 1;
        int result = -1;
    
        while(low <= high){
            int mid = low + (high - low)/2;
            if(num[mid]==target){
                result = mid;
                break;
            }
            if(num[mid]<target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(result);

    }
}