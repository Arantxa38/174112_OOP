package package1;

public class Palabras {

    String cadena;

    public Palabras(String cadena) {
        this.cadena = cadena;
    }

    public void hacerPrimeraMayuscula() {
        String mayuscula =cadena.substring(0,1).toUpperCase() + cadena.substring(1);
        System.out.println(mayuscula);
    }

    public void invertirCadena() {
        StringBuilder invertido = new StringBuilder(cadena).reverse();
        System.out.println(invertido);
    }

    public void convertirVocalesMayusculas () {
        StringBuilder vocalesMayus = new StringBuilder();
        for(char c: cadena.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vocalesMayus.append(Character.toUpperCase(c));
            } else {
                vocalesMayus.append(c);
            }
        }
        System.out.println(vocalesMayus);
    }

    public boolean verificarPalindromo() {
        if (cadena != null &&! cadena.isEmpty()) {
            String cleanCadena = cadena.replaceAll("[ +]", "").toLowerCase();
            String reversed = new StringBuilder(cleanCadena).reverse().toString();
            return cleanCadena.equals(reversed);
        } else {
            return false;
        }
    }
}
