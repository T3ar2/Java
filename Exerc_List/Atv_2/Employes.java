import java.util.Scanner;

public class Employes {
    private String name;
    private String position;
    private double salary;


    Scanner scanner = new Scanner (System.in);
    Employes(String name, String  position){
        this.name = name;
        this.position = position;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public double getSalary(){
        return salary;
    }

    public void ChangeSalary(Scanner scanner){

        System.out.println("How much in % the salary changed?(You don´t need to insert %) ");
        int porcent = scanner.nextInt();
        double total = salary + ((salary * porcent) / 100);
        setSalary(total);

        System.out.println("The salary total is " + salary);
    }

}
