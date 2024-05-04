import java.util.*;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 0, tot = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            tot += (max - a[i]);
        }
        System.out.println(tot);
        sc.close();
    }
}
