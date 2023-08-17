package main;

public class Cuadrado {
	    public double lado;
	    public double diagonal;
	    public double perimetro;
	    public double area;

	    public Cuadrado(int numero) {

	        this.lado = numero / 100.0;
	        calcularDiagonal();
	        calcularPerimetro();
	        calcularArea();
	    }

	    private double calcularDiagonal() {
	        this.diagonal =  Math.sqrt(2) * lado;
	        return diagonal;
	    }

	    private double calcularPerimetro() {
	        this.perimetro = 4 * lado;
	        return perimetro;
	    }

	    private double calcularArea() {
	        this.area = lado * lado;
	        return area;
	    }

	}
