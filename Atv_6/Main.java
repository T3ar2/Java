import java.util.Scanner;


public class Main{

    public static void main (String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("What's your name? ");

        pessoa.setName(scanner.nextLine());

        System.out.println("What's your age? ");

        pessoa.setAge (scanner.nextInt());

        pessoa.falar();

    }
}
