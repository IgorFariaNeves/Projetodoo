public class ap2 {
}
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Paqueta");
        Endereco endereco1 = new Endereco("Endereco x");
        Endereco endereco2 = new Endereco( "Endereco y");
        Endereco endereco3 = new Endereco( "Endereco z");

        cliente.listaEndereco.add(endereco1);
        cliente.listaEndereco.add(endereco2);
        cliente.listaEndereco.add(endereco3);

        cliente.imprimirEndereco(cliente);

    }

}
