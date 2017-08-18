import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        for(int q=0;q<Q;q++){
            int N = scan.nextInt();
            int K = scan.nextInt();
            //System.out.println(K);
            ArrayList<Integer> A = new ArrayList<Integer>();
            ArrayList<Integer> B = new ArrayList<Integer>();
            for(int i=0;i<N;i++){
                A.add(scan.nextInt());
            }
            for(int i=0;i<N;i++){
                B.add(scan.nextInt());
            }
            Collections.sort(A, Collections.reverseOrder());
            Collections.sort(B);
            //System.out.println(A);
            //System.out.println(B);
            boolean flag = false;
            for(int i=0;i<N;i++){
                if((A.get(i) + B.get(i)) < K){
                    System.out.println("NO");
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.println("YES");
            
        }
        
    }
}