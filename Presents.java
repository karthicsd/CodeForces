import java.util.*;
public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numberOfPersonsGaveGift = new ArrayList<>();
        for(int i=0;i<n;i++){
            numberOfPersonsGaveGift.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            int ans = (numberOfPersonsGaveGift.indexOf(i+1))+1;
            System.out.print(ans+" ");
        }
        sc.close();
    }
}
