package br.com.foursys.locadora.view;


import br.com.foursys.locadora.controller.VendedorController;
import br.com.foursys.locadora.model.Estado;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FilmeViewOld extends javax.swing.JFrame {

   // private VendedorController controllerVendedor = new VendedorController(FilmeView.this);
    
      public FilmeViewOld() {
        initComponents();
        setLocationRelativeTo(null);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfValorPromocao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jchAcao = new javax.swing.JCheckBox();
        jchFiccao = new javax.swing.JCheckBox();
        jchTerror = new javax.swing.JCheckBox();
        jchComedia = new javax.swing.JCheckBox();
        jchInfantil = new javax.swing.JCheckBox();
        jchAnimacao = new javax.swing.JCheckBox();
        jchAventura = new javax.swing.JCheckBox();
        jchOutro = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jcbDisponivel = new javax.swing.JComboBox();
        jcbPromocao = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisarNome = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbtCancelar = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtAlterar = new javax.swing.JButton();
        jbtSair = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFilme = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Vendedor");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel4.setText("Nome:");

        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo:");

        jLabel7.setText("Valor Promoção:");

        jtfValorPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorPromocaoActionPerformed(evt);
            }
        });

        jLabel9.setText("Valor:");

        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });

        jLabel8.setText("Promoção:");

        jLabel10.setText("Disponivel:");

        jchAcao.setText("Ação");

        jchFiccao.setText("Ficção");

        jchTerror.setText("Terror");

        jchComedia.setText("Comedia");

        jchInfantil.setText("Infantil");

        jchAnimacao.setText("Animação");

        jchAventura.setText("Aventura");

        jchOutro.setText("Outro");

        jLabel11.setText("Gênero:");

        jcbDisponivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        jcbPromocao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(23, 23, 23)
                                .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jchAcao)
                                .addGap(18, 18, 18)
                                .addComponent(jchFiccao)
                                .addGap(10, 10, 10)
                                .addComponent(jchTerror)
                                .addGap(18, 18, 18)
                                .addComponent(jchComedia)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jchInfantil)
                                .addGap(18, 18, 18)
                                .addComponent(jchAnimacao)
                                .addGap(18, 18, 18)
                                .addComponent(jchAventura))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(45, 45, 45)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfValorPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jchOutro))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfValorPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jcbDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jchAcao)
                    .addComponent(jchFiccao)
                    .addComponent(jchTerror)
                    .addComponent(jchComedia)
                    .addComponent(jchInfantil)
                    .addComponent(jchAnimacao)
                    .addComponent(jchAventura)
                    .addComponent(jchOutro)
                    .addComponent(jLabel11))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setText("Nome:");

        jtfPesquisarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                acaoPreencher(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, new java.awt.Color(204, 204, 204)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("FILMES Cadastrados");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/foursys/locadora/view/icons/cancelar.png"))); // NOI18N
        jbtCancelar.setText("CANCELAR");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/foursys/locadora/view/icons/salvar.png"))); // NOI18N
        jbtSalvar.setText("SALVAR FILME");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCancelar)
                    .addComponent(jbtSalvar))
                .addGap(11, 11, 11))
        );

        jbtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/foursys/locadora/view/icons/excluir.png"))); // NOI18N
        jbtExcluir.setText("Excluir");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/foursys/locadora/view/icons/alterar.png"))); // NOI18N
        jbtAlterar.setText("Alterar");
        jbtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAlterarActionPerformed(evt);
            }
        });

        jbtSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/foursys/locadora/view/icons/sair.png"))); // NOI18N
        jbtSair.setText("Sair");
        jbtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairActionPerformed(evt);
            }
        });

        jbtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/foursys/locadora/view/icons/filme.png"))); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        tabelaFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cidade", "Area de Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaFilme);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        //this.controllerVendedor.acaoBotaoNovo();
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAlterarActionPerformed
       // this.controllerVendedor.alterarVendedor();
    }//GEN-LAST:event_jbtAlterarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        //this.controllerVendedor.excluirVendedor();
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbtSairActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
       // this.controllerVendedor.acaoBotaoCancelar();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
       // this.controllerVendedor.salvarVendedor();
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void acaoPreencher(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acaoPreencher
        
    }//GEN-LAST:event_acaoPreencher

    private void jtfValorPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorPromocaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorPromocaoActionPerformed

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAlterar;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtSair;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JComboBox jcbDisponivel;
    private javax.swing.JComboBox jcbPromocao;
    private javax.swing.JCheckBox jchAcao;
    private javax.swing.JCheckBox jchAnimacao;
    private javax.swing.JCheckBox jchAventura;
    private javax.swing.JCheckBox jchComedia;
    private javax.swing.JCheckBox jchFiccao;
    private javax.swing.JCheckBox jchInfantil;
    private javax.swing.JCheckBox jchOutro;
    private javax.swing.JCheckBox jchTerror;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisarNome;
    private javax.swing.JTextField jtfValor;
    private javax.swing.JTextField jtfValorPromocao;
    private javax.swing.JTable tabelaFilme;
    // End of variables declaration//GEN-END:variables

   // public VendedorController getControllerVendedor() {
      //  return controllerVendedor;
   // }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public javax.swing.JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(javax.swing.JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public javax.swing.JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(javax.swing.JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public javax.swing.JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(javax.swing.JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public javax.swing.JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(javax.swing.JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public javax.swing.JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(javax.swing.JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public javax.swing.JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(javax.swing.JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JButton getJbtAlterar() {
        return jbtAlterar;
    }

    public void setJbtAlterar(javax.swing.JButton jbtAlterar) {
        this.jbtAlterar = jbtAlterar;
    }

    public javax.swing.JButton getJbtCancelar() {
        return jbtCancelar;
    }

    public void setJbtCancelar(javax.swing.JButton jbtCancelar) {
        this.jbtCancelar = jbtCancelar;
    }

    public javax.swing.JButton getJbtExcluir() {
        return jbtExcluir;
    }

    public void setJbtExcluir(javax.swing.JButton jbtExcluir) {
        this.jbtExcluir = jbtExcluir;
    }

    public javax.swing.JButton getJbtNovo() {
        return jbtNovo;
    }

    public void setJbtNovo(javax.swing.JButton jbtNovo) {
        this.jbtNovo = jbtNovo;
    }

    public javax.swing.JButton getJbtSair() {
        return jbtSair;
    }

    public void setJbtSair(javax.swing.JButton jbtSair) {
        this.jbtSair = jbtSair;
    }

    public javax.swing.JButton getJbtSalvar() {
        return jbtSalvar;
    }

    public void setJbtSalvar(javax.swing.JButton jbtSalvar) {
        this.jbtSalvar = jbtSalvar;
    }

    public javax.swing.JComboBox getJcbDisponivel() {
        return jcbDisponivel;
    }

    public void setJcbDisponivel(javax.swing.JComboBox jcbDisponivel) {
        this.jcbDisponivel = jcbDisponivel;
    }

    public javax.swing.JComboBox getJcbPromocao() {
        return jcbPromocao;
    }

    public void setJcbPromocao(javax.swing.JComboBox jcbPromocao) {
        this.jcbPromocao = jcbPromocao;
    }

    public javax.swing.JCheckBox getJchAcao() {
        return jchAcao;
    }

    public void setJchAcao(javax.swing.JCheckBox jchAcao) {
        this.jchAcao = jchAcao;
    }

    public javax.swing.JCheckBox getJchAnimacao() {
        return jchAnimacao;
    }

    public void setJchAnimacao(javax.swing.JCheckBox jchAnimacao) {
        this.jchAnimacao = jchAnimacao;
    }

    public javax.swing.JCheckBox getJchAventura() {
        return jchAventura;
    }

    public void setJchAventura(javax.swing.JCheckBox jchAventura) {
        this.jchAventura = jchAventura;
    }

    public javax.swing.JCheckBox getJchComedia() {
        return jchComedia;
    }

    public void setJchComedia(javax.swing.JCheckBox jchComedia) {
        this.jchComedia = jchComedia;
    }

    public javax.swing.JCheckBox getJchFiccao() {
        return jchFiccao;
    }

    public void setJchFiccao(javax.swing.JCheckBox jchFiccao) {
        this.jchFiccao = jchFiccao;
    }

    public javax.swing.JCheckBox getJchInfantil() {
        return jchInfantil;
    }

    public void setJchInfantil(javax.swing.JCheckBox jchInfantil) {
        this.jchInfantil = jchInfantil;
    }

    public javax.swing.JCheckBox getJchOutro() {
        return jchOutro;
    }

    public void setJchOutro(javax.swing.JCheckBox jchOutro) {
        this.jchOutro = jchOutro;
    }

    public javax.swing.JCheckBox getJchTerror() {
        return jchTerror;
    }

    public void setJchTerror(javax.swing.JCheckBox jchTerror) {
        this.jchTerror = jchTerror;
    }

    public javax.swing.JTextField getJtfCodigo() {
        return jtfCodigo;
    }

    public void setJtfCodigo(javax.swing.JTextField jtfCodigo) {
        this.jtfCodigo = jtfCodigo;
    }

    public javax.swing.JTextField getJtfNome() {
        return jtfNome;
    }

    public void setJtfNome(javax.swing.JTextField jtfNome) {
        this.jtfNome = jtfNome;
    }

    public javax.swing.JTextField getJtfPesquisarNome() {
        return jtfPesquisarNome;
    }

    public void setJtfPesquisarNome(javax.swing.JTextField jtfPesquisarNome) {
        this.jtfPesquisarNome = jtfPesquisarNome;
    }

    public javax.swing.JTextField getJtfValor() {
        return jtfValor;
    }

    public void setJtfValor(javax.swing.JTextField jtfValor) {
        this.jtfValor = jtfValor;
    }

    public javax.swing.JTextField getJtfValorPromocao() {
        return jtfValorPromocao;
    }

    public void setJtfValorPromocao(javax.swing.JTextField jtfValorPromocao) {
        this.jtfValorPromocao = jtfValorPromocao;
    }

    public javax.swing.JTable getTabelaFilme() {
        return tabelaFilme;
    }

    public void setTabelaFilme(javax.swing.JTable tabelaFilme) {
        this.tabelaFilme = tabelaFilme;
    }

   
 



}
