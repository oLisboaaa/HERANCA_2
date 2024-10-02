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
