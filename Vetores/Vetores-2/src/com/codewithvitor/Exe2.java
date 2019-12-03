package com.codewithvitor;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args){
        int a[], i,c;
        a = new int[5];
        Scanner in = new Scanner(System.in);

        for (i=0;i<a.length;i++){
            System.out.println("Digite o "+(i+1)+"° número:");
            a[i] = in.nextInt();
        }


        for (i=0;i<a.length;i++) {
            for (c=1;c<11;c++){
                System.out.println(a[i]+" X "+c+" = "+(a[i]*c));
            }
            System.out.println("\n");
        }


    }
}
