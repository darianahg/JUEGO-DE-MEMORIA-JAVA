/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JOptionPane;


public class JfJuegoMemoria extends javax.swing.JFrame {
   private Tablero tablero;

    
    public JfJuegoMemoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn4x4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Btn6x6 = new javax.swing.JButton();
        Btn8x8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        BtnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LblPuntos = new javax.swing.JLabel();
        LblMovimientos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn4x4.setBackground(new java.awt.Color(208, 55, 107));
        Btn4x4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Btn4x4.setForeground(new java.awt.Color(255, 255, 255));
        Btn4x4.setText("4 x 4");
        Btn4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4x4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(196, 54, 108));
        jLabel1.setText("JUEGO DE MEMORIA");

        Btn6x6.setBackground(new java.awt.Color(208, 55, 107));
        Btn6x6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Btn6x6.setForeground(new java.awt.Color(255, 255, 255));
        Btn6x6.setText("6 x 6");
        Btn6x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6x6ActionPerformed(evt);
            }
        });

        Btn8x8.setBackground(new java.awt.Color(208, 55, 107));
        Btn8x8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Btn8x8.setForeground(new java.awt.Color(255, 255, 255));
        Btn8x8.setText("8 x 8");

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nivel:");

        Panel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        BtnSalir.setText("SALIR");

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 20)); // NOI18N
        jLabel3.setText("PUNTOS:");

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 20)); // NOI18N
        jLabel4.setText("MOVIMIENTOS:");

        LblPuntos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LblPuntos.setForeground(new java.awt.Color(255, 105, 185));
        LblPuntos.setToolTipText("");
        LblPuntos.setAlignmentX(1.0F);
        LblPuntos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LblPuntos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LblMovimientos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LblMovimientos.setForeground(new java.awt.Color(255, 0, 153));
        LblMovimientos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn4x4)
                .addGap(18, 18, 18)
                .addComponent(Btn6x6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn8x8)
                        .addGap(147, 147, 147)
                        .addComponent(BtnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6x6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn6x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6x6ActionPerformed
       try {
            String[] opciones = {"Continuar", "Nuevo"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Opciones Tablero 6x6", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (respuesta == 0) {
                JOptionPane.showMessageDialog(null, "Has seleccionado Continuar");
            } else if (respuesta == 1) {
                JOptionPane.showMessageDialog(null, "Ha seleccionado Nuevo");
                reiniciarTablero(new Tablero6(Panel1, LblPuntos, LblMovimientos));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error:" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_Btn6x6ActionPerformed

    private void Btn4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4x4ActionPerformed
        try {
            String[] opciones = {"Continuar", "Nuevo"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Opciones Tablero 4x4", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (respuesta == 0) {
                JOptionPane.showMessageDialog(null, "Has seleccionado Continuar");
            } else if (respuesta == 1) {
                JOptionPane.showMessageDialog(null, "Ha seleccionado Nuevo");
                reiniciarTablero(new Tablero4(Panel1, LblPuntos, LblMovimientos));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error:" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_Btn4x4ActionPerformed

  
    private void reiniciarTablero(Tablero nuevoTablero) {
        Panel1.removeAll(); 
        tablero = nuevoTablero;
        tablero.inicializarTablero(); 
        Panel1.revalidate(); 
        Panel1.repaint();
    }

    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfJuegoMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn4x4;
    private javax.swing.JButton Btn6x6;
    private javax.swing.JButton Btn8x8;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblMovimientos;
    private javax.swing.JLabel LblPuntos;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
