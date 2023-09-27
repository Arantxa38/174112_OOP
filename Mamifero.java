package package1;

 class Mamifero extends Animal {
	 private String tipoPelo;
	 private int numPatas;
	 
	public Mamifero (String nombre, int edad, boolean tieneCola, String tipoPelo, int numPatas) {
		super(nombre, edad, tieneCola);
		this.tipoPelo = tipoPelo;
		this.numPatas = numPatas;
	}
	
	void hacerSonido() {
		System.out.println( nombre + " hace un sonido de Mamifero.");
	}
	
	//getter y setters
	public String gettipoPelo() {
		return tipoPelo;
	}
	public void settipoPelo (String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}
	
	public int getnumPatas() {
		return numPatas;
	}
	public void setnumPatas (int numPatas) {
		this.numPatas = numPatas;
	}
}