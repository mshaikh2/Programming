import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int count;
        int diff;
        int mindiff;
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();            
        }       
        
        Arrays.sort(a);
        mindiff = Math.abs(a[0]-a[1]);
        count = a.length;
        for (int i=1; i<count-1; i++){
        	diff = Math.abs(a[i]- a[i+1]);
            if(mindiff>diff){
            	mindiff = diff;
            }
        }
        
        System.out.println(mindiff);
    }
}
