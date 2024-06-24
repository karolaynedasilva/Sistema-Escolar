import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    private String codigo;
    private String nome;
    private Professor professor;
    private Set<Aluno> alunos;

    public Disciplina(String codigo, String nome, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new HashSet<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Código da Disciplina:" + codigo + ", Nome:" + nome + ", Professor:" + professor.getNome() + "";
    }
}

