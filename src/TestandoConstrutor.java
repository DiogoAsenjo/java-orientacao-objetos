public class TestandoConstrutor {
    public static void main(String[] args) {
        ContaBancaria contaTeste = new ContaBancaria(10, "Diogo Asnejo", "12345678901");
        System.out.println(contaTeste.getNumeroConta());
        System.out.println(contaTeste.getSaldo());
        System.out.println(contaTeste.getTitular().getNome());
        System.out.println(contaTeste.getTitular().getCpf());

        ContaBancaria segundoTeste = new ContaBancaria(20, "Neemias", "98765432110");
        System.out.println(segundoTeste.getNumeroConta());
        System.out.println(ContaBancaria.getTotal()); //Para chamar um método estático, pode usar a classe, não é necessário chamar um objeto.
    }
}
