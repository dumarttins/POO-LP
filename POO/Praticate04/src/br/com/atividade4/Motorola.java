package br.com.atividade4;

public class Motorola extends Smartphone implements Celular{
    private double valor;

    public Motorola(boolean enviarMensagem, boolean acessarInternet, boolean email, boolean radio, boolean tv, boolean verificarSistema, double valor) {
        super(enviarMensagem, acessarInternet, email, radio, tv, verificarSistema);
        this.valor = valor;
    }

    public boolean ligandoCelular(boolean acao){
        return acao;
    }
    public boolean desligandoCelular(boolean acao){
        return acao;
    }
    public boolean tirarFoto(boolean acao){
        return  acao;
    }
    public boolean alterandoVolume(boolean acao){
        return  acao;
    }
}
