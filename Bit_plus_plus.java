import java.util.*;
public class Bit_plus_plus{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int value = 0;
        
        while(n-- > 0){

            String s = sc.next();

            if( s.equals( "X++" ) )
            {
                value++;
            }else if( s.equals( "++X" ) )
            {
                ++value;
            }else if( s.equals( "X--" ) )
            {
                value--;
            }else{
                --value;
            }

        }

        System.out.println(value);

        sc.close();

    }
}
