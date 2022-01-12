/*
input -> {1,2,3}
output -> {},{1},{2},{3},{1,2},{2,3},{3,1},{1,2,3}
*/
import java.util.*;
public class PowerSet {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str=s.nextLine();
        String out="";
        subset(str,0,out);
    }
    public static void subset(String str,int in,String out){
        if(in==str.length()){
            System.out.print(out+" ");
            System.out.println();
            return;
        }
       
        subset(str,in+1,out);
        out=out+str.charAt(in);
        subset(str,in+1,out);
    }
}
