import java.util.*;
public class Binary{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int low = 0;
        int high = num.length-1;
        int res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(num[mid]==target){
                res = mid;
                break;
            }else if(num[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(res);
    }
}