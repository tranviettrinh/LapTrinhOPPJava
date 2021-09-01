/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava;

import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class MangDoiXung {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while(t-->0){
            int n = p.nextInt();
            int[] a = new int[n];
            boolean check = true;
            int x = n/2;
            for(int i=0; i<n;i++){
                a[i] =p.nextInt();
                
                if((i>=x) && (a[i]!=a[n-1-i])){
                    check = false;
                    
                }
                
            }
            if(check ==true){
                System.out.println("YES");
            }else System.out.println("NO");
            
        }
    }
}
