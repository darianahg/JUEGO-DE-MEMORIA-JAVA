/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public abstract class Tablero {
    protected int tamaño;
    protected JPanel panelTablero;
    protected JLabel lblPuntos;
    protected JLabel lblMovimientos;
    protected int puntos;
    protected int movimientos;
    protected int paresEncontrados;
    protected int totalPares;
    protected int[] numeros;
    protected JButton[] botones;
    protected JButton primerBoton;
    protected JButton segundoBoton;
    protected int primerNumero;
    protected int segundoNumero;
    protected boolean validarPar;

    public Tablero(int tamaño, JPanel panelTablero, JLabel lblPuntos, JLabel lblMovimientos) {
        this.tamaño = tamaño;
        this.panelTablero = panelTablero;
        this.lblPuntos = lblPuntos;
        this.lblMovimientos = lblMovimientos;
        this.puntos = 0;
        this.movimientos = 1;
        this.paresEncontrados = 0;
        this.validarPar = false;
        this.totalPares = tamaño * tamaño / 2;
    }

    protected abstract void inicializarTablero();
    public abstract char[][] devolverTablero();
    public abstract JPanel generarTablero();

    protected boolean todosLosParesEncontrados() {
        return paresEncontrados == totalPares;
    }

    protected void verificarPareja() {
        if (primerNumero == segundoNumero) {
            primerBoton.setVisible(false);
            segundoBoton.setVisible(false);
            puntos += 5;
            paresEncontrados++;
            if (todosLosParesEncontrados()) {
                actualizarPuntosYMovimientos();
                JOptionPane.showMessageDialog(panelTablero, "¡Felicidades! Has encontrado todos los pares.");
            }
        } else {
            primerBoton.setText("");
            segundoBoton.setText("");
            puntos--;
        }
        primerBoton = null;
        segundoBoton = null;
        validarPar = false;
        actualizarPuntosYMovimientos();
        panelTablero.revalidate();
        panelTablero.repaint();
    }

    protected void actualizarPuntosYMovimientos() {
        lblPuntos.setText(String.valueOf(puntos));
        lblMovimientos.setText(String.valueOf(movimientos));
    }

    protected JButton crearBoton(int numero, int index) {
        JButton btn = new JButton();
        btn.setPreferredSize(new Dimension(100, 100));
        btn.setBackground(Color.pink);
        Font fuente = new Font("Segoe UI Black", Font.PLAIN, 24);
        btn.setFont(fuente);

        btn.addActionListener(e -> {
            if (validarPar || !btn.getText().isEmpty()) {
                return;
            }
            btn.setText(String.valueOf(numero));
            if (primerBoton == null) {
                primerBoton = btn;
                primerNumero = numero;
            } else {
                segundoBoton = btn;
                segundoNumero = numero;
                validarPar = true;
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        SwingUtilities.invokeLater(() -> {
                            verificarPareja();
                            movimientos++; // Aumentar movimientos solo después de verificar pareja
                        });
                    }
                }, 1000);
            }
        });
        return btn;
    }
}
