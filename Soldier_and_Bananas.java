import java.util.*;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int tot = 0;

        for(int i=1; i<=w; i++){
            tot+=(k*i);
        }

        if (tot-n <= 0){
            System.out.println(0);
        }else{
        System.out.println(tot-n);
        }

        sc.close();
    }    
}
