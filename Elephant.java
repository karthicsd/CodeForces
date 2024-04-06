import java.util.*;

public class Elephant {

    public static int count = 0 , divider = 5;

    public static int getCount(int number){

        if(number >= divider){
            count += number / divider;
            number = number % divider;
        }
        divider--;

        return number;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n>0){
            n = getCount(n);
        }
        System.out.println(count);
        sc.close();
        
    }
}
