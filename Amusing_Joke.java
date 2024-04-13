import java.util.*;
public class Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guest = sc.nextLine(), host = sc.nextLine(), mix = sc.nextLine();
        int[] both_arr = new int[26], mix_arr = new int[26];
        for(char i:guest.toCharArray()){ both_arr[((int)i)-65]++; }
        for(char i:host.toCharArray()){ both_arr[((int)i)-65]++; }
        for(char i:mix.toCharArray()){ mix_arr[((int)i)-65]++; }
        if(Arrays.equals(both_arr, mix_arr)){System.out.println("YES");}
        else{System.out.println("NO");}
        sc.close();
    }
}
