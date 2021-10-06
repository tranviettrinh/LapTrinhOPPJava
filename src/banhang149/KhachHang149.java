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
public class KhachHang149 {
    private String id,namekh,gioitinh,diachi,ngaysinh;
    

    public KhachHang149() {
    }

    public KhachHang149(int n, String namekh, String gioitinh,  String ngaysinh,String diachi) {
        this.id = "KH".concat(String.format("%03d",n));
        this.namekh = namekh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
    }

    public String getId() {
        return id;
    }

    public String getNamekh() {
        return namekh;
    }

    

    public String getDiachi() {
        return diachi;
    }

    
    @Override
    public String toString(){
        return String.format(namekh+" "+diachi);
    }
    
}
