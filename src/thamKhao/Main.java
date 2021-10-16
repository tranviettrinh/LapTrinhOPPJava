/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamKhao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class Main {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Xang> ds=new ArrayList<Xang>();
        int so=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=so;i++) {
            Xang a=new Xang(sc.nextLine());
            ds.add(a);
        }
        for(Xang a:ds) {
            System.out.println(a);
        }
    }
}
