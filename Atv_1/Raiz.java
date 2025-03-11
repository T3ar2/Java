import java.util.Scanner;

public class bomdia {
    public static void main (String[] args) {
      int a = 0;
      int r = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira o valor da raiz: ");
    r = scanner.nextInt();
    a =  (r * r) * 314 / 100;
    System.out.println(a);
  }
}
