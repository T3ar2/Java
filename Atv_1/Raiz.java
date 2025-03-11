import java.util.Scanner;

public class bomdia {
    public static void main (String[] args) {
      Double a = 0.00;
      Double r = 0.00;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira o valor da raiz: ");
    r = scanner.nextDouble();
     a =  Math.pow(r, 2) * Math.PI;
    System.out.println(a);
  }
}
