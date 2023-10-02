package package1;
import java.util.List;

abstract class Pokemon {
    String nombre;
    String tipo;
    List<String> ataques;

    public Pokemon(String nombre, String tipo, List<String> ataques) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataques = ataques;
    }

    public abstract void imprimirInformacion();
}