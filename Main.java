package br.victormagosso;

import javax.swing.*;

public class Main {
    public static void main(String ... args){


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Calculadora calculadora = new Calculadora();
                calculadora.setVisible(true);

            }
        });
    }
}
