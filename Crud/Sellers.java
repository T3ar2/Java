import java.io.*;
import java.util.Scanner;

public class Sellers extends Persons{



    Logs sellerlogs = new Logs();
    Scanner scanner = new Scanner(System.in);
    public void addSellers(){
        sellerlogs.cleaningVariablesSeller();

        int verificadorInt;
        while (true) {

            System.out.print("Id: ");
            verificadorInt = scanner.nextInt();
            scanner.nextLine();

            if (verificadorInt <= 0 || verificadorInt > 999999) {
                System.out.println("ID inválido. Digite um número entre 1 e 999999.");
            } else if (idExiste(verificadorInt)) {
                System.out.println("Este ID já está em uso. Por favor, insira outro ID.");
            } else {
                break;
            }
        }
        setPersonId(verificadorInt);
        sellerlogs.setCostumerId(getPersonId());

        System.out.print("Name:");
        setName(scanner.nextLine());
        sellerlogs.setSellerName(getName());

        ImprimirCadastro();
        sellerlogs.sellersLog();
    }

    @Override
    public void ImprimirCadastro() {
        try (FileWriter fileWriter = new FileWriter("Sellers.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Id: " + getPersonId() + ";" + "Nome: " + getName() + ";");
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public boolean idExiste(int idVerificar){
        try (BufferedReader reader = new BufferedReader(new FileReader("Sellers.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith("Id: " + idVerificar + ";")) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao verificar ID existente: " + e.getMessage());
        }
        return false;
    }
}
