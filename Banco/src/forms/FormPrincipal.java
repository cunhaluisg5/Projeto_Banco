package forms;

import dao.ClientesDAO;
import dao.ContasDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {
    public static ClientesDAO bdClientes = null;
    public static ContasDAO bdContas = null;
    
    public FormPrincipal() {
        initComponents();
        bdClientes = new ClientesDAO();
        bdContas = new ContasDAO();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuOperacoes = new javax.swing.JMenu();
        JMenuItemClientes = new javax.swing.JMenuItem();
        JMenuItemContas = new javax.swing.JMenuItem();
        JMenuItemListagem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMenuItemSair = new javax.swing.JMenuItem();
        JMenuAjuda = new javax.swing.JMenu();
        JMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        JMenuOperacoes.setText("Operações");
        JMenuOperacoes.setName("JMenuOperacoes"); // NOI18N

        JMenuItemClientes.setText("Clientes");
        JMenuItemClientes.setName("JMenuItemClientes"); // NOI18N
        JMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemClientesActionPerformed(evt);
            }
        });
        JMenuOperacoes.add(JMenuItemClientes);

        JMenuItemContas.setText("Contas");
        JMenuItemContas.setName("JMenuItemContas"); // NOI18N
        JMenuItemContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemContasActionPerformed(evt);
            }
        });
        JMenuOperacoes.add(JMenuItemContas);

        JMenuItemListagem.setText("Listagem");
        JMenuItemListagem.setName("JMenuItemListagem"); // NOI18N
        JMenuItemListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemListagemActionPerformed(evt);
            }
        });
        JMenuOperacoes.add(JMenuItemListagem);
        JMenuOperacoes.add(jSeparator1);

        JMenuItemSair.setText("Sair");
        JMenuItemSair.setName("JMenuItemSair"); // NOI18N
        JMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSairActionPerformed(evt);
            }
        });
        JMenuOperacoes.add(JMenuItemSair);

        jMenuBar1.add(JMenuOperacoes);

        JMenuAjuda.setText("Ajuda");
        JMenuAjuda.setName("JMenuAjuda"); // NOI18N

        JMenuItemSobre.setText("Sobre");
        JMenuItemSobre.setName("JMenuItemSobre"); // NOI18N
        JMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSobreActionPerformed(evt);
            }
        });
        JMenuAjuda.add(JMenuItemSobre);

        jMenuBar1.add(JMenuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(621, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_JMenuItemSairActionPerformed

    private void JMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemSobreActionPerformed
        Date dataAtual = new Date();
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        String nome = "Luís Gustavo da Cunha Cipriani\n";
        JOptionPane.showMessageDialog(null, nome + fm.format(dataAtual), "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_JMenuItemSobreActionPerformed

    private void JMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemClientesActionPerformed
        new FormClientes().setVisible(true);
    }//GEN-LAST:event_JMenuItemClientesActionPerformed

    private void JMenuItemContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemContasActionPerformed
        new FormConta().setVisible(true);
    }//GEN-LAST:event_JMenuItemContasActionPerformed

    private void JMenuItemListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemListagemActionPerformed
        new FormListagem().setVisible(true);
    }//GEN-LAST:event_JMenuItemListagemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuAjuda;
    private javax.swing.JMenuItem JMenuItemClientes;
    private javax.swing.JMenuItem JMenuItemContas;
    private javax.swing.JMenuItem JMenuItemListagem;
    private javax.swing.JMenuItem JMenuItemSair;
    private javax.swing.JMenuItem JMenuItemSobre;
    private javax.swing.JMenu JMenuOperacoes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
