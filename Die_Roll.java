import java.util.*;

public class Die_Roll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int max = Math.max(a, b);
        int c = (6 - (max - 1));
        if (c % 6 == 0) {
            System.out.println(c / 6 + "/" + 6 / 6);
        } else if (c % 2 == 0) {
            System.out.println(c / 2 + "/" + 6 / 2);
        } else if (c % 3 == 0) {
            System.out.println(c / 3 + "/" + 6 / 3);
        } else {
            System.out.println(c + "/6");
        }
        sc.close();
    }
}
