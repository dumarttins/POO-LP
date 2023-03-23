package br.com.newton.agenda;

public class Contato {
    private String nome;
    private String numero;

    public void excluir (Contato contact){
        System.out.println("Excluindo o contato: "+contact.nome);
    }
    public void add (Contato contact){
        System.out.println("Adicionando o contato: "+contact.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


}
