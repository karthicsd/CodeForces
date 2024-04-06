import java.util.*;

public class Helpful_Maths {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] split_by_plus = s.split("[+]");
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<split_by_plus.length; i++){
            if(split_by_plus[i]!="")
            list.add(Integer.parseInt(split_by_plus[i]));
        }

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            if(list.size()-1 != i){
            System.out.print(list.get(i)+"+");
            }
            else{
                System.out.print(list.get(i));
            }
        }
        sc.close();
    }
}
