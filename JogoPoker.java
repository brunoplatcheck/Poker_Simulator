/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
class JogoPoker {
    private Baralho baralho;
    List<Jogador> jogadores;

    public JogoPoker(int numJogadores) {
        baralho = new Baralho();
        jogadores = new ArrayList<>();

        for (int i = 1; i <= numJogadores; i++) {
            jogadores.add(new Jogador("Jogador " + i));
        }
    }

    public void iniciarJogo() {
        baralho.embaralhar();

        for (int i = 0; i < 5; i++) {
            for (Jogador jogador : jogadores) {
                Carta carta = baralho.darCarta();
                if (carta != null) {
                    jogador.receberCarta(carta);
                }
            }
        }
    }
    public Jogador determinarVencedor() {
        Jogador vencedor = jogadores.get(0);

        for (int i = 1; i < jogadores.size(); i++) {
            Jogador jogadorAtual = jogadores.get(i);

            if (avaliarMao(jogadorAtual.getMao()) > avaliarMao(vencedor.getMao())) {
                vencedor = jogadorAtual;
            }
        }

        return vencedor;
    }

    private int avaliarMao(List<Carta> mao) {
        int maiorValor = 0;

        for (Carta carta : mao) {
            if (carta.getValor() > maiorValor) {
                maiorValor = carta.getValor();
            }
        }

        return maiorValor;
    }
}