public class Main {
    public static void main(String[] args) {
        ClienteAcademia cliente = new ClienteAcademia("João", 21);
        cliente.setMensalidade(80);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Mensalidade: R$" + cliente.getMensalidade());

        cliente.pagarMensalidade(85);
        System.out.println("Mensalidade atualizada: R$" + cliente.getMensalidade());
    }
}
