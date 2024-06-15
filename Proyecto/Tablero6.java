/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Tablero6 extends Tablero  {
    private char[][] letras;

    public Tablero6(JPanel panelTablero, JLabel lblPuntos, JLabel lblMovimientos) {
        super(6, panelTablero, lblPuntos, lblMovimientos);
        this.letras = generarLetras();
        this.botones = new JButton[tamaño * tamaño];
        inicializarTablero();
    }

    private char[][] generarLetras() {
        char[][] letras = new char[tamaño][tamaño];
        char letra='A';
        int contador=0;
        // GENERA LETRAS DUPLICADAS
        for (int i = 0; i<tamaño; i++) {
            for (int j = 0; j<tamaño; j += 2) {
                letras[i][j] = letra;
                letras[i][j+1] = letra;
                letra++;
            }
        }
        
        Random random = new Random();
        for (int i=0; i<tamaño; i++) {
            for (int j=0; j < tamaño - 1; j++) {
                int k = random.nextInt(tamaño-j) +j;
                char temp = letras[i][j];
                letras[i][j] =letras[i][k];
                letras[i][k] =temp;
            }
        }
        return letras;
    }

    @Override
    protected void inicializarTablero() {
        panelTablero.removeAll();
        panelTablero.setLayout(new GridLayout(tamaño, tamaño));

        for (int i=0; i <tamaño; i++) 
        {
            for (int j = 0; j< tamaño; j++) {
                JButton btn = crearBoton(letras[i][j], i, j);
                botones[i *tamaño+j] = btn;
                panelTablero.add(btn);
            }
        }
        panelTablero.revalidate();
        panelTablero.repaint();
    }

    @Override
    public JPanel generarTablero() {
        return panelTablero;
    }

    @Override
    public char[][] devolverTablero() {
        return letras;
    }

    protected JButton crearBoton(char letra, int fila, int columna) {
        JButton btn = new JButton();
        btn.setPreferredSize(new Dimension(100, 100));
        btn.setBackground(Color.pink);
        Font fuente = new Font("Segoe UI Black", Font.PLAIN, 24);
        btn.setFont(fuente);

        btn.addActionListener(e-> {
            if (validarPar || !btn.getText().isEmpty()) {
                return;
            }
            btn.setText(String.valueOf(letra));
            if (primerBoton == null) {
                primerBoton = btn;
                primerNumero = letra;
            } else {
                segundoBoton=btn;
                segundoNumero=letra;
                validarPar =true;

                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        SwingUtilities.invokeLater(() -> {
                            verificarPareja();
                            movimientos++;
                        });
                    }
                }, 1000); //1 SEGUNDO PARA QUE LA CARTA SE MUESTRE
            }
        });
        return btn;
    }
}