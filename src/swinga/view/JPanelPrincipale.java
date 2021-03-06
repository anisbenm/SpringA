/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.view;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Administrateur
 */
public class JPanelPrincipale extends javax.swing.JPanel {

    public void remplaceComposanCentral(JPanel NouveauPanneau) {

        //supprime le panneau du centre s'il existe 
        BorderLayout layout = (BorderLayout) this.getLayout();
        Component component = layout.getLayoutComponent(BorderLayout.CENTER);
        if (component != null) {
            this.remove(component);
        }

        //Ajouter un NouveauPanneau au centre 
        this.add(NouveauPanneau, BorderLayout.CENTER);

        //Raffraichit l'affichage de l'objet actuel(un JPanelPrincipal donc) et 
        //de tous ses composants enfants , petits enfants ...
        this.validate();

    }

    /**
     * Creates new form JPanelPrincipale
     */
    public JPanelPrincipale() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jbHotel = new javax.swing.JButton();
        jbChambre = new javax.swing.JButton();
        jbClient = new javax.swing.JButton();
        jbReservation = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jbHotel.setText("Hotel");
        jbHotel.setFocusable(false);
        jbHotel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbHotel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHotelActionPerformed(evt);
            }
        });
        jToolBar1.add(jbHotel);

        jbChambre.setText("Chambre");
        jbChambre.setFocusable(false);
        jbChambre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbChambre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbChambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChambreActionPerformed(evt);
            }
        });
        jToolBar1.add(jbChambre);

        jbClient.setText("Client");
        jbClient.setFocusable(false);
        jbClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbClient.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientActionPerformed(evt);
            }
        });
        jToolBar1.add(jbClient);

        jbReservation.setText("Reservation");
        jbReservation.setFocusable(false);
        jbReservation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbReservation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservationActionPerformed(evt);
            }
        });
        jToolBar1.add(jbReservation);

        add(jToolBar1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jbChambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChambreActionPerformed
    remplaceComposanCentral(new JPanelListChambre());

    }//GEN-LAST:event_jbChambreActionPerformed

    private void jbHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHotelActionPerformed

         remplaceComposanCentral(new JPanelListeHotels());

    }//GEN-LAST:event_jbHotelActionPerformed

    private void jbClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientActionPerformed
    remplaceComposanCentral(new JPanelListClients());
    }//GEN-LAST:event_jbClientActionPerformed

    private void jbReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservationActionPerformed
             remplaceComposanCentral(new JPanelListReservation());
    }//GEN-LAST:event_jbReservationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbChambre;
    private javax.swing.JButton jbClient;
    private javax.swing.JButton jbHotel;
    private javax.swing.JButton jbReservation;
    // End of variables declaration//GEN-END:variables
}
