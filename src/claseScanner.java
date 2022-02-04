import java.util.Scanner;

public class claseScanner {
    public static void main(String args[]) {
        System.out.println("Escrbe tu nombre:");// pedimos algo en la consola
        Scanner consola = new Scanner(System.in); // recibimos el input
        var usuario = consola.nextLine();// metodo para leer una linea en la consola.
        System.out.println("Escribe un título:");
        var titulo = consola.nextLine();
        System.out.println("usuario = " + titulo + " " + usuario);
    }

}
