package package1;

public class Cuadrado {
	
	public double lado;
   
   public Cuadrado() {
		   this( 174112 / 1000.0);
   }
    
    public Cuadrado(double numero) {
        this.lado = numero;
    } 
    
    public double calcularDiagonal() {
    	return Math.sqrt(2) * lado; 
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

}
