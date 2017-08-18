import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        k = (k)%n;
        int[] o_i = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            //System.out.println("a_i+k : " + (a_i+k));
            if(k==0)
                o_i[a_i] = a[a_i];
            else{
                if((a_i+k)>=n){
                    o_i[a_i+k-n] = a[a_i];
                }
                else{
                    o_i[a_i+k] = a[a_i];
                }
                //o_i[a_i] = a[(a_i+k)>=n?(a_i+k-n):(a_i+k)];
            }
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(o_i[m]);
        }
        
    }
}
