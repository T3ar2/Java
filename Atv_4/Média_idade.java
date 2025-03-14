import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int idade = 0;
        int idade_soma = 0;

          System.out.println("\nInsira a quantidade de idades que você vai inserir (Máximo 50): ");
          int a = teclado.nextInt();

          
            
            for ( int x = 0; x < a ; x++){
              if (a > 50){
                System.out.println("Quantidade inválida!");
                break;
              }
              System.out.println("\nInsira a idade: ");
              idade = teclado.nextInt();
              idade_soma += idade;
            }
        if (idade > 0){
          int media = idade_soma / a;
          System.out.println("A média é " + media);
        }

    }
          
}
