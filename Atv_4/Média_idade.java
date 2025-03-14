import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int idade1 = -1;
        int idade2 = -1;
        while (idade1<0 || idade1> 150){
          System.out.println("Insira a primeira idade: ");
          idade1 = teclado.nextInt();
        }
        
        
        while (idade2<0 || idade2> 150){
        System.out.println("\nInsira a segunda idade: ");
        idade2 = teclado.nextInt();
        }
        
        int media = (idade1 + idade2) / 2;
        
        System.out.println("A média é " + media);
    }

}
