package package1;

public class Ejecutar {
	 public void iniciarPrograma() {
		 
		 Animal perro = new Mamifero ("Nala", 4, true);
		 Animal gato = new Mamifero ("Bigotes", 6, true);
		 Animal paloma = new Ave ("Palomino", 2, false);
		 Animal loro = new Ave ("El Licenciado", 2, true);
		 Animal beta = new Pez ("Mussolini", 1, true);
		 Animal mojarra = new Pez ("Nemo", 2, true);
		 
		 perro.hacerSonido();
		 perro.comer();
		 
		 gato.hacerSonido();
		 gato.comer();
		 
		 paloma.hacerSonido();
		 paloma.comer();
		 
		 loro.hacerSonido();
		 loro.comer();
		 
		 beta.hacerSonido();
		 beta.comer();
		 
		 mojarra.hacerSonido();
		 mojarra.comer();
	 }
}
