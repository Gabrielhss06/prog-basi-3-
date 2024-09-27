public class Conta {
    private String numeroConta;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public Conta(String numeroConta, String nomeCliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta (somente se houver saldo suficiente)
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    // Método para obter o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }

    // Método para exibir as informações da conta
    @Override
    public String toString() {
        return "Número da Conta: " + numeroConta +
                "\nNome do Cliente: " + nomeCliente +
                "\nSaldo Atual: R$ " + String.format("%.2f", saldo);
    }
}
