package main;

public class Circulo {
	    public double radio;
	    public double circunferencia;
	    public double area;
	    
	    public Circulo(double id) {
	        radio = id / 100;
	        calcularCircunferencia();
	        calcularArea();
	    }

	    public double calcularCircunferencia() {
	        circunferencia = 2 * Math.PI * radio;
	        return circunferencia;
	    }

	    public double calcularArea() {
	        area = Math.PI * radio * radio;
	        return area;
	    }
	        
}
