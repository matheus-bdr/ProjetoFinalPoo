package ProjetoFinalPoo;

public class Documentario extends Entreterimento {
    private int quantidadeDeTemporadas;
    private int quantidadeDeEpisodeos;
    public int getQuantidadeDeTemporadas() {
        return quantidadeDeTemporadas;
    }
    public void setQuantidadeDeTemporadas(int quantidadeDeTemporadas) {
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    }
    public int getQuantidadeDeEpisodeos() {
        return quantidadeDeEpisodeos;
    }
    public void setQuantidadeDeEpisodeos(int quantidadeDeEpisodeos) {
        this.quantidadeDeEpisodeos = quantidadeDeEpisodeos;
    }
    public Documentario(String direcao, String dataDeLancamento, String classificacao, int classificacaIndicativa){
        super(direcao, dataDeLancamento, classificacao, classificacaIndicativa);
    }
}

