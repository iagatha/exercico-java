import java.util.Scanner;

public class ConversaoMetragem {
    //criar um progrma pra converter metros pra kilometros
    //criar um programa pra converter metros para milimetros 

    public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);

      double metros, kilometro, milimetros;

      System.out.println("Digite a quantidade de metros: ");

      metros = teclado.nextDouble();
      kilometro = metros / 1000;
      milimetros = metros * 1000;

    
      System.out.println("kilometro: " + kilometro);
      System.out.println("milimetro: " + milimetros);


    }
}
