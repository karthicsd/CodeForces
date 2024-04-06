import java.util.*;
public class Word_Capitalization {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String op = Character.toUpperCase(s.charAt(0))+s.substring(1,s.length());
        System.out.println(op);
        sc.close();
    }
}
