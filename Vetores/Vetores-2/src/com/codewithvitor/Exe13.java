package com.codewithvitor;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];

        for (int i = 0; i <a.length ; i++) {
            System.out.println("Digite o "+(i+1)+"° número");
            a[i] = in.nextInt();
            if(a[i]%2==0){
                b[i] = 1;
            }else{
                b[i] = 0;
            }
        }

        System.out.print("B = [ ");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.print("]");

    }



}
