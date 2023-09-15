public class ContaBancaria {
    //ATRIBUTOS
    private int numeroConta;
    private static int totalDeContas;
    //Aqui estamos deixando o atributo estático, asism ele deixa de ser um atributo de cada objeto, mas sim da classe
    private Pessoa titular;
    private double saldo = 0;
    //Com o private, nós deixamos esse atributo de forma que ele não pode ser lido ou alterado a não ser pela própria classe. É o encapsulamento.

    //CONSTRUTOR
    public ContaBancaria (double saldo, String nome, String cpf) {
        totalDeContas++;
        this.numeroConta = totalDeContas;

        if (saldo < 0) {
            System.out.println("Não é possível criar conta com saldo negativo");
        }
        this.saldo = saldo;

        this.titular = new Pessoa(nome, cpf);
    }

    //MÉTODOS
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

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public static int getTotal() {
        //Esse méotodo é estático pois assim como o atributo, ele não faz parte de nenhum objeto, mas sim da classe. Ou seja, para ser chamda, pode ser Conta.getTotal();
        return totalDeContas;
    }
}