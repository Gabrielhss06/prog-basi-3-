//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando alguns alunos
        Aluno aluno1 = new Aluno("João Silva", 17, 70.5, 1.75);
        Aluno aluno2 = new Aluno("Maria Souza", 19, 60.0, 1.68);
        Aluno aluno3 = new Aluno("Carlos Almeida", 16, 80.3, 1.80);
        Aluno aluno4 = new Aluno("Ana Costa", 21, 55.2, 1.65);

        // Exibindo informações dos alunos
        System.out.println(aluno1);
        System.out.println();
        System.out.println(aluno2);
        System.out.println();
        System.out.println(aluno3);
        System.out.println();
        System.out.println(aluno4);
    }
}