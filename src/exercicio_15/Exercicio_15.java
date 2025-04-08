package exercicio_15;

import javax.swing.JOptionPane;

public class Exercicio_15 {

    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
        if (idade >= 15 || idade <= 25) {
            JOptionPane.showMessageDialog(null, "Aceita" + idade + " anos");
        } else {
            JOptionPane.showMessageDialog(null, "Não aceita");
        }
    }
}