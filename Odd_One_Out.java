import java.util.*;

public class Odd_One_Out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a == b) {
                System.out.println(c);
            } else if (b == c) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
        sc.close();
    }
}
