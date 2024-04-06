import java.util.*;
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), tot_min_cap = 0, max = 0;
        while(n-- > 0){
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            tot_min_cap -= exit;
            tot_min_cap += enter;
            max = tot_min_cap > max ? tot_min_cap : max;
        }
        System.out.println(max);
        sc.close();
    }
}
