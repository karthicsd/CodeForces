import java.util.*;
public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            int c = Math.abs(a-b);
            int cnt = 0;
            if(c>=10){
                cnt += c/10;
                c -= (c/10)*10;
            }
            if(c>=9){
                cnt += c/9;
                c -= (c/9)*9;
            }
            if(c>=8){
                cnt += c/8;
                c -= (c/8)*8;
            }
            if(c>=7){
                cnt += c/7;
                c -= (c/7)*7;
            }
            if(c>=6){
                cnt += c/6;
                c -= (c/6)*6;
            }
            if(c>=5){
                cnt += c/5;
                c -= (c/5)*5;
            }
            if(c>=4){
                cnt += c/4;
                c -= (c/4)*4;
            }
            if(c>=3){
                cnt += c/3;
                c -= (c/3)*3;
            }
            if(c>=2){
                cnt += c/2;
                c -= (c/2)*2;
            }
            if(c>=1){
                cnt += c/1;
                c -= (c/1)*1;
            }
            System.out.println(cnt);
        }
        sc.close(); 
    }
}
