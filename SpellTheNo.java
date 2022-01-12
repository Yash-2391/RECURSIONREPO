/*
    input -> 12
    output -> one two
*/
import java.util.*;
public class SpellTheNo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE NUMBER");
        n=s.nextInt();
        spell(n);
    }
public static void spell(int n){
    if(n==0){
        return;
    }
    spell(n/10);
    System.out.print(spelling(n%10)+" ");
}
/*we can also create a string array of spellings*/
public static String spelling(int n){
    switch(n){
        case 0:
            return "ZERO";
        case 1:
            return "ONE";
        case 2:
            return "TWO";
        case 3:
            return "THREE";
        case 4:
            return "FOUR";
        case 5:
            return "FIVE";
        case 6:
            return "SIX";
        case 7:
            return "SEVEN";
        case 8:
            return "EIGHT";
        case 9:
            return "NINE";
        default:
            System.out.println("INVALID");
    }
    return "INVALID";
}
}
