package br.com.newton.exercicio2;

public class Funcionario extends Pessoa{
    private String dp;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean taNaEmpresa;

    public Funcionario(String nome, String email, String telefone, String dp, double salario, String dataEntrada, String rg, boolean taNaEmpresa) {
        super(nome, email, telefone);
        this.dp = dp;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.taNaEmpresa = taNaEmpresa;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isFoiEmbora() {
        return taNaEmpresa;
    }

    public void setFoiEmbora(boolean foiEmbora) {
        this.taNaEmpresa = foiEmbora;
    }

    public void bonificar(double valor){
        double alterarSal = getSalario();
        alterarSal += valor;
        setSalario(alterarSal);
    }

    public void demitir (){
        this.taNaEmpresa = false;
    }

    public String mostrarDados(){
        return " - Dados Funcionario:\nNome: "+getNome()+"\nEmail: "+getEmail()+"\nTelfone: "+getTelefone()+"\nDepartamento: "+getDp()+"\nSalário: "+getSalario()+"\nData Contratação: "+getDataEntrada()+"\nRG: "+getRg()+"\nAinda é funcionário: "+isFoiEmbora();
    }
}
