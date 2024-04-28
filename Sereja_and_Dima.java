import java.util.*;

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int leftPtr = 0, rightPtr = n - 1, Sereja = 0, Dima = 0, counter = 0;
        while (leftPtr <= rightPtr) {
            if (counter % 2 == 0) {
                if (a[leftPtr] < a[rightPtr]) {
                    Sereja += a[rightPtr];
                    rightPtr--;
                } else {
                    Sereja += a[leftPtr];
                    leftPtr++;
                }
            } else {
                if (a[leftPtr] < a[rightPtr]) {
                    Dima += a[rightPtr];
                    rightPtr--;
                } else {
                    Dima += a[leftPtr];
                    leftPtr++;
                }
            }
            counter++;
        }
        System.out.println(Sereja + " " + Dima);
        sc.close();
    }
}
