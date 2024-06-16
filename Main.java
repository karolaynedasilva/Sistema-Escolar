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
    private static void cadastrarDisciplina() {
        System.out.print("Digite o Código da Disciplina: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o Nome da Disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o ID do Professor responsável: ");
        int idProfessor = scanner.nextInt();
        scanner.nextLine();
        Professor professor = escola.consultarProfessor(idProfessor);
        if (professor != null) {
            Disciplina disciplina = new Disciplina(codigo, nome, professor);
            escola.adicionarDisciplina(disciplina);
            System.out.println("Disciplina cadastrada com sucesso!");
        } else {
            System.out.println("Professor não encontrado!");
        }
        
    }
    private static void matricularAlunoEmDisciplina() {
        System.out.print("Digite o ID do Aluno: ");
        int idAluno = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o Código da Disciplina: ");
        String codigoDisciplina = scanner.nextLine();
        escola.matricularAlunoEmDisciplina(idAluno, codigoDisciplina);
    }
    private static void listarAlunos() {
        System.out.println("\n--- Lista de Alunos ---");
        escola.listarAlunos();
    }

    private static void listarProfessores() {
        System.out.println("\n--- Lista de Professores ---");
        escola.listarProfessores();
    }

    private static void listarDisciplinas() {
        System.out.println("\n--- Lista de Disciplinas ---");
        escola.listarDisciplinas();
    }
}