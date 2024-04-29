import java.util.*;

public class Spy_Detected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int m = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                list.add(x);
                set.add(x);
            }
            for (int j : set) {
                if (Collections.frequency(list, j) == 1) {
                    System.out.println(list.indexOf(j) + 1);
                }
            }
        }
        sc.close();
    }
}