import java.util.*;

public class Pangram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a[] = new int[26];
        for(char i : s.toCharArray()){
            a[((int)Character.toUpperCase(i))-65]++;
        }
        int f = 0;
        for(int i : a){
            if(i == 0){
                f = 1;
                break;
            }
        }
        if(f == 0){System.out.println("YES");}
        else{System.out.println("NO");}
        sc.close();
    }

}