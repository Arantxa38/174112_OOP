package package1;

class Pez extends Animal {
	public Pez (String nombre, int edad, boolean tieneCola) {
		super(nombre, edad, tieneCola);
	}
	
	void hacerSonido() {
		System.out.println( nombre + " hace un sonido de Pez.");
	}
}
