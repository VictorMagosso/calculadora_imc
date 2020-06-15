package br.victormagosso;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JPanel rootPanel;
    private JTextField pesoString, alturaString;
    private JButton calcularButton;
    private JLabel resultadoLabel;

    public Calculadora(){
       add(rootPanel);

        setTitle("Calculadora IMC");
        setSize(300, 200);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int pesoKg = Integer.parseInt( pesoString.getText() );
              float alturaCm = Float.parseFloat(alturaString.getText());
              int pesoIMC = pesoKg;
              float alturaIMC = (alturaCm/100)*(alturaCm/100);
              float resultado = pesoIMC / alturaIMC;
              resultadoLabel.setText("Seu IMC é: " + resultado);

            }
        });

    }
}
