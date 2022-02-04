import java.util.Scanner;

/*
Se solicita incluir la siguiente información acerca de un libro:

titulo

autor

Debes imprimir la información en el siguiente formato:

Proporciona el titulo:
Proporciona el autor:
<titulo> fue escrito por <autor>
Puedes utilizar el IDE de tu preferencia para desarrollar la solución y después pegar aquí tu respuesta, ya que este editor no contiene ningún tipo de ayuda.

Preguntas de esta tarea
¿Cuál es el código del requerimiento solicitado?
*/

public class ejercicio1 {
    public static void main(String args[]) {
        System.out.println("Proporciona el titulo:");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrio por " + autor);

    }
}
