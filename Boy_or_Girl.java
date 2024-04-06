import java.util.*;
public class Boy_or_Girl {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        Set<Character> set = new HashSet<>();

        for(char i : s.toCharArray())
        {
            set.add(i);
        }

        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
        
        sc.close();
    }
}
