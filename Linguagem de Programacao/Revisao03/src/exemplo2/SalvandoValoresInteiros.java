package exemplo2;
import javax.swing.JOptionPane;
public class SalvandoValoresInteiros {
    public static void main(String[] args) {

        int valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor A: "));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor B: "));

        int resultado = valorA * valorB;

        JOptionPane.showMessageDialog(null,"Resultado: "+resultado,"Multiplicação",JOptionPane.WARNING_MESSAGE);
    }
}
