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
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean gettieneCola() {
		return tieneCola;
	}
	public void settieneCola(boolean tieneCola) {
		this.tieneCola = tieneCola;
	}
	
	abstract void hacerSonido(); //metodo abstracto
	
	/*protected void comer () { //metodo protector
		System.out.println( nombre + " esta comiendo :)");
	}*/
}