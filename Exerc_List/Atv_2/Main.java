import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        Employes employes = new Employes("Notch", "Striper");
        Scanner scanner = new Scanner (System.in);

        employes.setSalary(1560.00);
        System.out.println("Current salary: " +  employes.getSalary());
        employes.ChangeSalary(scanner);


    }
}
