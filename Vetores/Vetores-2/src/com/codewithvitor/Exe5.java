package com.codewithvitor;
import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args){
        int a[],c=0, i;
        a = new int[10];

        Scanner in = new Scanner(System.in);

        for(i=0;i<a.length;i++){
            System.out.println("Digite "+(i+1)+"° número: ");
            a[i] = in.nextInt();
        }

        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" = { ");
            for (c=1;c<a[i];c++){
                if (a[i]%c==0){
                    System.out.print(c+", ");
                }


            }
            System.out.println(a[i]+" }");
        }





    }
}
