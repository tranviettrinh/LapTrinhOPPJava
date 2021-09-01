/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int a = p.nextInt();
        int b = p.nextInt();
        float nghiem;
        if(a==0){
            if(b==0) System.out.println("VSN");
            else System.out.println("VN");
        }else {
        nghiem =(float)-b/a;
        System.out.println(df.format(nghiem));
        }

    }
}

