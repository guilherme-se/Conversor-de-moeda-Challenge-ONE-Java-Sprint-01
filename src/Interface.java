import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    public Interface(){
        setTitle("Conversor de moedas");
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // componente JTextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Bem-vindo ao conversor de moedas ");
        miJLabel.setText("Escolha uma opção ");
        add(miJLabel);


        JOptionPane.showMessageDialog(null, "Bem-vindo ao conversor de moedas");

        String[] escolhas = {"Real para Dolar", "Dolar para Real", "Real para Euro", "Euro para Real",
                "Real para Libras Esterlinas", "Libras Esterlinas para Real", "Real para Peso Argentino",
                "Peso Argentino para Real", "Real para Peso Chileno", "Peso Chileno para Real"};

        String tipoConvercao =  (String) JOptionPane.showInputDialog(null, "Escolha o tipo de conversão: ", "Moeda",
                JOptionPane.PLAIN_MESSAGE, null, escolhas, 0);


    }


}
