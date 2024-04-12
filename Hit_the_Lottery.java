import java.util.*;
public class Hit_the_Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), denominations = 0;
        if(n>=100){ denominations+=(n/100); n-=(n/100)*100; }
        if(n>=20){ denominations+=(n/20); n-=(n/20)*20; }
        if(n>=10){ denominations+=(n/10); n-=(n/10)*10; }
        if(n>=5){ denominations+=(n/5); n-=(n/5)*5; }
        if(n>=1){ denominations+=(n/1); n-=(n/1)*1; }
        System.out.println(denominations);
    }
}
