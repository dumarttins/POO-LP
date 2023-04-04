package br.com.atividade4;

public abstract class Smartphone {
    private boolean enviarMensagem;
    private boolean acessarInternet;
    private boolean email;
    private boolean radio;
    private boolean tv;
    private boolean verificarSistema;

    public Smartphone(boolean enviarMensagem, boolean acessarInternet, boolean email, boolean radio, boolean tv, boolean verificarSistema) {
        this.enviarMensagem = enviarMensagem;
        this.acessarInternet = acessarInternet;
        this.email = email;
        this.radio = radio;
        this.tv = tv;
        this.verificarSistema = verificarSistema;
    }
}
