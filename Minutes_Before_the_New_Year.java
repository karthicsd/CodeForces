import java.util.*;

public class Minutes_Before_the_New_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int h = sc.nextInt(), m = sc.nextInt();
            int tot = 24 * 60;
            tot -= (h * 60);
            tot -= m;
            System.out.println(tot);
        }
        sc.close();

    }
}
