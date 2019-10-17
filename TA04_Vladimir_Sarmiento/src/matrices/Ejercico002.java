
package matrices;

import java.util.Scanner;

public class Ejercico002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int Filas = 4;
        int Columnas = 5;
        
        int[][] Matriz = new int [Filas][Columnas];
        for(int i = 0;i<Filas;i++){
            for(int e = 0;e<Columnas;e++){
                System.out.print("digite el dato del indice "+"["+i+"]"+"["+e+"]: ");
                Matriz[i][e] = entrada.nextInt();   
            }
        }
        //imprimiendo la matriz
        System.out.println("la matriz original es: ");
        for(int i=0;i<Filas;i++){
            for(int j=0;j<Columnas;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
    
        
        int[] SumaFilas =  new int [Filas];
        int[] SumaColumnas =  new int [Columnas];
        int SF; int SC;
        for(int i = 0;i<Filas;i++){
            SF =0;
            for(int j=0;j<Columnas;j++){
                SF +=Matriz[i][j];
                
            }
            SumaFilas[i] = SF;
           
           
        }
        
        
        for(int j=0;j<Columnas;j++){
            SC = 0;
            for(int i=0;i<Filas;i++){
                SC +=Matriz[i][j];
                
            }
            SumaColumnas[j]=SC;
        }
        //suma total fila 
        int SumaTotalFilas=0;
        for(int i=0;i<Filas;i++){
            SumaTotalFilas = SumaTotalFilas+SumaFilas[i];
        }
        //suma total columna 
        int SumaTotalColumnas=0;
        for(int i=0;i<Columnas;i++){
            SumaTotalColumnas = SumaTotalColumnas+SumaColumnas[i];
        }    
         
        //suma total 
        int SumaTotal = SumaTotalFilas+SumaTotalColumnas;
        
        
        //imprimiendo la mitriz con sus respectivos sumas parciales y totales
        
        System.out.println("la matriz con sus respectivos sumas parciales de filas,columnas y suma total ");
        for(int i=0;i<Filas;i++){
            for(int j=0;j<Columnas;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.print(SumaFilas[i]+" ");
            System.out.println("");
        }
        for(int i=0;i<Columnas;i++){
            System.out.print(SumaColumnas[i]+" ");
        }
        System.out.print(SumaTotal);
        
        System.out.println("\n");
        
        
   
    }
    
}
