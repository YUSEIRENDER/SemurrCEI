package view;

import Relatorios.RelatorioGeral;
import controller.CadastroLoginController;
import controller.helper.TelaPrincipalHelper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaPrincipal extends javax.swing.JFrame {
    
    //criando campo helper
    private final TelaPrincipalHelper helper;
    
    //criando campo controller
    private final CadastroLoginController controller;
    
    public TelaPrincipal() throws SQLException {
        initComponents();  
        
        //inicie frame no meio
        this.setLocationRelativeTo(null);
        
        //helper esta passando view como parametro
        helper = new TelaPrincipalHelper(this);  
        
        //controller esta passando view como parametro
        controller = new CadastroLoginController(this);    
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBackground1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jConexao = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenu();
        JMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemEquipamento = new javax.swing.JMenuItem();
        jMenuEmprestimo = new javax.swing.JMenuItem();
        jMenuUnidade = new javax.swing.JMenuItem();
        jMenuFabricante = new javax.swing.JMenuItem();
        jMenuTipoEquipamento = new javax.swing.JMenuItem();
        jMenuFornecedor = new javax.swing.JMenuItem();
        jMenuNome = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1250, 650));
        setResizable(false);

        JBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/APRESENTACAO_NTI.png"))); // NOI18N

        jMenuBar1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.borderColor"));

        jConexao.setText("Conexao");
        jMenuBar1.add(jConexao);

        jMenuCadastro.setText("Cadastro");

        JMenuItemLogin.setText("Login");
        JMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemLoginActionPerformed(evt);
            }
        });
        jMenuCadastro.add(JMenuItemLogin);

        jMenuItemEquipamento.setText("Equipamento");
        jMenuItemEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEquipamentoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemEquipamento);

        jMenuEmprestimo.setText("Emprestimo");
        jMenuEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEmprestimoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuEmprestimo);

        jMenuUnidade.setText("Unidade");
        jMenuUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUnidadeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuUnidade);

        jMenuFabricante.setText("Fabricante");
        jMenuFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFabricanteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuFabricante);

        jMenuTipoEquipamento.setText("Tipo Equipamento");
        jMenuTipoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTipoEquipamentoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuTipoEquipamento);

        jMenuFornecedor.setText("Fornecedor");
        jMenuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuFornecedor);

        jMenuNome.setText("Nome");
        jMenuNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNomeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuNome);

        jMenuBar1.add(jMenuCadastro);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemLoginActionPerformed
            this.dispose();
        
            TelaCadastroLogin telacadastro = new TelaCadastroLogin();
            telacadastro.setVisible(true);        
        
    }//GEN-LAST:event_JMenuItemLoginActionPerformed

    private void jMenuItemEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEquipamentoActionPerformed
            this.dispose();
        
            TelaCadastroEquipamento telacadastroequip = new TelaCadastroEquipamento();
            telacadastroequip.setVisible(true);  
    }//GEN-LAST:event_jMenuItemEquipamentoActionPerformed

    private void jMenuEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEmprestimoActionPerformed
            this.dispose();
        
            TelaCadastroEmprestimo telacademprestimo = new TelaCadastroEmprestimo();
            telacademprestimo.setVisible(true);
    }//GEN-LAST:event_jMenuEmprestimoActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        //Sair do sistema
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUnidadeActionPerformed
        this.dispose();
        
        TelaCadastroUnidade telacadunidade = new TelaCadastroUnidade();
        telacadunidade.setVisible(true);
    }//GEN-LAST:event_jMenuUnidadeActionPerformed

    private void jMenuFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFabricanteActionPerformed
        //Chama tela cadastro fabricante 
        this.dispose();
        
        TelaCadastroFabricante telacadfabri = new TelaCadastroFabricante();
        telacadfabri.setVisible(true);  
    }//GEN-LAST:event_jMenuFabricanteActionPerformed

    private void jMenuTipoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTipoEquipamentoActionPerformed
        //Chama tela cadastro tipoequipamento 
        this.dispose();
        
        TelaCadastroTipoEquipamento telacadtipoequip = new TelaCadastroTipoEquipamento();
        telacadtipoequip.setVisible(true);  
    }//GEN-LAST:event_jMenuTipoEquipamentoActionPerformed

    private void jMenuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFornecedorActionPerformed
        //Chama tela cadastro fornecedor 
        this.dispose();
        
        TelaCadastroFornecedor telacadfornecedor = new TelaCadastroFornecedor();
        telacadfornecedor.setVisible(true);  
    }//GEN-LAST:event_jMenuFornecedorActionPerformed

    private void jMenuNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNomeActionPerformed
        //Chama tela TelaCadastroPessoa
        this.dispose();
        
        TelaCadastroPessoa telacadNome = new TelaCadastroPessoa();
        telacadNome.setVisible(true);  
    }//GEN-LAST:event_jMenuNomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    //getter e setter elemento view
    
    public JMenu getjConexao() {
        return jConexao;
    }

    public void setjConexao(JMenu jConexao) {
        this.jConexao = jConexao;
    }

    public JMenuItem getjMenuItemEquipamento() {
        return jMenuItemEquipamento;
    }

    public void setjMenuItemEquipamento(JMenuItem jMenuItemEquipamento) {
        this.jMenuItemEquipamento = jMenuItemEquipamento;
    }       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel JBackground1;
    public static javax.swing.JMenuItem JMenuItemLogin;
    public static javax.swing.JMenu jConexao;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenu jMenuCadastro;
    public static javax.swing.JMenuItem jMenuEmprestimo;
    public static javax.swing.JMenuItem jMenuFabricante;
    public static javax.swing.JMenuItem jMenuFornecedor;
    public static javax.swing.JMenuItem jMenuItemEquipamento;
    private javax.swing.JMenuItem jMenuNome;
    public static javax.swing.JMenu jMenuSair;
    public static javax.swing.JMenuItem jMenuTipoEquipamento;
    public static javax.swing.JMenuItem jMenuUnidade;
    // End of variables declaration//GEN-END:variables
}
