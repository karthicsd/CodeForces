import java.util.*;
public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c)));
        sc.close();
    }
}
