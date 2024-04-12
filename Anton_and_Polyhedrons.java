import java.util.*;
public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), faces = 0;
        while(n-- > 0){
            String s = sc.next();
            switch (s) {
                case "Tetrahedron":
                    faces+=4;
                    break;
                case "Cube":
                    faces+=6;
                    break;
                case "Octahedron" :
                    faces+=8;
                    break;
                case "Dodecahedron" :
                    faces+=12;
                    break;
                case "Icosahedron" :
                    faces+=20;
                    break;
                default:
                    break;
            }
        }
        System.out.println(faces);
        sc.close();
    }
}