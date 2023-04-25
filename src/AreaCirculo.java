import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        // calcular a area do circulo
        // area = 2 * PI * R
        Scanner leitor = new Scanner(System.in);
        double area, raio; 
       

        System.out.println("Insira o valor do raio: ");
        raio = leitor.nextDouble();
        area = 2 * Math.PI * raio;
       


        System.out.println("A area é: " + area);
    }
}
