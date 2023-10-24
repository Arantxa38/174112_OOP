package package1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.List;

class Ejecutar {
    public  List<Pokemon> iniciarPrograma() {
        List<Pokemon> pokemonList = new ArrayList<>();

        List<String> ataquesDisponibles = Arrays.asList("Hydropump", "Solarbeam", "Eruption", "Flamethrower", "Aquajet", "Whirlpool", "Synthesis", "Petaldance");

        String[] nombresAgua = {"Squirtle", "Totodile", "Mudkip", "Froakie", "Quaxly"};
        String[] nombresFuego = {"Charmander", "Cyndaquil", "Torchic", "Litten", "Fuecoco"};
        String[] nombresPlanta = {"Bulbasaur", "Chikorita", "Treecko", "Rowlet", "Sprigatito"};

        for (String nombre : nombresAgua) {
            List<String> ataquesPokemon = generarAtaquesAleatorios(ataquesDisponibles);
            Pokemon pokemon = new Agua(nombre, ataquesPokemon);
            pokemonList.add(pokemon);
        }

        for (String nombre : nombresFuego) {
            List<String> ataquesPokemon = generarAtaquesAleatorios(ataquesDisponibles);
            Pokemon pokemon = new Fuego(nombre, ataquesPokemon);
            pokemonList.add(pokemon);
        }

        for (String nombre : nombresPlanta) {
            List<String> ataquesPokemon = generarAtaquesAleatorios(ataquesDisponibles);
            Pokemon pokemon = new Planta(nombre, ataquesPokemon);
            pokemonList.add(pokemon);
        }

        Collections.shuffle(pokemonList);

        return pokemonList;
    }

    private static List<String> generarAtaquesAleatorios(List<String> ataquesDisponibles) {
        List<String> ataquesAleatorios = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int indiceAleatorio = random.nextInt(ataquesDisponibles.size());
            if (ataquesAleatorios.contains(ataquesDisponibles.get(indiceAleatorio))) {
                i--;
                continue;
            }
            ataquesAleatorios.add(ataquesDisponibles.get(indiceAleatorio));
        }

        return ataquesAleatorios;
    }
}
