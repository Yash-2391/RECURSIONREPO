/* n fibinocci series
    fib(5)=0,1,1,2,3,5  */
import java.util.*;
public class fibinocci {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("ENTER THE NUMBER");
    n=s.nextInt();
    for(int i=0;i<=n;i++){
        System.out.println(fib(i));
    }
    
}
public static int fib(int n){
    if(n==1||n==0){
        return n;
    }
    return(fib(n-1)+fib(n-2));
    
}
}
