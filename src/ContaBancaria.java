public class ContaBancaria {
    int numeroConta;
    String titular;
    String cpf;
    double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("""
                Depósito realizado!
                Saldo atualizado: %.2f
                """.formatted(this.saldo));
    }

    public void sacar(double valor) {
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

    public void transferir(double valor, ContaBancaria destino) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("""
                Transferência efetuada!
                Saldo atualizado: %.2f
                """.formatted(this.saldo));
        }
    }
}
