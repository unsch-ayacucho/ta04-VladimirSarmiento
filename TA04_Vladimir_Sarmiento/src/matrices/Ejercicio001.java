
package matrices;

public class Ejercicio001 {

    public static void main(String[] args) {
        int ElementosFila = 6;
        int ElementosColumna = 10;
        int Emax = 100, Emin = 0;
        
        int[][] Matriz = new int [ElementosFila][ElementosColumna];
        
        for (int i = 0;i<ElementosFila;i++){
            for (int e = 0;e<ElementosColumna;e++ ){
                int aleatorio = (int)Math.floor(Math.random()*(Emax-Emin)+Emin);
                Matriz[i][e]=aleatorio;
            }  
        }
        
        //buscando el max y min:
        int Emax1, Emin1;
        Emax1 = Emin1 = Matriz[0][0]; 
        
        
        int contF1=0, contF2=0, contC1=0, contC2=0;
        for (int i = 0;i<ElementosFila;i++){
            for(int e = 0;e<ElementosColumna;e++){
                if(Emax<Matriz[i][e]){
                    Emax1 = Matriz[i][e];
                }
                if(Matriz[i][e]<Emin1){
                    Emin1 = Matriz[i][e];
                }
            }
        }
        
        // para ubicar la pocicion del numero mayor:
        int posicionMax1 = 0; int posicionMax2 = 0;
        for (int m = 0; m<ElementosFila;m++){
            for(int n = 0; n<ElementosColumna;n++){
                if(Matriz[m][n]==Emax1){
                    posicionMax1 = m;
                    posicionMax2 = n;                   
                }
            }
        }
        
        // para ubicar la pocicion del numero menor:
        int posicionMin1 = 0; int posicionMin2 = 0;
        for (int m = 0; m<ElementosFila;m++){
            for(int n = 0; n<ElementosColumna;n++){
                if(Matriz[m][n]==Emin1){
                    posicionMin1 = m;
                    posicionMin2 = n;                   
                }
            }
        }
        
        System.out.println("el máxino se ubica en la posicion :"+"["+posicionMax1+"]"+"["+posicionMax2+"]");
        System.out.println("el mínino se ubica en la posicion :"+"["+posicionMin1+"]"+"["+posicionMin2+"]");
            
    }
    
}
