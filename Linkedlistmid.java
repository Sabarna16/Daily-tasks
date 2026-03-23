import java.util.Scanner;
import java.util.LinkedList;
public class Linkedlistmid{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());

        }
        int middle = list.size()/2;
        System.out.println(list.get(middle));

    }
}
