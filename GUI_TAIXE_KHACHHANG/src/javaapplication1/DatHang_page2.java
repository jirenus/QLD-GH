
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zerotus
 */
public class DatHang_page2 extends javax.swing.JFrame {

    /**
     * Creates new form DatHang_page2
     */
    public DatHang_page2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableSanPham = new javax.swing.JTable();
        btnChange = new javax.swing.JButton();
        txtNumberPhone1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTongThanhToan = new javax.swing.JTextField();
        txtTongTienHang = new javax.swing.JTextField();
        txtPhiVanChuyen = new javax.swing.JTextField();
        btnDatHang = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        selectbtnCOD = new javax.swing.JRadioButton();
        selectbtnZaloPay = new javax.swing.JRadioButton();
        selectbtnMomo = new javax.swing.JRadioButton();
        jLabelHinhThucThanhToan = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã đơn hàng", "Tên khách hàng", "Địa chỉ giao", "Phí vận chuyển", "Hình thức thanh toán", "Tình trạng đơn hàng", "Chọn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tên");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Số điện thoại");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 130, -1));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel3.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 160, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Địa chỉ nhận hàng");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 200, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Chi nhánh", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TableSanPham);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1500, 290));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1520, 310));

        btnChange.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnChange.setText("Thay đổi");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        jPanel3.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 180, 60));

        txtNumberPhone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberPhone1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtNumberPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 160, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1520, 390));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("HỆ THỐNG ĐẶT VÀ CHUYỂN HÀNG ONLINE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel7.setText("Địa chỉ nhận hàng");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 710, 170, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Tổng thanh toán:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, 250, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setText("Tổng tiền hàng:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel16.setText("Phí vận chuyển:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 250, 30));

        txtTongThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongThanhToanActionPerformed(evt);
            }
        });
        jPanel5.add(txtTongThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 230, 40));

        txtTongTienHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienHangActionPerformed(evt);
            }
        });
        jPanel5.add(txtTongTienHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 230, 40));

        txtPhiVanChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhiVanChuyenActionPerformed(evt);
            }
        });
        jPanel5.add(txtPhiVanChuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 230, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 600, 180));
        jPanel5.getAccessibleContext().setAccessibleParent(jLabel9);

        btnDatHang.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDatHang.setText("Đặt hàng");
        btnDatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatHangActionPerformed(evt);
            }
        });
        jPanel1.add(btnDatHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 710, 180, 50));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectbtnCOD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        selectbtnCOD.setText("Thanh toán khi nhận hàng");
        selectbtnCOD.setIconTextGap(10);
        selectbtnCOD.setPreferredSize(new java.awt.Dimension(200, 50));
        selectbtnCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtnCODActionPerformed(evt);
            }
        });
        jPanel7.add(selectbtnCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 300, 50));

        selectbtnZaloPay.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        selectbtnZaloPay.setText("ZaloPay");
        selectbtnZaloPay.setIconTextGap(10);
        selectbtnZaloPay.setInheritsPopupMenu(true);
        selectbtnZaloPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtnZaloPayActionPerformed(evt);
            }
        });
        jPanel7.add(selectbtnZaloPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        selectbtnMomo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        selectbtnMomo.setText("MoMo");
        selectbtnMomo.setIconTextGap(10);
        selectbtnMomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtnMomoActionPerformed(evt);
            }
        });
        jPanel7.add(selectbtnMomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 50));

        jLabelHinhThucThanhToan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelHinhThucThanhToan.setText("Hình thức thanh toán");
        jPanel7.add(jLabelHinhThucThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 340, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1540, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtTongThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongThanhToanActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnDatHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatHangActionPerformed

    private void selectbtnCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtnCODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectbtnCODActionPerformed

    private void selectbtnZaloPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtnZaloPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectbtnZaloPayActionPerformed

    private void selectbtnMomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtnMomoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectbtnMomoActionPerformed

    private void txtNumberPhone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberPhone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberPhone1ActionPerformed

    private void txtTongTienHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienHangActionPerformed

    private void txtPhiVanChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhiVanChuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhiVanChuyenActionPerformed

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
            java.util.logging.Logger.getLogger(DatHang_page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatHang_page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatHang_page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatHang_page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatHang_page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableSanPham;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDatHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelHinhThucThanhToan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton selectbtnCOD;
    private javax.swing.JRadioButton selectbtnMomo;
    private javax.swing.JRadioButton selectbtnZaloPay;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumberPhone1;
    private javax.swing.JTextField txtPhiVanChuyen;
    private javax.swing.JTextField txtTongThanhToan;
    private javax.swing.JTextField txtTongTienHang;
    // End of variables declaration//GEN-END:variables
}
