package package1;

import java.util.Scanner;

public class Ejecucion {

    public void IniciarPrograma(){

        Palabras input1 = new Palabras("hasta luego cocodrilo");
        Palabras input2 = new Palabras("anita lava la tina");

        System.out.println("1. Primera letra mayuscula: ");
        input1.hacerPrimeraMayuscula();
        input2.hacerPrimeraMayuscula();

        System.out.println("2. Oracion invertida: ");
        input1.invertirCadena();
        input2.invertirCadena();

        System.out.println("3. Volviendo las vocales mayusculas: ");
        input1.convertirVocalesMayusculas();
        input2.convertirVocalesMayusculas();

        System.out.println("4.1. Es '" + input1.cadena + "' un palindromo? " + input1.verificarPalindromo());

        System.out.println("4.2. Es '" + input2.cadena + "' un palindromo? " + input2.verificarPalindromo());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea ejecutar el metodo FizzBuzz? (Si/No)");
        String respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equals("si")) {
            Extra extra = new Extra();
            extra.fizzBuzz();
        }
        scanner.close();
    }
}
