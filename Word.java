import java.util.*;
public class Word {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int lower = 0,upper = 0;

        for(char i : s.toCharArray()){
            if(Character.isLowerCase(i)){
            lower++;
            }else{
            upper++;
            }
        }

        if(lower >= upper){
            System.out.println(s.toLowerCase());
        }else{
            System.out.println(s.toUpperCase());
        }
        sc.close();
    }
}
