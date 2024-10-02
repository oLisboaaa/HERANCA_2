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
