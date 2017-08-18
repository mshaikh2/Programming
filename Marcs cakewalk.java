import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        int count = 0;
        long miles = 0;
        
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        
        Arrays.sort(calories);        
        count = calories.length;       
        for (int i=count-1; i>=0; i--){
        	miles += Math.pow(2, count-1-i) *  calories[i];            
        }
        System.out.println(miles);
    }
}
