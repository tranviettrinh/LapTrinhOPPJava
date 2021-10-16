/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamKhao;

/**
 *
 * @author trinhtv.B17AT191
 */
class Xang {
    private final String daoVao;


    public Xang(String daoVao) {
        super();
        this.daoVao = daoVao;
    }
    public String ma() {
        String a[]=this.daoVao.split("\\s+");
        return a[0];
    }
    public int sol() {
        String a[]=this.daoVao.split("\\s+");
        int b=Integer.parseInt(a[1]);
        return b;
    }
    public String maSX() {
        String a=this.ma().substring(3);
        if(a.equals("BP")==true) {
            return "British Petro";
        }
        if(a.equals("ES")==true) {
            return "Esso";
        }
        if(a.equals("SH")==true) {
            return "Shell";
        }
        if(a.equals("CA")==true) {
            return "Castrol";
        }
        if(a.equals("MO")==true) {
            return "Mobil";
        }
        if(a.equals("TN")==true) {
            return "Trong Nuoc";
        }
        return "";
    }
    private  double thue() {
        String a=this.ma().charAt(0)+"";
        if(a.equals("X")==true) {
            return 3.0/100;
        }
        if(a.equals("D")==true) {
            return 3.5/100;
        }
        if(a.equals("N")==true) {
            return 2.0/100;
        }return 0;
    }
    public long donGia() {
        String a=this.ma().charAt(0)+"";
        if(a.equals("X")==true) {
                return 128000;
            }
        if(a.equals("D")==true) {
                return 11200;
            }
        if(a.equals("N")==true) {
                return 9700;
        }return 0;
    }
    public double tinhThue() {
        String a=this.ma().substring(3);
        if(a.equals("TN")==false) {
            double b= (this.sol()*this.thue()*this.donGia());
            return b;
        }
        return 0;

    }
    public double thanhTien() {
        return  this.tinhThue()+this.donGia()*this.sol();
    }
    @Override
    public String toString() {
        return this.ma()+" "+this.maSX()+" "+this.donGia()+" "+String.format("%.0f",tinhThue())+" "+String.format("%.0f",thanhTien());
    }


}
