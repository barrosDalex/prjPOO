/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoAPrazo;
import fatec.poo.control.DaoAVista;
import fatec.poo.control.DaoAluno;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoMatricula;
import fatec.poo.control.DaoPessoa;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.APrazo;
import fatec.poo.model.AVista;
import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Matricula;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Turma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gorom
 */
public class GUIEfetuarMatricula extends javax.swing.JFrame {

    /**
     * Creates new form GUIEfetuarMatricula
     */
    public GUIEfetuarMatricula() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        ftfDataMatricula = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboxTurmas = new javax.swing.JComboBox<>();
        cboxCursos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfNome = new javax.swing.JTextField();
        txtfValor = new javax.swing.JTextField();
        panlPagamento = new javax.swing.JPanel();
        radAvista = new javax.swing.JRadioButton();
        radAprazo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tftfAgen = new javax.swing.JTextField();
        tftfQtdeMes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tftfJur = new javax.swing.JTextField();
        tftfNcheq = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ftfDataPag = new javax.swing.JFormattedTextField();
        ftfDataVenc = new javax.swing.JFormattedTextField();
        btnInserir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        ftfCPFAluno = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Efetuar matrícula");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        try {
            ftfDataMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfDataMatriculaActionPerformed(evt);
            }
        });

        jLabel1.setText("Data da matrícula");

        jLabel2.setText("Curso");

        jLabel3.setText("Turma");

        jLabel4.setText("CPF aluno");

        cboxTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTurmasActionPerformed(evt);
            }
        });

        cboxCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCursosActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor");

        jLabel6.setText("Nome");

        txtfNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtfNome.setEnabled(false);

        txtfValor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtfValor.setEnabled(false);

        panlPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagamento"));

        radAvista.setText("Á vista");
        radAvista.setName(""); // NOI18N
        radAvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAvistaActionPerformed(evt);
            }
        });

        radAprazo.setText("Parcelado");
        radAprazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAprazoActionPerformed(evt);
            }
        });

        jLabel7.setText("Agência");

        jLabel8.setText("Qtde. Mensalidade");

        tftfQtdeMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftfQtdeMesActionPerformed(evt);
            }
        });

        jLabel9.setText("No. Cheque");

        jLabel10.setText("Tx. Juros(%)");

        tftfJur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftfJurActionPerformed(evt);
            }
        });

        jLabel11.setText("Data Pagto");

        jLabel12.setText("Data 1o. Vencto.");

        try {
            ftfDataPag.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfDataPagActionPerformed(evt);
            }
        });

        try {
            ftfDataVenc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataVenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfDataVencActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panlPagamentoLayout = new javax.swing.GroupLayout(panlPagamento);
        panlPagamento.setLayout(panlPagamentoLayout);
        panlPagamentoLayout.setHorizontalGroup(
            panlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panlPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radAvista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radAprazo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panlPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(tftfAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)
                        .addComponent(tftfNcheq, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panlPagamentoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tftfQtdeMes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(tftfJur, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panlPagamentoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(ftfDataPag, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panlPagamentoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(ftfDataVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        panlPagamentoLayout.setVerticalGroup(
            panlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panlPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radAvista)
                    .addComponent(jLabel7)
                    .addComponent(tftfAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tftfNcheq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(ftfDataPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panlPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radAprazo)
                    .addComponent(jLabel8)
                    .addComponent(tftfQtdeMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tftfJur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(ftfDataVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        try {
            ftfCPFAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCPFAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfCPFAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ftfCPFAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cboxTurmas, javax.swing.GroupLayout.Alignment.LEADING, 0, 92, Short.MAX_VALUE)
                                    .addComponent(cboxCursos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panlPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnConsultar)
                            .addGap(60, 60, 60)
                            .addComponent(btnInserir)
                            .addGap(61, 61, 61)
                            .addComponent(btnAlterar)
                            .addGap(61, 61, 61)
                            .addComponent(btnExcluir)
                            .addGap(52, 52, 52)
                            .addComponent(btnSair)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ftfDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboxTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ftfCPFAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panlPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnConsultar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void ftfDataMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfDataMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfDataMatriculaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        cpf = ftfCPFAluno.getText().replaceAll("[.,-]", "");
        boolean cp = Pessoa.validarCPF(cpf);
        
        if (cp == true){
            
            pessoa = null;
            aluno = null;
            
            pessoa = daoPessoa.consultarAluno(cpf);
            aluno = daoAluno.Consultar(cpf);
            
            if (pessoa != null){
                
                txtfNome.setText( pessoa.getNome());
                
                matricula = daoMatricula.consultar(cpf);
                
                if (matricula != null){
                    //existe
                    btnAlterar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                    btnConsultar.setEnabled(false);
                    
                    ftfDataMatricula.setText(matricula.getData());                                      
                    
                    aPrazo = daoAprazo.consultar(cpf);
                    aVista = daoAvista.consultar(cpf);
                                                          
                    if (aPrazo != null){  
                        System.out.println("Prazo");
                        tftfJur.setText( Double.toString(aPrazo.getTaxaJuros()) );
                        tftfQtdeMes.setText( Integer.toString( aPrazo.getQtdeMensalidade() ) );
                        ftfDataVenc.setText( aPrazo.getDtVencimento().replaceAll("[.,-]", ""));
                    }
                    else if (aVista != null) {
                        System.out.println("Vista");
                        tftfAgen.setText( Integer.toString(aVista.getAgencia()));
                        tftfNcheq.setText(Integer.toString(aVista.getNCheque()));
                        ftfDataPag.setText(aVista.getPreData().replaceAll("[.,-]", ""));
                    }
                    
                }
                else{
                    //nao existe
                    tftfAgen.setEnabled(true);
                    tftfNcheq.setEnabled(true);
                    ftfDataPag.setEnabled(true);
                    
                    btnInserir.setEnabled(true);
                    btnConsultar.setEnabled(false);
                }             
                
            }
            else JOptionPane.showMessageDialog(null, "CPF inserido não encontrado.");
        }
        else{
            JOptionPane.showMessageDialog(null, "CPF inserido não é válido.");
        }
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void radAvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAvistaActionPerformed
        // TODO add your handling code here:        
                    
        tftfAgen.setEnabled(true);
        tftfNcheq.setEnabled(true);
        ftfDataPag.setEnabled(true);

        tftfJur.setEnabled(false);
        tftfQtdeMes.setEnabled(false);
        ftfDataVenc.setEnabled(false);
        
        if(radAvista.isSelected() && radAprazo.isSelected() ){         
            radAvista.setSelected(true);
            radAprazo.setSelected(false);
            
            tftfJur.setText("");
            tftfQtdeMes.setText("");
            ftfDataVenc.setText("");
            
        }
        else{
            radAvista.setSelected(true);
        }
    }//GEN-LAST:event_radAvistaActionPerformed

    private void tftfQtdeMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftfQtdeMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftfQtdeMesActionPerformed

    private void ftfDataPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfDataPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfDataPagActionPerformed

    private void ftfDataVencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfDataVencActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfDataVencActionPerformed

    private void tftfJurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftfJurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftfJurActionPerformed

    private void radAprazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAprazoActionPerformed
        // TODO add your handling code here:
        tftfAgen.setEnabled(false);
        tftfNcheq.setEnabled(false);
        ftfDataPag.setEnabled(false);

        tftfJur.setEnabled(true);
        tftfQtdeMes.setEnabled(true);
        ftfDataVenc.setEnabled(true);
            
        if(radAvista.isSelected() && radAprazo.isSelected() ){         
            radAvista.setSelected(false);
            radAprazo.setSelected(true);
            
            tftfAgen.setText("");
            tftfNcheq.setText("");
            ftfDataPag.setText("");                   
        }
        else{
            radAprazo.setSelected(true);
        }

    }//GEN-LAST:event_radAprazoActionPerformed

    private void cboxCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCursosActionPerformed
        // TODO add your handling code here:
        
        turmas = daoTurma.ListarTurmas( String.valueOf(cboxCursos.getSelectedItem()) );
        
        cboxTurmas.removeAllItems();
        curso = daoCurso.consultar( String.valueOf(cboxCursos.getSelectedItem()) );
        txtfValor.setText( Double.toString( curso.getValor() ) );
        
        for (int i = 0; i < turmas.size(); i++){
            if (turmas.get(i) != null){ 
                cboxTurmas.addItem(turmas.get(i).getSiglaTurma());
            }
            
        }
        
    }//GEN-LAST:event_cboxCursosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conexao = new Conexao("alex", "alex1234");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
            
        radAvista.setSelected(false);
        radAprazo.setSelected(false);
        
        daoTurma = new DaoTurma(conexao.conectar());
        daoCurso = new DaoCurso(conexao.conectar());
        daoMatricula = new DaoMatricula(conexao.conectar());
        daoPessoa = new DaoPessoa(conexao.conectar());
        daoAluno = new DaoAluno(conexao.conectar());        
        daoAprazo = new DaoAPrazo((conexao.conectar()));
        daoAvista = new DaoAVista((conexao.conectar()));
        
        cboxCursos.removeAllItems();
        
        cursos = daoCurso.ListarCursos();
        turmas = daoTurma.ListarTurmas("COMP");
        
        for (int i = 0; i < cursos.size() ; i++){
            cboxCursos.addItem(cursos.get(i).getSigla());
        }
        
        //enable
        ftfCPFAluno.setEnabled(false);
        ftfDataPag.setEnabled(false);
        ftfDataVenc.setEnabled(false);
        
        btnAlterar.setEnabled(false);
        btnInserir.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        radAprazo.setEnabled(false);
        radAvista.setEnabled(false);
        
        tftfAgen.setEnabled(false);
        tftfJur.setEnabled(false);
        tftfNcheq.setEnabled(false);
        tftfQtdeMes.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void cboxTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTurmasActionPerformed
        // TODO add your handling code here:
        ftfCPFAluno.setEnabled(true);
        radAprazo.setEnabled(true);
        radAvista.setEnabled(true);
        
        turmas = daoTurma.ListarTurmas( String.valueOf(cboxCursos.getSelectedItem()) );
        
        if ( cboxTurmas.getItemCount() > 0 ) turma = turmas.get(cboxTurmas.getSelectedIndex()); 
        
    }//GEN-LAST:event_cboxTurmasActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        
        aluno = daoAluno.Consultar(cpf);
        
        matricula = new Matricula();        
        matricula.addAluno(aluno);
        matricula.addTurma( daoTurma.consultar( String.valueOf(cboxTurmas.getSelectedItem()) ) );
        matricula.setData(ftfDataMatricula.getText().replaceAll("[(,//),-]", ""));        
        matricula.setQtdeFaltas(0);
                
        daoMatricula.inserir(matricula);
        
        if ( radAprazo.isSelected() == true ){
            System.out.println("Pra");
            aPrazo.setDtVencimento( ftfDataVenc.getText() );
            aPrazo.setMatricula(matricula);
            aPrazo.setQtdeMensalidade( Integer.parseInt( tftfQtdeMes.getText() ) );
            aPrazo.setTaxaJuros( Double.parseDouble( tftfJur.getText() ));
            aPrazo.setValor( Double.parseDouble(txtfValor.getText()) );
            
            daoAprazo.inserir(aPrazo);
        }
        else if( radAvista.isSelected() == true){
            System.out.println("Vid");
            aVista.setAgencia( Integer.parseInt(tftfAgen.getText()) );
            aVista.setMatricula(matricula);
            aVista.setNCheque( Integer.parseInt(cpf) );
            aVista.setPreData(cpf);            
            aVista.setValor( Double.parseDouble(txtfValor.getText()) );
            
            daoAvista.inserir(aVista);
        }
        
        
    }//GEN-LAST:event_btnInserirActionPerformed

    private void ftfCPFAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfCPFAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfCPFAlunoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        matricula = new Matricula();        
        matricula.addAluno(aluno);
        matricula.addTurma( daoTurma.consultar( String.valueOf(cboxTurmas.getSelectedItem()) ) );
        matricula.setData(ftfDataMatricula.getText().replaceAll("[(,//),-]", ""));
        
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIEfetuarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEfetuarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEfetuarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEfetuarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboxCursos;
    private javax.swing.JComboBox<String> cboxTurmas;
    private javax.swing.JFormattedTextField ftfCPFAluno;
    private javax.swing.JFormattedTextField ftfDataMatricula;
    private javax.swing.JFormattedTextField ftfDataPag;
    private javax.swing.JFormattedTextField ftfDataVenc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panlPagamento;
    private javax.swing.JRadioButton radAprazo;
    private javax.swing.JRadioButton radAvista;
    private javax.swing.JTextField tftfAgen;
    private javax.swing.JTextField tftfJur;
    private javax.swing.JTextField tftfNcheq;
    private javax.swing.JTextField tftfQtdeMes;
    private javax.swing.JTextField txtfNome;
    private javax.swing.JTextField txtfValor;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao;
    private DaoPessoa daoPessoa;
    private DaoAluno daoAluno;
    private DaoMatricula daoMatricula;
    private DaoAPrazo daoAprazo;
    private DaoAVista daoAvista;
    private DaoTurma daoTurma;
    private DaoCurso daoCurso;
    private Pessoa pessoa;
    private Matricula matricula;
    private APrazo aPrazo;
    private AVista aVista;
    private Curso curso;
    private Turma turma;
    private Aluno aluno;
    ArrayList<Curso> cursos;
    ArrayList<Turma> turmas;
    private String cpf;
}
