import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
public class Linkedlistrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        LinkedList<Integer> list = new LinkedList<>();
        
        while (num != 0) {
            list.add(num % 10); 
            num /= 10;
        }
        
        for (int dig : list) {
            System.out.print(dig + " ");
        }
    }
}
