import java.util.*;

public class Plus_One_on_the_Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            int min = Arrays.stream(a).min().getAsInt();
            int max = Arrays.stream(a).max().getAsInt();
            System.out.println(max - min);
        }
        sc.close();
    }
}
