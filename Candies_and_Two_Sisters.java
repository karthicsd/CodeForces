import java.util.*;
public class Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int s = sc.nextInt(), start = s/2, end = s-1;
            System.out.println(Math.abs(start-end));
        }
        sc.close();
    }
}
