package package1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {
	public void execute() {
		List<Integer> fibonacciList = Fibonacci.generateFibonacci(1000000);
		List<Integer> evenNumbers = Splitter.getEvenNumbers(fibonacciList);
		List<Integer> oddNumbers = Splitter.getOddNumbers(fibonacciList);
		
		PrintNumbers(fibonacciList, "Numeros de Fibonacci:");
		PrintNumbers(evenNumbers, "Numeros pares:");
		PrintNumbers(oddNumbers, "Numeros impares:");
		
		
		writeToFile("fibonacci.txt", fibonacciList);
		writeToFile("evenNumbers.txt", evenNumbers);
		writeToFile("oddNumbers.txt", oddNumbers);
	}
	
	private void PrintNumbers(List<Integer> numbers, String title) {
		System.out.println(title);
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	private void writeToFile(String filename, List<Integer> numbers) {
		try (FileWriter writer = new FileWriter(filename)){
			for (int number : numbers) {
				writer.write(number + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
