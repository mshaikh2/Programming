import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        ArrayList<Integer> L_imp = new ArrayList<Integer>();
        ArrayList<Integer> L_unimp = new ArrayList<Integer>();
        int [] L = new int[N];
        int T[]= new int[N];
        for(int i = 0 ;i<N; i++){
            L[i] = scan.nextInt();
            T[i] = scan.nextInt();
            if(T[i]==1){
                L_imp.add(L[i]);
            }
            else{
                L_unimp.add(L[i]);
            }
        }
        Collections.sort(L_imp);
        //System.out.println(L_imp);
        //System.out.println(L_unimp);
        int sumUsedLuck =0;
        int sumUnusedLuck = 0;
        if(K<=L_imp.size()){
            for(int i = L_imp.size()-K;i<L_imp.size();i++){
                sumUnusedLuck+=L_imp.get(i);
            }
            //System.out.println(sumUnusedLuck);
            for(int i = 0;i<L_unimp.size();i++){
                sumUnusedLuck+=L_unimp.get(i);
            }
            //System.out.println(sumUnusedLuck);
            
            for(int i = 0;i<L_imp.size()-K;i++){
                sumUsedLuck+=L_imp.get(i);
            }
        }
        else if(K>L_imp.size()){
            for(int i = 0;i<L_unimp.size();i++){
                sumUnusedLuck+=L_unimp.get(i);
            }
            for(int i = 0;i<L_imp.size();i++){
                sumUnusedLuck+=L_imp.get(i);
            }
        }
       
        System.out.println(sumUnusedLuck-sumUsedLuck);
        
    }
}
