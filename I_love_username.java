import java.util.*;
public class I_love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){ a[i] = sc.nextInt(); }
        int min = a[0], max = a[0], count = 0;
        if(n>1){
        for(int i=1;i<n;i++){
            if(a[i] > max){
                max = a[i]; count++;
            }
            else if(a[i] < min){
                min = a[i]; count++;
            }
        } }
        System.out.println(count);
        sc.close();
    }
}
