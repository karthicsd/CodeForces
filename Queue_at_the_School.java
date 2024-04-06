import java.util.*;
public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        String s = sc.next();
        char[] students = new char[n];
        for(int i=0;i<n;i++){ students[i] = s.charAt(i); }
        for(int j=0;j<t;j++){
            int i=0;
            while(i<n-1){
            if(students[i]=='B' && students[i+1]=='G'){
                char temp = students[i];
                students[i] = students[i+1];
                students[i+1] = temp;
                i+=1;
            }i+=1;
            }
        }
        for(char i:students){System.out.print(i);}
        sc.close();
    }
}
