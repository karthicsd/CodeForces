import java.util.*;

public class Balanced_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            if (m % 4 == 0) {
                System.out.println("YES");
                m = m / 2;
                int even = 2, odd = 1, cnt = 1;
                while (cnt <= m) {
                    System.out.print(even + " ");
                    even += 2;
                    cnt++;
                }
                cnt = 1;
                while (cnt < m) {
                    System.out.print(odd + " ");
                    odd += 2;
                    cnt++;
                }

                System.out.println(3 * m - 1);
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
