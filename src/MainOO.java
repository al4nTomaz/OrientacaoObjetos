import java.util.Scanner;

public class MainOO {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        int nJogadas = 3;

        int opcao;
        int jogada = 0;
        
        Juiz juiz;
        JogadorHumano jogadorHumano;
        JogadorComputador jogadorComputador;

        juiz = new Juiz();
        jogadorHumano= new JogadorHumano("Alan", nJogadas);
        jogadorComputador = new JogadorComputador(nJogadas);
        
        boolean continuar = true;

        String resultado = "";
        
        while (continuar && jogada < nJogadas) {
            
            System.out.print("Você quer ser par? Digite 1-SIM 0-NÃO\t-> ");
            opcao = e.nextInt();
            
            if (opcao != 0 && opcao != 1) {
                System.out.println("ERRO!! Opção inválida!");
                System.exit(1);
            }
            
            jogadorHumano.setEhPar(opcao == 1);
            
            System.out.print("Escolha um número de 1 a 10\t-> ");
            opcao = e.nextInt();
            
            if (opcao < 0 || opcao > 10) {
                System.out.println("ERRO!! Valor inválida!");
                System.exit(1);
            }

            jogadorHumano.registraJogada(opcao, jogada);
        
            jogadorComputador.registraJogada(jogada);
            
            resultado = juiz.verificaQuemGanhou(jogadorHumano, jogadorComputador);
            
            jogada++;
            System.out.println("J : " + jogadorHumano.getValorAtual() + "\tC : " + jogadorComputador.getValorAtual());
            System.out.println(resultado);

            System.out.print("Você quer continuar? Digite 1-SIM 0-NÃO\t-> ");
            continuar = e.nextInt() == 1;
        }

        e.close();

        int[] escolhaUser = jogadorHumano.getEscolhas();
        int[] escolhaComputador = jogadorComputador.getEscolhas();

        // System.out.println("V - vencedor \t X - perdedor");

        for (int i = 0; i < jogada; i++) {
            System.out.println("J : " +escolhaUser[i] + "\tC : " + escolhaComputador[i]);
        }
    }
}
