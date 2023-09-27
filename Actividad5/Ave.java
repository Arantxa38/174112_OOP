package package1;

class Ave extends Animal {
	private String tipoPlumas;
	private boolean vuela;
	
	public Ave (String nombre, int edad, boolean tieneCola, String tipoPlumas, boolean vuela) {
		super(nombre, edad, tieneCola);
		this.tipoPlumas = tipoPlumas;
		this.vuela = vuela;
	}
	
	void hacerSonido() {
		System.out.println( nombre + " hace un sonido de Ave.");
	}
	
	//getter y setters
	public String gettipoPlumas() {
		return tipoPlumas;
	}
	public void settipoPlumas (String tipoPlumas) {
		this.tipoPlumas = tipoPlumas;
	}
	
	public boolean getvuela() {
		return vuela;
	}
	public void setvuela (boolean vuela) {
		this.vuela = vuela;
	}
}
