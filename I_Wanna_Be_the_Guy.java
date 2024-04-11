import java.util.*;
public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), flag = 0;
        Set<Integer> set = new HashSet<>();
        int s1 = sc.nextInt();
        for(int i=0;i<s1;i++){
            set.add(sc.nextInt());
        }
        int s2 = sc.nextInt();
        for(int i=0;i<s2;i++){
            set.add(sc.nextInt());
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                flag = 1;
                break;
            }
        }
        if(flag == 0){System.out.println("I become the guy.");}
        else{System.out.println("Oh, my keyboard!");}
        sc.close();
        
    }
}
