import java.util.Random;

public class MatrizTransposta {

    /* Fazer uma função que receba uma matriz
     * Calcular a matriz transposta e retornar a mesma
     */

    public static void main(String[] args) throws Exception {
        int [][] matriz = criaMatriz(3,4);
        imprimeMatriz(matriz);
        System.out.println();
        int[][] transposta = transposta(matriz);
        imprimeMatriz(transposta);
    }

    // CRIA A MATRIZ
    static int [][] criaMatriz(int N, int M){
        int [][] matriz = new int [N][M];
        Random gerador = new Random();

        for(int i=0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = gerador.nextInt(100);
            }
        }
        return matriz;
    }

    // CALCULA A MATRIZ PARA SER TRANSPOSTA
    static int[][] transposta(int [][] matriz){
        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for(int i = 0; i < matrizTransposta.length; i++){
            for(int j = 0; j < matrizTransposta[0].length; j++){
                matrizTransposta[i][j] = matriz[j][i];
            }
        }
        return matrizTransposta;
    }

    // FUNÇÂO DE IMPRIMIR A MATRIZ
    static void imprimeMatriz(int [][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }



   
}
