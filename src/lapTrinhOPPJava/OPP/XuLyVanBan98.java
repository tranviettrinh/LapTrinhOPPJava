/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class XuLyVanBan98 {

    public static String XuLyDong(String a) {
        String b = new String();
        String[] tach = a.split(" ");
        for (int j = 0; j < tach.length; j++) {
            if (!tach[j].isEmpty()) {
                b = b.concat(tach[j].toLowerCase().concat(" "));
            }

        }
        b = b.substring(0, b.length() - 1);
        return b;
    }

    public static String[] XuLyDoanVan(String a) {

        String[] tach = a.split("[.//?//!]");
        return tach;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader p = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(p);
        String a = new String();
        do {
            a= input.readLine();
            System.out.println(a);

        } while (!a.isEmpty());
        

    }

}
