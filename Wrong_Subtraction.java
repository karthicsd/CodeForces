import java.util.*;
public class Wrong_Subtraction{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        while(k-- > 0){
            if(n%10 == 0){
                n = n/10;
            }
            else{
                n -= 1;
            }
        }

        System.out.println(n);
        
        sc.close();
    }
}