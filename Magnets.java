import java.util.*;
public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        int[] magnets = new int[n];
        for(int i=0;i<n;i++){ magnets[i] = sc.nextInt();}
        for(int i=0;i<n-1;i++){ if(magnets[i] != magnets[i+1]){ count++; } }
        count++;
        System.out.println(count);
        sc.close();
    }
}
