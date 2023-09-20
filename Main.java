package package1;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int numNumerosAleatorios = 5;
		int numLanzamientos = 10;
		int suma;
		int suma2;
	
		Random random = new Random();
		
		int randomNumber1 = random.nextInt(numNumerosAleatorios);
		int randomNumber2 = random.nextInt(numNumerosAleatorios);
		
		suma = randomNumber1 + randomNumber2;
		System.out.println("1. La suma de " + numNumerosAleatorios + " valores aleatorios es: " + suma);
		
		int randomNumber3 = random.nextInt(201)-100;
		int randomNumber4 = random.nextInt(201)-100;
		
		suma2 = randomNumber3 + randomNumber4;
		System.out.println("2. La suma de " + numNumerosAleatorios + " valores aleatorios entre -100 y 100: " + suma2);
		
		for (int i=0; i<numNumerosAleatorios; i++) {
			int numeroAleatorio = random.nextInt(51)*2;
			System.out.println("3. Numero aleatorio par: " + (i+1) + ": " + numeroAleatorio);
		}
		
		int[] conteoLanzamientos = new int [6];
		for (int i=0; i<numLanzamientos; i++) {
			int resultadoLanzamiento = random.nextInt(6)+1;
			System.out.println("3. Lanzamiento " + (i+1) + ": " + resultadoLanzamiento);
			conteoLanzamientos[resultadoLanzamiento - 1]++;
		}
		System.out.println("Conteo de resultados: ");
		for (int i=0; i< 6; i++) {
			System.out.println("Numero " + (i+1) + " aparecio " + conteoLanzamientos[i] + " veces.");
		}
	}
}
