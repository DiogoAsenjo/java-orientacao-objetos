public class UsandoConta {
    public static void main(String[] args) {
        //CRIANDO UM OBJETO
        ContaBancaria primeiraConta = new ContaBancaria();
        primeiraConta.numeroConta = 0001;
        primeiraConta.titular = "Diogo Asenjo";
        primeiraConta.cpf = "12345678901";
        primeiraConta.saldo = 200.76;

        ContaBancaria segundaConta = new ContaBancaria();
        segundaConta.numeroConta = 0002;
        segundaConta.titular = "Neemias Vieira";
        segundaConta.cpf = "12345678901";
        segundaConta.saldo = 400;

        //REFERÊNCIA
        /*ContaBancaria referenciaConta = primeiraConta;
        referenciaConta.saldo += 100;
        System.out.println(primeiraConta.saldo);*/ //O output aqui será 300.76. Isso porque referenciaConta não é um novo objeto. Mas sim uma referência ao objeto primeiraConta.

        //CHAMANDO OS MÉTODOS
        //primeiraConta.depositar(100.50);
        //primeiraConta.sacar(10);
        primeiraConta.transferir(10, segundaConta);
        System.out.println(segundaConta.saldo);
    }
}
