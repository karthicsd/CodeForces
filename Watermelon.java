import java.util.*;

public class Watermelon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int flag = 0;

        for ( int i=1; i<=n/2; i++){
            if(i%2 == 0 && (n-i)%2 == 0)
            {
                System.out.println("YES");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("NO");
        }

        sc.close();
    }
}