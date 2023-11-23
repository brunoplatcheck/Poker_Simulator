
package src;

/**
 *
 * @author bruno
 */
public class Aula21_ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JogoPoker jogo = new JogoPoker(4);
        jogo.iniciarJogo();

        for (Jogador jogador : jogo.jogadores) {
            System.out.println(jogador.getNome() + " tem as seguintes cartas: " + jogador.getMao());
        }

        Jogador vencedor = jogo.determinarVencedor();
        System.out.println("O vencedor é: " + vencedor.getNome());
    }
    }

