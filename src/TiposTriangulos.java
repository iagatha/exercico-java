import java.util.Scanner;

import java.util.Scanner;
public class TiposTriangulos {

    public static void main(String[] args) {

        // AREA DE DECLARAÇÂO DE VARIAVEIS
        double A, B, C;
        double aux, A2, BC;

        Scanner leitor = new Scanner(System.in);

        // AREA PRA ENTRADA DE DADOS
        System.out.println("Digite o valor de A: ");
        A = leitor.nextDouble();
        
        System.out.println("Digite o valor de B : ");
        B = leitor.nextDouble();

        System.out.println("Digite o valor de C: ");
        C = leitor.nextDouble();

        // VERIFICAR SE A È O MAIOR DOS ELEMENTOS
        if (B > A) {
            aux = A;
            A = B;
            B = aux;
        }
        if(C > A){
            aux = A;
            A = C;
            C = aux;
        }

        A2 = Math.pow(A, 2);
        BC = Math.pow( B, 2) + Math.pow(C, 2);

        if( A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if(A2 > BC){
                System.out.println("TRIANGULO OBTUSANGULO");
            }else if(A2 < BC){
                System.out.println("TRIANGULO ACUTANGULO");
            }else{
                System.out.println("TRIANGULO RETANGULO");
            }

            // VERIFICA AS ARESTAS
            if(A == B && B == C){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(A == B || A == C || B == C){
                System.out.println("TRIANGULo ISOSCELES");
            }
           
        }
    }
    
}
