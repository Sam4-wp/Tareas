package pilasdos;

import java.util.Scanner;


public class Pilasdos {
//agregar el abecedario en un vector pila
    char pilabc[] = new char[26];
    int tope = 0;

    public void llenar(){
        for(int i=1; i<=26; i++){
        char c =(char) (Math.random()*26 + 'a');
        pilabc[tope]=c;
        c++;
        tope++;
        }
    }


    public void mostrar() {
        for (int i = tope - 1; i >= 0; i--) {
            System.out.print(" " + pilabc[i]);
        }
    }

    public void eliminar() {
        tope--;
        System.out.println("dato eliminado...");
    }

    public void agregar(char w) {
        pilabc[tope] = w; //$ *
        tope++;
        System.out.println("dato agregado..");
    }
    
    public void ordenar(){
         char letra = 'A'; 
        for (int i = 0; i < 26; i++) {
            if (tope < 26) {
                pilabc[tope] = letra;
                letra++;
                tope++;
            } else {
                System.out.println("pila llena");
                break;
            }
        }  
    }

    public static void main(String[] args) {
        Pilasdos c = new Pilasdos();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("\n1 llenar\n"
                    + "2 mostrar\n"
                    + "3 eliminar\n"
                    + "4 agregar\n"
                    + "5 Ordenar\n"
                    + "6 salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    c.llenar();
                    break;
                case 2:
                    c.mostrar();
                    break;
                case 3:
                    c.eliminar();
                break;
                case 4:
                    System.out.println("ingresa el dato");
                    char w=sc.next().charAt(0);
                    c.agregar(w);
                break;
                
                case 5:
                    c.ordenar();
                    break;
            }
        } while (opt != 6);
    }
}