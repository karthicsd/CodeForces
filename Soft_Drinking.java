import java.util.*;
public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), p = sc.nextInt(), nl = sc.nextInt(), np = sc.nextInt();
        int one = (k*l)/nl;
        int two = (c*d);
        int three = p/(np);
        int ans = Math.min(one,Math.min(two, three))/n;
        System.out.println(ans);
        sc.close();
    }
}
