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
