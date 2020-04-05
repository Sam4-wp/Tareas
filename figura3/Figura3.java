

package figura3;


    import java.util.Scanner;

public class Figura3 {
    
public static void main(String[] args) {
    

    int i,j;

        Scanner teclado;
        
        teclado = new Scanner(System.in);
        
        System.out.println("Numero de filas en la matriz");
        
        int n=teclado.nextInt();
        
        int y=n-1;
        
        System.out.println("Numero de columnas en la matriz");
        
        int m=teclado.nextInt();
        
        String matriz [][]= new String [n][m];

        for( i=0;i<n;i++){
            
            for(j=0;j<m;j++){
                
                    matriz[i][j]=" ";  
                    
                }    
             }
             //Filas en la matriz
        for(i=0;i<m;i++){
            
            matriz[0][i]="x";
            matriz[n-1][i]="x";
        }
        //Columnas en la matriz
        for(i=0;i<n;i++){
            
            matriz[i][0]="x";
            matriz[i][m-1]="x";
        }

        //Impresion de la matriz
        for(i=0; i<n;i++){
            for(j=0;j<m;j++){
              System.out.print(" [ " + matriz[i][j] + "  ] ");
            }
            System.out.println();
         }
    }
}

















