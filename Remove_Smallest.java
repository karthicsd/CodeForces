import java.util.*;
public class Remove_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int m = sc.nextInt();
            int[] a = new int[m];
            for(int i=0;i<m;i++){ a[i] = sc.nextInt(); }
            Arrays.sort(a);
            boolean ans = true;
            for(int i=1;i<m;i++){
                if(! (a[i] - a[i-1] <= 1) ){ ans = false; }
            }
            if(ans){ System.out.println("YES"); }
            else{ System.out.println("NO"); }
        }
        sc.close();
    }
}
