import java.util.*;
public class Buy_a_Shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), r = sc.nextInt(), num = 1;
        while(true){
            if((k*num)%10 == 0 || (k*num)%10 == r){ break; }
            num++;
        }
        System.out.println(num);
        sc.close();
    }
}
