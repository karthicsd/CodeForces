import java.util.*;

public class Short_Sort {
    public static void swap(int a, int b, char[] c) {
        char t = c[0];
        c[0] = c[1];
        c[1] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            // System.out.println(s);
            if (s.equals("bca") || s.equals("cab")) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
