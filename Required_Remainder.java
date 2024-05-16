import java.util.*;

public class Required_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
            if (n - n % x + y <= n) {
                System.out.println(n - n % x + y);
            } else {
                System.out.println(n - n % x - (x - y));
            }
        }
        sc.close();
    }
}
