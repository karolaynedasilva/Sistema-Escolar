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
        alunos.put(aluno.getId(), aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.put(professor.getId(), professor);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.put(disciplina.getCodigo(), disciplina);
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
            System.out.println("Aluno ou Disciplina não encontrado!");
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

}
