import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long i = scan.nextLong(); 
        long j = scan.nextLong();
        long k = scan.nextLong();
        long dayCounter = 0;
        for(long d=i;d<=j;d++){
            if(((d - reverse(d))%k)==0){
                dayCounter++;
            }
        }
        System.out.println(dayCounter);
    }
    public static long reverse(long dayNumber){
        String dayStr = dayNumber+"";
        
        String dayStrRev = "";
        for(int i = dayStr.length()-1;i>=0;i--){
            dayStrRev+=dayStr.charAt(i);
        }
        
        if(dayStrRev.charAt(0)=='0'){
            dayStrRev.replaceFirst("0","");
        }
        return (long)Long.parseLong(dayStrRev);
    }
    
}
