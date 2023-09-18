package package1;

public class Matrices {
	
	public static int sumaDiagonal(int[][] matriz1) {  //1. Suma diagonal
		int suma =0;
		for (int i=0; i<matriz1.length; i++) {
			suma += matriz1[i][i];
		}
		return suma;
	}
	
	public static int encontrarMaximo (int [][] matriz) { //2. devuelve el valor mas grande de la matriz
		int maximo = matriz[0][0];
		for ( int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[0].length; j++) {
				if (matriz[i][j] > maximo) {
					maximo = matriz[i][j];
				}
			}
		}
		return maximo;
	}
	
	public static int [][] sumarMatrices(int[][] matriz1, int[][] matriz2){ //3. Se suman las 2 matrices
		int filas = matriz1.length;
		int columnas = matriz1[0].length;
		int [][] resultado = new int [filas][columnas];
		for (int i=0; i< filas; i++) {
			for (int j=0; j<columnas;j++) {
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return resultado;
	}

	public int[][] multiplicarPorEscalar(int matriz1[][],int escalar){ //multiplicar por un escalar
		int filas =matriz1.length;
		int columnas = matriz1[0].length;
		int [][]resultado = new int [filas][columnas];
		for (int i=0; i< filas; i++) {
			for (int j=0; j<columnas; j++) {
				resultado[i][j]= matriz1[i][j]*escalar;
			}
		}
	return resultado;
	}
	
	public static int[][] multiplicarMatrices(int[][] matrix1, int [][] matrix2){

			int fila1 = matrix1.length;
			int columna1 = matrix2[0].length;
			int columna2 = matrix2[0].length;
			int [][] resultado = new int [fila1][columna2];
				for (int i=0;i<fila1;i++) {
					for (int j=0;j<columna2;j++) {
						for (int k=0;k<columna1;k++) {
						resultado [i][j] += matrix1[i][k]*matrix2[k][j];
						}
					}
				}
			return resultado;

		}

	public int[][] transponerMatriz(int matriz1[][]){ //transponer matriz

		int filas = matriz1.length;
		int columnas = matriz1[0].length;
		int resultado[][] = new int [columnas][filas];
		for (int i=0; i< filas; i++) {
			for (int j=0; j<columnas; j++) {
				resultado[j][i]= matriz1[i][j];
			}
		}
		return resultado;
		}
}
