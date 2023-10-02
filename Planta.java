package package1;
import java.util.List;

class Planta extends Pokemon {
    public Planta(String nombre, List<String> ataques) {
        super(nombre, "Planta", ataques);
    }

    @Override
    public void imprimirInformacion() {
    	System.out.println( nombre +  "    :    " + tipo + "    :    "  + ataques);
    }
}