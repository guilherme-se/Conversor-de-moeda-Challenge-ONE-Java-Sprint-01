package conversor;

import javax.swing.*;

public class Interface extends JFrame {

    public Interface(){

        JOptionPane.showMessageDialog(null, "Bem-vindo ao conversor de moedas");

        String[] moedas = {"Real para Dolar",
                           "Dolar para Real",
                           "Real para Euro",
                           "Euro para Real",
                           "Real para Libras Esterlinas",
                           "Libras Esterlinas para Real",
                           "Real para Peso Argentino",
                           "Peso Argentino para Real",
                           "Real para Peso Chileno",
                           "Peso Chileno para Real"};

        String tipoConvercao =  (String) JOptionPane.showInputDialog(null, "Escolha o tipo de conversão: ", "Moeda",
                JOptionPane.PLAIN_MESSAGE, null, moedas, 0);

        String valor = JOptionPane.showInputDialog(null,"Escolha o valor para converver " + tipoConvercao + ":");


    }


}
