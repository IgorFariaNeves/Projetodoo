public class ap1 {
}
    public static void main(String[] args) {
        Funcionario fb1 = new Funcionario("Paqueta");
        Funcionario fb2 = new Funcionario("Ounahi");
        FuncaoFuncionario gerente = new FuncaoFuncionario("gerente");
        FuncaoFuncionario atendente = new FuncaoFuncionario("atendente");

        fb1.setCargo(gerente);
        fb2.setCargo(atendente);

    }

}
