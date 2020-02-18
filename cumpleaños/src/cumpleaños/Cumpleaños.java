
package cumpleaños;

import java.util.Scanner;

public class Cumpleaños {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamaño[] = new int[1000],n, maximo=0, repeticion=0;
        System.out.println("¿cuantos años tiene?");
        n=entrada.nextInt();
        for (int i=0;i<n;i++)
        {
        System.out.println("digite el tamaño de la vela "+(i+1)+":");
        tamaño[i]= entrada.nextInt();
        if(tamaño[i]>maximo)
        {
        maximo=tamaño[i];
        }
        }
        for (int i=0;i<n;i++)
        {
        if(tamaño[i]==maximo)
        {
        repeticion=repeticion+1;
        }
        }
        System.out.println("el numero de velas apagades es "+repeticion);

    }
    
}