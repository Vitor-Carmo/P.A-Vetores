package com.codewithvitor;
import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args){
        int a[] = new int[10];
        boolean Verdadeiro = false;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i <a.length ; i++) {
            System.out.println("Preencha o vetor A["+i+"]:");
            a[i] = in.nextInt();

        }
        System.out.println("Qual elemento você quer verificar");
        int x = in.nextInt();


        for (int i = 0; i <a.length ; i++) {
            if (a[i]==x){
                Verdadeiro = true;
            }
        }



        if (Verdadeiro){
            System.out.println("O número "+x+" exite no vetor A!");
        }else{
            System.out.println("O número "+x+" não exite no vetor A!");
        }




    }
}
