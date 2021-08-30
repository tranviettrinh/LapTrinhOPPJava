/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LapTrinhOPPJava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class TongUocSo {
    public static boolean [] isPrime = new boolean[2000006];// mảng kiểm tra số nguyên tố
    public static int [] arrayPrime = new int[200005];// mảng chứa số nguyên tố từ 1 -> sqrt(2000005)
 
    public static void sangNguyenTo(){
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        int k = 0;
        for(int i = 2;i * i <= 2000005;i++){
            if(isPrime[i]){
                arrayPrime[k] = i;
                k++;
                for(int j = i * i;j <= 2000005;j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        sangNguyenTo();
        long maxRes = 0;// lưu kết quả
        for(int i = 0;i < n;i++){
            if(isPrime[arr[i]]){
                maxRes += arr[i];// kiểm tra nếu là số nguyên tố
            }
            else {
                int k = 0;// index trong mảng số nguyên tố
                while (arr[i] != 1) {
                    // lấy các ước số nguyên tố của nó
                    while (arr[i] % arrayPrime[k] == 0) {
                        maxRes += arrayPrime[k];
                        arr[i] /= arrayPrime[k];
                    }
                    // nếu nó là số nguyên tố sau khi tìm đc các ước thì cộng vào res và dừng vòng lặp
                    if(isPrime[arr[i]]){
                        maxRes += arr[i];
                        break;
                    }
                    k++;
                }
            }
        }
        System.out.println(maxRes);
        sc.close();
    }
    
}
