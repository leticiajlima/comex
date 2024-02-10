package br.com.alura.comex.semana07;

public class Endereco {
    String nomeDaRua;
    int complemento;
    String cep;
    String estado;
    String cidade;
    int numero;
    String bairro;

    public int getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    @Override
    public String toString() {
        return ">> Dados do Endereço:  \n" +
                "Nome da Rua: " + nomeDaRua + "\n" +
                "Cep: " + cep + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado + "\n" +
                "Número: " + numero + "\n" +
                "Complemento: " + complemento + "\n";
    }



}
