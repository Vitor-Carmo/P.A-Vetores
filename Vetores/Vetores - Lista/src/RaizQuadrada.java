import java.util.Scanner;
import java.math.*;
public class RaizQuadrada {
    public static void main(String[] args){

        int a[],i;
        double b[];

        Scanner in = new Scanner(System.in);

        a = new int[10];
        b = new double [10];
        for(i=0;i<a.length;i++) {

            System.out.println("Digite o "+(i+1)+" número: ");
            a[i] = in.nextInt();
            b[i] = a[i];
            b[i] = Math.sqrt(b[i]);
        }

        for(i=0;i<a.length;i++) {
            System.out.println("A raiz quadrada de "+a[i]+" = "+b[i]);

        }
    }

}
