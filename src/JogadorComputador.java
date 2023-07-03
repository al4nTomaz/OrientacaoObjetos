import java.util.Random;

public class JogadorComputador {

    private boolean ehPar;
    private int valorAtual;
    private int[] escolhas;

    
    public JogadorComputador(int nJogadas) {
        this.escolhas = new int[nJogadas];
    }


    public void registraJogada(int jogada){
        sorteia();
        this.escolhas[jogada] = this.valorAtual;
    }


    private void sorteia(){
        Random rnd = new Random(System.currentTimeMillis());

        valorAtual = rnd.nextInt(0, 10);
    }


    public int getValorAtual(){
        return valorAtual;
    }
    
    public int[] getEscolhas() {
        return escolhas;
    }
    public boolean isEhPar() {
        return ehPar;
    }


    public void setEhPar(boolean ehPar) {
        this.ehPar = ehPar;
    }

    public void setValorAtual(int valorAtual) {
        this.valorAtual = valorAtual;
    }
    
}