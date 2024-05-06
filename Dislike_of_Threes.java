import java.util.*;

public class Dislike_of_Threes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt(), cnt = 0;
            for (int i = 1; i <= 1900; i++) {
                String s = Integer.toString(i);
                if (i % 3 != 0 && s.charAt(s.length() - 1) != '3') {
                    cnt++;
                }
                if (cnt == m) {
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
