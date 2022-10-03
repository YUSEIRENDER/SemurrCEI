package view;

import controller.CadastroNomeController;
import controller.helper.CadastroNomeHelper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class TelaCadastroPessoa extends javax.swing.JFrame {

    //criando campo controller
    private final CadastroNomeController controller;
    
    //criando campo helper
    private final CadastroNomeHelper helper;       
    
    public TelaCadastroPessoa() {
        initComponents();
        
        this.setResizable(false);
        
        //controller esta passando view como parametro
        controller = new CadastroNomeController(this);
        
        //helper esta passando view como parametro
        helper = new CadastroNomeHelper(this);          
        
        //inicia essa tela no centro
        this.setLocationRelativeTo(null);
        
        //chama o metodo iniciar
        this.iniciar();          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaCadNome = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNomepessoa = new javax.swing.JLabel();
        txtNomepessoa = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("CADASTRO DE PESSOA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 350, -1));

        jTabelaCadNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabelaCadNome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nomepessoa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabelaCadNome.setAutoscrolls(false);
        jTabelaCadNome.setFocusable(false);
        jTabelaCadNome.setRequestFocusEnabled(false);
        jTabelaCadNome.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTabelaCadNome.getTableHeader().setReorderingAllowed(false);
        jTabelaCadNome.setUpdateSelectionOnSort(false);
        jTabelaCadNome.setVerifyInputWhenFocusTarget(false);
        jTabelaCadNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaCadNomeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaCadNome);
        if (jTabelaCadNome.getColumnModel().getColumnCount() > 0) {
            jTabelaCadNome.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1250, 360));

        lblID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID:");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtId.setEnabled(false);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 100, -1));

        lblNomepessoa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNomepessoa.setForeground(new java.awt.Color(255, 255, 255));
        lblNomepessoa.setText("NOMEPESSOA:");
        getContentPane().add(lblNomepessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 30));

        txtNomepessoa.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtNomepessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomepessoaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomepessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 410, -1));

        btnNovo.setBackground(new java.awt.Color(30, 129, 176));
        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 190, 110, 40));

        btnEditar.setBackground(new java.awt.Color(30, 129, 176));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, 110, 40));

        btnPesquisar.setBackground(new java.awt.Color(30, 129, 176));
        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 110, 40));

        btnVoltar.setBackground(new java.awt.Color(30, 129, 176));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 110, 40));

        btnExcluir.setBackground(new java.awt.Color(30, 129, 176));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, 110, 40));

        btnSalvar.setBackground(new java.awt.Color(30, 129, 176));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 250, 110, 40));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/PARTE INTERNA2.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelaCadNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaCadNomeMouseClicked
        // TODO add your handling code here:
        helper.setModelo();
    }//GEN-LAST:event_jTabelaCadNomeMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        //ao clickar chama o helper em novo seta todos os campos como true
        helper.desbloquearCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //controller chama metodo update Nome
        controller.updateNome();

        iniciar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        //tente chamar a tela cadastro equipamento
        try
        {

            this.dispose();

            TelaCadastroEmprestimo telacadEmprestimo = new TelaCadastroEmprestimo();
            telacadEmprestimo.setVisible(true);

        }
        //se não conseguir pegue a excesão e mostre a mensagem na tela junto com a excesão
        catch(Exception ex)
        {

            JOptionPane.showMessageDialog(null, "Error ao chamar a tela cadastro emprestimo!" + ex);

        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //controller chama metodo deletar nome
        controller.deletar();

        iniciar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //controller chama metodo salvar nome
        controller.salvarNome();

        iniciar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomepessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomepessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomepessoaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPessoa().setVisible(true);
            }
        });
    }

    //getters e setters
    public static JButton getBtnEditar() {
        return btnEditar;
    }

    public static void setBtnEditar(JButton btnEditar) {
        TelaCadastroPessoa.btnEditar = btnEditar;
    }

    public static JButton getBtnExcluir() {
        return btnExcluir;
    }

    public static void setBtnExcluir(JButton btnExcluir) {
        TelaCadastroPessoa.btnExcluir = btnExcluir;
    }

    public static JButton getBtnNovo() {
        return btnNovo;
    }

    public static void setBtnNovo(JButton btnNovo) {
        TelaCadastroPessoa.btnNovo = btnNovo;
    }

    public static JButton getBtnPesquisar() {
        return btnPesquisar;
    }

    public static void setBtnPesquisar(JButton btnPesquisar) {
        TelaCadastroPessoa.btnPesquisar = btnPesquisar;
    }

    public static JButton getBtnSalvar() {
        return btnSalvar;
    }

    public static void setBtnSalvar(JButton btnSalvar) {
        TelaCadastroPessoa.btnSalvar = btnSalvar;
    }

    public static JButton getBtnVoltar() {
        return btnVoltar;
    }

    public static void setBtnVoltar(JButton btnVoltar) {
        TelaCadastroPessoa.btnVoltar = btnVoltar;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public static JTable getjTabelaCadNome() {
        return jTabelaCadNome;
    }

    public static void setjTabelaCadNome(JTable jTabelaCadNome) {
        TelaCadastroPessoa.jTabelaCadNome = jTabelaCadNome;
    }

    public static JTextField getTxtId() {
        return txtId;
    }

    public static void setTxtId(JTextField txtId) {
        TelaCadastroPessoa.txtId = txtId;
    }

    public static JTextField getTxtNomepessoa() {
        return txtNomepessoa;
    }

    public static void setTxtNomepessoa(JTextField txtNomepessoa) {
        TelaCadastroPessoa.txtNomepessoa = txtNomepessoa;
    }

    
    public void iniciar()
    {
        
            //impede o usuario de mover as colunas para reoodena-las
            jTabelaCadNome.getTableHeader().setReorderingAllowed(false);
            
            //chama este metodo do controller
            controller.tabelaNomes();
            
            jTabelaCadNome.setRowSelectionAllowed(true);
            
            //impessa o jtable de se auto redimensionar
            jTabelaCadNome.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            
            //as linhas abaixo define o tamanho das colunas da tabela
            //tabela pegue o modelo de coluna, pegue a coluna zero e sete a largura
            jTabelaCadNome.getColumnModel().getColumn(0).setPreferredWidth(622);
            jTabelaCadNome.getColumnModel().getColumn(1).setPreferredWidth(622);          
        
    }        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnExcluir;
    public static javax.swing.JButton btnNovo;
    public static javax.swing.JButton btnPesquisar;
    public static javax.swing.JButton btnSalvar;
    public static javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTabelaCadNome;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNomepessoa;
    private javax.swing.JLabel lblTitulo;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNomepessoa;
    // End of variables declaration//GEN-END:variables
}