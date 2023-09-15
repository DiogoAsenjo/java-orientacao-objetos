public class UsandoConta {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Diogo Asenjo");
        primeiraPessoa.setCpf("12345678901");
        System.out.println(primeiraPessoa.getNome());
        System.out.println(primeiraPessoa.getCpf());

        ContaBancaria contaTeste = new ContaBancaria();
        contaTeste.setNumeroConta(3);
        System.out.println(contaTeste.getNumeroConta());
        contaTeste.setTitular(new Pessoa());
        contaTeste.getTitular().setNome("Neemias");
        System.out.println(contaTeste.getTitular().getNome());

        //CRIANDO UM OBJETO
        ContaBancaria primeiraConta = new ContaBancaria();
        //primeiraConta.numeroConta = 0001;
        primeiraConta.setNumeroConta(1);
        primeiraConta.setTitular(primeiraPessoa);
        //primeiraConta.titular = primeiraPessoa;
        //primeiraConta.saldo = 200.76; //Como saldo é um atributo privado, isso não irá funcionar
        System.out.println(primeiraConta.getSaldo());
        //System.out.println(primeiraConta.getNumeroConta());
        System.out.println(primeiraConta.getTitular().getNome());
        //Aqui teremos o getTitular e o getNome, já que o método getTitular chama apenas o objeto, é necessário também chamar o getNome da classe Pessoa para funcionar.

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
