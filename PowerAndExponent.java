/*
    exp(2,3)=2 power 3=8;
*/ 
import java.util.*;
public class PowerAndExponent {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE BASE");
        int b=s.nextInt();
        System.out.println("ENTER THE POWER");
        int p=s.nextInt();
        System.out.println("ANSWER IS: "+exp(b,p));
        System.out.println("WITH FAST EXPONENETIATION ANSWER IS: "+fastexp(b,p));
    }   
    public static int exp(int b,int p){
        if(p==0)
            return 1;
        if(b==0)
            return 0;
        return(b * exp(b,p-1));
    }
    public static int fastexp(int b,int p){
        if(p==0)
            return 1;
        if(b==0)
            return 0;
        if(p%2==1){
            return(b*fastexp(b, p/2)*fastexp(b, p/2));
        }
        return(fastexp(b, p/2)*fastexp(b, p/2));
    }
}
