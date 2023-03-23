package exercicio3;

public class Aluno {
    String nome, matricula, curso;
    double notaAV1, notaAV2, notaAVE;
    int periodo;

    public Aluno(String nome, String matricula, String curso, double notaAV1, double notaAV2, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.periodo = periodo;
    }

    public void alteraNotaAV1(double nota){
        this.notaAV1 = nota;
    }
    public void alterarNotaAV2(double nota){
        this.notaAV2 = nota;
    }
    public void alterarNotaAVE(double nota){
        this.notaAVE = nota;
    }

    public void avaliarAluno(){
        if ((notaAV1+notaAV2)/2 >= 60){
            System.out.println("Aluno APROVADO!");
        }
        else{
            System.out.println("RECUPERAÇAO");
        }
    }

    public void avaliarRecuperacao(){
        if((notaAV1+notaAV2+notaAVE)/2 >= 60){
            System.out.println("Aluno APROVADO!");
        }
        else{
            System.out.println("Aluno REPROVADO!");
        }
    }

}
