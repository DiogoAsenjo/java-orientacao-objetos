public class ContaBancaria {
    int numeroConta;
    String titular;
    String cpf;
    double saldo;

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("""
                Depósito realizado!
                Saldo atualizado: %.2f
                """.formatted(this.saldo));
    }

    void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("""
                Saque efetuado!
                Saldo atualizado: %.2f
                """.formatted(this.saldo));
        }
    }
}
