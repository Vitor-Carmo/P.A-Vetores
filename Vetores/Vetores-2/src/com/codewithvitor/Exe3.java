package com.codewithvitor;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a[], i, TotalPrimos[];
        int c = 0;
        a = new int [10];
        TotalPrimos = new int[10];


        for(i=0;i<a.length;i++){
            System.out.println("Digite "+(i+1)+"° número: ");
            a[i] = in.nextInt();
            TotalPrimos[i] = 0;
            for( c=1;c<=a[i];c++){

                if(a[i]%c==0){
                    TotalPrimos[i]++;
                }

            }


        }




        for (i=0;i<a.length;i++) {
            if (TotalPrimos[i] == 2) {
                System.out.println(a[i]+" é primo");
            } else {
                System.out.println(a[i]+" não é primo");
            }
        }




    }
}
