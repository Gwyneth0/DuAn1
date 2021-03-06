/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import DAO.TaiKhoanDAO;
import Utils.Auth;
import Utils.MsgBox;
import Utils.XImage;

/**
 *
 * @author vietm
 */
public class DoiMK_Dialog extends javax.swing.JDialog {

    /**
     * Creates new form DoiMK_Dialog
     */
    public DoiMK_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTDN = new javax.swing.JLabel();
        spr1 = new javax.swing.JSeparator();
        lblMK = new javax.swing.JLabel();
        spr2 = new javax.swing.JSeparator();
        lblMKM = new javax.swing.JLabel();
        spr3 = new javax.swing.JSeparator();
        lblXNMK = new javax.swing.JLabel();
        spr4 = new javax.swing.JSeparator();
        btnHuy = new javax.swing.JButton();
        btnXacnhan = new javax.swing.JButton();
        txtMKMoi = new javax.swing.JPasswordField();
        txtMK = new javax.swing.JPasswordField();
        txtXacnhanMK = new javax.swing.JPasswordField();
        lblTenDN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TNBank - Đổi Mật Khẩu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 75, 96));
        jLabel1.setText("Đổi Mật Khẩu");

        lblTDN.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTDN.setForeground(new java.awt.Color(71, 75, 96));
        lblTDN.setText("Tên Đăng Nhập");

        spr1.setBackground(new java.awt.Color(71, 75, 96));
        spr1.setForeground(new java.awt.Color(71, 75, 96));

        lblMK.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMK.setForeground(new java.awt.Color(71, 75, 96));
        lblMK.setText("Mật Khẩu");

        spr2.setBackground(new java.awt.Color(71, 75, 96));
        spr2.setForeground(new java.awt.Color(71, 75, 96));

        lblMKM.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMKM.setForeground(new java.awt.Color(71, 75, 96));
        lblMKM.setText("Mật Khẩu Mới");

        spr3.setBackground(new java.awt.Color(71, 75, 96));
        spr3.setForeground(new java.awt.Color(71, 75, 96));

        lblXNMK.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblXNMK.setForeground(new java.awt.Color(71, 75, 96));
        lblXNMK.setText("Xác Nhận Mật Khẩu Mới");

        spr4.setBackground(new java.awt.Color(71, 75, 96));
        spr4.setForeground(new java.awt.Color(71, 75, 96));

        btnHuy.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(71, 75, 96));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnXacnhan.setBackground(new java.awt.Color(255, 255, 255));
        btnXacnhan.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnXacnhan.setForeground(new java.awt.Color(71, 75, 96));
        btnXacnhan.setText("Xác Nhận");
        btnXacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacnhanActionPerformed(evt);
            }
        });

        txtMKMoi.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtMKMoi.setForeground(new java.awt.Color(71, 75, 96));
        txtMKMoi.setBorder(null);

        txtMK.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtMK.setForeground(new java.awt.Color(71, 75, 96));
        txtMK.setBorder(null);

        txtXacnhanMK.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtXacnhanMK.setForeground(new java.awt.Color(71, 75, 96));
        txtXacnhanMK.setBorder(null);

        lblTenDN.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblTenDN.setForeground(new java.awt.Color(71, 75, 96));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblXNMK)
                    .addComponent(spr4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(lblMKM)
                    .addComponent(spr3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(lblMK)
                    .addComponent(spr2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(lblTDN)
                    .addComponent(jLabel1)
                    .addComponent(spr1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMKMoi)
                    .addComponent(txtMK)
                    .addComponent(txtXacnhanMK)
                    .addComponent(lblTenDN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(lblTDN, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spr1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMK, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spr2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMKM, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spr3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblXNMK, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtXacnhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spr4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.huyBo();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnXacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacnhanActionPerformed
        // TODO add your handling code here:
        this.doiMatKhau();
    }//GEN-LAST:event_btnXacnhanActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMK_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMK_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMK_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMK_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMK_Dialog dialog = new DoiMK_Dialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMK;
    private javax.swing.JLabel lblMKM;
    private javax.swing.JLabel lblTDN;
    private javax.swing.JLabel lblTenDN;
    private javax.swing.JLabel lblXNMK;
    private javax.swing.JSeparator spr1;
    private javax.swing.JSeparator spr2;
    private javax.swing.JSeparator spr3;
    private javax.swing.JSeparator spr4;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JPasswordField txtMKMoi;
    private javax.swing.JPasswordField txtXacnhanMK;
    // End of variables declaration//GEN-END:variables

    TaiKhoanDAO TKdao = new TaiKhoanDAO();
    
    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        lblTenDN.setText(Auth.user.getMaNV());
    }

    private void doiMatKhau() {
        String matKhau = new String(txtMK.getPassword());
        String matKhauMoi = new String(txtMKMoi.getPassword());
        String xacNhanMK = new String(txtXacnhanMK.getPassword());
        if (!matKhau.equals(Auth.user.getMatKhau())) {
            MsgBox.waning(this, "Sai Mật Khẩu !");
        } else if (!matKhauMoi.equals(xacNhanMK)) {
            MsgBox.waning(this, "Xác Nhận Mật Khẩu Không Đúng !");
        } else if (matKhauMoi.equals("")) {
            MsgBox.waning(this, "Vui Lòng Nhập Mật Khẩu Mới !");
        } else if (matKhauMoi.equals(matKhau)) {
            MsgBox.waning(this, "CẢNH BÁO !!!\nMật Khẩu Mới Trùng Với Mật Khẩu Hiện Tại !\nĐể Đảm Bảo An Toàn Hãy Nhập Mật Khẩu Khác !");
        } else {
            Auth.user.setMatKhau(matKhauMoi);
            TKdao.update(Auth.user);
            MsgBox.alert(this, "Đổi Mật Khẩu Thành Công");
            this.dispose();
        }
    }

    private void huyBo() {
        this.dispose();
    }
}
