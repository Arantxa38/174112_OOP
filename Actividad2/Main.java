package main;

public class Main {
	public static void main(String[] args) {
		
		int Id = 174112;
        Cuadrado square = new Cuadrado(Id);
        System.out.println("Cuadrado:");
        System.out.println("El área es: " + square.area);
        System.out.println("El perímetro es: " + square.perimetro);
        System.out.println("La diagonal es: " + square.diagonal);
		
        int id = 174112;

        Circulo circle = new Circulo(id);

        System.out.println("Círculo:");
        System.out.println("Circunferencia: " + circle.circunferencia);
        System.out.println("Área: " + circle.area);

	}

}
