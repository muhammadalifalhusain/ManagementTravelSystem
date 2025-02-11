/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.test;

import com.google.protobuf.TextFormat.ParseException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;   
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ACER
 */
public class ManagementTravel extends javax.swing.JFrame {

    /**
     * Creates new form ManagementTravel
     */
    public ManagementTravel() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void infoMessage(String message, String tittle){
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void clearFieldValue() {
        travel_noTF.setText("");
        travel_sourceTF.setText("");
        travel_destTF.setText("");
        departDateDP.setDate(null);
        departTimeTF.setText("");
        PriceTF.setText("");
        seatTF.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        travel_noTF = new javax.swing.JTextField();
        travel_sourceTF = new javax.swing.JTextField();
        travel_destTF = new javax.swing.JTextField();
        simpanBTN = new javax.swing.JButton();
        editBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        departTimeTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PriceTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        seatTF = new javax.swing.JTextField();
        departDateDP = new com.toedter.calendar.JDateChooser();
        hapusBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        reportBTN = new javax.swing.JButton();
        bookingBTN = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Management Admin");

        jLabel2.setText("PO Travel");

        jLabel3.setText("Keberangkatan");

        jLabel4.setText("Destination");

        travel_noTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travel_noTFActionPerformed(evt);
            }
        });

        travel_sourceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travel_sourceTFActionPerformed(evt);
            }
        });

        travel_destTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travel_destTFActionPerformed(evt);
            }
        });

        simpanBTN.setBackground(new java.awt.Color(204, 204, 204));
        simpanBTN.setText("Simpan");
        simpanBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBTNActionPerformed(evt);
            }
        });

        editBTN.setBackground(new java.awt.Color(204, 204, 204));
        editBTN.setText("Edit");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });

        jLabel6.setText("Waktu");

        departTimeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departTimeTFActionPerformed(evt);
            }
        });

        jLabel7.setText("Tanggal");

        jLabel8.setText("Harga");

        jLabel9.setText("Kursi");

        hapusBTN.setBackground(new java.awt.Color(204, 204, 204));
        hapusBTN.setText("Hapus");
        hapusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTNActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PO Travel", "Keberangkatan", "Tujuan", "Tanggal", "Waktu", "Harga", "Kursi Tersedia"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        reportBTN.setBackground(new java.awt.Color(204, 204, 204));
        reportBTN.setText("Report");
        reportBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBTNActionPerformed(evt);
            }
        });

        bookingBTN.setBackground(new java.awt.Color(204, 204, 204));
        bookingBTN.setText("Booking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(travel_noTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(departDateDP, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simpanBTN)
                            .addComponent(PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(departTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(travel_destTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(travel_sourceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hapusBTN)
                                    .addComponent(seatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(editBTN))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reportBTN)
                        .addGap(44, 44, 44)
                        .addComponent(bookingBTN))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportBTN)
                    .addComponent(bookingBTN))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(travel_noTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(travel_sourceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(departDateDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(travel_destTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(PriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(departTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(seatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanBTN)
                    .addComponent(editBTN)
                    .addComponent(hapusBTN))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void travel_sourceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travel_sourceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_travel_sourceTFActionPerformed

    private void simpanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBTNActionPerformed
        String travelnoD = travel_noTF.getText();
        String travelsourceD = travel_sourceTF.getText();
        String traveldestD = travel_destTF.getText();
        java.util.Date departDateD = departDateDP.getDate();
        java.sql.Date sqlDepartDate = new java.sql.Date(departDateD.getTime()); // Konversi ke java.sql.Date
        String departTimeD = departTimeTF.getText();
        String priceD = PriceTF.getText();
        String seatD = seatTF.getText();

try {
            // Menggunakan driver terbaru
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/travelfinal";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");

            Statement stat = con.createStatement();
            String selectQuery = "SELECT COUNT(*) FROM travel_details WHERE travel_no = '" + travelnoD + "'";
            ResultSet rs = stat.executeQuery(selectQuery);

            if (rs.next() && rs.getInt(1) > 0) {
                infoMessage("Details Travel sudah ada di database!", "Data Duplikat!!");
                clearFieldValue();
            } else {
                String insertQuery = "INSERT INTO travel_details (travel_no, keberangkatan, tujuan, tanggal, waktu, harga, kursi) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(insertQuery);
                pst.setString(1, travelnoD);
                pst.setString(2, travelsourceD);
                pst.setString(3, traveldestD);
                pst.setDate(4, sqlDepartDate); // Gunakan java.sql.Date
                pst.setString(5, departTimeD);
                pst.setString(6, priceD);
                pst.setString(7, seatD);

                int x = pst.executeUpdate();
                if (x > 0) {
                    infoMessage("Data Travel Baru ditambahkan!", "Sukses!!");
                    clearFieldValue();
                    loadData();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_simpanBTNActionPerformed

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
  String travelnoD = travel_noTF.getText();
    String travelsourceD = travel_sourceTF.getText();
    String traveldestD = travel_destTF.getText();
    java.util.Date departDateD = departDateDP.getDate();
    java.sql.Date sqlDepartDate = new java.sql.Date(departDateD.getTime());
    String departTimeD = departTimeTF.getText();
    String priceD = PriceTF.getText();
    String seatD = seatTF.getText();

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String databaseURL = "jdbc:mysql://localhost:3306/travelfinal";
        Connection con = DriverManager.getConnection(databaseURL, "root", "");

        String updateQuery = "UPDATE travel_details SET keberangkatan = ?, tujuan = ?, tanggal = ?, waktu = ?, harga = ?, kursi = ? WHERE travel_no = ?";
        PreparedStatement pst = con.prepareStatement(updateQuery);
        pst.setString(1, travelsourceD);
        pst.setString(2, traveldestD);
        pst.setDate(3, sqlDepartDate);
        pst.setString(4, departTimeD);
        pst.setString(5, priceD);
        pst.setString(6, seatD);
        pst.setString(7, travelnoD);

        int x = pst.executeUpdate();
        if (x > 0) {
            infoMessage("Data Travel berhasil diupdate!", "Sukses!!");
            clearFieldValue();
            loadData();
        }
    } catch (Exception e) {
        System.out.println(e);
    }

    }//GEN-LAST:event_editBTNActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
int selectedRow = jTable2.getSelectedRow();
    TableModel model = jTable2.getModel();
    
    travel_noTF.setText(model.getValueAt(selectedRow, 0).toString());
    travel_sourceTF.setText(model.getValueAt(selectedRow, 1).toString());
    travel_destTF.setText(model.getValueAt(selectedRow, 2).toString());
    departDateDP.setDate((Date) model.getValueAt(selectedRow, 3)); // pastikan ini tipe Date
    departTimeTF.setText(model.getValueAt(selectedRow, 4).toString());
    PriceTF.setText(model.getValueAt(selectedRow, 5).toString());
    seatTF.setText(model.getValueAt(selectedRow, 6).toString());

    }//GEN-LAST:event_jTable2MouseClicked

    private void hapusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTNActionPerformed
        // TODO add your handling code here:
        String travelnoD = travel_noTF.getText();

    if (travelnoD.isEmpty()) {
        infoMessage("Pilih data yang akan dihapus!", "Error!");
        return;
    }

    int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
        return;
    }

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String databaseURL = "jdbc:mysql://localhost:3306/travelfinal";
        Connection con = DriverManager.getConnection(databaseURL, "root", "");

        String deleteQuery = "DELETE FROM travel_details WHERE travel_no = ?";
        PreparedStatement pst = con.prepareStatement(deleteQuery);
        pst.setString(1, travelnoD);

        int x = pst.executeUpdate();
        if (x > 0) {
            infoMessage("Data Travel berhasil dihapus!", "Sukses!!");
            clearFieldValue();
            loadData();
        } else {
            infoMessage("Data Travel tidak ditemukan!", "Error!");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_hapusBTNActionPerformed

    private void reportBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBTNActionPerformed
        // TODO add your handling code here:
        dispose();
        LaporanKeuangan lp = new LaporanKeuangan();
        lp.setLocationRelativeTo(null);
        lp.setVisible(true);
    }//GEN-LAST:event_reportBTNActionPerformed

    private void travel_noTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travel_noTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_travel_noTFActionPerformed

    private void travel_destTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travel_destTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_travel_destTFActionPerformed

    private void departTimeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departTimeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departTimeTFActionPerformed

    private void loadData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/travelfinal";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            String query = "SELECT * FROM travel_details";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0); // Menghapus semua baris

            while (rs.next()) {
                String travel_no = rs.getString("travel_no");
                String keberangkatan = rs.getString("keberangkatan");
                String tujuan = rs.getString("tujuan");
                java.sql.Date tanggal = rs.getDate("tanggal");
                String waktu = rs.getString("waktu");
                String harga = rs.getString("harga");
                String kursi = rs.getString("kursi");

                Object[] row = {    travel_no, keberangkatan, tujuan, tanggal, waktu, harga, kursi};
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
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
            java.util.logging.Logger.getLogger(ManagementTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementTravel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PriceTF;
    private javax.swing.JButton bookingBTN;
    private com.toedter.calendar.JDateChooser departDateDP;
    private javax.swing.JTextField departTimeTF;
    private javax.swing.JButton editBTN;
    private javax.swing.JButton hapusBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton reportBTN;
    private javax.swing.JTextField seatTF;
    private javax.swing.JButton simpanBTN;
    private javax.swing.JTextField travel_destTF;
    private javax.swing.JTextField travel_noTF;
    private javax.swing.JTextField travel_sourceTF;
    // End of variables declaration//GEN-END:variables
}
