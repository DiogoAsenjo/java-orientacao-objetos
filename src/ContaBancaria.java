public class ContaBancaria {
    private int numeroConta;
    private Pessoa titular;
    private double saldo = 0;
    //Com o private, nós deixamos esse atributo de forma que ele não pode ser lido ou alterado a não ser pela própria classe. É o encapsulamento.

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

    public String getSaldo() {
        return String.format("Seu saldo atual é: %.2f", this.saldo);
    }

    public String getNumeroConta() {
        return String.format("Conta nº %d", this.numeroConta);
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Pessoa getTitular() {
        return titular;
    }
}