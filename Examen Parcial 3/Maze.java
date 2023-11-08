package package1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maze {

    private static char[][] maze;
    private static int rows, cols; 
    private static FileWriter outputFile;
    private static List<String> directions = new ArrayList<>();

    public static void main(String[] args) {
        readMazeFromFile("laberinto.txt");

        try {
            outputFile = new FileWriter("direcciones.txt");
            if (solveMaze(findStartX(), findStartY())) {
                System.out.println("Laberinto resuelto.");
                Collections.reverse(directions);
                for (String direction : directions) {
                    outputFile.write(direction + " ");
                }
            } else {
                System.out.println("No se encontró una solución.");
            }
            outputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // lee el laberinto
    private static void readMazeFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            List<char[]> mazeLines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                mazeLines.add(line.toCharArray());
            }
            rows = mazeLines.size();
            cols = mazeLines.get(0).length;
            maze = new char[rows][cols];
            for (int i = 0; i < rows; i++) {
                maze[i] = mazeLines.get(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Encuentra la posición de inicio "S"
    private static int findStartX() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j] == 'S') {
                    return i;
                }
            }
        }
        return -1;
    }

    private static int findStartY() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j] == 'S') {
                    return j;
                }
            }
        }
        return -1;
    }

    // usando flood fill:
    private static boolean solveMaze(int x, int y) {
        if (x < 0 || x >= rows || y < 0 || y >= cols || maze[x][y] == '1' || maze[x][y] == 'V') {
            return false;
        }

        // Comprobar si llegamos a la meta
        if (maze[x][y] == 'F') {
            return true;
        }

        // Marcar la posición actual como visitada
        maze[x][y] = 'V';

        // Revisar en las cuatro direcciones posibles
        if (solveMaze(x - 1, y)) {
            directions.add("Arriba");
            return true;
        }
        if (solveMaze(x + 1, y)) {
            directions.add("Abajo");
            return true;
        }
        if (solveMaze(x, y - 1)) {
            directions.add("Izquierda");
            return true;
        }
        if (solveMaze(x, y + 1)) {
            directions.add("Derecha");
            return true;
        }

        // Si no se encontró una solución desde esta posición, retroceder
        maze[x][y] = '0';
        return false;
    }
}

