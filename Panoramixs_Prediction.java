import java.util.*;

public class Panoramixs_Prediction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), h = 0, cnt = 1;
        for (int i = a + 1; i <= b; i++) {
            int flag = 0;
            if (i == 0 || i == 1) {
                flag = 1;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0) {
                    if (b == i && cnt == 1) {
                        h = 1;
                        System.out.println("YES");
                        break;
                    } else {
                        cnt++;
                    }
                }
            }
        }
        if (h == 0) {
            System.out.println("NO");
        }
        sc.close();
    }
}
