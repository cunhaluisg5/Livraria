/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import dao.ClienteDao;

/**
 *
 * @author Luís Gustavo
 */
public class FormPrincipal extends javax.swing.JFrame {

    public static ClienteDao bdcliente = null;
    
    public FormPrincipal() {
        bdcliente = new ClienteDao();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuCadastros = new javax.swing.JMenu();
        JMenuItemCliente = new javax.swing.JMenuItem();
        JMenuItemProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMenuItemSair = new javax.swing.JMenuItem();
        JMenuConsultas = new javax.swing.JMenu();
        JMenuItemClientes = new javax.swing.JMenuItem();
        JMenuItemProdutos = new javax.swing.JMenuItem();
        JMenuCompras = new javax.swing.JMenu();
        JMenuItemDia = new javax.swing.JMenuItem();
        JMenuItemMes = new javax.swing.JMenuItem();
        JMenuItemAno = new javax.swing.JMenuItem();
        JMenuVendas = new javax.swing.JMenu();
        JMenuItemNovaVenda = new javax.swing.JMenuItem();
        JMenuItemEmitirNF = new javax.swing.JMenuItem();
        JMenuSuporte = new javax.swing.JMenu();
        JMenuItemAjuda = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        JMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle da Livraria Livro Aberto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setEnabled(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        JMenuCadastros.setText("Cadastros");

        JMenuItemCliente.setText("Cliente");
        JMenuItemCliente.setName("JMenuItemCliente"); // NOI18N
        JMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemClienteActionPerformed(evt);
            }
        });
        JMenuCadastros.add(JMenuItemCliente);

        JMenuItemProduto.setText("Produto");
        JMenuItemProduto.setName("JMenuItemProduto"); // NOI18N
        JMenuCadastros.add(JMenuItemProduto);
        JMenuCadastros.add(jSeparator1);

        JMenuItemSair.setText("Sair");
        JMenuCadastros.add(JMenuItemSair);

        jMenuBar1.add(JMenuCadastros);

        JMenuConsultas.setText("Consultas");

        JMenuItemClientes.setText("Clientes");
        JMenuItemClientes.setName("JMenuItemClientes"); // NOI18N
        JMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemClientesActionPerformed(evt);
            }
        });
        JMenuConsultas.add(JMenuItemClientes);

        JMenuItemProdutos.setText("Produtos");
        JMenuItemProdutos.setName("JMenuItemProdutos"); // NOI18N
        JMenuConsultas.add(JMenuItemProdutos);

        JMenuCompras.setText("Compras");
        JMenuCompras.setName("JMenuCompras"); // NOI18N

        JMenuItemDia.setText("Dia");
        JMenuItemDia.setName("JMenuItemDia"); // NOI18N
        JMenuCompras.add(JMenuItemDia);

        JMenuItemMes.setText("Mês");
        JMenuItemMes.setName("JMenuItemMes"); // NOI18N
        JMenuCompras.add(JMenuItemMes);

        JMenuItemAno.setText("Ano");
        JMenuItemAno.setName("JMenuItemAno"); // NOI18N
        JMenuCompras.add(JMenuItemAno);

        JMenuConsultas.add(JMenuCompras);

        jMenuBar1.add(JMenuConsultas);

        JMenuVendas.setText("Vendas");
        JMenuVendas.setName("JMenuVendas"); // NOI18N

        JMenuItemNovaVenda.setText("Nova Venda");
        JMenuItemNovaVenda.setName("JMenuItemNovaVenda"); // NOI18N
        JMenuVendas.add(JMenuItemNovaVenda);

        JMenuItemEmitirNF.setText("Emitir N.F.");
        JMenuItemEmitirNF.setName("JMenuItemEmitirNF"); // NOI18N
        JMenuVendas.add(JMenuItemEmitirNF);

        jMenuBar1.add(JMenuVendas);

        JMenuSuporte.setText("Suporte");
        JMenuSuporte.setName("JMenuSuporte"); // NOI18N

        JMenuItemAjuda.setText("Ajuda");
        JMenuItemAjuda.setName("JMenuItemAjuda"); // NOI18N
        JMenuSuporte.add(JMenuItemAjuda);
        JMenuSuporte.add(jSeparator2);

        JMenuItemSobre.setText("Sobre");
        JMenuItemSobre.setName("JMenuItemSobre"); // NOI18N
        JMenuSuporte.add(JMenuItemSobre);

        jMenuBar1.add(JMenuSuporte);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(626, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void JMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemClienteActionPerformed
        new FormCliente().setVisible(true);
    }//GEN-LAST:event_JMenuItemClienteActionPerformed

    private void JMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemClientesActionPerformed
        new FormConsultaCliente().setVisible(true);
    }//GEN-LAST:event_JMenuItemClientesActionPerformed

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
    private javax.swing.JMenu JMenuCadastros;
    private javax.swing.JMenu JMenuCompras;
    private javax.swing.JMenu JMenuConsultas;
    private javax.swing.JMenuItem JMenuItemAjuda;
    private javax.swing.JMenuItem JMenuItemAno;
    private javax.swing.JMenuItem JMenuItemCliente;
    private javax.swing.JMenuItem JMenuItemClientes;
    private javax.swing.JMenuItem JMenuItemDia;
    private javax.swing.JMenuItem JMenuItemEmitirNF;
    private javax.swing.JMenuItem JMenuItemMes;
    private javax.swing.JMenuItem JMenuItemNovaVenda;
    private javax.swing.JMenuItem JMenuItemProduto;
    private javax.swing.JMenuItem JMenuItemProdutos;
    private javax.swing.JMenuItem JMenuItemSair;
    private javax.swing.JMenuItem JMenuItemSobre;
    private javax.swing.JMenu JMenuSuporte;
    private javax.swing.JMenu JMenuVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
