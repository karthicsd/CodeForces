import java.util.*;
public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true){
            n++;
            Set<Character> set = new HashSet<>();
            String s = Integer.toString(n);
            for(int i=0;i<s.length();i++){ set.add(s.charAt(i)); }
            if(set.size() == 4){System.out.println(s);break;}
        }
        sc.close();
    }
}
