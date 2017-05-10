/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.view;

import java.util.List;
import swinga.entity.Client;
import swinga.service.ClientService;
import swinga.view.tablemodel.TableModelClient;

/**
 *
 * @author Administrateur
 */
public class JPanelListClients extends javax.swing.JPanel {

    /**
     * Creates new form JPanelListClients
     */
    public JPanelListClients() {
        initComponents();
        ClientService clService = new ClientService();
        List<Client> listClients=clService.lister();
        this.jtListeClient.setModel(new TableModelClient(listClients));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jbAjoutHotelPanel = new javax.swing.JButton();
        jbModifHotelPanel = new javax.swing.JButton();
        jbSupprimerHotelPanel = new javax.swing.JButton();
        jbGererChambres = new javax.swing.JButton();
        jspCentreHotL = new javax.swing.JScrollPane();
        jtListeClient = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jbAjoutHotelPanel.setText("Ajouter");
        jbAjoutHotelPanel.setFocusable(false);
        jbAjoutHotelPanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAjoutHotelPanel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAjoutHotelPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAjoutHotelPanelActionPerformed(evt);
            }
        });
        jToolBar1.add(jbAjoutHotelPanel);

        jbModifHotelPanel.setText("Modifier");
        jbModifHotelPanel.setFocusable(false);
        jbModifHotelPanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbModifHotelPanel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbModifHotelPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModifHotelPanelActionPerformed(evt);
            }
        });
        jToolBar1.add(jbModifHotelPanel);

        jbSupprimerHotelPanel.setText("Supprimer");
        jbSupprimerHotelPanel.setFocusable(false);
        jbSupprimerHotelPanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSupprimerHotelPanel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbSupprimerHotelPanel);

        jbGererChambres.setText("Gérer les clients");
        jbGererChambres.setFocusable(false);
        jbGererChambres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbGererChambres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbGererChambres);

        add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jtListeClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jspCentreHotL.setViewportView(jtListeClient);

        add(jspCentreHotL, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAjoutHotelPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAjoutHotelPanelActionPerformed
        //this.add(new JPanelHotel(),BorderLayout.CENTER);

        JPanelPrincipale parent =(JPanelPrincipale)this.getParent();
        parent.remplaceComposanCentral(new JPanelClient());

    }//GEN-LAST:event_jbAjoutHotelPanelActionPerformed

    private void jbModifHotelPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModifHotelPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbModifHotelPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbAjoutHotelPanel;
    private javax.swing.JButton jbGererChambres;
    private javax.swing.JButton jbModifHotelPanel;
    private javax.swing.JButton jbSupprimerHotelPanel;
    private javax.swing.JScrollPane jspCentreHotL;
    private javax.swing.JTable jtListeClient;
    // End of variables declaration//GEN-END:variables
}
