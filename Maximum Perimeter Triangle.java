import java.io.*;
import java.util.*;

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A, Collections.reverseOrder());        
        for(int i = 0; i<N-2; i++)
        {
            if(A[i]<A[i+1]+A[i+2])
            {
                System.out.println(A[i+2]+" "+A[i+1]+" "+A[i]);
                return;
            }		
        }
        System.out.println(-1);
    }
}
