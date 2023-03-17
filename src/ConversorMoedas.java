import javax.swing.*;

public class ConversorMoedas {

  public void converterReaisADolar(double valor){
    double moedaDolar = valor / 5.23;
    moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaDolar + " dolares");
  }

  public void converterDolarAReal(double valor){
    double moedaReal = valor * 5.23;
    moedaReal = (double) Math.round(moedaReal * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaReal + " reais");
  }

  public void converterReaisAEuro(double valor){
    double moedaEuro = valor / 5.52;
    moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaEuro + " euros");
  }

  public void converterEuroAReais(double valor){
    double moedaEuro = valor * 5.52;
    moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaEuro + " reais");
  }

  public void converterReaisALibrasEsterlinas(double valor){
    double moedaLibraEsterlina = valor / 6.40;
    moedaLibraEsterlina = (double) Math.round(moedaLibraEsterlina * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaLibraEsterlina + " libras esterlinas");
  }

  public void converterLibrasEsterlinasAReais(double valor){
    double moedaLibraEsterlina = valor * 0.16;
    moedaLibraEsterlina = (double) Math.round(moedaLibraEsterlina * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaLibraEsterlina + " reais");
  }

  public void converterReaisAPesoArgentino(double valor){
    double moedaPesoArgentino = valor / 0.026;
    moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaPesoArgentino + " pesos argentinos");
  }

  public void converterPesoArgentinoAReal(double valor){
    double moedaPesoArgentino = valor * 38.57;
    moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaPesoArgentino + " reais");
  }

  public void converterReaisAPesoChileno(double valor){
    double moedaPesoChileno = valor / 0.0064;
    moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaPesoChileno + " pesos chilenos");
  }

  public void converterPesoChilenoAReal(double valor){
    double moedaPesoChileno = valor * 157.05;
    moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
    JOptionPane.showInputDialog(null,"Voce tem $ " + moedaPesoChileno + " reais");
  }
}
