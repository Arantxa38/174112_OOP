package package1;

 class Mamifero extends Animal {
	public Mamifero (String nombre, int edad, boolean tieneCola) {
		super(nombre, edad, tieneCola);
	}
	
	void hacerSonido() {
		System.out.println( nombre + " hace un sonido de Mamifero.");
	}
}
