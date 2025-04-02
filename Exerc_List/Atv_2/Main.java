import java.util.Scanner;

//02) Uma empresa precisa de um sistema para gerenciar seus funcionários. Cada funcionário tem um
//nome, cargo e salário. O salário pode ser atualizado apenas através de um aumento percentual.
//Requisito: Crie a classe Funcionario garantindo que o salário seja atualizado apenas por um
//método apropriado.

public class Main{

    public static void main (String[] args){
        Employes employes = new Employes("Notch", "Striper");
        Scanner scanner = new Scanner (System.in);

        employes.setSalary(1560.00);
        System.out.println("Current salary: " +  employes.getSalary());
        employes.ChangeSalary(scanner);


    }
}
