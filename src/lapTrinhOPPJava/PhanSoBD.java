/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava;

import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class PhanSoBD {
    public static void main(String[] args) {
        PhanSo p = new PhanSo(1,1);
        p.nhap();
        p.rutGon();
        System.out.println(p);
    }
}

class PhanSo {
  private long tuso;
  private long mauso;

  public PhanSo() {}

  public PhanSo(long tuso, long mauso) {
    this.tuso = tuso;
    this.mauso = mauso;
  }

  public void nhap() {
    Scanner scanner = new Scanner(System.in);
    this.tuso = scanner.nextLong();
    this.mauso = scanner.nextLong();
    scanner.close();
  }

  public void rutGon() {
    long temp = _gcd(this.tuso, this.mauso);
    this.tuso = this.tuso / temp;
    this.mauso = this.mauso / temp;
  }

  private long _gcd(long a, long b) {
    return b == 0 ? a : _gcd(b, a % b);
  }

  @Override
  public String toString() {
    return this.tuso + "/" + this.mauso;
  }
}
