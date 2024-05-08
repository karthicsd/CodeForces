import java.util.*;

public class Design_Tutorial_Learn_from_Math {
    public static boolean isPrime(long n) {
        int flag = 0;
        if (n == 0 || n == 1) {
            flag = 1;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), exit = 0;
        for (long j = 4; j <= 1000000; j++) {
            for (long k = 4; k <= 1000000; k++) {
                if (j + k == n && !isPrime(j) && !isPrime(k)) {
                    System.out.println(j + " " + k);
                    exit = 1;
                    break;
                }
            }
            if (exit == 1) {
                break;
            }

        }

        sc.close();
    }
}
