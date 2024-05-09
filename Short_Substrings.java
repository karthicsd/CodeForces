import java.util.*;

public class Short_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            for (int i = 0; i < s.length(); i += 2) {
                System.out.print(s.charAt(i));
            }
            System.out.println(s.charAt(s.length() - 1));
        }
        sc.close();
    }

}
