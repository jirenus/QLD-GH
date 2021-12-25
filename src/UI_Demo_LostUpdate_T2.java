
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author zerotus
 */
public class UI_Demo_LostUpdate_T2 extends javax.swing.JFrame {
    String userID = "TX0002";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    /**
     * Creates new form UI_Demo_LostUpdate_T2
     */
    public UI_Demo_LostUpdate_T2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDonHang1 = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnRunErrror = new javax.swing.JButton();
        btnFixError = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDonHang2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("TÌNH HUỐNG TRANH CHẤP - LOST UPDATE");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 80));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDonHang1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableDonHang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MADH", "MAKH", "MATX", "TENDH", "TINHTRANGDH", "PHIVANCHUYEN", "DIACHIGIAO", "HINHTHUCTT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableDonHang1);

        jPanel16.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1220, 250));

        jPanel13.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1240, 270));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnReset.setText("Khôi phục");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel13.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 80, 170, 60));

        btnView.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnView.setText("Xem");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel13.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 190, 170, 60));

        btnRunErrror.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRunErrror.setText("Chạy lỗi");
        btnRunErrror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunErrrorActionPerformed(evt);
            }
        });
        jPanel13.add(btnRunErrror, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 310, 170, 60));

        btnFixError.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFixError.setText("Sửa lỗi");
        btnFixError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixErrorActionPerformed(evt);
            }
        });
        jPanel13.add(btnFixError, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 430, 170, 60));

        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDonHang2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableDonHang2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MADH", "MAKH", "MATX", "TENDH", "TINHTRANGDH", "PHIVANCHUYEN", "DIACHIGIAO", "HINHTHUCTT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableDonHang2);

        jPanel17.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1220, 250));

        jPanel13.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1240, 270));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Hai tài xế cùng xử lý 1 đơn hàng (cập nhật tình trạng cho 1 đơn hàng là đã có tài xế giao)");
        jPanel13.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 830, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Sau khi cập nhật tình trạng đơn hàng");
        jPanel13.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 350, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Trước khi cập nhật tình trạng đơn hàng");
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 380, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("TX0002");
        jPanel13.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 0, -1, -1));

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1520, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadDataToTable2() {
        int nums;
        try{
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select * from DONHANG");
            
            rs = pstmt.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            nums = stData.getColumnCount();
            
            DefaultTableModel recordTable2 = (DefaultTableModel) tableDonHang2.getModel();
            recordTable2.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                
                for (int i = 1; i <= nums; i++) {
                    columnData.add(rs.getString("MADH"));
                    columnData.add(rs.getString("MAKH"));
                    String driver = rs.getString("MATX");
                    driver = driver.replaceAll("\\s+", "");
                    if (driver.equals("TX0000")) {
                        columnData.add("Không");
                    }
                    else {
                        columnData.add(driver);
                    }
                    
                    columnData.add(rs.getString("TENDH"));
                    int status = Integer.parseInt(rs.getString("TINHTRANGDH"));
                    if (status == -1) {
                        columnData.add("ĐÃ BỊ HỦY");
                    }
                    else if (status == 0) {
                        columnData.add("CHỜ TÀI XẾ");
                    }
                    else {
                        columnData.add("TÀI XẾ ĐÃ LẤY HÀNG");
                    }
                    columnData.add(Integer.parseInt(rs.getString("PHIVANCHUYEN")));
                    columnData.add(rs.getString("DIACHIGIAO"));
                    columnData.add(rs.getString("HINHTHUCTT"));
                }
                
                recordTable2.addRow(columnData);
            }
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Không thể xem đơn hàng");
        }
    }
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        try {
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("update DONHANG set MATX = ?, TINHTRANGDH = 0");
            pstmt.setString(1, "TX0000");
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UI_Demo_LostUpdate_T2.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel RecordTable1 = (DefaultTableModel) tableDonHang1.getModel();
        RecordTable1.setRowCount(0);
        
        DefaultTableModel RecordTable2 = (DefaultTableModel) tableDonHang2.getModel();
        RecordTable2.setRowCount(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int nums;
        try{
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select * from DONHANG");
            
            rs = pstmt.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            nums = stData.getColumnCount();
            
            DefaultTableModel recordTable = (DefaultTableModel) tableDonHang1.getModel();
            recordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                
                for (int i = 1; i <= nums; i++) {
                    columnData.add(rs.getString("MADH"));
                    columnData.add(rs.getString("MAKH"));
                    String driver = rs.getString("MATX");
                    driver = driver.replaceAll("\\s+", "");
                    if (driver.equals("TX0000")) {
                        columnData.add("Không");
                    }
                    else {
                        columnData.add(driver);
                    }
                    
                    columnData.add(rs.getString("TENDH"));
                    int status = Integer.parseInt(rs.getString("TINHTRANGDH"));
                    if (status == -1) {
                        columnData.add("ĐÃ BỊ HỦY");
                    }
                    else if (status == 0) {
                        columnData.add("CHỜ TÀI XẾ");
                    }
                    else {
                        columnData.add("TÀI XẾ ĐÃ LẤY HÀNG");
                    }
                    columnData.add(Integer.parseInt(rs.getString("PHIVANCHUYEN")));
                    columnData.add(rs.getString("DIACHIGIAO"));
                    columnData.add(rs.getString("HINHTHUCTT"));
                }
                
                recordTable.addRow(columnData);
            }
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Không thể xem đơn hàng");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRunErrrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunErrrorActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel)tableDonHang1.getModel();
        int selectedRows = tableDonHang1.getSelectedRow();
        String idPackage = recordTable.getValueAt(selectedRows, 0).toString();
        idPackage = idPackage.replaceAll("\\s+", "");
        try {
            
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("EXEC SP_XULYDH ?, ?, ?");
            pstmt.setString(1, userID);
            pstmt.setString(2, idPackage);
            pstmt.setInt(3, 1);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra, cập nhật không thành công!");
        }
        
        this.loadDataToTable2();
    }//GEN-LAST:event_btnRunErrrorActionPerformed

    private void btnFixErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixErrorActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel)tableDonHang1.getModel();
        int selectedRows = tableDonHang1.getSelectedRow();
        String idPackage = recordTable.getValueAt(selectedRows, 0).toString();
        idPackage = idPackage.replaceAll("\\s+", "");
        try {
            
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("EXEC SP_XULYDH_FIX ?, ?, ?");
            pstmt.setString(1, userID);
            pstmt.setString(2, idPackage);
            pstmt.setInt(3, 1);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra, cập nhật không thành công!");
        }
        
        this.loadDataToTable2();
    }//GEN-LAST:event_btnFixErrorActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Demo_LostUpdate_T2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Demo_LostUpdate_T2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Demo_LostUpdate_T2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Demo_LostUpdate_T2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Demo_LostUpdate_T2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFixError;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRunErrror;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableDonHang1;
    private javax.swing.JTable tableDonHang2;
    // End of variables declaration//GEN-END:variables
}