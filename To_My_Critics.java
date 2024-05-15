import java.util.*;

public class To_My_Critics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a + b >= 10 || b + c >= 10 || c + a >= 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO  ");
            }
        }
        sc.close();
    }
}
