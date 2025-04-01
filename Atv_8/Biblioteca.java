import java.util.Scanner;

public class Biblioteca {
    Livro[] Biblioteca = new Livro[3];

    public void ApresentaLivro(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escolha o Livro ( 0 até 2)");
        int i = scanner.nextInt();
        System.out.println("Titulo: " + Biblioteca[i].getTitulo());
        System.out.println("Autor: " + Biblioteca[i].getAutor());
        System.out.println("Preço: " + Biblioteca[i].getPreco());
    }
    public void ApresentarBiblioteca(){
        System.out.println("Livro 1: ");
        System.out.println("Titulo: " + Biblioteca[0].getTitulo());
        System.out.println("Autor: " + Biblioteca[0].getAutor());
        System.out.println("Preço: " + Biblioteca[0].getPreco());
        System.out.println("Livro 2: ");
        System.out.println("Titulo: " + Biblioteca[1].getTitulo());
        System.out.println("Autor: " + Biblioteca[1].getAutor());
        System.out.println("Preço: " + Biblioteca[1].getPreco());
        System.out.println("Livro 3: ");
        System.out.println("Titulo: " + Biblioteca[2].getTitulo());
        System.out.println("Autor: " + Biblioteca[2].getAutor());
        System.out.println("Preço: " + Biblioteca[2].getPreco());
    }

}
