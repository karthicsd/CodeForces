import java.util.*;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String m = sc.next();
            int sum = 0;
            String[] s = { "1", "11", "111", "1111", "2", "22", "222", "2222", "3", "33", "333", "3333", "4", "44",
                    "444", "4444", "5", "55", "555", "5555", "6", "66", "666", "6666", "7", "77", "777", "7777", "8",
                    "88", "888", "8888", "9", "99", "999", "9999" };
            for (int i = 0; i < s.length; i++) {
                if (s[i].equals(m)) {
                    sum += s[i].length();
                    break;
                } else {
                    sum += s[i].length();
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
