import java.util.*;
public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println("I hate it");
        }else{
        for(int i=0;i<n;i++){
            if(i==n-1 && i%2==0){System.out.print("I hate it");}
            else if(i==n-1 && i%2!=0){System.out.print("I love it");}
            else if(i%2==0){System.out.print("I hate that ");}
            else{System.out.print("I love that ");}
        }
    }
            sc.close();
    }
}
