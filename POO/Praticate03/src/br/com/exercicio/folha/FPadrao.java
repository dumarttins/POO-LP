package br.com.exercicio.folha;

public class FPadrao extends Funcionario{
    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    public double calculaproventosP(){
        return getSalario();
    }
}
