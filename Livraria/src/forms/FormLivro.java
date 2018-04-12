/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Livro;

/**
 *
 * @author Luís Gustavo
 */
public class FormLivro extends javax.swing.JFrame {

    public static Livro li = null;
    
    public static Livro getLivro(){
        return li;
    }
    
    public static void setLivro(Livro li){
        FormLivro.li = li;
    }
    
    public FormLivro() {
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

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btAtualizar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btCancelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btSair = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        lbFornecedor = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox<>();
        lbValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lbQuantidade = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        tfData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Livros (Acervo)");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(214, 217, 223));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(1));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 386));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icCadlivro.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setMaximumSize(new java.awt.Dimension(80, 73));
        btCadastrar.setMinimumSize(new java.awt.Dimension(80, 73));
        btCadastrar.setName("btCadastrar"); // NOI18N
        btCadastrar.setPreferredSize(new java.awt.Dimension(80, 73));
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCadastrar);
        jToolBar1.add(jSeparator1);

        btAtualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icAtualizar.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btAtualizar.setEnabled(false);
        btAtualizar.setFocusable(false);
        btAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAtualizar.setMaximumSize(new java.awt.Dimension(80, 73));
        btAtualizar.setMinimumSize(new java.awt.Dimension(80, 73));
        btAtualizar.setName("btAtualizar"); // NOI18N
        btAtualizar.setPreferredSize(new java.awt.Dimension(80, 73));
        btAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btAtualizar);
        jToolBar1.add(jSeparator2);

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icCancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMaximumSize(new java.awt.Dimension(80, 73));
        btCancelar.setMinimumSize(new java.awt.Dimension(80, 73));
        btCancelar.setName("btCancelar"); // NOI18N
        btCancelar.setPreferredSize(new java.awt.Dimension(80, 73));
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancelar);
        jToolBar1.add(jSeparator3);

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icSair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMaximumSize(new java.awt.Dimension(80, 73));
        btSair.setMinimumSize(new java.awt.Dimension(80, 73));
        btSair.setName("btSair"); // NOI18N
        btSair.setPreferredSize(new java.awt.Dimension(80, 73));
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btSair);

        lbCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCodigo.setText("Código:");
        lbCodigo.setName("lbCodigo"); // NOI18N

        tfCodigo.setName("tfCodigo"); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTitulo.setText("Título:");
        lbTitulo.setName("lbTitulo"); // NOI18N

        tfTitulo.setName("tfTitulo"); // NOI18N

        lbFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbFornecedor.setText("Fornecedor:");
        lbFornecedor.setName("lbFornecedor"); // NOI18N

        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Editora Melhoramentos" }));
        cbFornecedor.setName("cbFornecedor"); // NOI18N

        lbValor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbValor.setText("Valor unitário:");
        lbValor.setName("lbValor"); // NOI18N

        tfValor.setName("tfValor"); // NOI18N

        lbQuantidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbQuantidade.setText("Quantidade em estoque:");
        lbQuantidade.setName("lbQuantidade"); // NOI18N

        tfQuantidade.setName("tfQuantidade"); // NOI18N

        lbData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbData.setText("Data de Publicação:");
        lbData.setName("lbData"); // NOI18N

        try {
            tfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfData.setName("tfData"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbValor))
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFornecedor)
                    .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbQuantidade))
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbData)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitulo))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(lbTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(lbFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(lbQuantidade)
                    .addComponent(lbData))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(674, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Livro livro = FormPrincipal.bdlivro.buscarLivro(tfCodigo.getText());
        if(livro == null){
            livro = new Livro();
            livro.setCodigo(tfCodigo.getText());
            livro.setTitulo(tfTitulo.getText());
            livro.setValorUnitario(tfValor.getText());
            livro.setQuantidadeEstoque(tfQuantidade.getText());
            livro.setData(tfData.getText());
            livro.setFornecedor(cbFornecedor.getSelectedItem().toString());
            if(livro.validaLivro())
            {
                FormPrincipal.bdlivro.adicionarLivro(livro);
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
                btAtualizar.setEnabled(true);
                btCadastrar.setEnabled(false);
                tfCodigo.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Atenção! Preencha todos os campos para fazer o cadastro!", "Informação de Cadastro", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Atenção! Já existe livro cadastrado com este código!", "Informação de Cadastro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        btAtualizar.setEnabled(false);
        btCadastrar.setEnabled(true);
        for(int i = 0; i < getContentPane().getComponentCount(); i++)
        {
            Component c = getContentPane().getComponent(i); 
            if ( c instanceof JPanel)
            {
                JPanel p = (JPanel)c;
                for(int j = 0; j < p.getComponentCount(); j++)
                {
                    Component c2 = p.getComponent(j); 
                    if (c2 instanceof JTextField)
                    {
                        JTextField field = (JTextField)c2; 
                        field.setText("");
                    }
                    if (c2 instanceof JFormattedTextField)
                    {
                        JFormattedTextField field = (JFormattedTextField)c2; 
                        field.setValue(null);
                    }
                }
            }
        }
        cbFornecedor.setSelectedIndex(0);
        tfCodigo.setEnabled(true);
        tfCodigo.requestFocus();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        int recebe = JOptionPane.showConfirmDialog(null, "Deseja mesmo atualizar o livro?", "Atualização de Livro", JOptionPane.YES_NO_OPTION);
        if(recebe == 0)
        {
            Livro livro = FormPrincipal.bdlivro.buscarLivro(tfCodigo.getText());
            livro.setData(tfData.getText());
            livro.setFornecedor(cbFornecedor.getSelectedItem().toString());
            livro.setQuantidadeEstoque(tfQuantidade.getText());
            livro.setTitulo(tfTitulo.getText());
            livro.setValorUnitario(tfValor.getText());
            FormPrincipal.bdlivro.alterarLivro(livro);
            JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!", "Atualização de Livro", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(li != null)
        {
            btAtualizar.setEnabled(true);
            btSair.setEnabled(true);
            btCancelar.setEnabled(false);
            btCadastrar.setEnabled(false);;
            tfCodigo.setEnabled(false);
            tfCodigo.setText(li.getCodigo());
            tfData.setText(li.getData());
            tfQuantidade.setText(li.getQuantidadeEstoque());
            tfTitulo.setText(li.getTitulo());
            tfValor.setText(li.getValorUnitario());
            cbFornecedor.setSelectedItem(li.getFornecedor());
        }
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
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbFornecedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfData;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
