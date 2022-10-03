package view;


public class EsqueciSenha extends javax.swing.JFrame {

    /**
     * Creates new form EsqueciSenha
     */
    public EsqueciSenha() {
        initComponents();
        //inicie frame no meio
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        TxtEmail = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLblText1 = new javax.swing.JLabel();
        jLblText2 = new javax.swing.JLabel();
        jLblTitulo = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(46, 96, 96));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 110, 40));
        getContentPane().add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 380, 30));

        btnEnviar.setBackground(new java.awt.Color(45, 94, 94));
        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 110, 50));

        jLblText1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLblText1.setForeground(new java.awt.Color(255, 255, 255));
        jLblText1.setText("sobre como redefinir sua senha.");
        getContentPane().add(jLblText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 390, -1));

        jLblText2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLblText2.setForeground(new java.awt.Color(255, 255, 255));
        jLblText2.setText("Lhe enviaremos um e-mail com mais informações");
        getContentPane().add(jLblText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 390, -1));

        jLblTitulo.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLblTitulo.setText("ESQUECI MINHA SENHA");
        getContentPane().add(jLblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 370, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/esquecisenha.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        //suma com essa tela
        this.dispose();
        //tela login
        TelaLogin loginn = new TelaLogin();
        loginn.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        //recuperar senha

    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsqueciSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLblText1;
    private javax.swing.JLabel jLblText2;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JLabel lblFundo;
    // End of variables declaration//GEN-END:variables
}
