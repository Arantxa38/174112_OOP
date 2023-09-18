package package1;

public class Main {
	
	public static void main (String[] args) {
		int [][] matriz1 = {{1,2}, {3,4}};
		int [][] matriz2 = {{5,6}, {7,8}};
		
		Matrices objetoMatriz = new Matrices();
		
		System.out.println("Suma en la diagonal: " + objetoMatriz.sumaDiagonal(matriz1));
		System.out.println("Valor maximo: " + objetoMatriz.encontrarMaximo(matriz1));
		
		int[][] suma = objetoMatriz.sumarMatrices(matriz1, matriz2);
        System.out.println("Suma de matrices:");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        int[][] productoEscalar = objetoMatriz.multiplicarPorEscalar(matriz1, 2);
        System.out.println("Matriz multiplicada por escalar:");
        for (int i = 0; i < productoEscalar.length; i++) {
            for (int j = 0; j < productoEscalar[0].length; j++) {
                System.out.print(productoEscalar[i][j] + " ");
            }
            System.out.println();
        }

        int[][] productoMatrices = objetoMatriz.multiplicarMatrices(matriz1, matriz2);
        System.out.println("Producto de matrices:");
        for (int i = 0; i < productoMatrices.length; i++) {
            for (int j = 0; j < productoMatrices[0].length; j++) {
                System.out.print(productoMatrices[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matrizTranspuesta = objetoMatriz.transponerMatriz(matriz1);
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[0].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
	}
}