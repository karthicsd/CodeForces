import java.util.*;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt(), f = 0;
            int a[] = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < m - 1; i++) {
                if (a[i] >= a[i + 1]) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
