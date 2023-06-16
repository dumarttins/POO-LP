package br.com.sorveteria.classes;

import javax.swing.JLabel;
import java.util.List;

public class Acrescimo {
    private String [] listAcrescimoA =  {"LeiteEmPo", "Granola", "Banana", "Confete", "LeiteCondesado"};
    private String [] listAcrescimoS = {"Confete","Granulado", "BalaFine", "CanudoWaffle", "Ovamaltine"};
    private double acrescimoValor;

    public double getAcrescimoValor() {
        return acrescimoValor;
    }

    public void setAcrescimoValor(double acrescimoValor) {
        this.acrescimoValor = acrescimoValor;
    }

    public void resumoAcrescimoA(JLabel label, List<Boolean> list, String tamanho){
        StringBuilder concat = new StringBuilder();
        for(int i=0 ; i < list.size() ; i++){
            if(list.get(i))
                concat.append(listAcrescimoA[i]+"<br>");
        }
        String textLabel = "<html>"+tamanho+"<br>"+concat.toString()+"</html>";
        label.setText(textLabel);
    }

    public void resumoACrescimoS(JLabel label, List<Boolean> list, String tamanho){
        StringBuilder concat = new StringBuilder();
        for(int i=0 ; i < list.size() ; i++){
            if(list.get(i))
                concat.append(listAcrescimoS[i]+"<br>");
        }
        String textLabel = "<html>"+tamanho+"<br>"+concat.toString()+"</html>";
        label.setText(textLabel);
    }
}
