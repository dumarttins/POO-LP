package br.com.newton.exercicio2;
import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtde_de_funcionario;

    public Empresa(String nome, String cnpj, int qtde_de_funcionario, ArrayList<Funcionario> funcionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtde_de_funcionario = qtde_de_funcionario;
        this.funcionarios = funcionarios;
    }

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

}
