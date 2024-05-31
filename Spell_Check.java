import java.util.*;

public class Spell_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            String s = sc.next();
            int T = 0, ii = 0, mm = 0, u = 0, r = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'T') {
                    T = 1;
                } else if (s.charAt(i) == 'i') {
                    ii = 1;
                } else if (s.charAt(i) == 'm') {
                    mm = 1;
                } else if (s.charAt(i) == 'u') {
                    u = 1;
                } else if (s.charAt(i) == 'r') {
                    r = 1;
                }
            }

            if (T == 1 && ii == 1 && mm == 1 && u == 1 && r == 1 && m == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
