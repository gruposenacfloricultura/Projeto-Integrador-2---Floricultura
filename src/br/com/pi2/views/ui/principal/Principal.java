/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi2.views.ui.principal;

import br.com.pi2.ui.clientes.CadastroCliente;
import br.com.pi2.ui.clientes.PesquisarCliente;
import br.com.pi2.ui.produto.CadastroProduto;
import br.com.pi2.ui.produto.PesquisarProduto;
import java.awt.Dimension;
import javax.swing.JInternalFrame;



/**
 *
 * @author work
 */
public class Principal extends javax.swing.JFrame {

    private CadastroCliente cadastroCliente = null;
    private PesquisarCliente consultarCliente = null;
    private CadastroProduto cadastroProduto = null;
    
    
    public Principal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    public CadastroCliente getCadastroCliente(){
        return cadastroCliente;
    }
    
    public void setCadastrarCliente(CadastroCliente cadastroCliente){
        this.cadastroCliente = cadastroCliente;
    }
    
    public PesquisarCliente getPesquisarCliente(){
        return consultarCliente;
    }
    
    public void setPesquisarCliente(PesquisarCliente consultarCliente){
        this.consultarCliente = consultarCliente;
    }
    
     public CadastroProduto getCadastroProduto(){
        return cadastroProduto;
    }
    
    public void setCadastroProduto(CadastroProduto cadastroProduto){
        this.cadastrarProduto = cadastrarProduto;
    }
    
     
            
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        cliente = new javax.swing.JMenu();
        cadastrarCliente = new javax.swing.JMenuItem();
        pesquisarCliente = new javax.swing.JMenuItem();
        produto = new javax.swing.JMenu();
        cadastrarProduto = new javax.swing.JMenuItem();
        pesquisarProduto = new javax.swing.JMenuItem();
        venda = new javax.swing.JMenu();
        realizarVenda = new javax.swing.JMenuItem();
        relatorio = new javax.swing.JMenu();
        gerarRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        cliente.setText("Cliente");

        cadastrarCliente.setText("Cadastrar Cliente");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        cliente.add(cadastrarCliente);

        pesquisarCliente.setText("Pesquisar Cliente");
        pesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarClienteActionPerformed(evt);
            }
        });
        cliente.add(pesquisarCliente);

        jMenuBar1.add(cliente);

        produto.setText("Produto");

        cadastrarProduto.setText("Cadastrar Produto");
        cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoActionPerformed(evt);
            }
        });
        produto.add(cadastrarProduto);

        pesquisarProduto.setText("Pesquisar Produto");
        pesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarProdutoActionPerformed(evt);
            }
        });
        produto.add(pesquisarProduto);

        jMenuBar1.add(produto);

        venda.setText("Venda");

        realizarVenda.setText("Realizar Venda");
        realizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarVendaActionPerformed(evt);
            }
        });
        venda.add(realizarVenda);

        jMenuBar1.add(venda);

        relatorio.setText("Relatório");

        gerarRelatorio.setText("Gerar Relatório");
        gerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioActionPerformed(evt);
            }
        });
        relatorio.add(gerarRelatorio);

        jMenuBar1.add(relatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
            if (cadastroCliente == null || !cadastroCliente.isDisplayable()) {
                cadastroCliente = new CadastroCliente();
                desktop.add(cadastroCliente);
                this.openFrameInCenter(cadastroCliente);
            }
                cadastroCliente.toFront();
        
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void pesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarClienteActionPerformed
        if (consultarCliente == null || !consultarCliente.isDisplayable()) {
            consultarCliente = new PesquisarCliente();
            desktop.add(consultarCliente);
            this.openFrameInCenter(consultarCliente);
        }
        consultarCliente.toFront();
    }//GEN-LAST:event_pesquisarClienteActionPerformed

    private void cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoActionPerformed
       if (cadastroProduto == null || !cadastroProduto.isDisplayable()) {
                cadastroProduto = new CadastroProduto();
                desktop.add(cadastroProduto);
                this.openFrameInCenter(cadastroProduto);
            }
                cadastroCliente.toFront();
    }//GEN-LAST:event_cadastrarProdutoActionPerformed

    private void pesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarProdutoActionPerformed
       PesquisarProduto produto = new PesquisarProduto();
       desktop.add(produto);
       produto.show();
       
    }//GEN-LAST:event_pesquisarProdutoActionPerformed

    private void realizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarVendaActionPerformed
        
    }//GEN-LAST:event_realizarVendaActionPerformed

    private void gerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioActionPerformed
        
    }//GEN-LAST:event_gerarRelatorioActionPerformed

    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = desktop.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenuItem cadastrarProduto;
    private javax.swing.JMenu cliente;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem gerarRelatorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem pesquisarCliente;
    private javax.swing.JMenuItem pesquisarProduto;
    private javax.swing.JMenu produto;
    private javax.swing.JMenuItem realizarVenda;
    private javax.swing.JMenu relatorio;
    private javax.swing.JMenu venda;
    // End of variables declaration//GEN-END:variables
}
