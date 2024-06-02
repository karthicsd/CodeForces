import java.util.*;

public class Not_Quite_Latin_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            for (int i = 0; i < 3; i++) {
                String s = sc.next();
                int a = 0, b = 0, c = 0;
                for (int j = 0; j < 3; j++) {
                    if (s.charAt(j) == 'A') {
                        a = 1;
                    } else if (s.charAt(j) == 'B') {
                        b = 1;
                    } else if (s.charAt(j) == 'C') {
                        c = 1;
                    }
                }
                if (c != 1) {
                    System.out.println("C");
                } else if (b != 1) {
                    System.out.println("B");
                } else if (a != 1) {
                    System.out.println("A");
                }
            }

        }
        sc.close();
    }
}
