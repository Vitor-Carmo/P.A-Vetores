package com.codewithvitor;
import java.util.Scanner;
import java.math.*;

public class Exe6 {
    public static void main(String[] args){
        int a[],c;
        a = new int[11];

        Scanner in = new Scanner(System.in);
        System.out.print("A[");
        for(int i =0;i<a.length;i++){
            a[i] = (int) Math.pow(2, i);


            //Condição para colocar virgula ou ponto.

            if (i == a.length-1){
                System.out.print(a[i]);
            }else{
                System.out.print(a[i]+", ");
            }

        }
        System.out.println("]");


    }
}
