import java.util.*;

public class Black_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), tot_calories = 0;
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                tot_calories += a;
            } else if (s.charAt(i) == '2') {
                tot_calories += b;
            } else if (s.charAt(i) == '3') {
                tot_calories += c;
            } else if (s.charAt(i) == '4') {
                tot_calories += d;
            }
        }
        System.out.println(tot_calories);
        sc.close();
    }
}
