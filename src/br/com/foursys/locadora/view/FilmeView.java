package br.com.foursys.locadora.view;

import br.com.foursys.locadora.controller.FilmeController;
import br.com.foursys.locadora.controller.FilmeController;
import br.com.foursys.locadora.model.Estado;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FilmeView extends javax.swing.JFrame {

    FilmeController controllerFilme = new FilmeController(FilmeView.this);
    
    public FilmeView() {
        initComponents();
      
        this.controllerFilme.listarFilmes();
        setLocationRelativeTo(null);
         this.controllerFilme.bloqueioInicial();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfValorPromocao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcbDisponivel = new javax.swing.JComboBox();
        jchAcao = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jcbPromocao = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jchFiccao = new javax.swing.JCheckBox();
        jchTerror = new javax.swing.JCheckBox();
        jchComedia = new javax.swing.JCheckBox();
        jchInfantil = new javax.swing.JCheckBox();
        jchAnimacao = new javax.swing.JCheckBox();
        jchAventura = new javax.swing.JCheckBox();
        jchOutro = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisarNome = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFilme = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jbtCancelar = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtAlterar = new javax.swing.JButton();
        jbtSair = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Filme");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Filme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel4.setText("Codigo:");

        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor:");

        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jtfValorPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorPromocaoActionPerformed(evt);
            }
        });

        jLabel9.setText("Valor Promoção:");

        jLabel5.setText("Disponível:");

        jcbDisponivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "SIM", "NÃO" }));
        jcbDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDisponivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jchAcao.setText("Ação");

        jLabel6.setText("Promoção:");

        jcbPromocao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "SIM", "NÃO" }));
        jcbPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPromocaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(52, 52, 52)
                .addComponent(jcbPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel8.setText("Gênero:");

        jchFiccao.setText("Ficção");

        jchTerror.setText("Terror");

        jchComedia.setText("Comédia");

        jchInfantil.setText("Infantil");

        jchAnimacao.setText("Animação");

        jchAventura.setText("Aventura");

        jchOutro.setText("Outro");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNome))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfValorPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)
                        .addComponent(jchAcao)
                        .addGap(18, 18, 18)
                        .addComponent(jchFiccao)
                        .addGap(18, 18, 18)
                        .addComponent(jchTerror)
                        .addGap(18, 18, 18)
                        .addComponent(jchComedia)
                        .addGap(18, 18, 18)
                        .addComponent(jchInfantil)
                        .addGap(18, 18, 18)
                        .addComponent(jchAnimacao)
                        .addGap(18, 18, 18)
                        .addComponent(jchAventura)
                        .addGap(18, 18, 18)
                        .addComponent(jchOutro)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtfValorPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jchAcao)
                    .addComponent(jLabel8)
                    .addComponent(jchFiccao)
                    .addComponent(jchTerror)
                    .addComponent(jchComedia)
                    .addComponent(jchInfantil)
                    .addComponent(jchAnimacao)
                    .addComponent(jchAventura)
                    .addComponent(jchOutro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Filme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
                .addComponent(jtfPesquisarNome)
                .addContainerGap())
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
        jLabel17.setText("Filmes Cadastrados");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(305, 305, 305))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        tabelaFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Genero", "Valor", "Disponivel", "Promoção", "Valor Promoção"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaFilme);

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
                .addGap(0, 9, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
       this.controllerFilme.acaoBotaoNovo();
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAlterarActionPerformed
      this.controllerFilme.alterarFilme();
    }//GEN-LAST:event_jbtAlterarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
      this.controllerFilme.excluirFilme();
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbtSairActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.controllerFilme.acaoBotaoCancelar();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        this.controllerFilme.salvarFilme();
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void acaoPreencher(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acaoPreencher
     //   this.controllerFilme.pesquisarFilme();
    }//GEN-LAST:event_acaoPreencher

    private void jtfValorPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorPromocaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorPromocaoActionPerformed

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jcbDisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDisponivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDisponivelActionPerformed

    private void jcbPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPromocaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPromocaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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

    public JButton getJbtAlterar() {
        return jbtAlterar;
    }

    public void setJbtAlterar(JButton jbtAlterar) {
        this.jbtAlterar = jbtAlterar;
    }

    public JButton getJbtCancelar() {
        return jbtCancelar;
    }

    public void setJbtCancelar(JButton jbtCancelar) {
        this.jbtCancelar = jbtCancelar;
    }

    public JButton getJbtExcluir() {
        return jbtExcluir;
    }

    public void setJbtExcluir(JButton jbtExcluir) {
        this.jbtExcluir = jbtExcluir;
    }

    public JButton getJbtNovo() {
        return jbtNovo;
    }

    public void setJbtNovo(JButton jbtNovo) {
        this.jbtNovo = jbtNovo;
    }

    public JButton getJbtSair() {
        return jbtSair;
    }

    public void setJbtSair(JButton jbtSair) {
        this.jbtSair = jbtSair;
    }

    public JButton getJbtSalvar() {
        return jbtSalvar;
    }

    public void setJbtSalvar(JButton jbtSalvar) {
        this.jbtSalvar = jbtSalvar;
    }

    public JComboBox getJcbDisponivel() {
        return jcbDisponivel;
    }

    public void setJcbDisponivel(JComboBox jcbDisponivel) {
        this.jcbDisponivel = jcbDisponivel;
    }

    public JComboBox getJcbPromocao() {
        return jcbPromocao;
    }

    public void setJcbPromocao(JComboBox jcbPromocao) {
        this.jcbPromocao = jcbPromocao;
    }

    public JCheckBox getJchAcao() {
        return jchAcao;
    }

    public void setJchAcao(JCheckBox jchAcao) {
        this.jchAcao = jchAcao;
    }

    public JCheckBox getJchAnimacao() {
        return jchAnimacao;
    }

    public void setJchAnimacao(JCheckBox jchAnimacao) {
        this.jchAnimacao = jchAnimacao;
    }

    public JCheckBox getJchAventura() {
        return jchAventura;
    }

    public void setJchAventura(JCheckBox jchAventura) {
        this.jchAventura = jchAventura;
    }

    public JCheckBox getJchComedia() {
        return jchComedia;
    }

    public void setJchComedia(JCheckBox jchComedia) {
        this.jchComedia = jchComedia;
    }

    public JCheckBox getJchFiccao() {
        return jchFiccao;
    }

    public void setJchFiccao(JCheckBox jchFiccao) {
        this.jchFiccao = jchFiccao;
    }

    public JCheckBox getJchInfantil() {
        return jchInfantil;
    }

    public void setJchInfantil(JCheckBox jchInfantil) {
        this.jchInfantil = jchInfantil;
    }

    public JCheckBox getJchOutro() {
        return jchOutro;
    }

    public void setJchOutro(JCheckBox jchOutro) {
        this.jchOutro = jchOutro;
    }

    public JCheckBox getJchTerror() {
        return jchTerror;
    }

    public void setJchTerror(JCheckBox jchTerror) {
        this.jchTerror = jchTerror;
    }

    public JTextField getJtfCodigo() {
        return jtfCodigo;
    }

    public void setJtfCodigo(JTextField jtfCodigo) {
        this.jtfCodigo = jtfCodigo;
    }

    public JTextField getJtfNome() {
        return jtfNome;
    }

    public void setJtfNome(JTextField jtfNome) {
        this.jtfNome = jtfNome;
    }

    public JTextField getJtfPesquisarNome() {
        return jtfPesquisarNome;
    }

    public void setJtfPesquisarNome(JTextField jtfPesquisarNome) {
        this.jtfPesquisarNome = jtfPesquisarNome;
    }

    public JTextField getJtfValor() {
        return jtfValor;
    }

    public void setJtfValor(JTextField jtfValor) {
        this.jtfValor = jtfValor;
    }

    public JTextField getJtfValorPromocao() {
        return jtfValorPromocao;
    }

    public void setJtfValorPromocao(JTextField jtfValorPromocao) {
        this.jtfValorPromocao = jtfValorPromocao;
    }

    public JTable getTabelaFilme() {
        return tabelaFilme;
    }

    public void setTabelaFilme(JTable tabelaFilme) {
        this.tabelaFilme = tabelaFilme;
    }


        
}
