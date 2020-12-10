package eliminarprimeryultimo;


import java.util.Scanner;

public class Eliminarprimeryultimo {
    
    Scanner sc = new Scanner(System.in);
    static class Nodo {
        String dato;
        Nodo sig;
     }
    

    Nodo inicio = null;
    Nodo fin = null;

    
    public void agregar() {
        Nodo temp = new Nodo();
        System.out.println("agregar el dato ");
        temp.dato = sc.nextLine();
        
        if (fin == null) {
            fin = temp;
            fin.sig = null;
            inicio = temp;
        } else {
           inicio.sig = temp;
            temp.sig = null;
            inicio = temp;
            System.out.println("Dato agregado "+ inicio.dato);
        }
    }

    public void mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                System.out.print(" DATO " + "[" + actual.dato + "]");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }

   public void eliminarPrimero() {
   Nodo actual = fin;
   while(actual.sig != inicio){
       actual = actual.sig;
   }
   System.out.println("Dato eliminado: "+ inicio.dato);
   actual.sig = null;
   inicio = actual;
  
    }

   public void eliminarultimo(){
        System.out.println("El dato se elimino correctamente: "+fin.dato);
        fin = fin.sig;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        Eliminarprimeryultimo n = new Eliminarprimeryultimo();
        do {
            System.out.println("\n1 add \n"
                    + "2 mostrar \n"
                    + "3 elimiar Primero\n"
                    + "4 eliminar Ultimo\n"
                    + "5 salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;
                case 3:
                    n.eliminarPrimero();
                    break;
                case 4:
                    n.eliminarultimo();
                    break;
            }
        } while (opt != 5);
    }
}