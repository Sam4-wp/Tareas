/*
Sosa Ibarra Samuel
2S11
IMC
Clase persona
 */
package indicemasacorporal;
import java.util.Scanner;
public class persona {
    
String nombre;
String edad;
String sexo;

    void persona(){
    System.out.println("Ingresa los datos");
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingrese nombre: ");
    nombre = teclado.nextLine();
    
    System.out.println("Ingrese edad: ");
    edad = teclado.nextLine();
    
    System.out.println("Ingrese sexo: ");
    sexo = teclado.nextLine();
    
    System.out.println("Tu nombre es: "+nombre);
    System.out.println("Tu edad es: "+edad);
    System.out.println("Eres del sexo: "+sexo);
    
    }
}
