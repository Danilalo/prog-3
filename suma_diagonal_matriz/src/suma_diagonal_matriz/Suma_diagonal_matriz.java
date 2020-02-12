
package suma_diagonal_matriz;

import java.util.Scanner;

public class Suma_diagonal_matriz {

    public static void main(String[] args) {
        Scanner entada=new Scanner(System.in);
    int Matriz[][];
    int n,suma=0;
    System.out.println("digite el numero de filas y de columnas: ");
    n=entada.nextInt();
    Matriz=new int[n][n];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        {  
                  System.out.println("digite la fila "+(i+1)+", columna "+(j+1)+":" );
              Matriz[i][j]=entada.nextInt();
  
        } 

    }
          System.out.println("");
     System.out.println("");

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        {
      System.out.print(Matriz[i][j]);
      if(i==j)
      {
      suma= suma + Matriz[i][j];
      }
    }
     System.out.println("");
  
    }
         System.out.println("La suma de la diagonal principal es: "+ suma);

    }
    
}
