/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newtonPaiva.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemaacad.Models.Aluno;

/**
 *
 * @author Gustavo
 */
public class TelaAluno extends javax.swing.JFrame {

    /**
     * Creates new form TelaAluno
     */
    public TelaAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_Salvar_al = new javax.swing.JButton();
        bt_buscar_al = new javax.swing.JButton();
        bt_excluir_al = new javax.swing.JButton();
        label_nome = new javax.swing.JLabel();
        input_nome = new javax.swing.JTextField();
        label_endereco = new javax.swing.JLabel();
        input_endereco = new javax.swing.JTextField();
        label_telefone = new javax.swing.JLabel();
        input_ativo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        input_curso = new javax.swing.JTextField();
        input_telefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_Salvar_al.setText("SALVAR");
        bt_Salvar_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Salvar_alActionPerformed(evt);
            }
        });

        bt_buscar_al.setText("BUSCAR");

        bt_excluir_al.setText("EXCLUIR");

        label_nome.setText("Nome:");

        label_endereco.setText("Endereço:");

        label_telefone.setText("Telefone:");

        input_ativo.setText("Ativo");

        jLabel1.setText("Curso:");

        try {
            input_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        input_telefone.setToolTipText("Incluir o telefone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(input_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(input_ativo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_Salvar_al)
                                .addGap(54, 54, 54)
                                .addComponent(bt_buscar_al)
                                .addGap(38, 38, 38)
                                .addComponent(bt_excluir_al))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_endereco)
                                .addGap(1, 1, 1)
                                .addComponent(input_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_nome)
                                .addGap(18, 18, 18)
                                .addComponent(input_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(input_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_telefone)
                    .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_endereco)
                    .addComponent(input_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(input_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_ativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Salvar_al)
                    .addComponent(bt_buscar_al)
                    .addComponent(bt_excluir_al))
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Salvar_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Salvar_alActionPerformed
        // TODO add your handling code here:
        Aluno aluno = new Aluno();
        aluno.setCurso(null);
               
        aluno.setAtivo(input_ativo.getText().equals(1) ? true : false);
        aluno.setNome(input_nome.getText());
        aluno.setEndereco(input_endereco.getText());
        aluno.setTelefone(input_telefone.getText());
        
        try {
            aluno.Salvar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_Salvar_alActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Salvar_al;
    private javax.swing.JButton bt_buscar_al;
    private javax.swing.JButton bt_excluir_al;
    private javax.swing.JCheckBox input_ativo;
    private javax.swing.JTextField input_curso;
    private javax.swing.JTextField input_endereco;
    private javax.swing.JTextField input_nome;
    private javax.swing.JFormattedTextField input_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_endereco;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_telefone;
    // End of variables declaration//GEN-END:variables
}