import java.io.*;
import java.util.*;

public class BeautifulNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int count = 0;
        
        for(int i = 0; i < N; i++){
            A[i]=sc.nextInt();            
        }
        for(int i = 0; i < N; i++){            
            B[i]=sc.nextInt();
        }
        
        for(int i = 0; i < N; i++){
        	for(int j = 0; j < N; j++){
        		if (B[j]==A[i]){
        			B[j] = -1;
        			count++;
                    break;
        		}
        	}        		
        }
        
        if(N==count){
            System.out.println(count-1);
        }
        else{
            System.out.println(++count);
        }
    }
}