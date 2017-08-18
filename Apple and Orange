import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int appleCount=0, orangeCount = 0;
        int s = in.nextInt();// sams left boundary
        int t = in.nextInt();// sams right boundary
        int a = in.nextInt();// apple tree point
        int b = in.nextInt();// orange tree point
        int m = in.nextInt();// number of apples
        int n = in.nextInt();// number of oranges
        int distanceLeft = (s-a);
        int distanceRight = (t-a);
        int[] apple = new int[m];// distance ofapples from point a
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if(apple[apple_i]>=distanceLeft && apple[apple_i]<=distanceRight){
                appleCount++;
                
            }
        }
        distanceLeft = (b-t);
        distanceRight = (b-s);
        int[] orange = new int[n];// distance of oranges from point b
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if((orange[orange_i]*-1)>=distanceLeft &&  (orange[orange_i]*-1)<=distanceRight){
                orangeCount++;
            }
        }
        System.out.print(appleCount+"\n"+orangeCount);
       
        
    }
}
