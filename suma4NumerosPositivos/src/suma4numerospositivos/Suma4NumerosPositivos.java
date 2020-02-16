
package suma4numerospositivos;

import java.util.Scanner;

public class Suma4NumerosPositivos {

    public static void main(String[] args) {
         Scanner entrada =  new Scanner(System.in);
    
    int numero[]=new int[5],Suma=0,Max=0,Min=1000,i;
 
  for(i=0;i<5;i++){
   System.out.println("Digite el numero "+(i+1)+": ");
  numero[i] = entrada.nextInt();
   Suma=Suma+numero[i];
  if(numero[i]>Max)
  {
      Max=numero[i];
  }
  if(numero[i]<Min)
  {
      Min=numero[i];
  }
}
          System.out.println("la suma maxima que puede hacer es: "+(Suma-Min));
        System.out.println("la minima suma que puede hacer es:"+(Suma-Max));

}
}
