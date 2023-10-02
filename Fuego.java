package package1;
import java.util.List;

class Fuego extends Pokemon {
    public Fuego(String nombre, List<String> ataques) {
        super(nombre, "Fuego", ataques);
    }

    @Override
    public void imprimirInformacion() {
    	System.out.println( nombre +  "    :    " + tipo + "    :    "  + ataques);
       // System.out.println("");
    }
}