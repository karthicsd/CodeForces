import java.util.*;
public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt(), count = 0;
        while(n-- > 0){
            if(h < sc.nextInt()){ count += 2; }
            else{ count += 1; }
        }
        System.out.println(count);
        sc.close();
    }
}
