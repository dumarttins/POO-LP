package br.com.atividade4;

public interface Celular {
    default boolean ligandoCelular(boolean acao){
        return acao;
    }
    default boolean desligandoCelular(boolean acao){
        return acao;
    }
    default boolean tirarFoto(boolean acao){
        return  acao;
    }
    default boolean alterandoVolume(boolean acao){
        return  acao;
    }
       
    
}
