import java.util.HashMap;
import java.util.Map;

public class Escola {
private Map<Integer, Aluno> alunos;
    private Map<Integer, Professor> professores;
    private Map<String, Disciplina> disciplinas;

    public Escola() {
        alunos = new HashMap<>();
        professores = new HashMap<>();
        disciplinas = new HashMap<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (alunos.containsKey(aluno.getId())) {
            System.out.println("\u001B[31mErro, já existe um aluno com a matricula " +  aluno.getId()+"\u001B[m");
        } else {
            alunos.put(aluno.getId(), aluno);
            System.out.println("\u001B[32mAluno cadastrado com sucesso!\u001B[m");
        }
    }

    public void adicionarProfessor(Professor professor) {
        if (professores.containsKey(professor.getId())) {
            System.out.println("\u001B[31mErro, já existe um professor com a matricula " +  professor.getId()+"\u001B[m");
        } else {
            professores.put(professor.getId(), professor);
            System.out.println("\\u001B[32mProfessor cadastrado com sucesso!\\u001B[m");
        }
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (disciplinas.containsKey(disciplina.getCodigo())) {
            System.out.println("\u001B[31mErro, já existe uma disciplina com o código " +  disciplina.getCodigo()+"\u001B[m");
        } else {
            disciplinas.put(disciplina.getCodigo(), disciplina);
            System.out.println("\\u001B[32mDisciplina cadastrada com sucesso!\\u001B[m");
        }
    }

    public Aluno consultarAluno(int id) {
        return alunos.get(id);
    }

    public Professor consultarProfessor(int id) {
        return professores.get(id);
    }

    public Disciplina consultarDisciplina(String codigo) {
        return disciplinas.get(codigo);
    }

    public void matricularAlunoEmDisciplina(int alunoId, String codigoDisciplina) {
        Aluno aluno = alunos.get(alunoId);
        Disciplina disciplina = disciplinas.get(codigoDisciplina);
        if (aluno != null && disciplina != null) {
            disciplina.matricularAluno(aluno);
        } else {
            System.out.println("\u001B[33mAluno ou Disciplina não encontrado!\u001B[m");
        }
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos.values()) {
            System.out.println(aluno);
        }
    }

    public void listarProfessores() {
        for (Professor professor : professores.values()) {
            System.out.println(professor);
        }
    }

    public void listarDisciplinas() {
        for (Disciplina disciplina : disciplinas.values()) {
            System.out.println(disciplina);
        }
    }
    public void registrarNota(int alunoId, String codigoDisciplina, double nota) {
        Aluno aluno = alunos.get(alunoId);
        Disciplina disciplina = disciplinas.get(codigoDisciplina);
        if (aluno != null && disciplina != null) {
            aluno.adicionarNota(disciplina, nota);
            System.out.println("\u001B[32mNota registrada com sucesso!\u001B[m");
        } else {
            System.out.println("\u001B[33mAluno ou Disciplina não encontrado!\u001B[m");
        }
    }
    public void imprimirBoletim(int alunoId) {
        Aluno aluno = alunos.get(alunoId);
        if (aluno != null) {
            aluno.imprimirBoletim();
        } else {
            System.out.println("\u001B[31mAluno não encontrado!\u001B[m");
        }
    }
}
