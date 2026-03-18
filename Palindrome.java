
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org=num;
        int rev = 0;
        while(num!=0){
            int rem = num%10;
            rev = rev*10+rem;
            num/=10;
        }
        if(org==rev){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}