package com.codewithvitor;
import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[],b[],C[],i,c=0;
        a = new int[10];
        b = new int[10];
        C = new int[10];
        int aux;

        for (i=0;i<a.length;i++){
            System.out.println("Digite o "+(i+1)+"° número:");
            a[i] = in.nextInt();
            b[i] =a[i];
            C[i] = a[i];

        }

        for (i=0;i<b.length;i++){

            for (c = i+1;c<b.length;c++){
                if(b[i]>b[c]){
                    aux = b[i];
                    b[i] = b[c];
                    b[c] = aux;

                }

            }
        }

        for (i=0;i<C.length;i++){
            for (c = i+1;c<C.length;c++){
                if(C[i]<C[c]){
                    aux = C[i];
                    C[i] = C[c];
                    C[c] = aux;

                }

            }
        }



        for (i=0;i<a.length;i++){
            System.out.println("A["+i+"] = "+a[i]+"     B["+i+"] ="+b[i]+"     C["+i+"] = "+C[i]);
        }


        /*
        *   Eu só copiei o meu código 5 da lista
        *   Acredito que as duas tenham o mesmo objetivo...
        */



    }
}
