/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LapTrinhOPPJava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class DiaChiEmail {
    static ArrayList<String> A = new ArrayList<String>();
    public static void solution(String N)
    {
        N = " " + N.toLowerCase() + " ";
        String Ans = "";
        for(int i = 1; i < N.length(); i++)
        {
            if(N.charAt(i) != ' ' && N.charAt(i-1) == ' ')
            {
                Ans += N.charAt(i);
            }
        }
        Ans = Ans.substring(0,Ans.length()-1);
        for(int i = N.length()-1; i > 0; i--)
        {
            if(N.charAt(i) != ' ' && N.charAt(i-1) == ' ')
            {
                String tmp = "";
                while(N.charAt(i) != ' ')
                {
                    tmp += N.charAt(i);
                    i++;
                }
                Ans = tmp + Ans;
                break;
            }
        }
        A.add(Ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < T; i++)
        {
            String N = "";
            do
            {
    	    	N = sc.nextLine();
        	}
        	while(N == "");
            solution(N);
        }
        for(int i = 0; i < A.size(); i++)
        {
            int Count = 0;
            for(int j = 0; j <= i; j++)
            {
                if(A.get(i).equals(A.get(j)))
                {
                    Count++;
                }
            }
            if(Count == 1)
            {
                System.out.print(A.get(i) + "@ptit.edu.vn\n");
            }
            else
            {
                System.out.print(A.get(i) + Count + "@ptit.edu.vn\n");
            }
        }
    }
}
