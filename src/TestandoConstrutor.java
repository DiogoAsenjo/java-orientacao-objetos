public class TestandoConstrutor {
    public static void main(String[] args) {
        ContaBancaria contaTeste = new ContaBancaria(1, 10, "Diogo Asnejo", "12345678901");
        System.out.println(contaTeste.getNumeroConta());
        System.out.println(contaTeste.getSaldo());
        System.out.println(contaTeste.getTitular().getNome());
        System.out.println(contaTeste.getTitular().getCpf());
    }
}
