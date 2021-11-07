/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class HelloFile {

    public static void main(String[] args) throws IOException {
        File a = new File("Hello.txt");
        Scanner p = new Scanner(a);
        System.out.println(p.nextLine());
    }
}
