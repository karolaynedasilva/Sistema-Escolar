import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Escola escola = new Escola();

    public static void main(String[] args) {
        System.out.print("Digite a Matricula do Aluno: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o Nome do Aluno: ");
        String nome = scanner.nextLine();
        Aluno aluno = new Aluno(id, nome);
        escola.adicionarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

}