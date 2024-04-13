import java.util.*;
public class Fox_And_Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), m = sc.nextInt(), temp = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i%2!=0){ System.out.print("#"); }
                else{
                    if(temp%2==0){
                        if(j != m){System.out.print(".");}
                        else{System.out.print("#");}
                    }
                    else{
                        if(j == 1){ System.out.print("#"); }
                        else{ System.out.print("."); }
                    }
                }  
            }
            if(i%2 == 0){ temp++; }
            System.out.println();
        }
        sc.close();
    }
}
