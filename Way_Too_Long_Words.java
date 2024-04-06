import java.util.*;

public class Way_Too_Long_Words {   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        for(int i=0; i<n; i++){
            String s = arr[i];
            if (s.length() > 10){
                System.out.println( s.charAt(0) + Integer.toString(s.length()-2) + s.charAt(s.length()-1) );
            }
            else{
                System.out.println(s);
            }
        }
        sc.close();
    }
}