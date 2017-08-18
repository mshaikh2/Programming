import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        ArrayList<Long> list = new ArrayList<Long>();
        list.add(a);list.add(b);list.add(c);list.add(d);list.add(e);
        Collections.sort(list);
        long min= 0;
        long max = 0;
        for(int i=0;i<4;i++){
            min+=list.get(i);
            max+=list.get(4-i);
        }
        System.out.print(min+" "+max);
    }
}
