/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java17hcb.library.view;

import com.java17hcb.library.bus.BusBook;
import com.java17hcb.library.entity.Book;
import com.java17hcb.library.utils.CurrentStaff;
import com.java17hcb.library.utils.FormVerifier;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;

public class ImportDialog extends javax.swing.JDialog {
    private java.awt.Frame parent; 

    public ImportDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
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

        btngType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbAuthor = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        tfAuthor = new javax.swing.JTextField();
        lbType = new javax.swing.JLabel();
        rbA = new javax.swing.JRadioButton();
        rbB = new javax.swing.JRadioButton();
        rbC = new javax.swing.JRadioButton();
        lbPrice = new javax.swing.JLabel();
        lbErrTitle = new javax.swing.JLabel();
        lbErrAuthor = new javax.swing.JLabel();
        snPrice = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        lbPublisher = new javax.swing.JLabel();
        tfPublisher = new javax.swing.JTextField();
        lbYear = new javax.swing.JLabel();
        snYear = new javax.swing.JSpinner();
        lbErrPublisher = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbImportBy = new javax.swing.JLabel();
        tfImportBy = new javax.swing.JTextField();
        lbCopies = new javax.swing.JLabel();
        snCopies = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Information"));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 190));

        lbTitle.setText("Title");

        lbAuthor.setText("Author");

        tfTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTitleKeyReleased(evt);
            }
        });

        tfAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAuthorKeyReleased(evt);
            }
        });

        lbType.setText("Type");

        btngType.add(rbA);
        rbA.setSelected(true);
        rbA.setText("A");
        rbA.setActionCommand("");

        btngType.add(rbB);
        rbB.setText("B");
        rbB.setActionCommand("");

        btngType.add(rbC);
        rbC.setText("C");
        rbC.setActionCommand("");

        lbPrice.setText("Price");

        lbErrTitle.setForeground(new java.awt.Color(255, 51, 51));
        lbErrTitle.setText(" ");
        lbErrTitle.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbErrTitlePropertyChange(evt);
            }
        });

        lbErrAuthor.setForeground(new java.awt.Color(255, 51, 51));
        lbErrAuthor.setText(" ");
        lbErrAuthor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbErrAuthorPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAuthor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbType, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPrice, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTitle)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbErrAuthor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbErrTitle)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbC))))
                            .addComponent(snPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle)
                    .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAuthor)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbType)
                    .addComponent(rbA)
                    .addComponent(rbB)
                    .addComponent(rbC))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice)
                    .addComponent(snPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Publish Information"));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 95));

        lbPublisher.setText("Publisher");

        tfPublisher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPublisherKeyReleased(evt);
            }
        });

        lbYear.setText("Year");

        lbErrPublisher.setForeground(new java.awt.Color(255, 51, 51));
        lbErrPublisher.setText(" ");
        lbErrPublisher.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbErrPublisherPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPublisher, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbYear, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPublisher)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbErrPublisher)
                            .addComponent(snYear, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 158, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPublisher)
                    .addComponent(tfPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbYear)
                    .addComponent(snYear, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Import Information"));

        lbImportBy.setText("Import by");

        tfImportBy.setEditable(false);

        lbCopies.setText("Copies");

        snCopies.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbImportBy, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCopies, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfImportBy)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(snCopies, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbImportBy)
                    .addComponent(tfImportBy, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCopies)
                    .addComponent(snCopies, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOK)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancel, btnOK});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String title = tfTitle.getText();
        String author = tfAuthor.getText();
        long price = (Integer)snPrice.getValue();
        String publisher = tfPublisher.getText();
        Date publishYear = (Date)snYear.getValue();
        int copies = (Integer)snCopies.getValue();
        int type = 0;
        switch(btngType.getSelection().getActionCommand()){
            case "A":
                type = Book.Type.A;
                break;
            case "B":
                type = Book.Type.B;
                break;
            case "C":
                type = Book.Type.C;
                break;
        }
        
        int result = BusBook.getInstance().importBook(title, type, author, publishYear, publisher, price, copies);
        switch(result){
            case BusBook.CURRENT_STAFF_DONT_HAVE_PERMISSION:
                JOptionPane.showMessageDialog(this, 
                        "You don't have permission to import book. Please login with another account and try again!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case BusBook.IMPORT_UNKNOWN_ERROR:
                JOptionPane.showMessageDialog(this, 
                                        "There is some problem when insert book to database. Please try again later.",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                break;
            case BusBook.IMPORT_SUCCESS:
                JOptionPane.showMessageDialog(this, 
                                        "Insert book to database success!",
                                        "Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        ((MainFrame)parent).setupBookTable();
        dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void tfTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTitleKeyReleased
        FormVerifier.verifyInput(btnOK, tfTitle, lbErrTitle, "Title");
    }//GEN-LAST:event_tfTitleKeyReleased

    private void tfAuthorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAuthorKeyReleased
        FormVerifier.verifyInput(btnOK, tfAuthor, lbErrAuthor, "Author");
    }//GEN-LAST:event_tfAuthorKeyReleased

    private void lbErrTitlePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbErrTitlePropertyChange
        List<String> errMessages = new ArrayList<>();
        errMessages.add(lbErrTitle.getText());
        errMessages.add(lbErrAuthor.getText());
        errMessages.add(lbErrPublisher.getText());
        btnOK.setEnabled(FormVerifier.enableBtnConfirm(errMessages));
    }//GEN-LAST:event_lbErrTitlePropertyChange

    private void lbErrAuthorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbErrAuthorPropertyChange
        List<String> errMessages = new ArrayList<>();
        errMessages.add(lbErrTitle.getText());
        errMessages.add(lbErrAuthor.getText());
        errMessages.add(lbErrPublisher.getText());
        btnOK.setEnabled(FormVerifier.enableBtnConfirm(errMessages));
    }//GEN-LAST:event_lbErrAuthorPropertyChange

    private void lbErrPublisherPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbErrPublisherPropertyChange
        List<String> errMessages = new ArrayList<>();
        errMessages.add(lbErrTitle.getText());
        errMessages.add(lbErrAuthor.getText());
        errMessages.add(lbErrPublisher.getText());
        btnOK.setEnabled(FormVerifier.enableBtnConfirm(errMessages));
    }//GEN-LAST:event_lbErrPublisherPropertyChange

    private void tfPublisherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPublisherKeyReleased
        FormVerifier.verifyInput(btnOK, tfPublisher, lbErrPublisher, "Publisher");
    }//GEN-LAST:event_tfPublisherKeyReleased
    
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
            java.util.logging.Logger.getLogger(ImportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImportDialog dialog = new ImportDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.ButtonGroup btngType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbAuthor;
    private javax.swing.JLabel lbCopies;
    private javax.swing.JLabel lbErrAuthor;
    private javax.swing.JLabel lbErrPublisher;
    private javax.swing.JLabel lbErrTitle;
    private javax.swing.JLabel lbImportBy;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbPublisher;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbType;
    private javax.swing.JLabel lbYear;
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbC;
    private javax.swing.JSpinner snCopies;
    private javax.swing.JSpinner snPrice;
    private javax.swing.JSpinner snYear;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfImportBy;
    private javax.swing.JTextField tfPublisher;
    private javax.swing.JTextField tfTitle;
    // End of variables declaration//GEN-END:variables

    private void setupComponents(){
        setTitle("Import book");
        setLocationRelativeTo(null);
        btnOK.setEnabled(false);
        
        // Set actionCommand for radio button
        rbA.setActionCommand("A");
        rbB.setActionCommand("B");
        rbC.setActionCommand("C");
        
        // Setup price spinner
        SpinnerNumberModel numberModel = new SpinnerNumberModel(5_000,5_000,10_000_000, 5_000);
        snPrice.setModel(numberModel);
        snPrice.setEditor(new JSpinner.NumberEditor(snPrice, "#,###"));
        
        // Setup publish year spinner
        Calendar cal = Calendar.getInstance();
        Date initDate = cal.getTime();
        Date latestDate = cal.getTime();
        cal.add(Calendar.YEAR, -8);
        Date earliestDate = cal.getTime();
        
        SpinnerDateModel dateModel = new SpinnerDateModel(initDate, earliestDate, latestDate, Calendar.YEAR);
        snYear.setModel(dateModel);
        snYear.setEditor(new JSpinner.DateEditor(snYear, "yyyy"));       
        
        if(CurrentStaff.getCurrentStaff() != null){
            tfImportBy.setText(CurrentStaff.getCurrentStaff().getFullName());
        }
    }
}
