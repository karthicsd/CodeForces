import java.util.*;

public class Good_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt(), mul = 1;
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            a[0] = a[0] + 1;
            for (int i = 0; i < m; i++) {
                mul *= a[i];
            }
            System.out.println(mul);
        }
        sc.close();
    }
}
