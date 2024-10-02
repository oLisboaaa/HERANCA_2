public class Empresa {
    public static void main(String[] args) {
        
            // Cria os objetos da classe de vendedor
        Vendedor vendedor1 = new Vendedor("Joao Roma", "123.456.789-00", "01/01/2000", "01/01/2020", 2500.00, 10.0);
        Vendedor vendedor2 = new Vendedor("Marcolina Carolina", "456.789.123-00", "15/06/1995", "01/01/2021", 3000.00, 12.0);
        Vendedor vendedor3 = new Vendedor("Ze Grande", "789.456.123-00", "25/11/1990", "01/01/2019", 2800.00, 15.0);

            // Cria os objetos da classe de Gerente
        Gerente gerente1 = new Gerente("Carlos Eduardo", "321.654.987-00", "20/02/1980", "01/01/2018", 8000.00, "Vendas");
        Gerente gerente2 = new Gerente("Ana Maria Braga", "654.321.789-00", "10/04/1985", "01/01/2017", 9000.00, "Financeiro");


            // Cria os clientes
        Cliente cliente1 = new Cliente("Rafaelo Marimbo", "321.654.987-00", "30/06/1995", "fernando@email.com", "914672358", "(11) 98765-4321");
        Cliente cliente2 = new Cliente("Luciana Santas", "987.654.321-00", "01/02/2000", "luciana@email.com", "385421639", "(11) 99876-5432");


            // Da output nas informações
        System.out.println("\n\nVendedor: " + vendedor1.getNome() + "\nCPF: " + vendedor1.getCpf() + "\nData de Nascimento: "
                + vendedor1.getDataNasc() + "\nData de Contratacao: " + vendedor1.getDataContrat() + "\nSalario Base: " 
                + vendedor1.getSalarioBase() + "\nPercentual de Comissao: " + vendedor1.getPercentComis() + "%");

        System.out.println("\n\nVendedor: " + vendedor2.getNome() + "\nCPF: " + vendedor2.getCpf() + "\nData de Nascimento: "
                + vendedor2.getDataNasc() + "\nData de Contratacao: " + vendedor2.getDataContrat() + "\nSalario Base: " 
                + vendedor2.getSalarioBase() + "\nPercentual de Comissao: " + vendedor2.getPercentComis() + "%");

        System.out.println("\n\nVendedor: " + vendedor3.getNome() + "\nCPF: " + vendedor3.getCpf() + "\nData de Nascimento: "
                + vendedor3.getDataNasc() + "\nData de Contratacao: " + vendedor3.getDataContrat() + "\nSalario Base: " 
                + vendedor3.getSalarioBase() + "\nPercentual de Comissao: " + vendedor3.getPercentComis() + "%");

        System.out.println("\n\n##########################################################");

        System.out.println("\n\nGerente: " + gerente1.getNome() + "\nCPF: " + gerente1.getCpf() + "\nData de Nascimento: "
                + gerente1.getDataNasc() + "\nData de Contratacao: " + gerente1.getDataContrat() + "\nSalario Base: " 
                + gerente1.getSalarioBase() + "\nDepartamento: " + gerente1.getDepart());

        System.out.println("\n\nGerente: " + gerente2.getNome() + "\nCPF: " + gerente2.getCpf() + "\nData de Nascimento: "
                + gerente2.getDataNasc() + "\nData de Contratacao: " + gerente2.getDataContrat() + "\nSalario Base: " 
                + gerente2.getSalarioBase() + "\nDepartamento: " + gerente2.getDepart());

        System.out.println("\n\n##########################################################");

        System.out.println("\n\nCliente: " + cliente1.getNome() + "\nCPF: " + cliente1.getCpf() + "\nData de Nascimento: "
                + cliente1.getDataNasc() + "\nEmail: " + cliente1.getEmail() + "\nCartao de Fidelidade: " 
                + cliente1.getCartaoFidel() + "\nTelefone: " + cliente1.getTelefone());

        System.out.println("\n\nCliente: " + cliente2.getNome() + "\nCPF: " + cliente2.getCpf() + "\nData de Nascimento: "
                + cliente2.getDataNasc() + "\nEmail: " + cliente2.getEmail() + "\nCartao de Fidelidade: " 
                + cliente2.getCartaoFidel() + "\nTelefone: " + cliente2.getTelefone());
    }
}