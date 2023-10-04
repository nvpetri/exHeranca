package br.senai.sp.jandira;

import br.senai.sp.jandira.module.Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        jogador.cadastrarJogador();

        jogador.andar();
    }
}
