import java.io.*;
import java.util.Scanner;

public class Costumers extends Persons {
    Scanner costumerScanner = new Scanner(System.in);
    Logs costumerLog = new Logs();

    public void addCostumer() {
        costumerLog.cleaningVariablesCostumer();
        int verificadorInt;
        while (true) {

            System.out.print("Id: ");
            verificadorInt = scanner.nextInt();
            costumerScanner.nextLine();

            if (verificadorInt <= 0 || verificadorInt > 999999) {
                System.out.println("ID inválido. Digite um número entre 1 e 999999.");
            } else if (idExiste(verificadorInt)) {
                System.out.println("Este ID já está em uso. Por favor, insira outro ID.");
            } else {
                break;
            }
        }
        setPersonId(verificadorInt);
        costumerLog.setCostumerId(getPersonId());



        System.out.print("Name:");
        setName(costumerScanner.nextLine());
        costumerLog.setCostumerName(getName());


        costumerLog.costumersLog();
        ImprimirCadastro();
    }


    @Override
    public void ImprimirCadastro() {
        try (FileWriter fileWriter = new FileWriter("Costumers.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Id: " + getPersonId() + ";" + "Nome: " + getName() + ";");
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }


    public boolean idExiste(int idVerificar){
        try (BufferedReader reader = new BufferedReader(new FileReader("Costumers.txt"))) {
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
