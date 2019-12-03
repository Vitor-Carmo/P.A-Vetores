package com.codewithvitor;
import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[],b[],c[],i,z=0, Variavel=10;
        a = new int[Variavel];
        b = new int[Variavel];
        c = new int[Variavel];


        for(i=0; i<a.length;i++){
            System.out.println("Digite o "+(i+1)+"° elemento do vetor A");
            a[i] = in.nextInt();
        }
        System.out.println("-------------------------------------------------");

        for(i=0; i<b.length;i++){
            System.out.println("Digite o "+(i+1)+"° elemento do vetor B");
            b[i] = in.nextInt();
        }





        System.out.print("A ∩ B = { ");

        for(i=0; i<Variavel;i++){
            for (int j=0;j<Variavel;j++) {
                if(a[i]==b[j]){
                    c[z] = b[j];
                    System.out.print(c[z]+" ");
                    z++;
                }
            }
        }
        System.out.println("}");



    }

}
