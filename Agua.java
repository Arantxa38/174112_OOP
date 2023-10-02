package package1;
import java.util.List;

class Agua extends Pokemon {
    public Agua(String nombre, List<String> ataques) {
        super(nombre, "Agua", ataques);
    }

    @Override
    public void imprimirInformacion() {
    	System.out.println( nombre +  "    :    " + tipo + "    :    "  + ataques);
    }
}