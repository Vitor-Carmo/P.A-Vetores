import java.util.Scanner;
public class MaiorValorLido {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[],i,MaiorNumero=0, MenorNumero = 0;
        a = new int[10];


        for(i = 0; i< a.length;i++){
            System.out.println("Digite o "+(i+1)+"° número");
            a[i] = in.nextInt();
        }

        MaiorNumero = a[0];
        MenorNumero = a[0];

        for(i = 0; i< a.length;i++){
            if (a[i]>MaiorNumero){
                MaiorNumero = a[i];
            }
            if (MenorNumero>a[i]){
                MenorNumero = a[i];
            }


        }

        System.out.println("O maior número é: "+MaiorNumero);
        System.out.println("O menor número é: "+MenorNumero);



    }
}
