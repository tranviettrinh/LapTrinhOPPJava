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
public class PhanTichThuaSoNguyenTo {

 public static void main(String args[]){
     Scanner p = new Scanner(System.in);
     int t = p.nextInt();
     int v=1;
     while(v<=t){
            
         int n = p.nextInt();
         System.out.print("Test "+v+":");  
         for(int i=2; i<=n;i++){
             int d=0;
             while(n%i==0){
                 n=n/i;
                 d++;
           
             }
             if(d>0){
                 System.out.print(" "+i+"("+d+")");
  
             }
         }
         v++;
         System.out.println("");
     }
 }
}
