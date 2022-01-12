/* you are given a staircase , you need to find the total number of ways to reach the nth stair case from the bottom
of the stair case when you are only allowed to climb 1,2,3 stais at a time

if n=4 total number of ways are are 7

[1,1,1,1]
[1,2,1]
[1,1,2]
[2,2]
[3,1]
[2,1,1]
[1,2,1]
*/
import java.util.*;
public class TotalJumpsWays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE N VALUE OF STAIRCASE");
        n=s.nextInt();
        System.out.println("THE NO OF WAYS TO CLIMB THE STAIRCASE IS: "+climb(n));
    }    
    public static int climb(int n){
        if(n<0)
            return 0;
        if(n==0||n==1){
            return 1;
        }
        return(climb(n-1)+climb(n-2)+climb(n-3));
    }
}
