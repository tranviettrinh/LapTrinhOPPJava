/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class Test {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String ho = p.next();
        String dem = p.next();
        String ten = p.next();
        p.nextLine();
        String hoten = p.nextLine();
        System.out.println(ho+dem+ten);
        System.out.println(hoten);

    }
}
