package com.codewithvitor;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];

        for (int i = 0; i <a.length; i++) {
            System.out.println("Digite um número do vetor A["+i+"]");
            a[i] = in.nextInt();
        }

        System.out.println("----------------------------------------");


        for (int i = 0; i <a.length; i++) {
            System.out.println("Digite um número do vetor B["+i+"]");
            b[i] = in.nextInt();
        }


        System.out.print("C = [  ");
        for (int i = 0; i <c.length ; i++) {
            if (a[i]==b[i]){
                c[i]=0;
                System.out.print(c[i]+"  ");

            }else if (a[i]>b[i]){
                c[i]=1;
                System.out.print(c[i]+"  ");
            }else{
                c[i]=-1;
                System.out.print(c[i]+"  ");
            }
        }
        System.out.println("]");

    }
}
