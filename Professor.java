public class Professor {
    private int id;
    private String nome;

    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Professor: " + id + ", Nome:" + nome + "";
    }
}
