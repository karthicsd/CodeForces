import java.util.*;

public class Plus_or_Minus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a + b == c) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
        sc.close();
    }
}
