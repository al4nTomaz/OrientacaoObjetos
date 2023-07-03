public class JogadorHumano {
    
    private String apelido;
    private boolean ehPar;
    private int valorAtual;
    private int[] escolhas;


    public JogadorHumano(String apelido, int nJogadas) {
        this.apelido = apelido;
        this.escolhas = new int[nJogadas];
    }

    public void registraJogada(int valor, int jogada){
        this.valorAtual = valor;
        this.escolhas[jogada] = valor;
    }


    public String getApelido() {
        return apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    

    public boolean isEhPar() {
        return ehPar;
    }
    
    public void setEhPar(boolean ehPar) {
        this.ehPar = ehPar;
    }
    

    public int getValorAtual() {
        return valorAtual;
    }
    

    public int[] getEscolhas() {
        return escolhas;
    }
    
}
