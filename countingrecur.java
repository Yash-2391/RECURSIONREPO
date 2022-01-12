/*
    if we input n=5 it gives output
    1 -> 1,2,3,4,5
    2 -> 5,4,3,2,1 
*/
import java.util.*;
class countingrecur{
    public static void main(String ar[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=s.nextInt();
        System.out.println("LINEAR PRINTING");
        linearcount(n);
        System.out.println("REVERSE PRINTING");
        reversecount(n);
    }
    public static void linearcount(int n){
        if(n==0)
            return ;
        linearcount(n-1);
        System.out.println(n);
    }
    public static void reversecount(int n){
        if(n==0)
            return ;
        System.out.println(n);
        reversecount(n-1);       
    }
}