import java.util.Scanner;
public class InvertendoVetores {
    public static void main(String[] args){
        int a[], b[], i,c=0;

        a = new int[10];
        b = new int[10];


        Scanner in = new Scanner(System.in);

        for(i=0;i<a.length;i++){
            System.out.println("Digite o número do vetor a["+i+"]: ");
            a[i] = in.nextInt();
        }


        i = a.length-1;

        while (i>=0){
            b[c] = a[i];
            c++;
            i--;
        }



        for(i=0;i<b.length;i++){
            System.out.println("a["+i+"] = "+a[i]+" enquanto b["+i+"] = "+b[i]);
        }




    }
}
