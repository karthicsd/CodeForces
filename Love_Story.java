import java.util.*;

public class Love_Story {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            char[] c = s.toCharArray();
            int f = 0;
            if (c[0] != 'c') {
                f++;
            }
            if (c[1] != 'o') {
                f++;
            }
            if (c[2] != 'd') {
                f++;
            }
            if (c[3] != 'e') {
                f++;
            }
            if (c[4] != 'f') {
                f++;
            }
            if (c[5] != 'o') {
                f++;
            }
            if (c[6] != 'r') {
                f++;
            }
            if (c[7] != 'c') {
                f++;
            }
            if (c[8] != 'e') {
                f++;
            }
            if (c[9] != 's') {
                f++;
            }
            System.out.println(f);
        }
        sc.close();

    }
}
