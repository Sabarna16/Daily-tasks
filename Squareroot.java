import java.util.*;
public class Squareroot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int low = 0;
        int high = num;
        int answer = 0;
        while(low<=high){
            long mid = low+(high-low)/2;
            long squ = mid*mid;
            if(squ==num){
                answer = (int)mid;
                break;
            }else if(squ<num){
                answer = (int)mid;
                low = (int)mid+1;
            }else{
                high = (int)mid - 1;
            }

        }
        System.out.println(answer);
    }
}