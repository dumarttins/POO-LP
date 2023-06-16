package br.com.sorveteria.classes;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class Interface {
    private double totalAcrescimo = 0;
    private boolean lp, granola, banana, confete, lc, granulado, balaFine, cw, ovoMaltine;
    private String metodoPagamento = "Cartão de Crédito";
    private String tamanho = "300";
    Acai pedidoAcai = new Acai();
    Sorvete sorvete = new Sorvete();
    Acrescimo acrescimo = new Acrescimo();
    Pedido pedido = new Pedido();
    Excecao exception = new Excecao();
    Registro registrar = new Registro();



    //Contrutor par iniciar minha tela principal
    public Interface(){
        //Inicializando meu Jframe
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,500);
        jFrame.setTitle("Sorvetaça");
        //jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        //Implementação titulos tela principal
        JLabel titleMainScreen = new JLabel("MENU");
        titleMainScreen.setBounds(100,25,600,55);
        titleMainScreen.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        titleMainScreen.setHorizontalAlignment(SwingConstants.CENTER);
        titleMainScreen.setFont(new Font("Arial",Font.BOLD,45));
        JLabel subTitleMainScreen = new JLabel("Selecione a opção desejada:");
        subTitleMainScreen.setBounds(200,100,400,30);
        subTitleMainScreen.setHorizontalAlignment(SwingConstants.CENTER);
        subTitleMainScreen.setFont(new Font("Arial",Font.BOLD,25));

        //Puxando as imagens
        ImageIcon acaiPNG = new ImageIcon("D:\\acai.jpg");
        ImageIcon sorvetePNG = new ImageIcon("D:\\sorvete.jpg");

        //Jlabels para inputar as imagens
        JLabel inserindoImagemAcai = new JLabel(acaiPNG);
        inserindoImagemAcai.setBounds(150,200,201,201);
        inserindoImagemAcai.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JLabel inserindoImgSorvete = new JLabel(sorvetePNG);
        inserindoImgSorvete.setBounds(450,200,201,201);
        inserindoImgSorvete.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        //Implemtação do botão Acaí
        JButton acai = new JButton("Acai");
        acai.setBounds(150,400,200,30);
        acai.setFont(new Font("Arial",Font.BOLD,20));

        //Implemtação do botão Sorvete
        JButton sorvete = new JButton("Sorvete");
        sorvete.setBounds(450,400,200,30);
        sorvete.setFont(new Font("Arial",Font.BOLD,20));

        jFrame.add(acai);
        jFrame.add(sorvete);
        jFrame.add(inserindoImagemAcai);
        jFrame.add(inserindoImgSorvete);
        jFrame.add(titleMainScreen);
        jFrame.add(subTitleMainScreen);

        //Chamada dos metodos abaixo consequentemente ao botão clicado
        acai.addActionListener(this::opcaoAcai);
        sorvete.addActionListener(actionEvent -> {
            try {
                opcaoSorvete();
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        });

        jFrame.setVisible(true);
    }
    private double extrairValorNumerico(String texto){
        String numero = texto.replaceAll("[^0-9]", "");
        return Double.parseDouble(numero);
    }

    //Método de implementação de interface caso o usuário escolha a opção Sorvete
    private void opcaoSorvete() throws ParseException {
        //Inicializando meu Jframe
        JFrame jFrametwoA = new JFrame();
        jFrametwoA.setVisible(true);
        jFrametwoA.setSize(800,500);
        jFrametwoA.setTitle("Sorvetaça");
        jFrametwoA.setResizable(false);
        jFrametwoA.setLocationRelativeTo(null);
        jFrametwoA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrametwoA.setLayout(null);

        //Titulos
        JLabel titleMain = new JLabel("SORVETE");
        titleMain.setBounds(100,25,600,55);
        titleMain.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        titleMain.setHorizontalAlignment(SwingConstants.CENTER);
        titleMain.setFont(new Font("Arial",Font.BOLD,45));
        JLabel subTitle = new JLabel("Selecione a opção de acrescimo desejada:");
        subTitle.setBounds(380,130,350,20);
        //subTitle.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        subTitle.setHorizontalAlignment(SwingConstants.CENTER);
        subTitle.setFont(new Font("Arial",Font.BOLD,15));

        //Jlabels para parte de Preço
        JLabel inputPeso = new JLabel("PESO:");
        inputPeso.setBounds(100,200,100,30);
        inputPeso.setFont(new Font("Arial",Font.BOLD,25));
        JLabel inputValorP = new JLabel("Valor Parcial: ");
        inputValorP.setBounds(50,260,150,25);
        inputValorP.setFont(new Font("Arial",Font.BOLD,20));
        JLabel resultValorP = new JLabel();
        JLabel informationPeso = new JLabel("Kg do sorvete: R$ 50,00");
        informationPeso.setBounds(150,350,180,20);
        informationPeso.setFont(new Font("Arial",Font.BOLD,15));
        informationPeso.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        //JLabels que mostram as opções e valores referente a tamanho
        MaskFormatter pesoKg = new MaskFormatter("#,###g");
        JTextField peso = new JFormattedTextField(pesoKg);
        peso.setBounds(210,200,100,30);
        peso.setFont(new Font("Arial",Font.BOLD,25));


        //Jlabels que mostram as opções de acréscimos
        JLabel opcaoConfete = new JLabel("CONFETE");
        opcaoConfete.setBounds(450,170,250,30);
        opcaoConfete.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoConfete.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoConfete.setFont(new Font("Arial",Font.BOLD,20));
        JLabel opcaoGranulado = new JLabel("GRANULADO");
        opcaoGranulado.setBounds(450,200,250,30);
        opcaoGranulado.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoGranulado.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoGranulado.setFont(new Font("Arial",Font.BOLD,20));
        JLabel opcaoBalaFini = new JLabel("BALA FINI");
        opcaoBalaFini.setBounds(450,230,250,30);
        opcaoBalaFini.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoBalaFini.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoBalaFini.setFont(new Font("Arial",Font.BOLD,20));
        JLabel opcaoCanudoWaffle = new JLabel("CANUDO WAFFLE");
        opcaoCanudoWaffle.setBounds(450,260,250,30);
        opcaoCanudoWaffle.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoCanudoWaffle.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoCanudoWaffle.setFont(new Font("Arial",Font.BOLD,20));
        JLabel opcaoOvomaltine = new JLabel("OVOMALTINE");
        opcaoOvomaltine.setBounds(450,290,250,30);
        opcaoOvomaltine.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoOvomaltine.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoOvomaltine.setFont(new Font("Arial",Font.BOLD,20));
        JLabel informationAcrescimo = new JLabel("Acrescimo: R$ 5,00 por item");
        informationAcrescimo.setBounds(450,335,250,30);
        informationAcrescimo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        informationAcrescimo.setHorizontalAlignment(SwingConstants.CENTER);
        informationAcrescimo.setFont(new Font("Arial",Font.BOLD,15));


        //CheckBoxs para selecionar os acrécimos desejados
        JCheckBox boxConfete = new JCheckBox();
        boxConfete.setBounds(420,170,30,30);
        boxConfete.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxConfete.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox boxGranola = new JCheckBox();
        boxGranola.setBounds(420,200,30,30);
        boxGranola.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxGranola.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox boxBalaFini = new JCheckBox();
        boxBalaFini.setBounds(420,230,30,30);
        boxBalaFini.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxBalaFini.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox boxCanudoWaffle = new JCheckBox();
        boxCanudoWaffle.setBounds(420,260,30,30);
        boxCanudoWaffle.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxCanudoWaffle.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox boxOvomaltine = new JCheckBox();
        boxOvomaltine.setBounds(420,290,30,30);
        boxOvomaltine.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxOvomaltine.setHorizontalAlignment(SwingConstants.CENTER);


        //Botões para calcular o valor parcial e passar para a tela RESUMO
        JButton nextBotao = new JButton("Próximo");
        nextBotao.setBounds(600,400,150,50);
        nextBotao.setFont(new Font("Arial",Font.BOLD,20));
        JButton calcularbutton = new JButton("Calcular");
        calcularbutton.setBounds(210,233,100,15);
        JButton validacaoAcrescimos = new JButton("Validar Acrecimos");
        validacaoAcrescimos.setBounds(450,370,250,20);
        validacaoAcrescimos.setFont(new Font("Arial",Font.BOLD,20));


        //Chamada dos labels e checkboxs no meu frame
        jFrametwoA.add(titleMain);
        jFrametwoA.add(subTitle);
        jFrametwoA.add(inputPeso);
        jFrametwoA.add(informationPeso);
        jFrametwoA.add(inputValorP);
        jFrametwoA.add(peso);
        jFrametwoA.add(opcaoConfete);
        jFrametwoA.add(opcaoGranulado);
        jFrametwoA.add(opcaoBalaFini);
        jFrametwoA.add(opcaoCanudoWaffle);
        jFrametwoA.add(opcaoOvomaltine);
        jFrametwoA.add(informationAcrescimo);
        jFrametwoA.add(boxConfete);
        jFrametwoA.add(boxGranola);
        jFrametwoA.add(boxBalaFini);
        jFrametwoA.add(boxCanudoWaffle);
        jFrametwoA.add(boxOvomaltine);
        jFrametwoA.add(nextBotao);
        jFrametwoA.add(calcularbutton);
        jFrametwoA.add(validacaoAcrescimos);



        //ActionListener para calcular o valor dos acrescimos
        ActionListener calculaAcrescimo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boxConfete.isSelected()) {
                    confete = true;
                    totalAcrescimo += 5;
                }
                if(boxGranola.isSelected()) {
                    granulado = true;
                    totalAcrescimo += 5;
                }
                if(boxBalaFini.isSelected()) {
                    balaFine = true;
                    totalAcrescimo += 5;
                }
                if(boxCanudoWaffle.isSelected()){
                    cw = true;
                    totalAcrescimo += 5;
                }
                if(boxOvomaltine.isSelected()){
                    ovoMaltine = true;
                    totalAcrescimo += 5;
                }
                acrescimo.setAcrescimoValor(totalAcrescimo);

            }
        };

        ActionListener calculoParcial = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = extrairValorNumerico(peso.getText());
                sorvete.setPeso(valor);
                resultValorP.setText(String.format("R$: %.2f",(sorvete.calculaPreco())));
                jFrametwoA.add(resultValorP);
                resultValorP.setBounds(208,258,220,30);
                resultValorP.setFont(new Font("Arial",Font.BOLD,25));
                sorvete.setValor(sorvete.calculaPreco());
            }
        };
        calcularbutton.addActionListener(calculoParcial);
        validacaoAcrescimos.addActionListener(calculaAcrescimo);
        nextBotao.addActionListener(actionEvent -> {
            try {
                resumoSorvete(actionEvent);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });

    }

    private void resumoSorvete(ActionEvent actionEvent) throws SQLException {
        List<Boolean> listAcrescimo = List.of(confete,granulado,balaFine,cw,ovoMaltine);
        String peso = String.format("%.0fg",sorvete.getPeso());
        double valorTotalPedido = sorvete.getValor()+totalAcrescimo;

        JFrame jFrameresume = new JFrame();
        jFrameresume.setVisible(true);
        jFrameresume.setSize(800,500);
        jFrameresume.setTitle("Sorvetaça");
        jFrameresume.setResizable(false);
        jFrameresume.setLocationRelativeTo(null);
        jFrameresume.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameresume.setLayout(null);

        JLabel titleMain =  new JLabel("RESUMO PEDIDO");
        titleMain.setBounds(50,25,700,55);
        titleMain.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        titleMain.setHorizontalAlignment(SwingConstants.CENTER);
        titleMain.setFont(new Font("Arial",Font.BOLD,45));

        //Painel onde estão os labels com as informações do pedido
        JPanel resumoinfo = new JPanel();
        resumoinfo.setBounds(50,90,700,350);
        resumoinfo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        resumoinfo.setLayout(null);
        JPanel outroPanel = new JPanel();
        outroPanel.setBounds(0,50,350,250);
        outroPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        outroPanel.setLayout(null);


        JLabel itensSelecionados = new JLabel("ITENS SELECIONADOS:");
        itensSelecionados.setBounds(0,0,350,50);
        itensSelecionados.setFont(new Font("Arial",Font.BOLD,20));
        itensSelecionados.setHorizontalAlignment(SwingConstants.CENTER);
        itensSelecionados.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JLabel formaPagamento = new JLabel("FORMA DE PAGAMENTO:");
        formaPagamento.setBounds(350,0,350,50);
        formaPagamento.setFont(new Font("Arial",Font.BOLD,20));
        formaPagamento.setHorizontalAlignment(SwingConstants.CENTER);
        formaPagamento.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JLabel escolha1 = new JLabel();
        escolha1.setBounds(0,0,350,250);
        escolha1.setFont(new Font("Arial",Font.BOLD,20));
        escolha1.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel valorTotal = new JLabel("VALOR TOTAL:");
        valorTotal.setBounds(0,300,350,50);
        valorTotal.setFont(new Font("Arial",Font.BOLD,20));
        valorTotal.setHorizontalAlignment(SwingConstants.CENTER);
        valorTotal.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JLabel totalPedido = new JLabel(String.format("R$: %.2f",valorTotalPedido));
        totalPedido.setBounds(350,300,200,50);
        totalPedido.setFont(new Font("Arial",Font.BOLD,20));
        totalPedido.setHorizontalAlignment(SwingConstants.CENTER);
        totalPedido.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        //Botão CONCLUIR
        JButton concluir = new JButton("CONCLUIR");
        concluir.setBounds(550,300,150,50);
        concluir.setFont(new Font("Arial",Font.BOLD,20));

        //CheckBoxs com opções de pagamentos
        JCheckBox cartaoCredito = new JCheckBox("Cartão de crédito");
        cartaoCredito.setBounds(380,90,250,50);
        cartaoCredito.setFont(new Font("Arial",Font.BOLD,20));
        JCheckBox cartaoDebito = new JCheckBox("Cartão de débito");
        cartaoDebito.setBounds(380,145,250,50);
        cartaoDebito.setFont(new Font("Arial",Font.BOLD,20));
        JCheckBox dinheiro = new JCheckBox("Dinheiro");
        dinheiro.setBounds(380,195,250,50);
        dinheiro.setFont(new Font("Arial",Font.BOLD,20));
        JCheckBox pix = new JCheckBox("PIX");
        pix.setBounds(380,245,250,50);
        pix.setFont(new Font("Arial",Font.BOLD,20));

        acrescimo.resumoACrescimoS(escolha1,listAcrescimo, peso);

        ActionListener checkboxfalse = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == cartaoCredito){
                    cartaoDebito.setSelected(false);
                    dinheiro.setSelected(false);
                    pix.setSelected(false);
                    metodoPagamento = "Cartão de crédito";
                }
                else if(e.getSource() == cartaoDebito){
                    cartaoCredito.setSelected(false);
                    dinheiro.setSelected(false);
                    pix.setSelected(false);
                    metodoPagamento = "Cartão de debito";
                }
                else if(e.getSource() == dinheiro){
                    cartaoDebito.setSelected(false);
                    cartaoCredito.setSelected(false);
                    pix.setSelected(false);
                    metodoPagamento = "Dinheiro";
                }
                else if(e.getSource() == pix){
                    cartaoDebito.setSelected(false);
                    cartaoCredito.setSelected(false);
                    dinheiro.setSelected(false);
                    metodoPagamento = "PIX";
                }
            }
        };

        cartaoCredito.addActionListener(checkboxfalse);
        cartaoDebito.addActionListener(checkboxfalse);
        dinheiro.addActionListener(checkboxfalse);
        pix.addActionListener(checkboxfalse);

        //Chamada dos labels no meu Panel
        outroPanel.add(escolha1);


        //Chamada dos labels e panels no meu Frame
        resumoinfo.add(itensSelecionados);
        resumoinfo.add(valorTotal);
        resumoinfo.add(formaPagamento);
        resumoinfo.add(totalPedido);
        resumoinfo.add(concluir);
        resumoinfo.add(cartaoCredito);
        resumoinfo.add(cartaoDebito);
        resumoinfo.add(dinheiro);
        resumoinfo.add(pix);
        resumoinfo.add(outroPanel);


        //Chamada dos labels e checkboxs no meu Frame
        jFrameresume.add(titleMain);
        jFrameresume.add(resumoinfo);
        concluir.addActionListener(this::obrigado);
        String produto = "Sorvete";

        registrar.inseriPedido(2,peso,produto,totalAcrescimo, 2,metodoPagamento);

    }


    //Método de implementação de interface caso o usuário escolha a opção Acaí
    public void opcaoAcai(ActionEvent e) {
        //Inicializando meu Jframe
        JFrame jFrametwoB = new JFrame();
        jFrametwoB.setVisible(true);
        jFrametwoB.setSize(800,500);
        jFrametwoB.setTitle("Sorvetaça");
        jFrametwoB.setResizable(false);
        jFrametwoB.setLocationRelativeTo(null);
        jFrametwoB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrametwoB.setLayout(null);

        //Titulos
        JLabel titleMain = new JLabel("AÇAÍ");
        titleMain.setBounds(100,25,600,55);
        titleMain.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        titleMain.setHorizontalAlignment(SwingConstants.CENTER);
        titleMain.setFont(new Font("Arial",Font.BOLD,45));
        JLabel subTitle = new JLabel("Selecione a opção desejada:");
        subTitle.setBounds(200,100,400,30);
        //subTitle.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        subTitle.setHorizontalAlignment(SwingConstants.CENTER);
        subTitle.setFont(new Font("Arial",Font.BOLD,25));


        //JLabels que mostram as opções e valores referente a tamanho
        JLabel opcao300ml = new JLabel("300ML R$8,00");
        opcao300ml.setBounds(90,180,200,45);
        opcao300ml.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcao300ml.setHorizontalAlignment(SwingConstants.CENTER);
        opcao300ml.setFont(new Font("Arial",Font.BOLD,25));
        JLabel opcao500ml = new JLabel("500ML R$10,00");
        opcao500ml.setBounds(90,240,200,45);
        opcao500ml.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcao500ml.setHorizontalAlignment(SwingConstants.CENTER);
        opcao500ml.setFont(new Font("Arial",Font.BOLD,25));
        JLabel opcao700ml = new JLabel("700ML R$12,00");
        opcao700ml.setBounds(90,300,200,45);
        opcao700ml.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcao700ml.setHorizontalAlignment(SwingConstants.CENTER);
        opcao700ml.setFont(new Font("Arial",Font.BOLD,25));


        //Jlabels que mostram as opções de acréscimos
        JLabel opcaoLP = new JLabel("LEITE EM PÓ");
        opcaoLP.setBounds(450,170,250,30);
        opcaoLP.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoLP.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoLP.setFont(new Font("Arial",Font.BOLD,20));
        JLabel opcaoGranola = new JLabel("GRANOLA");
        opcaoGranola.setBounds(450,200,250,30);
        opcaoGranola.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoGranola.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoGranola.setFont(new Font("Arial",Font.BOLD,20));
        JLabel opcaoBanana = new JLabel("BANANA");
        opcaoBanana.setBounds(450,230,250,30);
        opcaoBanana.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoBanana.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoBanana.setFont(new Font("Arial",Font.BOLD,20));
        JLabel opcaoConfete = new JLabel("CONFETE");
        opcaoConfete.setBounds(450,260,250,30);
        opcaoConfete.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoConfete.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoConfete.setFont(new Font("Arial",Font.BOLD,20));
        JLabel opcaoLC = new JLabel("LEITE CONDENSADO");
        opcaoLC.setBounds(450,290,250,30);
        opcaoLC.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        opcaoLC.setHorizontalAlignment(SwingConstants.CENTER);
        opcaoLC.setFont(new Font("Arial",Font.BOLD,20));
        JLabel informationAcrescimo = new JLabel("Acrescimo: R$ 2,00 por item");
        informationAcrescimo.setBounds(450,335,250,30);
        informationAcrescimo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        informationAcrescimo.setHorizontalAlignment(SwingConstants.CENTER);
        informationAcrescimo.setFont(new Font("Arial",Font.BOLD,15));

        //CheckBoxs para selecionar o tamanho desejado
        JCheckBox box300ml = new JCheckBox();
        box300ml.setBounds(60,190,30,30);
        box300ml.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        box300ml.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox box500ml = new JCheckBox();
        box500ml.setBounds(60,245,30,30);
        box500ml.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        box500ml.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox box700ml = new JCheckBox();
        box700ml.setBounds(60,300,30,30);
        box700ml.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        box700ml.setHorizontalAlignment(SwingConstants.CENTER);

        //CheckBoxs para selecionar os acrécimos desejados
        JCheckBox boxLP = new JCheckBox();
        boxLP.setBounds(420,170,30,30);
        boxLP.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxLP.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox boxGranola = new JCheckBox();
        boxGranola.setBounds(420,200,30,30);
        boxGranola.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxGranola.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox boxBanana = new JCheckBox();
        boxBanana.setBounds(420,230,30,30);
        boxBanana.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxBanana.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox boxConfete = new JCheckBox();
        boxConfete.setBounds(420,260,30,30);
        boxConfete.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxConfete.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox boxLC = new JCheckBox();
        boxLC.setBounds(420,290,30,30);
        boxLC.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        boxLC.setHorizontalAlignment(SwingConstants.CENTER);

        JButton nextBotao = new JButton("Próximo");
        nextBotao.setBounds(600,400,150,50);
        nextBotao.setFont(new Font("Arial",Font.BOLD,20));
        JButton validacaoAcrescimos = new JButton("Validar Acrecimos");
        validacaoAcrescimos.setBounds(450,370,250,20);
        validacaoAcrescimos.setFont(new Font("Arial",Font.BOLD,20));


        //Chamada dos labels e checkboxs no meu frame
        jFrametwoB.add(titleMain);
        jFrametwoB.add(subTitle);
        jFrametwoB.add(opcao300ml);
        jFrametwoB.add(opcao500ml);
        jFrametwoB.add(opcao700ml);
        jFrametwoB.add(opcaoLP);
        jFrametwoB.add(opcaoGranola);
        jFrametwoB.add(opcaoBanana);
        jFrametwoB.add(opcaoConfete);
        jFrametwoB.add(opcaoLC);
        jFrametwoB.add(informationAcrescimo);
        jFrametwoB.add(box300ml);
        jFrametwoB.add(box500ml);
        jFrametwoB.add(box700ml);
        jFrametwoB.add(boxLP);
        jFrametwoB.add(boxGranola);
        jFrametwoB.add(boxBanana);
        jFrametwoB.add(boxConfete);
        jFrametwoB.add(boxLC);
        jFrametwoB.add(nextBotao);
        jFrametwoB.add(validacaoAcrescimos);

        //Implentação de um ActionListerner para deixer que o usuário marque somente uma checkBox nas opções de tamanho
        ActionListener checkboxfalse = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == box300ml){
                    box500ml.setSelected(false);
                    box700ml.setSelected(false);
                    pedidoAcai.setValor(8);
                    pedidoAcai.setTamanho("300ml");
                }
                else if(e.getSource() == box500ml){
                    box700ml.setSelected(false);
                    box300ml.setSelected(false);
                    pedidoAcai.setValor(10);
                    pedidoAcai.setTamanho("500ml");
                }
                else if(e.getSource() == box700ml){
                    box500ml.setSelected(false);
                    box300ml.setSelected(false);
                    pedidoAcai.setValor(12);
                    pedidoAcai.setTamanho("700ml");
                }
            }
        };

        //Chamando o metodo acima nas checkboxs
        box300ml.addActionListener(checkboxfalse);
        box500ml.addActionListener(checkboxfalse);
        box700ml.addActionListener(checkboxfalse);

        ActionListener calculaAcrescimo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boxLP.isSelected()) {
                    lp = true;
                    totalAcrescimo += 2;
                }
                if(boxGranola.isSelected()) {
                    granola = true;
                    totalAcrescimo += 2;
                }
                if(boxBanana.isSelected()) {
                    banana = true;
                    totalAcrescimo += 2;
                }
                if(boxConfete.isSelected()){
                    confete = true;
                    totalAcrescimo += 2;
                }
                if(boxLC.isSelected()){
                    lc = true;
                    totalAcrescimo += 2;
                }
                acrescimo.setAcrescimoValor(totalAcrescimo);
            }
        };
        validacaoAcrescimos.addActionListener(calculaAcrescimo);
        nextBotao.addActionListener(actionEvent -> {
            try {
                resumoAcai(actionEvent);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });



    }

    private void resumoAcai(ActionEvent actionEvent) throws SQLException {
        List<Boolean> listAcrescimo = List.of(lp,granola,banana,confete,lc);
        double valorTotalPedido = pedido.valorTotalP(pedidoAcai.getTamanho(),totalAcrescimo);

        JFrame jFrameresume = new JFrame();
        jFrameresume.setVisible(true);
        jFrameresume.setSize(800,500);
        jFrameresume.setTitle("Sorvetaça");
        jFrameresume.setResizable(false);
        jFrameresume.setLocationRelativeTo(null);
        jFrameresume.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameresume.setLayout(null);

        JLabel titleMain =  new JLabel("RESUMO PEDIDO");
        titleMain.setBounds(50,25,700,55);
        titleMain.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        titleMain.setHorizontalAlignment(SwingConstants.CENTER);
        titleMain.setFont(new Font("Arial",Font.BOLD,45));

        //Painel onde estão os labels com as informações do pedido
        JPanel resumoinfo = new JPanel();
        resumoinfo.setBounds(50,90,700,350);
        resumoinfo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        resumoinfo.setLayout(null);
        JPanel outroPanel = new JPanel();
        outroPanel.setBounds(0,50,350,250);
        outroPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        outroPanel.setLayout(null);


        JLabel itensSelecionados = new JLabel("ITENS SELECIONADOS:");
        itensSelecionados.setBounds(0,0,350,50);
        itensSelecionados.setFont(new Font("Arial",Font.BOLD,20));
        itensSelecionados.setHorizontalAlignment(SwingConstants.CENTER);
        itensSelecionados.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JLabel formaPagamento = new JLabel("FORMA DE PAGAMENTO:");
        formaPagamento.setBounds(350,0,350,50);
        formaPagamento.setFont(new Font("Arial",Font.BOLD,20));
        formaPagamento.setHorizontalAlignment(SwingConstants.CENTER);
        formaPagamento.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JLabel escolha1 = new JLabel();
        escolha1.setBounds(0,0,350,250);
        escolha1.setFont(new Font("Arial",Font.BOLD,20));
        escolha1.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel valorTotal = new JLabel("VALOR TOTAL:");
        valorTotal.setBounds(0,300,350,50);
        valorTotal.setFont(new Font("Arial",Font.BOLD,20));
        valorTotal.setHorizontalAlignment(SwingConstants.CENTER);
        valorTotal.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JLabel totalPedido = new JLabel(String.format("R$: %.2f",valorTotalPedido));
        totalPedido.setBounds(350,300,200,50);
        totalPedido.setFont(new Font("Arial",Font.BOLD,20));
        totalPedido.setHorizontalAlignment(SwingConstants.CENTER);
        totalPedido.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        //Botão CONCLUIR
        JButton concluir = new JButton("CONCLUIR");
        concluir.setBounds(550,300,150,50);
        concluir.setFont(new Font("Arial",Font.BOLD,20));

        //CheckBoxs com opções de pagamentos
        JCheckBox cartaoCredito = new JCheckBox("Cartão de crédito");
        cartaoCredito.setBounds(380,90,250,50);
        cartaoCredito.setFont(new Font("Arial",Font.BOLD,20));
        JCheckBox cartaoDebito = new JCheckBox("Cartão de débito");
        cartaoDebito.setBounds(380,145,250,50);
        cartaoDebito.setFont(new Font("Arial",Font.BOLD,20));
        JCheckBox dinheiro = new JCheckBox("Dinheiro");
        dinheiro.setBounds(380,195,250,50);
        dinheiro.setFont(new Font("Arial",Font.BOLD,20));
        JCheckBox pix = new JCheckBox("PIX");
        pix.setBounds(380,245,250,50);
        pix.setFont(new Font("Arial",Font.BOLD,20));

        acrescimo.resumoAcrescimoA(escolha1,listAcrescimo, pedidoAcai.getTamanho());

        ActionListener checkboxfalse = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == cartaoCredito){
                    cartaoDebito.setSelected(false);
                    dinheiro.setSelected(false);
                    pix.setSelected(false);
                }
                else if(e.getSource() == cartaoDebito){
                    cartaoCredito.setSelected(false);
                    dinheiro.setSelected(false);
                    pix.setSelected(false);
                }
                else if(e.getSource() == dinheiro){
                    cartaoDebito.setSelected(false);
                    cartaoCredito.setSelected(false);
                    pix.setSelected(false);
                }
                else if(e.getSource() == pix){
                    cartaoDebito.setSelected(false);
                    cartaoCredito.setSelected(false);
                    dinheiro.setSelected(false);
                }
            }
        };

        cartaoCredito.addActionListener(checkboxfalse);
        cartaoDebito.addActionListener(checkboxfalse);
        dinheiro.addActionListener(checkboxfalse);
        pix.addActionListener(checkboxfalse);

        //Chamada dos labels no meu Panel
        outroPanel.add(escolha1);

        //Chamada dos labels e panels no meu Frame
        resumoinfo.add(itensSelecionados);
        resumoinfo.add(valorTotal);
        resumoinfo.add(formaPagamento);
        resumoinfo.add(totalPedido);
        resumoinfo.add(concluir);
        resumoinfo.add(cartaoCredito);
        resumoinfo.add(cartaoDebito);
        resumoinfo.add(dinheiro);
        resumoinfo.add(pix);
        resumoinfo.add(outroPanel);

        String produto = "Acai";
        //Chamada dos labels e checkboxs no meu Frame
        jFrameresume.add(titleMain);
        jFrameresume.add(resumoinfo);
        concluir.addActionListener(this::obrigado);
        //registrar.inseriPedido(2,tamanho,produto,totalAcrescimo, 2,metodoPagamento);

    }
    private void obrigado (ActionEvent actionEvent){
        JFrame jFrameFinal = new JFrame();
        jFrameFinal.setVisible(true);
        jFrameFinal.setSize(800,500);
        jFrameFinal.setTitle("Sorvetaça");
        jFrameFinal.setResizable(false);
        jFrameFinal.setLocationRelativeTo(null);
        jFrameFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameFinal.setLayout(null);

        JLabel vlwBrigaoo = new JLabel("PEDIDO CONCLUIDO!");
        vlwBrigaoo.setBounds(0,0,800,500);
        vlwBrigaoo.setFont(new Font("Arial",Font.BOLD,50));
        vlwBrigaoo.setHorizontalAlignment(SwingConstants.CENTER);

        jFrameFinal.add(vlwBrigaoo);
    }

}