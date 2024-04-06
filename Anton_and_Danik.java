import java.util.*;
public class Anton_and_Danik {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(),anton = 0, danik = 0, i = 0;
        String s = sc.next();

        while(n-- > 0){
            char c = s.charAt(i);
            if(c == 'A'){
                anton++;
            }else{
                danik++;
            }
            i++;
        }

        if(anton > danik){System.out.println("Anton");}
        else if(danik > anton){System.out.println("Danik");}
        else{System.out.println("Friendship");}

        sc.close(); 
    }
}
