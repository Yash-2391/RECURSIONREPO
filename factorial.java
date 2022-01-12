/*
    fact(5)=5*4*3*2*1=120;
*/
import java.util.*;
public class factorial {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE NUMBER FOR FINDING FACTORIAL");
        n=s.nextInt();
        
        int factorial=findfact(n);
        System.out.println("THE FACTORIAL OF "+n+" IS "+factorial);
    } 
    public static int findfact(int n){
        if(n==1)
            return 1;
        return(n*findfact(n-1));
    }
}
