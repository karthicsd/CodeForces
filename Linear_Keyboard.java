import java.util.*;

public class Linear_Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String x = sc.next();
            String y = sc.next();
            int tot = 0;
            if (y.length() == 1) {
                System.out.println(0);
            } else {
                for (int i = 1; i < y.length(); i++) {
                    int c = Math.abs(x.indexOf(y.charAt(i)) - x.indexOf(y.charAt(i - 1)));
                    tot += c;
                }
                System.out.println(tot);
            }
        }
        sc.close();
    }
}
