import java.util.*;
public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int redSocks = sc.nextInt(), blueSocks = sc.nextInt(), min = Math.min(redSocks,blueSocks), balance = 0;
        redSocks -= min; blueSocks -= min;
        if(redSocks >= 2){ balance = (redSocks/2); }
        else if(blueSocks >= 2){ balance = (blueSocks/2); }
        else{ balance = 0; }
        System.out.println(min+" "+balance);
        sc.close();
    }
}
