package att_1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando uma conta com saldo inicial
        Conta conta1 = new Conta("12345", "João Silva", 500.00);


        System.out.println(conta1);
        System.out.println();


        conta1.depositar(200.00);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
        System.out.println();


        conta1.sacar(800.00);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
        System.out.println();


        conta1.sacar(150.00);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
    }
}