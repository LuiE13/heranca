public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("cleiton Racha For debochaitin Legal");
        funcionario.setRg("666.696.123-52");
        funcionario.setCartao("242424242424");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRg());
        System.out.println(funcionario.getCartao());
    }
}
