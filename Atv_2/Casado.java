import java.util.*;

public class Casado {
    public static void main(String[] args) {
            Scanner scanner = new  Scanner (System.in);
            char casado;
            System.out.println("Insira seu nome: ");
            String nome = scanner.nextLine();
        do {
            System.out.println("Você é casado?(S/N) ");
            casado = scanner.next().charAt(0);
            }
        while (!((casado == 's') || (casado == 'n') || (casado == 'N') || (casado == 'S')));
        if ((casado == 's') || (casado == 'S')){
          System.out.println(nome + "é casado.");
          }
          else if ((casado == 'n')|| (casado == 'N')){
          System.out.println(nome + "não é casado.");
          }
    }
}