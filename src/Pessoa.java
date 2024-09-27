public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, String dataNascimento, Universidade universidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
    }

    public void dizerOndeTrabalha() {
        System.out.println(nome + " trabalha na universidade " + universidade.getNome());
    }
}
