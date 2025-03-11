import java.util.Scanner;


public class idade {

  public static void main(String[] args){
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("qual é o seu nome? ");
    String nome = teclado.nextLine();
    System.out.println("\nPor favor, digite seu ano de nascimento ");
    int numero = teclado.nextInt();
    System.out.print("");
    int count = 0; 
    System.out.println("\nPor favor, digite o ano em que está ");
    int ano = teclado.nextInt();
    int ano2 = numero;
    
    for(int i=numero; i<ano;i++){
      System.out.println("Em " + ano2 + " "+ nome + " tinha " + count + " anos ");
      count = count + 1;
      ano2 = ano2 + 1;
    }
    System.out.println("Em " + ano2 + " " + nome + " tem " + count  + " anos ");
  }

}
