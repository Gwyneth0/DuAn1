/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import dao.LichSuDAO;
import dao.TheDAO;
import entity.LichSu;
import entity.The;
import java.text.DecimalFormat;
import static javax.swing.border.LineBorder.createGrayLineBorder;

import utils.Handle;
import utils.MsgBox;
import utils.XCheck;
import utils.XDate;

/**
 *
 * @author thai
 */
public class ChuyenTien extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ChuyenTien() {
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
        lblNgayGui = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cboTenGiaoDich = new javax.swing.JComboBox<>();
        pnlSoTaiKhoan = new javax.swing.JPanel();
        txtSoTaiKhoan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlHoTen = new javax.swing.JPanel();
        txtTenNguoiGiaoDich = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblNgayGiaoDich = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSoTien = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        cboKiemTra = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        txtPin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnHuy = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        lblNgayGui.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lblNgayGui.setForeground(new java.awt.Color(255, 255, 255));
        lblNgayGui.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNgayGui.setText("Ngày nạp tiền:");

        jScrollPane2.setBorder(null);

        txtGhiChu.setBackground(new java.awt.Color(102, 102, 102));
        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtGhiChu.setForeground(new java.awt.Color(255, 255, 255));
        txtGhiChu.setRows(5);
        txtGhiChu.setText("\n");
        txtGhiChu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nội Dung", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        txtGhiChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGhiChuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtGhiChu);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên Giao Dịch:");

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        cboTenGiaoDich.setBackground(new java.awt.Color(204, 255, 255));
        cboTenGiaoDich.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        cboTenGiaoDich.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nạp Tiền", "Rút Tiền" }));
        cboTenGiaoDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenGiaoDichActionPerformed(evt);
            }
        });

        pnlSoTaiKhoan.setBackground(new java.awt.Color(102, 102, 102));
        pnlSoTaiKhoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtSoTaiKhoan.setBackground(new java.awt.Color(102, 102, 102));
        txtSoTaiKhoan.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtSoTaiKhoan.setForeground(new java.awt.Color(204, 204, 204));
        txtSoTaiKhoan.setText("Số Tài Khoản");
        txtSoTaiKhoan.setBorder(null);
        txtSoTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSoTaiKhoanMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSoTaiKhoanMouseExited(evt);
            }
        });
        txtSoTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoTaiKhoanKeyReleased(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/card.png"))); // NOI18N

        javax.swing.GroupLayout pnlSoTaiKhoanLayout = new javax.swing.GroupLayout(pnlSoTaiKhoan);
        pnlSoTaiKhoan.setLayout(pnlSoTaiKhoanLayout);
        pnlSoTaiKhoanLayout.setHorizontalGroup(
            pnlSoTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSoTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSoTaiKhoan))
        );
        pnlSoTaiKhoanLayout.setVerticalGroup(
            pnlSoTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(txtSoTaiKhoan)
        );

        pnlHoTen.setBackground(new java.awt.Color(102, 102, 102));
        pnlHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtTenNguoiGiaoDich.setBackground(new java.awt.Color(102, 102, 102));
        txtTenNguoiGiaoDich.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTenNguoiGiaoDich.setForeground(new java.awt.Color(204, 204, 204));
        txtTenNguoiGiaoDich.setText("Họ và Tên");
        txtTenNguoiGiaoDich.setBorder(null);
        txtTenNguoiGiaoDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTenNguoiGiaoDichMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTenNguoiGiaoDichMouseExited(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        javax.swing.GroupLayout pnlHoTenLayout = new javax.swing.GroupLayout(pnlHoTen);
        pnlHoTen.setLayout(pnlHoTenLayout);
        pnlHoTenLayout.setHorizontalGroup(
            pnlHoTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoTenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenNguoiGiaoDich))
        );
        pnlHoTenLayout.setVerticalGroup(
            pnlHoTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(txtTenNguoiGiaoDich)
        );

        jPanel4.setBackground(new java.awt.Color(74, 198, 126));

        lblTieuDe.setBackground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setText("NAP TIEN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        lblNgayGiaoDich.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lblNgayGiaoDich.setForeground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        jLabel3.setText("SỐ TIỀN");

        txtSoTien.setBackground(new java.awt.Color(102, 102, 102));
        txtSoTien.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        txtSoTien.setForeground(new java.awt.Color(255, 255, 255));
        txtSoTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSoTien.setBorder(null);
        txtSoTien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoTienKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSoTien))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(txtSoTien)
        );

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        cboKiemTra.setBackground(new java.awt.Color(102, 102, 102));
        cboKiemTra.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        cboKiemTra.setForeground(new java.awt.Color(255, 255, 255));
        cboKiemTra.setText("Kiểm tra thông tin chính xác.");
        cboKiemTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKiemTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(cboKiemTra)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboKiemTra)
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        txtPin.setBackground(new java.awt.Color(102, 102, 102));
        txtPin.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPin.setForeground(new java.awt.Color(255, 255, 255));
        txtPin.setText("Pin");
        txtPin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPinMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        btnHuy.setBackground(new java.awt.Color(153, 153, 153));
        btnHuy.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Huỷ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnXacNhan.setBackground(new java.awt.Color(74, 198, 126));
        btnXacNhan.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác Nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(btnXacNhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addComponent(jScrollPane2)
                    .addComponent(pnlSoTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTenGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNgayGui, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNgayGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboTenGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNgayGui))
                    .addComponent(lblNgayGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnlSoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void cboKiemTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKiemTraActionPerformed
        // TODO add your handling code here:
        this.checkThongTin();
    }//GEN-LAST:event_cboKiemTraActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void cboTenGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenGiaoDichActionPerformed
        // TODO add your handling code here:
        this.setForm();
    }//GEN-LAST:event_cboTenGiaoDichActionPerformed

    private void txtSoTaiKhoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoTaiKhoanKeyReleased
        // TODO add your handling code here:
        this.checkSTK();
    }//GEN-LAST:event_txtSoTaiKhoanKeyReleased

    private void txtSoTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSoTaiKhoanMouseClicked
        // TODO add your handling code here:
        txtSoTaiKhoan.setText(null);
        pnlSoTaiKhoan.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_txtSoTaiKhoanMouseClicked

    private void txtGhiChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGhiChuMouseClicked
        // TODO add your handling code here:
        txtGhiChu.setText(null);
        txtGhiChu.setForeground(Color.white);
    }//GEN-LAST:event_txtGhiChuMouseClicked

    private void txtPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPinMouseClicked
        // TODO add your handling code here:
        txtPin.setText(null);
        txtPin.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_txtPinMouseClicked

    private void txtSoTaiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSoTaiKhoanMouseExited
        // TODO add your handling code here:
        if (txtSoTaiKhoan.getText().equals("")) {
            txtSoTien.setText("0");
            txtSoTien.setEnabled(false);
            txtSoTaiKhoan.setText("Số Tài Khoản");
        }
    }//GEN-LAST:event_txtSoTaiKhoanMouseExited

    private void txtPinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPinMouseExited
        // TODO add your handling code here:
        if (txtPin.getText().equals("")) {
            txtPin.setText("Pin");
        }
    }//GEN-LAST:event_txtPinMouseExited

    private void txtTenNguoiGiaoDichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenNguoiGiaoDichMouseClicked
        // TODO add your handling code here:
        txtTenNguoiGiaoDich.setText(null);
        pnlHoTen.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_txtTenNguoiGiaoDichMouseClicked

    private void txtSoTienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoTienKeyReleased
        // TODO add your handling code here:
        this.checkTien();
    }//GEN-LAST:event_txtSoTienKeyReleased

    private void txtTenNguoiGiaoDichMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenNguoiGiaoDichMouseExited
        // TODO add your handling code here:
        if (txtTenNguoiGiaoDich.getText().equals("")) {
            txtTenNguoiGiaoDich.setText("Họ và Tên");
        }
    }//GEN-LAST:event_txtTenNguoiGiaoDichMouseExited

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
            java.util.logging.Logger.getLogger(ChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuyenTien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JCheckBox cboKiemTra;
    private javax.swing.JComboBox<String> cboTenGiaoDich;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblNgayGiaoDich;
    private javax.swing.JLabel lblNgayGui;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel pnlHoTen;
    private javax.swing.JPanel pnlSoTaiKhoan;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtPin;
    private javax.swing.JTextField txtSoTaiKhoan;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtTenNguoiGiaoDich;
    // End of variables declaration//GEN-END:variables

    LichSuDAO lsdao = new LichSuDAO();
    TheDAO tdao = new TheDAO();

    public void init() {
        this.setForm();
    }

    void setForm() {
        Date date = new Date();
        SimpleDateFormat day = new SimpleDateFormat("MM/dd/yyyy");
        if (cboTenGiaoDich.getSelectedIndex() == 0) {
            lblTieuDe.setText("NẠP TIỀN");
            lblNgayGui.setText("Ngày nạp tiền");
            txtPin.setVisible(false);
        } else {
            lblTieuDe.setText("RÚT TIỀN");
            lblNgayGui.setText("Ngày rút tiền");
            txtPin.setVisible(true);
        }
        txtSoTaiKhoan.setText("Số Tài Khoản");
        txtTenNguoiGiaoDich.setText("Họ và Tên");
        lblNgayGiaoDich.setText(day.format(date.getTime()));
        txtGhiChu.setText(null);
        cboKiemTra.setSelected(false);
        txtSoTien.setText("0");
        btnXacNhan.setEnabled(false);
        txtSoTien.setEnabled(false);
        txtPin.setEnabled(false);
        txtPin.setText(" Pin");
        pnlSoTaiKhoan.setBorder(new LineBorder(Color.white));
        pnlHoTen.setBorder(new LineBorder(Color.white));
        txtPin.setBorder(new LineBorder(Color.white));
    }

    LichSu getForm() {
        LichSu ls = new LichSu();
        ls.setTenLoai((String) cboTenGiaoDich.getSelectedItem());
        ls.setSoTaiKhoan(txtSoTaiKhoan.getText());
        ls.setNguoiGiaoDich(txtTenNguoiGiaoDich.getText());
        ls.setNgayGiaoDich(lblNgayGiaoDich.getText());
        ls.setGhiChu(txtGhiChu.getText());
        ls.setSoTien(Float.parseFloat(String.valueOf(Handle.formatString(txtSoTien.getText()))));
        return ls;
    }

    void insert() {
        try {
            The the = new The();
            LichSu lichsu = getForm();
            the.setSoTaiKhoan(lichsu.getSoTaiKhoan());
            if (cboTenGiaoDich.getSelectedIndex() == 0) {
                the.setSoTien(tdao.selectById(lichsu.getSoTaiKhoan()).getSoTien() + lichsu.getSoTien());
            } else {
                if (Integer.valueOf(txtPin.getText()) == tdao.selectById(lichsu.getSoTaiKhoan()).getPin()) {
                    the.setSoTien(tdao.selectById(lichsu.getSoTaiKhoan()).getSoTien() - lichsu.getSoTien());
                } else {
                    MsgBox.alert(this, "Sai Pin");
                    return;
                }
            }
            lsdao.insert(lichsu);
            tdao.update(the);
            MsgBox.alert(this, "Giao dịch thành công.");
            this.setForm();
        } catch (Exception e) {}
    }

    void checkSTK() {
        LichSu lichsu = getForm();
        if (tdao.selectById(lichsu.getSoTaiKhoan()) != null) {
            txtSoTien.setEnabled(true);
            txtPin.setEnabled(true);
        } else {
            txtSoTien.setEnabled(false);
            txtSoTien.setText("0");
        }
        // kiểm tra loại bỏ chử.
        XCheck.read(txtSoTaiKhoan, 0);
    }

    void checkTien() {
        double soTien = Handle.formatString(txtSoTien.getText());
        if (soTien > 2000000000){
            soTien = 2000000000;
        }
        txtSoTien.setText(Handle.formatDouble(soTien));
        LichSu lichsu = getForm();
        try {
            if (cboTenGiaoDich.getSelectedIndex() == 1) {
                if (tdao.selectById(lichsu.getSoTaiKhoan()).getSoTien() < soTien) {
                    double tien = tdao.selectById(lichsu.getSoTaiKhoan()).getSoTien();
                    txtSoTien.setText(Handle.formatDouble(tien));
                }
            }
        } catch (Exception e) {}
    }

    void checkThongTin() {
        String soTaiKhoan = txtSoTaiKhoan.getText();
        String tenNguoiGiaoDich = txtTenNguoiGiaoDich.getText();
        String ghiChu = txtGhiChu.getText();
        double soTien = Handle.formatString(txtSoTien.getText());
        boolean check = true;
        if (soTaiKhoan.equals("") || !txtSoTien.isEnabled() || soTaiKhoan.equals("Số Tài Khoản")) {
            pnlSoTaiKhoan.setBorder(new LineBorder(new Color(255,102,102)));
            check = false;
        }
        if (tenNguoiGiaoDich.equals("") || tenNguoiGiaoDich.equals("Họ và Tên")) {
            pnlHoTen.setBorder(new LineBorder(new Color(255,102,102)));
            check = false;
        }
        if (ghiChu.equals("")) {
            txtGhiChu.setForeground(new Color(255,102,102));
            txtGhiChu.setText("Không được để trống.");
            check = false;
        }
        if (soTien < 100000 && txtSoTien.isEnabled()) {
            MsgBox.alert(this, "Số Tiền tối thiểu là: 100,000 VND\n và tối đa là 2,000,000,000 VND");
            check = false;
        }
        if (cboTenGiaoDich.getSelectedIndex() == 1 && txtSoTien.isEnabled()) {
            String pin = txtPin.getText();
            if (pin.equals(" Pin")) {
                txtPin.setBorder(new LineBorder(Color.red));
                check = false;
            }
        }
        btnXacNhan.setEnabled(check);
        cboKiemTra.setSelected(check);
    }
}