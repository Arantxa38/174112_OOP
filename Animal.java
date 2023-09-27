package package1;

abstract class Animal {
	protected String nombre;
	protected int edad;
	protected boolean tieneCola;
	
	public Animal (String nombre, int edad, boolean tieneCola) {  //constructir
		this.nombre = nombre;
		this.edad = edad;
		this.tieneCola = tieneCola;
	}
	
	abstract void hacerSonido(); //metodo abstracto
	
	protected void comer () { //metodo protector
		System.out.println( nombre + " esta comiendo :)");
	}
}
