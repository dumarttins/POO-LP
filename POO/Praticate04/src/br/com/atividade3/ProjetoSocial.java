package br.com.atividade3;

public abstract class ProjetoSocial {
    private String nome;
    private String descricao;
    private String endereco;
    private String detaInicio;
    private String dataFim;

    public ProjetoSocial(String nome, String descricao, String endereco, String detaInicio, String dataFim) {
        this.nome = nome;
        this.descricao = descricao;
        this.endereco = endereco;
        this.detaInicio = detaInicio;
        this.dataFim = dataFim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDetaInicio() {
        return detaInicio;
    }

    public void setDetaInicio(String detaInicio) {
        this.detaInicio = detaInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public boolean validaProject(){
        return false;
    }
    public String imprimeProjeto(){
        return null;
    }


}
