import java.util.*;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int front_runners = 0;
            if (a < b) {
                front_runners++;
            }
            if (a < c) {
                front_runners++;
            }
            if (a < d) {
                front_runners++;
            }
            System.out.println(front_runners);
        }
        sc.close();
    }
}
