import java.util.*;
public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), crime = 0;
        int police = 0;
        while(n-- > 0){
            int m = sc.nextInt();
            if(m >= 1){
                police += m;
            }
            if(m == -1){
                if( police <= 0){ crime++; }
                else{ police -= 1; }
            }
        }
        System.out.println(crime);
        sc.close();
    }
}
