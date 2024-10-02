package empresa;

class Pessoa { // Classe Pai
    private String nome; // Nome da pessoa
    private String cpf; // CPF da pessoa
    private String dataNasc; // Data de nascimento da pessoa

    public Pessoa(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

        //Getters e Setters da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}

class Vendedor extends Pessoa {
    private String dataContrat; // Data de contratação do vendedor
    private double salarioBase; // Salário base do vendedor
    private double percentComis; // Percentual de comissão do vendedor

    public Vendedor(String nome, String cpf, String dataNasc, String dataContrat, double salarioBase, double percentComis) {
        super(nome, cpf, dataNasc); // Chama o construtor da classe pai (Pessoa)
        this.dataContrat = dataContrat;
        this.salarioBase = salarioBase;
        this.percentComis = percentComis;
    }

        //Getters e Setters da classe
    public String getDataContrat() {
        return dataContrat;
    }

    public void setDataContrat(String dataContrat) {
        this.dataContrat = dataContrat;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPercentComis() {
        return percentComis;
    }

    public void setPercentComis(double percentComis) {
        this.percentComis = percentComis;
    }
}

class Gerente extends Pessoa {
    private String dataContrat; // Data de contratação do gerente
    private double salarioBase; // Salário base do gerente
    private String depart; // Departamento do gerente

    public Gerente(String nome, String cpf, String dataNasc, String dataContrat, double salarioBase, String depart) {
        super(nome, cpf, dataNasc); // Chama o construtor da classe pai (Pessoa)
        this.dataContrat = dataContrat;
        this.salarioBase = salarioBase;
        this.depart = depart;
    }

        //Getters e Setters da classe
    public String getDataContrat() {
        return dataContrat;
    }

    public void setDataContrat(String dataContrat) {
        this.dataContrat = dataContrat;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}

class Cliente extends Pessoa {
    private String email; // Email do cliente
    private String cartaoFidel; // Cartão de fidelidade do cliente
    private String telefone; // Telefone do cliente

    public Cliente(String nome, String cpf, String dataNasc, String email, String cartaoFidel, String telefone) {
        super(nome, cpf, dataNasc); // Chama o construtor da classe pai (Pessoa)
        this.email = email;
        this.cartaoFidel = cartaoFidel;
        this.telefone = telefone;
    }

        //Getters e Setters da classe
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCartaoFidel() {
        return cartaoFidel;
    }

    public void setCartaoFidel(String cartaoFidel) {
        this.cartaoFidel = cartaoFidel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String numero = telefone.replaceAll("[^0-9]", ""); // Remove caracteres não numéricos
        if (numero.length() == 11) {
            this.telefone = String.format("(%s) %s-%s", // Formata o telefone
                    numero.substring(0, 2),
                    numero.substring(2, 7),
                    numero.substring(7));
        } else {
            System.out.println("Numero invalido"); // Mensagem de erro para número inválido
        }
    }
}

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