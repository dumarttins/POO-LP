import javax.swing.*;
import java.awt.Container;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

public class AluguelCarros extends JFrame {
    public static void main(String[] args) {
        AluguelCarros p1 = new AluguelCarros();
        p1.PainelVeiculos();
    }
    public void PainelVeiculos(){
        Container janela = getContentPane();
        setLayout(null);

        JLabel labelTituloM = new JLabel("Aluguel de Veículos");
        JLabel labelTitulo2 = new JLabel("Dados Cliente: ");
        JLabel nome = new JLabel("Nome: ");
        JLabel cpf = new JLabel("CPF: ");
        JLabel tel = new JLabel("Telefone: ");
        JLabel labelTitulo3 = new JLabel("Dados do Carro: ");
        JLabel nomeC = new JLabel("Nome: ");
        JLabel placa = new JLabel("Placa: ");
        JLabel ano = new JLabel("Ano: ");
        JLabel dataLocacao = new JLabel("Data de Locação:");
        JLabel dataEntrega = new JLabel("Data da Entrega:");
        labelTituloM.setBounds(50,40,200,20);
        labelTitulo2.setBounds(50,80,100,20);
        nome.setBounds(50,120,100,20);
        cpf.setBounds(50,160,100,20);
        tel.setBounds(50,200,100,20);
        labelTitulo3.setBounds(50,240,100,20);
        nomeC.setBounds(50,280,100,20);
        placa.setBounds(50,320,100,20);
        ano.setBounds(50,360,100,20);
        dataLocacao.setBounds(50,400,100,20);
        dataEntrega.setBounds(50,440,100,20);

        MaskFormatter mascaraNome = null;
        MaskFormatter mascaraCPF = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraNomeC = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraLocacao = null;
        MaskFormatter mascaraEntrega = null;

        try{
            mascaraNome = new MaskFormatter("??????????????????????");
            mascaraCPF =  new MaskFormatter("#########-##");
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraNomeC =  new MaskFormatter("???????????");
            mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraAno = new MaskFormatter("####");
            mascaraLocacao = new MaskFormatter("##/##/####");
            mascaraEntrega = new MaskFormatter("##/##/####");
            mascaraCPF.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('_');
            mascaraLocacao.setPlaceholderCharacter('_');
            mascaraEntrega.setPlaceholderCharacter('_');

        }
        catch (ParseException excp){
            System.err.println("Erro na formatação: "+excp.getMessage());
            System.exit(-1);
        }

        JFormattedTextField campoNome = new JFormattedTextField(mascaraNome);
        JFormattedTextField campoCPF = new JFormattedTextField(mascaraCPF);
        JFormattedTextField campoTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField campoNomeC = new JFormattedTextField(mascaraNomeC);
        JFormattedTextField campoPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField campoAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField campoLocacao = new JFormattedTextField(mascaraLocacao);
        JFormattedTextField campoEntrega = new JFormattedTextField(mascaraEntrega);
        campoNome.setBounds(150,120,100,20);
        campoCPF.setBounds(150,160,100,20);
        campoTel.setBounds(150,200,100,20);
        campoNomeC.setBounds(150,280,100,20);
        campoPlaca.setBounds(150,320,100,20);
        campoAno.setBounds(150,360,100,20);
        campoLocacao.setBounds(150,400,100,20);
        campoEntrega.setBounds(150,440,100,20);

        janela.add(labelTituloM);
        janela.add(labelTitulo2);
        janela.add(nome);
        janela.add(cpf);
        janela.add(tel);
        janela.add(labelTitulo3);
        janela.add(nomeC);
        janela.add(placa);
        janela.add(ano);
        janela.add(dataLocacao);
        janela.add(dataEntrega);
        janela.add(campoNome);
        janela.add(campoCPF);
        janela.add(campoTel);
        janela.add(campoNomeC);
        janela.add(campoPlaca);
        janela.add(campoAno);
        janela.add(campoLocacao);
        janela.add(campoEntrega);

        setSize(600,600);
        setVisible(true);



    }
}
