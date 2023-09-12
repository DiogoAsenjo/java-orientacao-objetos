public class UsandoConta {
    public static void main(String[] args) {
        //CRIANDO UM OBJETO
        ContaBancaria primeiraConta = new ContaBancaria();
        primeiraConta.numeroConta = 0001;
        primeiraConta.titular = "Diogo Asenjo";
        primeiraConta.cpf = "12345678901";
        primeiraConta.saldo = 200.76;

        //REFERÊNCIA
        /*ContaBancaria referenciaConta = primeiraConta;
        referenciaConta.saldo += 100;
        System.out.println(primeiraConta.saldo);*/ //O output aqui será 300.76. Isso porque referenciaConta não é um novo objeto. Mas sim uma referência ao objeto primeiraConta.

        //CHAMANDO OS MÉTODOS
        primeiraConta.depositar(100.50);
        primeiraConta.sacar(10);
    }
}
