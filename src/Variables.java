
//My Class in Java
public class Variables {
    public static void main(String args[]) {
        // define variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        // Modify variable value
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);

        // var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        // Concadenación de variables
        var miVariableCadena2 = "Happy World";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);// se realiza la suma de numeros
        System.out.println(i + j + usuario); // Primero se realiza la suma
        System.out.println(usuario + i + j); // Contexto cadena, aqui no sumará los valores
        System.out.println(usuario + (i + j)); // Aquí si efectuará la suma

        // Valores permitidos en variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;

        // Funcionalidades
        var nombre = "Karla";

        System.out.println("Nueva línea: \n" + nombre);// Hace un salto de línea
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
