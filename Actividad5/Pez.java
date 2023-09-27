package package1;

class Pez extends Animal {
	private String tipoEscamas;
	private boolean ataca;
	public Pez (String nombre, int edad, boolean tieneCola, String tipoEscamas, boolean ataca) {
		super(nombre, edad, tieneCola);
		this.tipoEscamas = tipoEscamas;
		this.ataca = ataca;
	}
	
	void hacerSonido() {
		System.out.println( nombre + " hace un sonido de Pez.");
	}
	
	//getters y setterss
	public String gettipoEscamas() {
		return tipoEscamas;
	}
	public void settipoEscamas (String tipoEscamas) {
		this.tipoEscamas = tipoEscamas;
	}
	
	public boolean getataca() {
		return ataca;
	}
	public void setAtaca (boolean ataca) {
		this.ataca = ataca;
	}
}
