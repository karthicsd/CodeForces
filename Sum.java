import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if(a+b == c || b+c == a || a+c == b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
