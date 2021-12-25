import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author zerotus
 */
public class QTVCapNhatDoiTac extends javax.swing.JFrame {
    String userID;
    String userType;
    String currentUser;
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    /**
     * Creates new form QTVCapNhatTaiKhoanDoiTac
     */
    public QTVCapNhatDoiTac() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnBackToHome = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        txtRepresentative = new javax.swing.JTextField();
        txtTaxID = new javax.swing.JTextField();
        txtNumOfBranch = new javax.swing.JTextField();
        txtNumOfPackage = new javax.swing.JTextField();
        txtTypeOfPackage = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        comboStatus = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAccountID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnViewProfile = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("HỆ THỐNG ĐẶT VÀ CHUYỂN HÀNG ONLINE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 90));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Quản lý nhân viên");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 654, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Quản trị người dùng");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 40));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel8.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 210, 60));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel8.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 210, 60));

        btnBackToHome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBackToHome.setText("Trang chủ");
        btnBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToHomeActionPerformed(evt);
            }
        });
        jPanel8.add(btnBackToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 210, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 1520, 70));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Mã số thuế");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 170, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Tên công ty");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 140, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Thông tin chi tiết đối tác");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 310, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Email");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 140, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Người đại diện");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 140, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Loại người dùng");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 170, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Tình trạng");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 140, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Số điện thoại");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 140, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Số lượng đơn hàng");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 180, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Loại hàng vận chuyển");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 210, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Địa chỉ kinh doanh");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 170, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Số chi nhánh");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 140, 40));

        txtCompanyName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 310, 40));

        txtRepresentative.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtRepresentative, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 130, 310, 40));

        txtTaxID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtTaxID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 180, 310, 40));

        txtNumOfBranch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtNumOfBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, 310, 40));

        txtNumOfPackage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtNumOfPackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, 310, 40));

        txtTypeOfPackage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtTypeOfPackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 330, 310, 40));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 380, 310, 40));

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 430, 310, 40));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 310, 40));

        comboStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn loại tình trạng---", "0: Khóa", "1: Bình thường" }));
        jPanel6.add(comboStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 310, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("2:  Đối tác");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 140, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Mã tài khoản");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 40));

        txtAccountID.setEditable(false);
        txtAccountID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtAccountID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 310, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Mật khẩu");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, 40));

        jLabel3.setText("*Bỏ trống nếu không muốn đổi mật khẩu");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 310, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1520, 550));

        btnViewProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewProfile.setText("Thông tin tài khoản");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 100, -1, 40));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 100, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int getStatus(String status) {
        return Integer.parseInt(status.substring(0, 1));
    } 
    
    public void loadData() {
        try {
            conn = DBInfo.connect();
            //load data from QUANTRIVIEN table
            pstmt = conn.prepareStatement("select * from DOITAC where MADT = ?");
            pstmt.setString(1, currentUser);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                txtCompanyName.setText(rs.getString("TENDT"));
                txtRepresentative.setText(rs.getString("NGUOIDAIDIEN"));
                txtTaxID.setText(rs.getString("MAST"));
                txtNumOfBranch.setText(rs.getString("SOCN"));
                txtNumOfPackage.setText(rs.getString("SOLUONGDH"));
                txtTypeOfPackage.setText(rs.getString("LOAIHANGVC"));
                txtAddress.setText(rs.getString("DIACHIKD"));
                txtPhone.setText(rs.getString("SDT"));
                txtEmail.setText(rs.getString("EMAIL"));
            }
            
            //load data from TAIKHOAN table
            pstmt = conn.prepareStatement("select * from TAIKHOAN where MATK = ?");
            pstmt.setString(1, currentUser);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                txtAccountID.setText(currentUser);
                int status = Integer.parseInt(rs.getString("TINHTRANG"));
                comboStatus.setSelectedIndex(status + 1);
            }
            
            //System.out.println(rs.getString("MATK"));
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinQuanTriVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            conn = DBInfo.connect();
            //update data from QUANTRIVIEN table
          pstmt = conn.prepareStatement("update DOITAC set TENDT = ?, NGUOIDAIDIEN = ?, MAST = ?, SOCN = ?,"
                  + " SOLUONGDH = ? , LOAIHANGVC = ?, DIACHIKD = ?, SDT = ?, EMAIL = ? where MADT = ?");
            pstmt.setString(1, txtCompanyName.getText());
            pstmt.setString(2, txtRepresentative.getText());
            pstmt.setString(3, txtTaxID.getText());
            pstmt.setInt(4, Integer.parseInt(txtNumOfBranch.getText()));
            pstmt.setInt(5, Integer.parseInt(txtNumOfPackage.getText()));
            pstmt.setString(6, txtTypeOfPackage.getText());
            pstmt.setString(7, txtAddress.getText());
            pstmt.setString(8, txtPhone.getText());
             pstmt.setString(9, txtEmail.getText());
            pstmt.setString(10, currentUser);
            pstmt.executeUpdate();

            
            //update data from TAIKHOAN table
            String password = new String(txtPassword.getPassword());
            int status = getStatus(comboStatus.getSelectedItem().toString());
            if (password.length() != 0) {
                pstmt = conn.prepareStatement("update TAIKHOAN SET MATKHAU = ?, TINHTRANG = ? where MATK = ?");
                pstmt.setString(1, password);
                pstmt.setInt(2, status);
                pstmt.setString(3, currentUser);
            } else {
                pstmt = conn.prepareStatement("update TAIKHOAN SET TINHTRANG = ? where MATK = ?");
                pstmt.setInt(1, status);
                pstmt.setString(2, currentUser);
            }
            pstmt.executeUpdate();
            
            QTVQuanTriNguoiDung admin = new QTVQuanTriNguoiDung();
            admin.userID = userID;
            admin.userType = userType;
            admin.currentUser = currentUser;

            this.hide();
            admin.setVisible(true);
            
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
            //System.out.println(rs.getString("MATK"));
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinQuanTriVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ThongTinDoiTac PartnerInfo = new ThongTinDoiTac();
        PartnerInfo.userID = userID;
        PartnerInfo.userType = userType;
        PartnerInfo.currentUser = currentUser;

        this.hide();
        PartnerInfo.loadData();
        PartnerInfo.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        ThongTinQuanTriVien adminInfo = new ThongTinQuanTriVien();
        adminInfo.userID = userID;
        adminInfo.userType = userType;
        adminInfo.currentUser = userID;

        this.hide();
        adminInfo.loadData();
        adminInfo.setVisible(true);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        DangNhap login = new DangNhap();
        this.hide();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToHomeActionPerformed
        QTVQuanTriNguoiDung admin = new QTVQuanTriNguoiDung();
        admin.userID = userID;
        admin.userType = userType;
        admin.currentUser = currentUser;

        this.hide();
        admin.setVisible(true);
    }//GEN-LAST:event_btnBackToHomeActionPerformed

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
            java.util.logging.Logger.getLogger(QTVCapNhatDoiTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QTVCapNhatDoiTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QTVCapNhatDoiTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QTVCapNhatDoiTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QTVCapNhatDoiTac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBackToHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNumOfBranch;
    private javax.swing.JTextField txtNumOfPackage;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRepresentative;
    private javax.swing.JTextField txtTaxID;
    private javax.swing.JTextField txtTypeOfPackage;
    // End of variables declaration//GEN-END:variables
}
