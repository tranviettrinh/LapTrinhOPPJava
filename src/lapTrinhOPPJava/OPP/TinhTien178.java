/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class TinhTien178 {
    private String a,b;
    private int c;
    private long d, e, f;

    public TinhTien178() {
    }

    public TinhTien178(String a, String b, int c, long d, long e, long f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public long getF() {
        return f;
    }

    

    
    @Override
    public String toString(){
        return String.format(a+" "+b+" "+c+" "+d+" "+e+" "+f);
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        List<TinhTien178> list = new ArrayList<>();
        while(u++<t){
            String a = p.nextLine();
            String b = p.nextLine();
            int c = Integer.parseInt(p.nextLine());
            long d = Long.parseLong(p.nextLine());
            long e = Long.parseLong(p.nextLine());
            long f = c*d-e;
            TinhTien178 tt = new TinhTien178(a,b,c,d,e,f);
            list.add(tt);
        }
        list.sort((o1,o2)-> o1.getF()>o2.getF()?-1:1);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
    
}
