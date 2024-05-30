import java.util.*;

public class Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = 0, cnt = 1, rowTot = 0, tot = 0;
        while (tot <= n) {
            // System.out.println(tot + " " + n);
            rowTot += cnt;
            tot += rowTot;
            height++;
            cnt++;
        }
        if (tot == n) {
            System.out.println(height);
        } else {
            System.out.println(height - 1);
        }
        sc.close();
    }
}
