/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Tablero4 extends Tablero {
    
public Tablero4(JPanel panelTablero, JLabel lblPuntos, JLabel lblMovimientos) {
        super(4, panelTablero, lblPuntos, lblMovimientos);
        this.numeros = generarPares();
        this.botones = new JButton[tamaño * tamaño];
        inicializarTablero();
    }

    private int[] generarPares() {
        int[] nums = new int[tamaño * tamaño];
        for (int i = 0; i < nums.length / 2; i++) {
            nums[2 * i] = i + 1;
            nums[2 * i + 1] = i + 1;
        }
        Random random = new Random();
        for (int i = nums.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    @Override
    protected void inicializarTablero() {
        panelTablero.removeAll();
        panelTablero.setLayout(new GridLayout(tamaño, tamaño));

        for (int index = 0; index < numeros.length; index++) {
            JButton btn = crearBoton(numeros[index], index);
            botones[index] = btn;
            panelTablero.add(btn);
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
        return null;
    }
}