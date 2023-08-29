package package1;

public class Circulo {
	
	public double radio;
    
    
    public Circulo() {
		   this( 174112 / 1000.0);
    }
    
    public Circulo(double id) {
    	
        radio = id / 1000;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
       
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
        
    }

}
