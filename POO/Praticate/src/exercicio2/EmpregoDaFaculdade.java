package exercicio2;

public class EmpregoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    double getGastos(){
        return this.salario = this.salario+(this.horasAula*40);
    }

    String getInfo(){
        return "Nome: "+this.nome+" com salário "+salario;
    }

    double getSalario(){
        return salario;
    }

    public EmpregoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    /*public static void main(String[] args) {
        EmpregoDaFaculdade aluno1 = new EmpregoDaFaculdade("Eduardo", 3500,160);
        System.out.println(aluno1.getGastos());
        System.out.println(aluno1.getInfo());
    }*/
}