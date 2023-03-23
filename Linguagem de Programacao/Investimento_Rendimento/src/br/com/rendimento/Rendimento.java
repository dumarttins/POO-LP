package br.com.rendimento;

public class Rendimento {
    private double investI;
    private double taxaI;
    private int numMeses;

    public Rendimento() {
    }

    public void setInvestI(double investI) {
        this.investI = investI;
    }

    public void setTaxaI(double taxaI) {
        this.taxaI = taxaI;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    public int getNumMeses() {
        return numMeses;
    }


    public double calcularendi(){
        double valInvest = this.investI;
        int c = 1;
        for(int i=0; i < getNumMeses(); i++){
            valInvest += valInvest * this.taxaI / 100;
            System.out.printf("Mês "+c+": R$ %.2f\n", valInvest);
            c++;
        }
        return valInvest - this.investI;
    }

}
