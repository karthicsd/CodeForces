import java.util.*;
public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), rooms_available = 0;
        while(n-- > 0){
            int p = sc.nextInt(), q = sc.nextInt();
            if(Math.abs(q-p) >= 2){ rooms_available++; }
        }
        System.out.println(rooms_available);
        sc.close();
    }
}
