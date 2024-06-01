import java.util.*;

public class Word_on_the_Paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = "";
            for (int i = 0; i < 8; i++) {
                String c = sc.next();
                for (int j = 0; j < c.length(); j++) {
                    if (c.charAt(j) >= 'a' && c.charAt(j) <= 'z') {
                        s += c.charAt(j);
                    }
                }
            }
            System.out.println(s);
        }
        sc.close();
    }
}
