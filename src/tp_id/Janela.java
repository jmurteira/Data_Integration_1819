/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_id;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.saxon.s9api.SaxonApiException;
import org.jdom2.Document;
import static tp_id.TP_ID.adicionaInfoAmbosFicheiros;
import static tp_id.TP_ID.alteraPopulacao;
import static tp_id.TP_ID.alteraPresidente;
import static tp_id.TP_ID.removePaisFicheiros;
import static tp_id.TP_ID.validarDocumentoDTD;
import static tp_id.TP_ID.validarDocumentoXSD;

/**
 *
 * @author joaop
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Creates new form Janela
     */
    public Janela() {
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

        JanelaAdicionaPais = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        CampoTextPaisParaAdicionar = new javax.swing.JTextField();
        BotaoAdicionarPais = new javax.swing.JButton();
        JanelaRemovePais = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        CampoTextPaisParaRemover = new javax.swing.JTextField();
        BotaoRemoverPais = new javax.swing.JButton();
        JanelaEditaPresi = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        CampoTextPaisParaEditarPres = new javax.swing.JTextField();
        BotaoEditaPresi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CampoTextPresidente = new javax.swing.JTextField();
        JanelaEditaPop = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        CampoTextPaisParaEditarPop = new javax.swing.JTextField();
        BotaoEditaPop = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CampoTextPopulacao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        MenuBar = new javax.swing.JMenuBar();
        MenuPrincipal = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();
        MenuXML = new javax.swing.JMenu();
        VerPaisesXML = new javax.swing.JMenuItem();
        ApagarPaisesXML = new javax.swing.JMenuItem();
        VerFactosXML = new javax.swing.JMenuItem();
        ApagarFactosXML = new javax.swing.JMenuItem();
        MenuAdicionar = new javax.swing.JMenu();
        AdicionarPais = new javax.swing.JMenuItem();
        MenuEditar = new javax.swing.JMenu();
        EditarPresPais = new javax.swing.JMenuItem();
        EditarPopPais = new javax.swing.JMenuItem();
        EditarCidMPop = new javax.swing.JMenuItem();
        MenuRemover = new javax.swing.JMenu();
        RemoverPais = new javax.swing.JMenuItem();
        MenuXSLT = new javax.swing.JMenu();
        XMLparaHTML_FLAGS = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ValidarPaisesDTD = new javax.swing.JMenuItem();
        ValidarFactosDTD = new javax.swing.JMenuItem();
        ValidarPaisesXSD = new javax.swing.JMenuItem();
        ValidarFactosXSD = new javax.swing.JMenuItem();

        jLabel1.setText("Nome do País:");

        BotaoAdicionarPais.setText("Adicionar");
        BotaoAdicionarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JanelaAdicionaPaisLayout = new javax.swing.GroupLayout(JanelaAdicionaPais.getContentPane());
        JanelaAdicionaPais.getContentPane().setLayout(JanelaAdicionaPaisLayout);
        JanelaAdicionaPaisLayout.setHorizontalGroup(
            JanelaAdicionaPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JanelaAdicionaPaisLayout.createSequentialGroup()
                .addGroup(JanelaAdicionaPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JanelaAdicionaPaisLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(CampoTextPaisParaAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(JanelaAdicionaPaisLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoAdicionarPais)))
                .addGap(32, 32, 32))
        );
        JanelaAdicionaPaisLayout.setVerticalGroup(
            JanelaAdicionaPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaAdicionaPaisLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(JanelaAdicionaPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoTextPaisParaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoAdicionarPais)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLabel2.setText("Nome do País:");

        BotaoRemoverPais.setText("Remover");
        BotaoRemoverPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JanelaRemovePaisLayout = new javax.swing.GroupLayout(JanelaRemovePais.getContentPane());
        JanelaRemovePais.getContentPane().setLayout(JanelaRemovePaisLayout);
        JanelaRemovePaisLayout.setHorizontalGroup(
            JanelaRemovePaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JanelaRemovePaisLayout.createSequentialGroup()
                .addGroup(JanelaRemovePaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JanelaRemovePaisLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoRemoverPais))
                    .addGroup(JanelaRemovePaisLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(CampoTextPaisParaRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        JanelaRemovePaisLayout.setVerticalGroup(
            JanelaRemovePaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaRemovePaisLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(JanelaRemovePaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoTextPaisParaRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoRemoverPais)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLabel3.setText("Nome do País:");

        BotaoEditaPresi.setText("Alterar Informação");
        BotaoEditaPresi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditaPresiActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome do Presidente:");

        CampoTextPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTextPresidenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JanelaEditaPresiLayout = new javax.swing.GroupLayout(JanelaEditaPresi.getContentPane());
        JanelaEditaPresi.getContentPane().setLayout(JanelaEditaPresiLayout);
        JanelaEditaPresiLayout.setHorizontalGroup(
            JanelaEditaPresiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JanelaEditaPresiLayout.createSequentialGroup()
                .addGroup(JanelaEditaPresiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JanelaEditaPresiLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoEditaPresi))
                    .addGroup(JanelaEditaPresiLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(JanelaEditaPresiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(JanelaEditaPresiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoTextPaisParaEditarPres)
                            .addComponent(CampoTextPresidente, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        JanelaEditaPresiLayout.setVerticalGroup(
            JanelaEditaPresiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaEditaPresiLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(JanelaEditaPresiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoTextPaisParaEditarPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JanelaEditaPresiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoTextPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotaoEditaPresi)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel5.setText("Nome do País:");

        BotaoEditaPop.setText("Alterar Informação");
        BotaoEditaPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditaPopActionPerformed(evt);
            }
        });

        jLabel6.setText("População:");

        CampoTextPopulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTextPopulacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JanelaEditaPopLayout = new javax.swing.GroupLayout(JanelaEditaPop.getContentPane());
        JanelaEditaPop.getContentPane().setLayout(JanelaEditaPopLayout);
        JanelaEditaPopLayout.setHorizontalGroup(
            JanelaEditaPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JanelaEditaPopLayout.createSequentialGroup()
                .addGroup(JanelaEditaPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JanelaEditaPopLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoEditaPop))
                    .addGroup(JanelaEditaPopLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(JanelaEditaPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(7, 7, 7)
                        .addGroup(JanelaEditaPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoTextPaisParaEditarPop)
                            .addComponent(CampoTextPopulacao, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        JanelaEditaPopLayout.setVerticalGroup(
            JanelaEditaPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaEditaPopLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(JanelaEditaPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoTextPaisParaEditarPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JanelaEditaPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CampoTextPopulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotaoEditaPop)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        MenuPrincipal.setText("Principal");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        MenuPrincipal.add(Sair);

        MenuBar.add(MenuPrincipal);

        MenuXML.setText("XML");

        VerPaisesXML.setText("Ver ficheiro paises.xml");
        VerPaisesXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPaisesXMLActionPerformed(evt);
            }
        });
        MenuXML.add(VerPaisesXML);

        ApagarPaisesXML.setText("Apagar ficheiro paises.xml");
        ApagarPaisesXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarPaisesXMLActionPerformed(evt);
            }
        });
        MenuXML.add(ApagarPaisesXML);

        VerFactosXML.setText("Ver ficheiro factos.xml");
        VerFactosXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerFactosXMLActionPerformed(evt);
            }
        });
        MenuXML.add(VerFactosXML);

        ApagarFactosXML.setText("Apagar ficheiro factos.xml");
        ApagarFactosXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarFactosXMLActionPerformed(evt);
            }
        });
        MenuXML.add(ApagarFactosXML);

        MenuBar.add(MenuXML);

        MenuAdicionar.setText("Adicionar");

        AdicionarPais.setText("Adicionar info de um País");
        AdicionarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarPaisActionPerformed(evt);
            }
        });
        MenuAdicionar.add(AdicionarPais);

        MenuBar.add(MenuAdicionar);

        MenuEditar.setText("Editar");

        EditarPresPais.setText("Editar Presidente de um País");
        EditarPresPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPresPaisActionPerformed(evt);
            }
        });
        MenuEditar.add(EditarPresPais);

        EditarPopPais.setText("Editar População de um País");
        EditarPopPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPopPaisActionPerformed(evt);
            }
        });
        MenuEditar.add(EditarPopPais);

        EditarCidMPop.setText("Editar Cidade Mais Populosa de um País");
        EditarCidMPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCidMPopActionPerformed(evt);
            }
        });
        MenuEditar.add(EditarCidMPop);

        MenuBar.add(MenuEditar);

        MenuRemover.setText("Remover");

        RemoverPais.setText("Remover info de um País");
        RemoverPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverPaisActionPerformed(evt);
            }
        });
        MenuRemover.add(RemoverPais);

        MenuBar.add(MenuRemover);

        MenuXSLT.setText("XSLT");

        XMLparaHTML_FLAGS.setText("XML para HTML --> Bandeiras");
        XMLparaHTML_FLAGS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XMLparaHTML_FLAGSActionPerformed(evt);
            }
        });
        MenuXSLT.add(XMLparaHTML_FLAGS);

        MenuBar.add(MenuXSLT);

        jMenu1.setText("Validar");

        ValidarPaisesDTD.setText("Validar paises.xml DTD");
        ValidarPaisesDTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidarPaisesDTDActionPerformed(evt);
            }
        });
        jMenu1.add(ValidarPaisesDTD);

        ValidarFactosDTD.setText("Validar factos.xml DTD");
        ValidarFactosDTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidarFactosDTDActionPerformed(evt);
            }
        });
        jMenu1.add(ValidarFactosDTD);

        ValidarPaisesXSD.setText("Validar paises.xml XSD");
        ValidarPaisesXSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidarPaisesXSDActionPerformed(evt);
            }
        });
        jMenu1.add(ValidarPaisesXSD);

        ValidarFactosXSD.setText("Validar factos.xml XSD");
        ValidarFactosXSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidarFactosXSDActionPerformed(evt);
            }
        });
        jMenu1.add(ValidarFactosXSD);

        MenuBar.add(jMenu1);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void VerPaisesXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPaisesXMLActionPerformed
        // TODO add your handling code here:
        Document doc = XMLJDomFunctions.lerDocumentoXML("paises.xml");
        String s = "Ficheiro Não Existe";
        if (doc != null) {
            s = XMLJDomFunctions.escreverDocumentoString(doc);
        }
        jTextArea1.setText(s);
    }//GEN-LAST:event_VerPaisesXMLActionPerformed

    private void VerFactosXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerFactosXMLActionPerformed
        // TODO add your handling code here:
        Document doc = XMLJDomFunctions.lerDocumentoXML("factos.xml");
        String s = "Ficheiro Não Existe";
        if (doc != null) {
            s = XMLJDomFunctions.escreverDocumentoString(doc);
        }
        jTextArea1.setText(s);
    }//GEN-LAST:event_VerFactosXMLActionPerformed

    private void ApagarPaisesXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarPaisesXMLActionPerformed
        // TODO add your handling code here:
        File f = new File("paises.xml");
        if (f != null) {
            f.delete();
        }
        jTextArea1.setText("Ficheiro Removido");
    }//GEN-LAST:event_ApagarPaisesXMLActionPerformed

    private void ApagarFactosXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarFactosXMLActionPerformed
        // TODO add your handling code here:
        File f = new File("factos.xml");
        if (f != null) {
            f.delete();
        }
        jTextArea1.setText("Ficheiro Removido");
    }//GEN-LAST:event_ApagarFactosXMLActionPerformed

    private void AdicionarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarPaisActionPerformed
        JanelaAdicionaPais.setSize(400, 200);
        JanelaAdicionaPais.setLocation(300, 300);
        JanelaAdicionaPais.setTitle("Adicionar um País");
        JanelaAdicionaPais.setVisible(true);
    }//GEN-LAST:event_AdicionarPaisActionPerformed

    
    private void BotaoAdicionarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarPaisActionPerformed
        // TODO add your handling code here:
        String pesquisa = CampoTextPaisParaAdicionar.getText();
        
        try {
            adicionaInfoAmbosFicheiros(pesquisa);
        } catch (IOException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SaxonApiException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAdicionarPaisActionPerformed

    private void BotaoRemoverPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverPaisActionPerformed
        // TODO add your handling code here:
        String pesquisa = CampoTextPaisParaRemover.getText();
        
        removePaisFicheiros(pesquisa);
    }//GEN-LAST:event_BotaoRemoverPaisActionPerformed

    private void RemoverPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverPaisActionPerformed
        JanelaRemovePais.setSize(400, 200);
        JanelaRemovePais.setLocation(300, 300);
        JanelaRemovePais.setTitle("Remover um País");
        JanelaRemovePais.setVisible(true);
    }//GEN-LAST:event_RemoverPaisActionPerformed

    private void BotaoEditaPresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditaPresiActionPerformed
        // TODO add your handling code here:
        String pesquisa = CampoTextPaisParaEditarPres.getText();
        String novo_pres = CampoTextPresidente.getText();
        
        alteraPresidente(pesquisa, novo_pres);
    }//GEN-LAST:event_BotaoEditaPresiActionPerformed

    private void CampoTextPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTextPresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTextPresidenteActionPerformed

    private void EditarPresPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPresPaisActionPerformed
        // TODO add your handling code here:
        JanelaEditaPresi.setSize(400, 250);
        JanelaEditaPresi.setLocation(300, 300);
        JanelaEditaPresi.setTitle("Editar Presidente de um país");
        JanelaEditaPresi.setVisible(true);
    }//GEN-LAST:event_EditarPresPaisActionPerformed

    private void BotaoEditaPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditaPopActionPerformed
        // TODO add your handling code here:
        String pesquisa = CampoTextPaisParaEditarPop.getText();
        String pop = CampoTextPopulacao.getText();
        
        alteraPopulacao(pesquisa, pop);
    }//GEN-LAST:event_BotaoEditaPopActionPerformed

    private void CampoTextPopulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTextPopulacaoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CampoTextPopulacaoActionPerformed

    private void EditarPopPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPopPaisActionPerformed
        // TODO add your handling code here:
        JanelaEditaPop.setSize(400, 250);
        JanelaEditaPop.setLocation(300, 300);
        JanelaEditaPop.setTitle("Editar População de um país");
        JanelaEditaPop.setVisible(true);
    }//GEN-LAST:event_EditarPopPaisActionPerformed

    private void EditarCidMPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCidMPopActionPerformed
        // TODO add your handling code here:
        JanelaEditaPop.setSize(400, 250);
        JanelaEditaPop.setLocation(300, 300);
        JanelaEditaPop.setTitle("Editar Cidade mais populosa de um país");
        JanelaEditaPop.setVisible(true);
    }//GEN-LAST:event_EditarCidMPopActionPerformed

    private void XMLparaHTML_FLAGSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XMLparaHTML_FLAGSActionPerformed
        // TODO add your handling code here:
        Document doc = XMLJDomFunctions.lerDocumentoXML("paises.xml");
        if (doc != null) {
            Document novo = JDOMFunctions_XSLT.transformaDocumento(doc, "paises.xml", "transf_html.xsl");
            XMLJDomFunctions.escreverDocumentoParaFicheiro(novo, "teste.html");
            doc = XMLJDomFunctions.lerDocumentoXML("teste.html");
            String t = XMLJDomFunctions.escreverDocumentoString(doc);
            String url = "teste.html";
            File htmlFile = new File(url);
            try {
                Desktop.getDesktop().browse(htmlFile.toURI());
            } catch (IOException ex) {
                Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_XMLparaHTML_FLAGSActionPerformed

    private void ValidarPaisesDTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidarPaisesDTDActionPerformed
        try {
            // TODO add your handling code here:
            validarDocumentoDTD("paises.xml", "paises.dtd");
        } catch (IOException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ValidarPaisesDTDActionPerformed

    private void ValidarFactosDTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidarFactosDTDActionPerformed
        try {
            // TODO add your handling code here:
            validarDocumentoDTD("factos.xml", "factos.dtd");
        } catch (IOException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ValidarFactosDTDActionPerformed

    private void ValidarPaisesXSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidarPaisesXSDActionPerformed
        // TODO add your handling code here:
        validarDocumentoXSD("paises.xml", "paises.xsd");
    }//GEN-LAST:event_ValidarPaisesXSDActionPerformed

    private void ValidarFactosXSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidarFactosXSDActionPerformed
        // TODO add your handling code here:
        validarDocumentoXSD("factos.xml", "factos.xsd");
    }//GEN-LAST:event_ValidarFactosXSDActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdicionarPais;
    private javax.swing.JMenuItem ApagarFactosXML;
    private javax.swing.JMenuItem ApagarPaisesXML;
    private javax.swing.JButton BotaoAdicionarPais;
    private javax.swing.JButton BotaoEditaPop;
    private javax.swing.JButton BotaoEditaPresi;
    private javax.swing.JButton BotaoRemoverPais;
    private javax.swing.JTextField CampoTextPaisParaAdicionar;
    private javax.swing.JTextField CampoTextPaisParaEditarPop;
    private javax.swing.JTextField CampoTextPaisParaEditarPres;
    private javax.swing.JTextField CampoTextPaisParaRemover;
    private javax.swing.JTextField CampoTextPopulacao;
    private javax.swing.JTextField CampoTextPresidente;
    private javax.swing.JMenuItem EditarCidMPop;
    private javax.swing.JMenuItem EditarPopPais;
    private javax.swing.JMenuItem EditarPresPais;
    private javax.swing.JDialog JanelaAdicionaPais;
    private javax.swing.JDialog JanelaEditaPop;
    private javax.swing.JDialog JanelaEditaPresi;
    private javax.swing.JDialog JanelaRemovePais;
    private javax.swing.JMenu MenuAdicionar;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenu MenuPrincipal;
    private javax.swing.JMenu MenuRemover;
    private javax.swing.JMenu MenuXML;
    private javax.swing.JMenu MenuXSLT;
    private javax.swing.JMenuItem RemoverPais;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem ValidarFactosDTD;
    private javax.swing.JMenuItem ValidarFactosXSD;
    private javax.swing.JMenuItem ValidarPaisesDTD;
    private javax.swing.JMenuItem ValidarPaisesXSD;
    private javax.swing.JMenuItem VerFactosXML;
    private javax.swing.JMenuItem VerPaisesXML;
    private javax.swing.JMenuItem XMLparaHTML_FLAGS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
