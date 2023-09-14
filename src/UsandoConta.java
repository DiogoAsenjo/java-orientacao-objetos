public class UsandoConta {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Diogo Asenjo");
        primeiraPessoa.setCpf("12345678901");
        System.out.println(primeiraPessoa.getNome());
        System.out.println(primeiraPessoa.getCpf());

        //CRIANDO UM OBJETO
        ContaBancaria primeiraConta = new ContaBancaria();
        //primeiraConta.numeroConta = 0001;
        primeiraConta.setNumeroConta(1);
        //primeiraConta.titular = primeiraPessoa;
        //primeiraConta.saldo = 200.76; //Como saldo é um atributo privado, isso não irá funcionar
        System.out.println(primeiraConta.getSaldo());
        System.out.println(primeiraConta.getNumeroConta());

        //System.out.println(primeiraConta.titular.nome);

        ContaBancaria segundaConta = new ContaBancaria();
        //segundaConta.numeroConta = 0002;
        //segundaConta.saldo = 400;

        //REFERÊNCIA
        /*ContaBancaria referenciaConta = primeiraConta;
        referenciaConta.saldo += 100;
        System.out.println(primeiraConta.saldo);*/ //O output aqui será 300.76. Isso porque referenciaConta não é um novo objeto. Mas sim uma referência ao objeto primeiraConta.

        //CHAMANDO OS MÉTODOS
        //primeiraConta.depositar(100.50);
        //primeiraConta.sacar(10);
        //primeiraConta.transferir(10, segundaConta);
        //System.out.println(segundaConta.saldo);
    }
}
