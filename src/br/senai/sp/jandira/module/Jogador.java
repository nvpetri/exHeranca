package br.senai.sp.jandira.module;

import java.util.Scanner;

public class Jogador extends Pessoas{
    private String posicao;
    private int numeroCamisa;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarJogador(){
        System.out.println("|------------------------------------------------|");
        System.out.println("|                 Cadastrar Jogador              |");
        System.out.println("|------------------------------------------------|");
        System.out.println("Informe o nome: ");
        super.nome = scanner.nextLine();

        System.out.println("Informe o CPF: ");
        super.cpf = scanner.nextLong();

        System.out.println("Informe o RG: ");
        super.rg = scanner.nextLong();

        System.out.println("Informe a idade: ");
        super.idade = scanner.nextInt();

        System.out.println("Informe o numero da camisa: ");
        numeroCamisa = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe a posição do jogador: ");
        posicao = scanner.nextLine();

        System.out.println("|------------------------------------------------|");
    }
}
