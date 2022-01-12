import java.util.*;
public class SubsequenceOfString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int n=s.nextInt();
        ArrayList<Integer> str=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            str.add(s.nextInt());
        }    
        for(int i : str){
            System.out.print(i+" ");
            System.out.println();
        }      
        String out=""; 
        subset(str,0,out);
    }
    public static void subset(ArrayList<Integer> str,int ind,String out){
        if(ind==str.size()){
            System.out.println(out);
            return;
        }
        subset(str,ind+1,out);
        out=out+str.get(ind);
        subset(str,ind+1,out);
    }
}
