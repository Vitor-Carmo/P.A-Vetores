package com.codewithvitor;
import java.util.Scanner;


public class Exe7 {
    public static void main(String[] args){
        int a[],b[], i,c;
        a = new int[15];
        b = new int [15];
        Scanner in = new Scanner(System.in);

        for(i=0;i<a.length;i++){
            System.out.println("Digite "+(i+1)+"° número: ");
            a[i] = in.nextInt();
        }

        for(i=0;i<a.length;i++){

            b[i] = 1;

            for (c=a[i];c>0;c--){
                b[i] *=c;
            }

            if(a[i]==0) { b[i]=1;}

            System.out.println(a[i]+"! = "+b[i]);
        }




    }


}
