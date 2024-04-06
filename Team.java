import java.util.*;

public class Team {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int tot_known_answer = 0;
    
        for(int i=0; i<n; i++)
        {
            int count = 0;
            int Petya = sc.nextInt();
            int Vasya = sc.nextInt();
            int Tonya = sc.nextInt();

            if(Petya == 1){count++;}
            if(Vasya == 1){count++;}
            if(Tonya == 1){count++;}

            if(count >=2 ){tot_known_answer++;}
        }

        System.out.println(tot_known_answer);
        sc.close(); 
    }
}
