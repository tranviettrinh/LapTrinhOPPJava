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
public class SapXepDoiChoTrucTiep1 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);    
     
            int n = p.nextInt();
            int[] a = new int[n+1];
            for(int i =1; i<=n; i++){
                a[i] = p.nextInt();
            }
            int d =1;
            for(int i =1; i<n;i++){
                if(check(a) == false){
                    for(int j=i+1; j<=n; j++){
                    if(a[i]>a[j]){
                        int x = a[i];
                        a[i]=a[j];
                        a[j]=x;                       
                     }
                }
                
            }else break;
                
                System.out.print("Buoc "+i+":");
                for(int t=1; t<=n; t++){
                    System.out.print(" "+a[t]);
                }    
                System.out.println("");
                
        }
    }
    static boolean check (int a[]){
        int n = a.length;
        for(int v =1; v<n; v++){
            if(a[v]>a[v+1]){
                return false;
            }
    }
        return true;
}
}
