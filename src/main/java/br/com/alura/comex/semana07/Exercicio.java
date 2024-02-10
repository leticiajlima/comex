package br.com.alura.comex.semana07;

public class Exercicio {
    public static void main(String[] args) {
        //* Exercicio 1 *//

        Produto produto = new Produto();
        produto.nome = "Jogo Persona 5 Royal";
        produto.precoUnitario = 174.90;
        produto.descricao = "Persona 5 é um jogo eletrônico de RPG desenvolvido pela Atlus.";

        Produto produto1 = new Produto();
        produto1.nome = "Jogo Baldur Gate 3";
        produto1.precoUnitario = 199.00;
        produto1.descricao = "Baldur's Gate III é um jogo eletrônico de RPG desenvolvido e publicado pela Larian Studios. " +
                "É o terceiro jogo principal da série Baldur's Gate, que é baseada no sistema de RPG de mesa Dungeons & Dragons.";

        System.out.println("Bem-Vindo a RPG Store");
        System.out.println("____________________________________");


        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Descrição do Produto: " + produto.descricao);
        System.out.println("Preço do Produto: " + produto.precoUnitario);
        System.out.println("------------------------------------------");

        System.out.println("Nome do produto: " + produto1.nome);
        System.out.println("Descrição do Produto: " + produto1.descricao);
        System.out.println("Preço do Produto: " + produto1.precoUnitario);
        System.out.println("------------------------------------------");


        //* Exercicio 2 *//

        if (produto.equals(produto1)){
            System.out.println("Os produtos são iguais!!");
        }
        else
            System.out.println("Os produtos não são iguais!!");


        //* Exercicio 3 *//

        System.out.println(produto.toString());
        System.out.println(produto1.toString());

        //* Exercicio 4 *//

        Endereco endereco = new Endereco();
        endereco.nomeDaRua = "Rua Radialista Odete Pacheco";
        endereco.bairro = "Farol";
        endereco.cep = "57051-560";
        endereco.cidade = "Maceió";
        endereco.numero = 294;
        endereco.estado = "Alagoas";
        endereco.complemento = 2;

        System.out.println(endereco.toString());



        //* Exercicio 5 *//

        Cliente cliente = new Cliente();
        cliente.setNome("Sebastiana Isadora da Rosa");
        cliente.setCPF("995.108.412-50");
        cliente.setEndereco(endereco);
        cliente.setEmail("sebastiana_darosa@rafaeladson.com");
        cliente.setTelefone("01/02/1999");

        System.out.println(cliente.toString());







    }
}
