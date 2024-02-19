package br.com.alura.comex.semana08;

import br.com.alura.comex.semana07.Produto;

public class testaPedido {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Persona Royal 5");
        produto1.setDescricao(" Persona 5 é um jogo eletrônico de RPG desenvolvido pela Atlus");
        produto1.setPrecoUnitario(1747.90);
        produto1.setQuantidade(1);

        Produto produto2 = new Produto();
        produto2.setNome("Baldur Gate 3");
        produto2.setDescricao("Baldur's Gate III é um jogo eletrônico de RPG desenvolvido e publicado pela Larian Studios.");
        produto2.setPrecoUnitario(199.00);
        produto2.setQuantidade(1);

        Produto produto3 = new Produto();
        produto3.setNome("Stardew Valley");
        produto3.setDescricao("Stardew Valley é um videogame RPG de simulação desenvolvido por Eric ConcernedApe.");
        produto3.setPrecoUnitario(24.99);
        produto3.setQuantidade(3);


        System.out.println();

    }
}
