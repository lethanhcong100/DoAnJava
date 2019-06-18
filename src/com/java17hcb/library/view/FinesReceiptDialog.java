/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java17hcb.library.view;

import com.java17hcb.library.bus.BusStaff;
import com.java17hcb.library.entity.LibraryCard;
import com.java17hcb.library.utils.CurrentStaff;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author labyr
 */
public class FinesReceiptDialog extends javax.swing.JDialog {

    private java.awt.Frame parent; 
    private LibraryCard card;
    
    public FinesReceiptDialog(java.awt.Frame parent, boolean modal, LibraryCard card) {
        super(parent, modal);
        this.parent = parent;
        this.card = card;
        
        initComponents();
        setupComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngReason = new javax.swing.ButtonGroup();
        pnInfo = new javax.swing.JPanel();
        lbStaff = new javax.swing.JLabel();
        lbReader = new javax.swing.JLabel();
        tfStaff = new javax.swing.JTextField();
        tfReader = new javax.swing.JTextField();
        lbFinesFee = new javax.swing.JLabel();
        tfFinesFee = new javax.swing.JTextField();
        lbPayment = new javax.swing.JLabel();
        snPayment = new javax.swing.JSpinner();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbStaff.setText("Staff");

        lbReader.setText("Reader");

        tfStaff.setEditable(false);

        tfReader.setEditable(false);

        lbFinesFee.setText("Fines Fee");

        tfFinesFee.setEditable(false);

        lbPayment.setText("Payment");

        javax.swing.GroupLayout pnInfoLayout = new javax.swing.GroupLayout(pnInfo);
        pnInfo.setLayout(pnInfoLayout);
        pnInfoLayout.setHorizontalGroup(
            pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbStaff, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbReader, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbFinesFee, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPayment, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(tfReader)
                    .addComponent(tfFinesFee)
                    .addGroup(pnInfoLayout.createSequentialGroup()
                        .addComponent(snPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnInfoLayout.setVerticalGroup(
            pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoLayout.createSequentialGroup()
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStaff)
                    .addComponent(tfStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReader)
                    .addComponent(tfReader, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFinesFee)
                    .addComponent(tfFinesFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPayment)
                    .addComponent(snPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnOK)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancel, btnOK});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        
        Object test = snPayment;
        long payment = (Integer)snPayment.getValue();
        
        int status = BusStaff.getInstance().createFinesReceipt(card.getId(), payment);
        switch(status){
            case BusStaff.CURRENT_STAFF_DONT_HAVE_PERMISSION:
                JOptionPane.showMessageDialog(this, 
                        "Current staff don't have permission.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case BusStaff.PAYMENT_LARGER_THAN_FINES:
                JOptionPane.showMessageDialog(this, 
                        "Payment larger than fines",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case BusStaff.PAYMENT_LIBRARY_CARD_NOT_EXIST:
                JOptionPane.showMessageDialog(this, 
                        "This library card not exists",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case BusStaff.PAYMENT_UNKNOWN_ERROR:
                JOptionPane.showMessageDialog(this, 
                        "Unknown error.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case BusStaff.PAYMENT_SUCCESS:
                JOptionPane.showMessageDialog(this, 
                        "Create new fines receipt success!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        
        ((MainFrame)parent).setupCardTable();
        dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.ButtonGroup btngReason;
    private javax.swing.JLabel lbFinesFee;
    private javax.swing.JLabel lbPayment;
    private javax.swing.JLabel lbReader;
    private javax.swing.JLabel lbStaff;
    private javax.swing.JPanel pnInfo;
    private javax.swing.JSpinner snPayment;
    private javax.swing.JTextField tfFinesFee;
    private javax.swing.JTextField tfReader;
    private javax.swing.JTextField tfStaff;
    // End of variables declaration//GEN-END:variables

    private void setupComponents() {
        setTitle("Create Fines Receipt");
        setLocationRelativeTo(null);
        
        // Set staff's name
        tfStaff.setText(CurrentStaff.getCurrentStaff().getFullName());
        
        // Set reader's name
        tfReader.setText(card.getFullName());
        
        // Set fines fee
        tfFinesFee.setText(card.getFinesFee() + "đ");

        // Set spinner payment model
        SpinnerNumberModel numberModel;
        if(card.getFinesFee() <= 0){
            numberModel = new SpinnerNumberModel(0, 0, card.getFinesFee(), 1_000);
        } else{
            numberModel = new SpinnerNumberModel(1_000, 1_000, (int)card.getFinesFee(), 1_000);
        }
        snPayment.setModel(numberModel);
    }
}
