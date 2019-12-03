package com.codewithvitor;
import com.sun.scenario.effect.light.SpotLight;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[],c=0;
        a = new int[10];
        boolean palindromo=true;

        for (int i = 0; i <a.length ; i++) {
            System.out.println("Digite o "+(i+1)+"° número");
            a[i] = in.nextInt();
        }

        for (int i = a.length-1; i >=0 ; i--) {
            if(a[i]==a[c]){
                palindromo = true;
            }else{
                palindromo =false;
                break;
            }
            c++;
        }


        if (palindromo){
            System.out.println("O vetor é palíndromo.");
        }else {
            System.out.println("O vetor não é palíndromo.");
        }



    }
}
