package com.codewithvitor;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int a[],c, i;
        a = new int[10];

        for(i=0;i<a.length;i++){
            System.out.println("Digite "+(i+1)+"° número: ");
            a[i] = in.nextInt();
        }

        System.out.println();
        System.out.println();
        for(i=0;i<a.length;i++){
            System.out.println("---------------------------------------");
            System.out.println("Os pares entre 0 e "+a[i]+" São: ");
            c = 0;
            while(c<=a[i]){
                 if(c%2==0){
                     System.out.print(c+" ");
                 }

                 c++;
            }
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println();
            System.out.println();
        }











    }

}
