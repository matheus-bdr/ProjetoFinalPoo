package ProjetoFinalPoo;

public class Entreterimento {
    private String direcao;
    private String dataDeLancamento;
    
    private String classificacao;
    private int classificacaIndicativa;
    
    public Entreterimento(){}
    public Entreterimento(String direcao, String dataDeLancamento, String classificacao, int classificacaIndicativa) {
        this.direcao = direcao;
        this.dataDeLancamento = dataDeLancamento;
        this.classificacao = classificacao;
        this.classificacaIndicativa = classificacaIndicativa;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setClassificacaIndicativa(int classificacaIndicativa) {
        this.classificacaIndicativa = classificacaIndicativa;
    }

    public String getDirecao() {
        return direcao;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public int getClassificacaIndicativa() {
        return classificacaIndicativa;
    }
}
