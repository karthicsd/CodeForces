import java.util.*;

public class Domino_piling {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int tot_square = m*n;

        System.out.println(tot_square/2);

        sc.close();
    }    
}
