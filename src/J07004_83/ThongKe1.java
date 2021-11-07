/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07004_83;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class ThongKe1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        int a[] = new int[1000];
        while(in.hasNextInt()){
            a[in.nextInt()]++;
            
        }
        for(int i=1;i<1000;i++){
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}
