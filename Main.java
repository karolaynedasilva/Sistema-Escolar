import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Escola escola = new Escola();

    public static void main(String[] args) {
        
    }
    private static void cadastrarAluno() {
        System.out.print("Digite o ID do Aluno: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o Nome do Aluno: ");
        String nome = scanner.nextLine();
        Aluno aluno = new Aluno(id, nome);
        escola.adicionarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }
    private static void cadastrarProfessor() {
        System.out.print("Digite o ID do Professor: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o Nome do Professor: ");
        String nome = scanner.nextLine();
        Professor professor = new Professor(id, nome);
        escola.adicionarProfessor(professor);
        System.out.println("Professor cadastrado com sucesso!");
    }
}