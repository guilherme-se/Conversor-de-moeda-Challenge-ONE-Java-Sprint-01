import javax.swing.*;

public class Funcao {

  ConversorMoedas moedas = new ConversorMoedas();

  public void converterMoedas(double valorRecebido){
    String opcao = JOptionPane.showInputDialog(null, "Escolha a moeda para a aqual voce deseja converter o seu dinheiro","Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{
      "Real para Dolar",
      "Dolar para Real",
      "Real para Euro",
      "Euro para Real",
      "Real para Libras Esterlinas",
      "Libras Esterlinas para Real",
      "Real para Peso Argentino",
      "Peso Argentino para Real",
      "Real para Peso Chileno",
      "Peso Chileno para Real"},"escolha").toString();

    switch (opcao){
      case "Real para Dolar":
        moedas.converterReaisADolar(valorRecebido);
        break;
      case "Dolar para Real":
        moedas.converterDolarAReal(valorRecebido);
        break;
      case "Real para Euro":
        moedas.converterReaisAEuro(valorRecebido);
        break;
      case "Euro para Real":
        moedas.converterEuroAReais(valorRecebido);
        break;
      case "Real para Libras Esterlinas":
        moedas.converterReaisALibrasEsterlinas(valorRecebido);
        break;
      case "Libras Esterlinas para Real":
        moedas.converterLibrasEsterlinasAReais(valorRecebido);
        break;
      case "Real para Peso Argentino":
        moedas.converterReaisAPesoArgentino(valorRecebido);
        break;
      case "Peso Argentino para Real":
        moedas.converterPesoArgentinoAReal(valorRecebido);
        break;
      case "Real para Peso Chileno":
        moedas.converterReaisAPesoChileno(valorRecebido);
        break;
      case "Peso Chileno para Real":
        moedas.converterPesoChilenoAReal(valorRecebido);
        break;
    }
  }

}
