import java.util.*;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            if (m <= 1399) {
                System.out.println("Division 4");
            } else if (m >= 1400 && m <= 1599) {
                System.out.println("Division 3");
            } else if (m >= 1600 && m <= 1899) {
                System.out.println("Division 2");
            } else if (m >= 1900) {
                System.out.println("Division 1");
            }
        }
        sc.close();
    }
}