//05) Uma escola precisa de um sistema para armazenar as notas dos alunos. Cada aluno tem um
//nome e três notas. A média final do aluno deve ser calculada e informada apenas através de um
//método específico.
//Requisito: Crie a classe Aluno aplicando encapsulamento para que as notas não possam ser
//alteradas diretamente.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        student.setName(scanner.nextLine());

        student.Media();

    }
}
