import java.util.Scanner;

//04) Uma concessionária deseja armazenar informações sobre seus veículos. Cada veículo tem um
//modelo, uma marca e uma velocidade máxima. A velocidade do veículo pode ser alterada, mas não
//pode ultrapassar sua velocidade máxima.
//Requisito: Implemente a classe Veiculo garantindo que a velocidade não ultrapasse o limite
//máximo.

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = new Vehicle("toyota", "Supra mk4", 250, 2019);

        vehicle.getSettings();

        System.out.println("What's the speed for this car (in number)? ");
        vehicle.setCar_speed(scanner.nextInt());

        if ((vehicle.getCar_speed() <= vehicle.getMax_speed()) & (vehicle.getCar_speed() >= 0 )){
            vehicle.getSettings();
        }
        else {
            System.out.println("You can't, insert this kind a number ");
        }
    }
}
