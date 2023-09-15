/* public class UsandoContaGetESet {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Diogo Asenjo");
        primeiraPessoa.setCpf("12345678901");
        System.out.println(primeiraPessoa.getNome());
        System.out.println(primeiraPessoa.getCpf());

        ContaBancaria primeiraConta = new ContaBancaria();
        primeiraConta.setNumeroConta(1);
        primeiraConta.setTitular(primeiraPessoa);
        System.out.println(primeiraConta.getTitular().getNome());
        System.out.println(primeiraConta.getSaldo());
        primeiraConta.depositar(200);

        ContaBancaria segundaConta = new ContaBancaria();
        segundaConta.setNumeroConta(2);
        segundaConta.setTitular(new Pessoa());
        segundaConta.getTitular().setNome("Itallo");
        segundaConta.getTitular().setCpf("987654322110");
        System.out.println(segundaConta.getTitular().getNome());

        primeiraConta.transferir(10, segundaConta);
        System.out.println(segundaConta.getSaldo());

        primeiraConta.sacar(10);
    }
} */
