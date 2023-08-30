package package1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        while (true) {
            System.out.println("Ingrese que quiere hacer: ");
            System.out.println("1. Calcular Cuadrado");
            System.out.println("2. Calcular Circulo");
            System.out.println("3. Salir");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el lado del cuadrado: ");
                    double lado = Double.parseDouble(sc.nextLine());

                    System.out.println("Que deseas calcular?");
                    System.out.println("1. Diagonal");
                    System.out.println("2. Perimetro");
                    System.out.println("3. Area");
                    System.out.println("4. Salir al menu principal");
                    int accion1 = Integer.parseInt(sc.nextLine());

                    Cuadrado square = new Cuadrado(lado);

                    switch (accion1) {
                        case 1:
                            System.out.println("La diagonal es: " + square.calcularDiagonal());
                            break;
                        case 2:
                            System.out.println("El perimetro es: " + square.calcularPerimetro());
                            break;
                        case 3:
                            System.out.println("El area es: " + square.calcularArea());
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Ingresa una opcion valida");
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Ingrese el radio del Circulo: ");
                    double radio = Double.parseDouble(sc.nextLine());

                    System.out.println("Que deseas calcular?");
                    System.out.println("1. Circunferencia");
                    System.out.println("2. Area");
                    System.out.println("3. Salir al menu principal");
                    int accion2 = Integer.parseInt(sc.nextLine());

                    Circulo circle = new Circulo(radio);
                    switch (accion2) {
                        case 1:
                            System.out.println("Circunferencia: " + circle.calcularCircunferencia());
                            break;
                        case 2:
                            System.out.println("Area: " + circle.calcularArea());
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Ingresa una opcion valida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingresa una opcion valida bro");
                    break;
                    
            }
        }
    }
}
