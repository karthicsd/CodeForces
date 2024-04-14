import java.util.*;
public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int mins = 240 - k, mins_sum = 0, no_of_problems_solves = 0;
        for(int i=1;i<=n;i++){
            mins_sum += (5*i);
            if(mins_sum > mins){ break; }
            else{ no_of_problems_solves++; }
        }
        System.out.println(no_of_problems_solves);
        sc.close();
    }
}
