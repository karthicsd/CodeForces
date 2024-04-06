import java.util.*;

public class Next_Round {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int count = 0;

        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        int k_th_score = a[k-1];

        for(int i=0; i<n; i++)
        {
            if( (k_th_score !=0 && a[i]>=k_th_score) || (k_th_score == 0 && a[i]>k_th_score) )
            {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
