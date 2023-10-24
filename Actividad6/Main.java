package package1;
import java.util.List;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Tracker de Adivina Quién");

        while (true) {
            System.out.println("1. Crear un perfil de jugador");
            System.out.println("2. Jugar Adivina Quién");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearPerfil(scanner);
                    break;
                case 2:
                    jugarAdivinaQuien(scanner);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void crearPerfil(Scanner scanner) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.next();
        Jugador jugador = new Jugador(nombre);
        guardarPerfil(jugador);
    }

    private static void guardarPerfil(Jugador jugador) {
        try (FileWriter writer = new FileWriter(jugador.getNombre() + ".txt");
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write("Nombre: " + jugador.getNombre());
            bw.newLine();
            bw.write("Juegos jugados: " + jugador.getJuegosJugados());
            bw.newLine();
            bw.write("Juegos ganados: " + jugador.getJuegosGanados());
            bw.newLine();
            System.out.println("Perfil guardado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar el perfil del jugador.");
        }
    }

    private static Jugador cargarPerfil(String nombre) {
        File file = new File(nombre + ".txt");
        if (!file.exists()) {
            System.out.println("No se encontró el perfil del jugador. Crea un perfil primero.");
            return null;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String playerName = null;
            int gamesPlayed = 0;
            int gamesWon = 0;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Nombre: ")) {
                    playerName = line.substring("Nombre: ".length());
                } else if (line.startsWith("Juegos jugados: ")) {
                    gamesPlayed = Integer.parseInt(line.substring("Juegos jugados: ".length()));
                } else if (line.startsWith("Juegos ganados: ")) {
                    gamesWon = Integer.parseInt(line.substring("Juegos ganados: ".length()));
                }
            }
            return new Jugador(playerName, gamesPlayed, gamesWon);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al cargar el perfil del jugador.");
        }
        return null;
    }

    private static void jugarAdivinaQuien(Scanner scanner) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.next();
        Jugador jugador = cargarPerfil(nombre);

        if (jugador == null) {
            return;
        }

        int juegosJugados = jugador.getJuegosJugados();
        int juegosGanados = jugador.getJuegosGanados();

        List<Pokemon> pokemonList = new Ejecutar().iniciarPrograma();
        Menu menu = new Menu(pokemonList);
        menu.playGame();

        System.out.println("Estadísticas de " + jugador.getNombre() + ":");
        System.out.println("Juegos jugados: " + juegosJugados);
        System.out.println("Juegos ganados: " + juegosGanados);

        guardarPerfil(jugador);
    }
}

class Jugador {
    private String nombre;
    private int juegosJugados;
    private int juegosGanados;

    public Jugador(String nombre) {
        this(nombre, 0, 0);
    }

    public Jugador(String nombre, int juegosJugados, int juegosGanados) {
        this.nombre = nombre;
        this.juegosJugados = juegosJugados;
        this.juegosGanados = juegosGanados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getJuegosJugados() {
        return juegosJugados;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void incrementarJuegosJugados() {
        juegosJugados++;
    }

    public void incrementarJuegosGanados() {
        juegosGanados++;
    }
}