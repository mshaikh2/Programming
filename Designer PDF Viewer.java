import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        ArrayList<Character> alphabets= new ArrayList<Character>();
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
       
        for(int c = 97;c<123;c++){
            alphabets.add(Character.toChars(c)[0]);
        }
        String word = in.next();
        int maxHeight = 0;
        int height = 0;
        for(int c=0;c<word.length();c++){
            height = h[(alphabets.indexOf(word.toCharArray()[c]))];
            if(height>maxHeight){
                maxHeight = height;
            }
        }
       // System.out.print(maxHeight);
        System.out.print(maxHeight*word.length());
    }
}
