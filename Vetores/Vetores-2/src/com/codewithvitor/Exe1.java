package com.codewithvitor;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        int variavel = 2 ,c=0;
        int a[] = new int[variavel];
        int b[] = new int[variavel];


        for(int i =0;i<a.length;i++){
            System.out.println("Digite o "+(i+1)+"° número:");
            a[i] = in.nextInt();
        }


        System.out.print("Vetor A[] desordenado = [ ");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("]");

        System.out.print("\n");
        System.out.print("\n");
        int i = a.length-1;
        int z = 0;

        for(c=0;c<a.length;c++){
            if (a[c]%2!=0){

                b[i] = a[c];
                i--;
            }else{
                b[z] = a[c];
                z++;
            }
        }

        boolean BrecadorIf = true;
        System.out.println("PARES: ");

        for (i = 0; i<a.length;i++){
            a[i] = b[i];

            if(a[i]%2!=0 && BrecadorIf==true){

                // isso é so pra pular a linha e escrever impares depois

                System.out.print("\n");
                System.out.println("IMPARES:");
                BrecadorIf = false;

            }

            System.out.print(a[i]+" ");

        }

        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Vetor A[] ordenado = [ ");
        for (i = 0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("]");


    }
}
