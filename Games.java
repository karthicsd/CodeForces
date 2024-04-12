import java.util.*;
public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = 0, g = 0, count = 0;
        int[] home = new int[n], guest = new int[n];
        n = n*2;
        for(int i=0;i<n;i++){
            if(i%2==0){ home[h++] = sc.nextInt(); }
            else{ guest[g++] = sc.nextInt(); }
        }
        for(int i=0;i<home.length;i++){
            for(int j=0;j<guest.length;j++){
                if(home[i] == guest[j]){ count++; }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
