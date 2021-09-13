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
public class DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        int u =1;
        while(u<=t){
            int n = p.nextInt();
            int a[] = new int[n+1];
            for(int i=1; i<=n;i++){
                a[i]= p.nextInt();
                
            }
            System.out.println("Test "+u+":");
            for(int i=1; i<n;i++){
                if(a[i]!=-1 && check(i)==true){
                    int d =1;
                    for(int j=i+1;j<=n;j++){
                        if(a[j]==a[i]){
                            d++;
                            a[j]=-1;
                        }
                        
                    }
                    System.out.println(a[i]+" xuat hien "+d+" lan");
                    a[i]=-1;
                }
                
            }
            u++;
        }
    }
    static boolean check(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
}
