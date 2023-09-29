package package1;
import java.util.Random;

public class NomRandom {
    public static void main(String[] args) {
        String[] amiguitos = {"Alejandro <3", "Melisa", "Estrella", "Geo", "Diego", "Arantxa :)", "Geraldine", "Maeva", "Totopo", "Nala", "Mía", "Luis", "Mafer", "Sophie", "Sandra"};

        Random rand = new Random();
        int totalNombres = amiguitos.length;

        boolean[] nomImpresos = new boolean[totalNombres];

        int ConteoImpresos = 0;
        while (ConteoImpresos < totalNombres) {
            int indiceRand = rand.nextInt(totalNombres);
            if (!nomImpresos[indiceRand]) {
                System.out.println(amiguitos[indiceRand]);
                nomImpresos[indiceRand] = true;
                ConteoImpresos++;
            }
        }
    }
}
