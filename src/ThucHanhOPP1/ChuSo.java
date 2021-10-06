/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhOPP1;

import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class ChuSo {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        while (p.hasNext()) {
            String s = p.nextLine();
            int n = s.length();
            int d = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '4' || s.charAt(i) == '7') {
                    d++;
                }
            }
            if (d == 4 || d == 7) {
                System.out.println("YES");
            }else System.out.println("NO");

        }
    }
}
