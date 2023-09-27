package package1;
import java.util.Random;

public class Ejecucion {
	 public void iniciarPrograma() {
		 Random rand = new Random();
		 Animal[] animales = new Animal[10];
		 for (int i=0; i<animales.length; i++) {
			 int randomNum = rand.nextInt(3);
			 
			 if (randomNum == 0) {
				 animales[i] = new Mamifero("Mamifero " + i, rand.nextInt(10), rand.nextBoolean(), "Pelo", rand.nextInt(4));
			 } else if (randomNum == 1){
				 animales[i] = new Ave("Ave " + i, rand.nextInt(10), rand.nextBoolean(), "Plumaje", rand.nextBoolean());
			 } else {
				 animales[i] = new Pez("Pez " + i, rand.nextInt(10), rand.nextBoolean(), "Escamas", rand.nextBoolean());
			 }
		 }
		 
		 for (Animal animal : animales) {
			 System.out.println("Nombre: " + animal.getNombre());
			 System.out.println("Edad: " + animal.getEdad());
			 System.out.println("Tiene cola: " + animal.gettieneCola());
			 animal.hacerSonido();
			 System.out.println("----------------");
		 }
		 
		 /*Animal perro = new Mamifero ("Koda", 4, true);
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
		 mojarra.comer();*/
	 }
}
