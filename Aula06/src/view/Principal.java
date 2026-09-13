package view;

import business.GeradorPin;
import business.GeradorSenhaForte;
import business.IGeradorSenha;

public class Principal {

    public static void main(String[] args) {
        System.out.println("aluno: arthur oliveira");

        IGeradorSenha gerador;

        // gera a senha forte
        gerador = new GeradorSenhaForte(12);

        System.out.println("senha forte 1: " + gerador.gerarSenha());
        System.out.println("senha forte 2: " + gerador.gerarSenha());

        // gerador de pin
        gerador = new GeradorPin();

        System.out.println("pin 1: " + gerador.gerarSenha());
        System.out.println("pin 2: " + gerador.gerarSenha());
    }
}