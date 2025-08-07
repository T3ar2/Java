import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Persons {

    private int personId;
    private String name;
    private String personType;


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    Scanner scanner = new Scanner(System.in);

    public void addPerson(){
        Costumers costumers = new Costumers();
        Sellers sellers = new Sellers();
        int option = 0;
        System.out.println("What type of person is this?");
        System.out.println("1 - Customer");
        System.out.println("2 - Seller");
        System.out.println("3 - Both");
        System.out.print("Your choice: ");
        option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1){
            costumers.addCostumer();
        }
        else if (option == 2){
            sellers.addSellers();
        }
        else if(option == 3){
            costumers.addCostumer();
            sellers.addSellers();
        }
        else {
            System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
        }

    }

    public void ImprimirCadastro(){}
}
