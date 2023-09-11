public class CriaConta {
    public static void main(String[] args) {
        ContaBancaria primeiraConta = new ContaBancaria();
        primeiraConta.numeroConta = 0001;
        primeiraConta.titular = "Diogo Asenjo";
        primeiraConta.cpf = "12345678901";
        primeiraConta.saldo = 200.76;

        ContaBancaria referenciaConta = primeiraConta;
        referenciaConta.saldo += 100;
        System.out.println(primeiraConta.saldo); //O output aqui será 300.76. Isso porque referenciaConta não é um novo objeto. Mas sim uma referência ao objeto primeiraConta.

        ContaBancaria segundaConta = new ContaBancaria();
        segundaConta.numeroConta = 0002;
        segundaConta.titular = "Neemias Vieira";
        segundaConta.cpf = "98765432101";
        segundaConta.saldo = 100;
    }
}
