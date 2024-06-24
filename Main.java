import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Escola escola = new Escola();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                case 3:
                    cadastrarDisciplina();
                    break;
                case 4:
                    matricularAlunoEmDisciplina();
                    break;
                case 5:
                    registrarNota();
                    break;
                case 6:
                    registrarFalta();
                    break;
                case 7:
                    listarAlunos();
                    break;
                case 8:
                    listarProfessores();
                    break;
                case 9:
                    listarDisciplinas();
                    break;
                case 10:
                    imprimirBoletim();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
    private static void exibirMenu() {
        System.out.println("\n--- Sistema de Gestão Escolar ---\n" + "");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Cadastrar Professor");
        System.out.println("3. Cadastrar Disciplina");
        System.out.println("4. Matricular Aluno em Disciplina");
        System.out.println("5. Registrar Nota");
        System.out.println("6. Registrar Falta");
        System.out.println("7. Listar Alunos");
        System.out.println("8. Listar Professores");
        System.out.println("9. Listar Disciplinas");
        System.out.println("10.Imprimir Boletim");
        System.out.println("0. Sair");
        System.out.println("--------------------------------");

        System.out.print("Escolha uma opção: ");
    
    }
    private static void cadastrarAluno() {
        System.out.print("Digite o ID do Aluno: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o Nome do Aluno: ");
        String nome = scanner.nextLine();
        Aluno aluno = new Aluno(id, nome);
        escola.adicionarAluno(aluno);
    }
    private static void cadastrarProfessor() {
        System.out.print("Digite o ID do Professor: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o Nome do Professor: ");
        String nome = scanner.nextLine();
        Professor professor = new Professor(id, nome);
        escola.adicionarProfessor(professor);
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
        } else {
            System.out.println("\u001B[31mProfessor não encontrado!\u001B[m");
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
        System.out.println("\n--- Lista de Alunos ---\n");
        escola.listarAlunos();

    }

    private static void listarProfessores() {
        System.out.println("\n--- Lista de Professores ---\n");
        escola.listarProfessores();
    }

    private static void listarDisciplinas() {
        System.out.println("\n--- Lista de Disciplinas ---\n");
        escola.listarDisciplinas();
    }
    private static void registrarNota() {
        System.out.print("Digite o ID do Aluno: ");
        int idAluno = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o Código da Disciplina: ");
        String codigoDisciplina = scanner.nextLine();
        System.out.print("Digite a Nota: ");
        double nota = scanner.nextDouble();
        escola.registrarNota(idAluno, codigoDisciplina, nota);
    }
    private static void registrarFalta() {
        System.out.print("Digite o ID do Aluno: ");
        int idAluno = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o Código da Disciplina: ");
        String codigoDisciplina = scanner.nextLine();
        escola.registrarFalta(idAluno, codigoDisciplina);
    }
    private static void imprimirBoletim() {
        System.out.print("Digite o ID do Aluno: ");
        int idAluno = scanner.nextInt();
        escola.imprimirBoletim(idAluno);
    }
}