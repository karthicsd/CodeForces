import java.util.*;
public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min_index = 0, max_index = 0, max_value = 0, min_value = 1000;
        for(int i=0;i<n;i++){
            int s = sc.nextInt();
            if(s > max_value){
                max_index = i;
                max_value = s;
            }
            if(s <= min_value){
                min_index = i;
                min_value = s;
            }
        }
        if(max_index > min_index){
            System.out.println((max_index-1) + (n-min_index) - 1);
        }else{
            System.out.println((max_index-1) + (n-min_index));
        }
        sc.close();

    }
}
