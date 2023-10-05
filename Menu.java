package package1;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Menu {
    private final List<Pokemon> pokemonList;
    private Pokemon chosenPokemon;
    private final Scanner scanner;

    public Menu(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
        this.scanner = new Scanner(System.in);
        chooseRandomPokemon();
    }

    private void chooseRandomPokemon() {
        Random random = new Random();
        int index = random.nextInt(pokemonList.size());
        chosenPokemon = pokemonList.get(index);
    }

    private void askQuestion(Pokemon chosenPokemon) {
        System.out.println("Elige una pregunta:");
        System.out.println("1. ¿Es de un tipo en particular?");
        System.out.println("2. ¿Tiene cierto ataque?");
        System.out.println("3. ¿Es un Pokemon en particular?");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Introduce el tipo (agua, fuego o planta): ");
                String type = scanner.next().toLowerCase();
               
                if (type.equals(chosenPokemon.getTipo())) {
                    System.out.println("¡Correcto!");
                    pokemonList.removeIf(pokemon -> !pokemon.getTipo().equals(type));

                } else {
                   
                    System.out.println("¡Incorrecto!");
                    pokemonList.removeIf(pokemon -> pokemon.getTipo().equals(type));
                }
                System.out.println("Opciones restantes:");
                printPokemonList();
            }
            case 2 -> {
                System.out.print("Introduce el ataque: ");
               
                String attack = scanner.next();
               
                if (chosenPokemon.getAtaques().contains(attack)) {
                    System.out.println("¡Correcto!");
                    pokemonList.removeIf(pokemon -> !pokemon.getAtaques().contains(attack));
                } else {
                    
                    System.out.println("¡Incorrecto!");
                    pokemonList.removeIf(pokemon -> pokemon.getAtaques().contains(attack));
                }
                System.out.println("Opciones restantes:");
                printPokemonList();
            }
            case 3 -> {
                System.out.print("Introduce el nombre: ");
                String name = scanner.next();
                
                if (name.equals(chosenPokemon.getNombre())) {
                    System.out.println("¡Correcto!");
                   
                    pokemonList.clear();
                    System.out.println("¡Felicidades! Has adivinado el Pokemon correctamente.");
                    System.exit(0);
                } else {
                    
                    System.out.println("¡Incorrecto!");
                    pokemonList.removeIf(pokemon -> pokemon.getNombre().equals(name));
                }
                System.out.println("Opciones restantes:");
                printPokemonList();
            }
            default -> System.out.println("Opción no válida.");
        }
    }

    private void printPokemonList() {
        for (int i = 0; i < pokemonList.size(); i++) {
            System.out.println((i + 1) + ". " + pokemonList.get(i).getNombre() + " (" + pokemonList.get(i).getTipo() + ") " + pokemonList.get(i).getAtaques());
        }
    }

    public void playGame() {

        System.out.println("¡Bienvenido a Pokemon! Tienes 4 preguntas para adivinar el Pokemon.");

        System.out.println("Aquí tienes la lista de Pokemones disponibles:");

        printPokemonList();

        for (int i = 0; i < 4; i++) {
            System.out.println("Pregunta " + (i + 1) + ":");
            askQuestion(chosenPokemon);
        }

        System.out.println("Elige un Pokemon de las siguientes opciones:");

        for (int i = 0; i < pokemonList.size(); i++) {
            System.out.println((i + 1) + ". " + pokemonList.get(i).getNombre());
        }

        int userChoice = scanner.nextInt();
        if (pokemonList.get(userChoice - 1).equals(chosenPokemon)) {
            System.out.println("¡Felicidades! Has adivinado el Pokemon correctamente.");
        } else {
            System.out.println("¡Lo siento! El Pokemon correcto era: " + chosenPokemon.getNombre());
        }
    }
}