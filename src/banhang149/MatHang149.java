/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banhang149;

/**
 *
 * @author trinhtv.B17AT191
 */
public class MatHang149 {
    private String id, name,donvi;
    private int giamua, giaban;

    public MatHang149() {
    }

    public MatHang149(int n, String name, String donvi, int giamua, int giaban) {
        this.id = "MH".concat(String.format("%03d",n));
        this.name = name;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDonvi() {
        return donvi;
    }

    public int getGiamua() {
        return giamua;
    }

    public int getGiaban() {
        return giaban;
    }
    public int getLoiNhuan(){
        return giaban-giamua;
    }
    @Override
    public String toString(){
//        return String.format(name+" "+donvi+" "+giamua+" "+giaban);
        return String.format(name);
    }
}
