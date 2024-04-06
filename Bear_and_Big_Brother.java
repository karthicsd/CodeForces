import java.util.*;
public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while(b >=   a){
            count++;
            a*=3;
            b*=2;
        }
        System.out.println(count);
        sc.close();
    }
}
