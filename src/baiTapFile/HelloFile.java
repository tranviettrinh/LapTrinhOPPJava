/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class HelloFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File a = new File("./src/baiTapFile/Hello.txt");
        Scanner p = new Scanner(a);
        System.out.println(p.nextLine());
//        BufferedReader br = new BufferedReader(new FileReader("./src/baiTapFile/Hello.txt"));
//        try {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//
//            while (line != null) {
//                sb.append(line);
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//            }
//            String everything = sb.toString();
//            System.out.println(everything);
//        } finally {
//            br.close();
//        }
    }
}
