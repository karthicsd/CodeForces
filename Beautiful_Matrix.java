import java.util.*;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                if(sc.nextInt() == 1){
                    x = i+1;
                    y = j+1;
                }
            }
        }

        System.out.println(Math.abs(3-x)+Math.abs(3-y));
        
        sc.close();
        
    }    
}
