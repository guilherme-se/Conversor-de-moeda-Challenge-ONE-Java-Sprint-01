import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String opcoes = JOptionPane.showInputDialog(null,"escolha uma opção","Menu",JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha").toString();

        String input = JOptionPane.showInputDialog("Insira um valor");

        Funcao funcao = new Funcao();

        switch (opcoes){
            case "Conversor de Moeda":
                double valorRecebido = Double.parseDouble(input);
                funcao.converterMoedas(valorRecebido);
                int resposta = JOptionPane.showConfirmDialog(null,"Deseja continuar?");
                if (resposta == JOptionPane.OK_OPTION){
                    System.out.println("Escolheu opção afirmativa");
                } else {
                    JOptionPane.showMessageDialog(null,"Programa finalizado");
                }
                break;
        }
    }
}