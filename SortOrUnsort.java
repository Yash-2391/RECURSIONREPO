/*
input -> a[5,4,9,8,6,2]
output -> sorted or unsorted
*/ 
import java.util.*;
public class SortOrUnsort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int n=s.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println(sortorunsort(a,n-1));
    }    
    public static String sortorunsort(int a[],int n){
        if(n==0){
            return "SORTED";
        }
        if(a[n]<a[n-1]){
            return "UNSORTED";
        }
        return sortorunsort(a,n-1);
    }
}
