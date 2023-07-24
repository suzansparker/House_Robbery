import java.util.*;
public class houserobber {
    public static void main(String[] args) {
        System.out.println("enter row of the array");
        System.out.println("enter how many numbers");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int house[] = new int[size];
        int cost = 0;
        for (int i = 0; i < size; i++) ;
        int i = 0;
        {
            //scanner = null;
            house[i] = sc.nextInt();
        }
        if (i % 2 == 0) {
            cost += house[i];
        }
        System.out.println("house robber: " +size);
}
}