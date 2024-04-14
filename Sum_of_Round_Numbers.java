import java.util.*;
public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int m = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            if(m >= 1 && m <= 9){ l.add(m); }
            else{
                int x = 1;
                while(m > 0){
                    if((m % 10)*x != 0){ l.add((m % 10) * x); }
                    m/=10;x*=10;
                }
            }
            System.out.println(l.size());
            for(int i : l){ System.out.print(i+" "); }
            System.out.println();
        }
        sc.close();
    }
}
