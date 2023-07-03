public class Juiz {

    public String verificaQuemGanhou(JogadorHumano jogadorHumano, JogadorComputador jogadorComputador){

        int soma = jogadorHumano.getValorAtual() + jogadorComputador.getValorAtual();

        if ((soma % 2 == 0) && jogadorHumano.isEhPar()) {
            return "Jogador";    
        } else if ((soma % 2 == 0) && !jogadorHumano.isEhPar()) {
            return "Jogador";    
        }

        return "Computador"; 
    }

}
