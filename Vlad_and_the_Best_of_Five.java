import java.util.*;

public class Vlad_and_the_Best_of_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            List<Character> l = new ArrayList<Character>();
            for (char i : s.toCharArray()) {
                l.add(i);
            }
            int a = Collections.frequency(l, 'A');
            int b = Collections.frequency(l, 'B');
            if (a > b) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
        sc.close();
    }
}
