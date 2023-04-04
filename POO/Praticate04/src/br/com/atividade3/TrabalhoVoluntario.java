package br.com.atividade3;

public class TrabalhoVoluntario extends ProjetoSocial{
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nome, String descricao, String endereco, String detaInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nome, descricao, endereco, detaInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProject(){
        if(getDuracaoTrabalho() > 2)
            return true;
        else
            return false;
    }
    public String imprimeProjeto(){
        return "Nome Projeto: "+getNome()+"\nDescrição: "+getDescricao()+"\nData Inicio: "+getDetaInicio()+"\nData Final: "+getDataFim()+"\nTipo Trabalho: "+getTipoTrabalho()+"\nDuração Trabalho: "+getDuracaoTrabalho();
    }
}
