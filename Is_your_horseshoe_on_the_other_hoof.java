import java.util.*;
public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<4;i++){
            set.add(sc.nextInt());
        }
        System.out.println(4-set.size());
        sc.close();
    }
}
