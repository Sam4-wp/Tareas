package nodo;
import java.util.Scanner;
public class Nodo {

    Scanner sc = new Scanner(System.in);
    String dato;
    Nodo sig;
    
    
    Nodo fin = null;

    public void agregar() {
        Nodo temp;
        String msg;
        System.out.println("agregar el dato ");
        if (fin == null) {
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
        } else {
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;
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
    
    public void eliminar(){
        System.out.println("El dato se elimino correctamente: "+fin.dato);
        fin = fin.sig;
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        Nodo n = new Nodo();
        do {
        System.out.println("1. Agregar");
        System.out.println("2. Mostrar");
        System.out.println("3. Eliminar");
        System.out.println("4. Salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;
                    
                case 3:
                    n.eliminar();
                    break;
            }
        } while (opt != 4);
    }
}