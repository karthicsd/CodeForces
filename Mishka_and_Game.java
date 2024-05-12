import java.util.*;

public class Mishka_and_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), Mishka = 0, Chris = 0;
        for (int i = 0; i < n; i++) {
            int mishkaPt = sc.nextInt(), chrisPt = sc.nextInt();
            if (mishkaPt > chrisPt) {
                Mishka++;
            } else if (chrisPt > mishkaPt) {
                Chris++;
            }
        }
        if (Mishka > Chris) {
            System.out.println("Mishka");
        } else if (Chris > Mishka) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
        sc.close();
    }
}
