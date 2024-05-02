import java.util.*;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            char[] c = s.toCharArray();
            if ((Character.valueOf(c[0]) + Character.valueOf(c[1])
                    + Character.valueOf(c[2])) == (Character.valueOf(c[3])
                            + Character.valueOf(c[4]) + Character.valueOf(c[5]))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
