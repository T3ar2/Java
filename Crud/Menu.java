import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;



public class Menu {

    public void StartMenu() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Menu1.txt"))) {

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {

                String[] campos = linha.split(";");

                if (campos.length == 4 && campos[0].trim().equals("1")) {

                    System.out.println(campos[2].trim() + " - " + campos[3].trim());

                }

            }

        } catch (IOException e) {

            System.err.println("Error to read Menu1.txt: " + e.getMessage());

        }

    }



    public void StartMenu(int nivel, int opcaoPai) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Menu1.txt"))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] campos = line.split(";");

                if (campos.length == 4 &&

                        Integer.parseInt(campos[0].trim()) == nivel &&

                        Integer.parseInt(campos[1].trim()) == opcaoPai) {

                    System.out.println(campos[2].trim() + " - " + campos[3].trim());

                }

            }

        } catch (IOException e) {

            System.err.println("Error to read Menu1.txt: " + e.getMessage());

        }

    }



    public int InputChosen(int inicial_position, int final_positions, String menssage) {

        Scanner scanner_chan = new Scanner(System.in);

        int opcao;

        while (true) {

            System.out.print(menssage + " ( put a number between " + inicial_position + " e " + final_positions + " ): ");

            if (scanner_chan.hasNextInt()) {

                opcao = scanner_chan.nextInt();

                if (opcao >= inicial_position && opcao <= final_positions) {

                    break;

                } else {

                    System.out.println("Error: Invalid option. Please, choose a number between " + inicial_position + " and " + final_positions + ".");

                }

            } else {

                System.out.println("Error: Invalid number. Please, choose a valid number.");

                scanner_chan.next();

            }

        }

        return opcao;

    }



}
