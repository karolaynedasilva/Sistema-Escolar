import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno {
    private int id;
    private String nome;
    private Map<Disciplina, List<Double>> notas;
    private Map<Disciplina, Integer> faltas;

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.notas = new HashMap<>();
        this.faltas = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public Map<Disciplina, List<Double>> getNotas() {
        return notas;
    }

    public void adicionarNota(Disciplina disciplina, double nota) {
        notas.putIfAbsent(disciplina, new ArrayList<>());
        notas.get(disciplina).add(nota);
    }
    public void registrarFalta(Disciplina disciplina) {
        faltas.putIfAbsent(disciplina, 0);
        faltas.put(disciplina, faltas.get(disciplina) + 1);
    }

    public void imprimirBoletim() {
        System.out.println("Boletim de " + nome + ":");
        for (Map.Entry<Disciplina, List<Double>> entry : notas.entrySet()) {
            Disciplina disciplina = entry.getKey();
            List<Double> notasDisciplina = entry.getValue();
            System.out.println(disciplina.getNome() + ": " + notasDisciplina);
        }
        System.out.println("Faltas:");
        for (Map.Entry<Disciplina, Integer> entry : faltas.entrySet()) {
            Disciplina disciplina = entry.getKey();
            Integer faltasDisciplina = entry.getValue();
            System.out.println(disciplina.getNome() + ": " + faltasDisciplina + " faltas");
        }
    }
    @Override
    public String toString() {
        return "Matricula do Aluno: " + id +", Nome: " + nome + "";
    }
}
