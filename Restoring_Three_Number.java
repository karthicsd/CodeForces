import java.util.*;
public class Restoring_Three_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), x2 = sc.nextInt(), x3 = sc.nextInt(), x4 = sc.nextInt();
        int max = Math.max(x1,Math.max(x2, Math.max(x3, x4)));
        if(x1 != max){ System.out.print(max-x1 + " "); }
        if(x2 != max){ System.out.print(max-x2 + " "); }
        if(x3 != max){ System.out.print(max-x3 + " "); }
        if(x4 != max){ System.out.print(max-x4 + " "); }
        sc.close();
    }
}
