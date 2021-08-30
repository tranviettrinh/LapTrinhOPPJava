/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LapTrinhOPPJava;

import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class PhanTichThuaSoNguyenTo {
    boolean checkNguyenTo(int n){
  if(n <=2){
   return true;
  }else{
   for(int i = 2; i<=n/2;i++){
    if(n%i == 0){
     return false;
    }
   }
  }
  return true;
 }
 void phantichthuasonguyento(int n){
    for(int i=2;i<=n;i++){
   while(checkNguyenTo(i) && (n%i ==0)){
    System.out.print(" "+i);
    n/=i;
   }
  }
 }
 public static void main(String args[]){
  PhanTichThuaSoNguyenTo pt = new PhanTichThuaSoNguyenTo();
  int n = 12;
  pt.phantichthuasonguyento(n);
 }
}
