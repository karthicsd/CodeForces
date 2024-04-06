import java.util.*;
public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); String s = "EASY";
        while(n-- > 0){
            if(sc.nextInt() == 1){s = "HARD";}
        }
        System.out.println(s);
        sc.close();
    }
}
