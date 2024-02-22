package br.com.alura.comex.modelos;

public class Cliente {
    private String nome;
    private String CPF;
    private String email;
    private String telefone;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return ">> Dados do Cliente:  \n" +
                "Nome: " + nome + "\n" +
                "CPF: " + CPF + "\n" +
                "E-Mail: " + email + "\n" +
                "Telefone: " + telefone + "\n" +
                "Endereço: " + endereco + "\n";
    }
}

