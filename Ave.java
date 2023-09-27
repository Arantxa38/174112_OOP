package package1;

class Ave extends Animal {
	public Ave (String nombre, int edad, boolean tieneCola) {
		super(nombre, edad, tieneCola);
	}
	
	void hacerSonido() {
		System.out.println( nombre + " hace un sonido de Ave.");
	}
}