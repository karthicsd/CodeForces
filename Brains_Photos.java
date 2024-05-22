import java.util.*;

public class Brains_Photos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];
        int f = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.next().charAt(0);
                if (a[i][j] == 'C' || a[i][j] == 'M' || a[i][j] == 'Y') {
                    f = 1;
                }
            }
        }
        if (f == 1) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
        sc.close();
    }
}
