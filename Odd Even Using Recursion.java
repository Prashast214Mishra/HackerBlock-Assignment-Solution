import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        evenOdd(n);
    }
    public static void evenOdd(int n){
        if(n==0){
            return;
        }
        if(n%2!=0){
            System.out.println(n);
        }
        evenOdd(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }
}
