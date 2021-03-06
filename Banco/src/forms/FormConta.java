package forms;

import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Cliente;
import model.ContaBancaria;
import model.ContaEspecial;

public class FormConta extends javax.swing.JFrame {

    Cliente cliente = null;
    
    public FormConta() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgContas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbCPF = new javax.swing.JLabel();
        tfCPF = new javax.swing.JFormattedTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbAgencia = new javax.swing.JLabel();
        tfAgencia = new javax.swing.JFormattedTextField();
        lbSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        btAbrir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rbContaBancaria = new javax.swing.JRadioButton();
        rbContaEspecial = new javax.swing.JRadioButton();
        btBuscar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conta");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lbCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCPF.setText("CPF:");
        lbCPF.setName("lbCPF"); // NOI18N

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCPF.setName("tfCPF"); // NOI18N

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setText("Nome:");
        lbNome.setName("lbNome"); // NOI18N

        tfNome.setEditable(false);
        tfNome.setEnabled(false);
        tfNome.setName("tfNome"); // NOI18N

        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNumero.setText("N° da Conta:");
        lbNumero.setName("lbNumero"); // NOI18N

        tfNumero.setText("0");
        tfNumero.setEnabled(false);
        tfNumero.setName("tfNumero"); // NOI18N

        lbAgencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAgencia.setText("Agência:");
        lbAgencia.setName("lbAgencia"); // NOI18N

        try {
            tfAgencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfAgencia.setEnabled(false);
        tfAgencia.setName("tfAgencia"); // NOI18N

        lbSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSenha.setText("Senha:");
        lbSenha.setName("lbSenha"); // NOI18N

        pfSenha.setEnabled(false);
        pfSenha.setName("pfSenha"); // NOI18N

        btAbrir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAbrir.setText("Abrir Conta");
        btAbrir.setEnabled(false);
        btAbrir.setName("btAbrir"); // NOI18N
        btAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setText("Sair");
        btSair.setName("btSair"); // NOI18N
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Selecione o Tipo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        bgContas.add(rbContaBancaria);
        rbContaBancaria.setSelected(true);
        rbContaBancaria.setText("Conta Bancária");
        rbContaBancaria.setEnabled(false);
        rbContaBancaria.setName("rbContaBancaria"); // NOI18N

        bgContas.add(rbContaEspecial);
        rbContaEspecial.setText("Conta Especial");
        rbContaEspecial.setEnabled(false);
        rbContaEspecial.setName("rbContaEspecial"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(rbContaBancaria)
                .addGap(45, 45, 45)
                .addComponent(rbContaEspecial)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbContaBancaria)
                    .addComponent(rbContaEspecial))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setName("btBuscar"); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setName("btLimpar"); // NOI18N
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAbrir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addComponent(lbNumero))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNome)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbAgencia)
                                            .addComponent(tfAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(135, 135, 135)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbSenha)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btLimpar)
                                        .addGap(170, 170, 170)
                                        .addComponent(btSair)))))
                        .addGap(48, 48, 48))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPF)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero)
                    .addComponent(lbAgencia)
                    .addComponent(lbSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAbrir)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(624, 394));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String CPF = tfCPF.getText();
        cliente = FormPrincipal.bdClientes.buscaCliente(CPF);
        if(cliente != null){
            tfNome.setText(cliente.getNome());
            tfNome.setEnabled(true);
            tfNumero.setEnabled(true);
            tfAgencia.setEnabled(true);
            pfSenha.setEnabled(true);
            rbContaBancaria.setEnabled(true);
            rbContaEspecial.setEnabled(true);
            btAbrir.setEnabled(true);
            tfCPF.setEnabled(false);
            btBuscar.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirActionPerformed
        int numero = Integer.parseInt(tfNumero.getText());
        String agencia = tfAgencia.getText();
        String senha = new String (pfSenha.getPassword());
            if(rbContaBancaria.isSelected()){
                ContaBancaria bancaria = new ContaBancaria(numero, agencia, senha, cliente);
                bancaria.setSaldo();
                FormPrincipal.bdContas.inserirConta(bancaria);
                JOptionPane.showMessageDialog(null, "Conta criada com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else if(rbContaEspecial.isSelected()){
                ContaEspecial especial = new ContaEspecial(numero, agencia, senha, cliente);
                especial.setSaldo();
                FormPrincipal.bdContas.inserirConta((ContaBancaria) especial);
                JOptionPane.showMessageDialog(null, "Conta criada com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                btLimparActionPerformed(evt);
            }
    }//GEN-LAST:event_btAbrirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfCPF.setValue("");
        tfCPF.setEnabled(true);
        tfCPF.requestFocus();
        btBuscar.setEnabled(true);
        tfNome.setText("");
        tfNome.setEnabled(false);
        tfNumero.setText("0");
        tfNumero.setEnabled(false);
        tfAgencia.setValue("");
        tfAgencia.setEnabled(false);
        pfSenha.setText("");
        pfSenha.setEnabled(false);
        rbContaBancaria.setSelected(true);
        rbContaBancaria.setEnabled(false);
        rbContaEspecial.setEnabled(false);
        btAbrir.setEnabled(false);
    }//GEN-LAST:event_btLimparActionPerformed

    private String capturaRadio(){
        JRadioButton radio; 
        String str = null; 
        Enumeration jr = bgContas.getElements(); 
        while ( jr.hasMoreElements() ) 
        { 
            radio = (JRadioButton) jr.nextElement(); 
            if (radio.isSelected()) 
            { 
                str = radio.getText(); 
            } 
        }
        return str;
    }    
    
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
            java.util.logging.Logger.getLogger(FormConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgContas;
    private javax.swing.JButton btAbrir;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAgencia;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JRadioButton rbContaBancaria;
    private javax.swing.JRadioButton rbContaEspecial;
    private javax.swing.JFormattedTextField tfAgencia;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables
}
