
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu_chan = new Menu();
        Scanner scanner = new Scanner(System.in);
        Costumers costumers = new Costumers();
        int OpcaoUsuario;
        do {
            System.out.println("\n=== Menu ===");
            menu_chan.StartMenu();
            OpcaoUsuario = menu_chan.InputChosen(1, 4, "Choose a option: ");

            int opcao_selecao;
            switch (OpcaoUsuario) {
                case 1:
                    System.out.println("\n--- Registro de Empresa ---");
                    menu_chan.StartMenu(2, 1);
                    opcao_selecao = menu_chan.InputChosen(1, 5, "Choose a option");
                    System.out.println("Opção escolhida: " + opcao_selecao);
                    Persons persons = new Persons();
                    switch (opcao_selecao) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:
                            persons.addPerson();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n=== Menu de Registro de Produto ===");
                    menu_chan.StartMenu(2, 2);
                    int opcao_produto = menu_chan.InputChosen(1, 5, "Choose a option");
                    System.out.println("Opção escolhida: " + opcao_produto);
                    switch (opcao_produto){

                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                    }
                    break;
                case 3:
                    System.out.println("\n=== Menu de Registro de Venda ===");
                    menu_chan.StartMenu(2, 3);
                    int opcao_venda = menu_chan.InputChosen(1, 5, "Choose a option");
                    System.out.println("Opção escolhida: " + opcao_venda);

                    switch(opcao_venda){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                    }
                    break;
                case 4:
                    System.out.println("Program Closing.");
                    break;
                default:
                    System.out.println("Wrong option.");
            }
        }
        while (OpcaoUsuario != 4) ;
        scanner.close();
    }
}
