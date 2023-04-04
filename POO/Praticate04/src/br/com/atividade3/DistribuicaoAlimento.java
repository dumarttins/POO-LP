package br.com.atividade3;

public class DistribuicaoAlimento extends ProjetoSocial{
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nome, String descricao, String endereco, String detaInicio, String dataFim, String descAlimento, float qtde) {
        super(nome, descricao, endereco, detaInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProject(){
        if(getDataFim()==" ")
            return true;
        else
            return false;
    }
    public String imprimeProjeto(){
        return "Nome Projeto: "+getNome()+"\nDescrição: "+getDescricao()+"\nData Inicio: "+getDetaInicio()+"\nData Final: "+getDataFim()+"\nQuantidade: "+getQtde();
    }
}
