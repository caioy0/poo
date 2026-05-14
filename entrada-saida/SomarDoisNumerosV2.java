import javax.swing.JOptionPane;
public class SomarDoisNumerosV2{
    static public void main(String args []){
        //Declaracao de variaveis
        double a, b, resultado;
        //Entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite um outro valor"));
        //Processamento
        resultado = a + b;
        //Saida
        JOptionPane.showMessageDialog(
            null, 
            String.format("%.2f + %.2f = %.2f", a, b, resultado)
        );
    }
}

class Calculadora{
    public int somar(int a, int b){
        return a + b;
    }
}