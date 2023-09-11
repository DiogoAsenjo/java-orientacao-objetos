public class CriaConta {
    public static void main(String[] args) {
        ContaBancaria primeiraConta = new ContaBancaria();
        primeiraConta.numeroConta = 0001;
        primeiraConta.titular = "Diogo Asenjo";
        primeiraConta.cpf = "12345678901";
        primeiraConta.saldo = 200.76;

        System.out.println(primeiraConta.numeroConta);
    }
}
