/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.User;

import MODEL.*;
import DAO.*;
import com.microsoft.sqlserver.jdbc.StringUtils;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tsmda
 */
public class frmTaoDonHang extends javax.swing.JFrame {

    DonHang dh = new DonHang();
    DonHangDao dhdao = new DonHangDao();
    GioHang gh = new GioHang();
    List<GioHang> listgh = new ArrayList();
    List<ChiTietDonHang> list = new ArrayList();
    GioHangDao ghdao = new GioHangDao();
    ChiTietDonHangDao ctdhdao = new ChiTietDonHangDao();
    String TenDN;
    String TongTien;
    TaiKhoan tk = new TaiKhoan();
    TaiKhoanDao tkdao = new TaiKhoanDao();
    List<DiaChi> listdc = new ArrayList();
    DiaChiDao dcdao = new DiaChiDao();
    DiaChi dc = new DiaChi();
    private frmUserMain loadForm;

    public void loadForm(frmUserMain loadForm) {
        this.loadForm = loadForm;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
        lblTongTien.setText(TongTien + " $");
    }

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
        txtSoDTHT.setText(dc.getHoTen());
        txtSoDTHT.setText(dc.getSoDienThoai());
        loadDiaChi(this.getTenDN());
    }

    /**
     * Creates new form frmTaoDonHang
     */
    public frmTaoDonHang() {
        initComponents();
        setLocationRelativeTo(null);
        txtDiaChiMoi.setEnabled(false);
        txtHoTenMoi.setEnabled(false);
        txtSoDTMoi.setEnabled(false);
        rdoDiaChiHienTai.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGThanhToan = new javax.swing.ButtonGroup();
        btnGDiaChi = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblQuayLai = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rdoDiaChiMoi = new javax.swing.JRadioButton();
        rdoDiaChiHienTai = new javax.swing.JRadioButton();
        cboDiaChiHT = new javax.swing.JComboBox<>();
        btnThemDonHang = new javax.swing.JButton();
        lblTongTien = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdoTheTinDung = new javax.swing.JRadioButton();
        rdoTienMat = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtDiaChiMoi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSoDTHT = new javax.swing.JTextField();
        txtHoTenHT = new javax.swing.JTextField();
        txtHoTenMoi = new javax.swing.JTextField();
        txtSoDTMoi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        lblQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thoat.png"))); // NOI18N
        lblQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuayLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuayLaiMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("TẠO ĐƠN HÀNG");

        btnGDiaChi.add(rdoDiaChiMoi);
        rdoDiaChiMoi.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rdoDiaChiMoi.setForeground(new java.awt.Color(0, 51, 204));
        rdoDiaChiMoi.setText("Địa chỉ mới");
        rdoDiaChiMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoDiaChiMoi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdoDiaChiMoiItemStateChanged(evt);
            }
        });

        btnGDiaChi.add(rdoDiaChiHienTai);
        rdoDiaChiHienTai.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rdoDiaChiHienTai.setForeground(new java.awt.Color(0, 51, 204));
        rdoDiaChiHienTai.setText("Địa chỉ hiện tại");
        rdoDiaChiHienTai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoDiaChiHienTai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdoDiaChiHienTaiItemStateChanged(evt);
            }
        });

        cboDiaChiHT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboDiaChiHT.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        cboDiaChiHT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboDiaChiHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiaChiHTActionPerformed(evt);
            }
        });

        btnThemDonHang.setBackground(new java.awt.Color(153, 0, 0));
        btnThemDonHang.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnThemDonHang.setForeground(new java.awt.Color(255, 255, 255));
        btnThemDonHang.setText("Xác nhận");
        btnThemDonHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDonHangActionPerformed(evt);
            }
        });

        lblTongTien.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(255, 51, 51));
        lblTongTien.setText("jLabel7");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel6.setText("Tổng số tiền cần thanh toán: ");

        btnGThanhToan.add(rdoTheTinDung);
        rdoTheTinDung.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rdoTheTinDung.setText("Thẻ tín dụng");
        rdoTheTinDung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoTheTinDung.setEnabled(false);

        btnGThanhToan.add(rdoTienMat);
        rdoTienMat.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rdoTienMat.setText("Thanh toán khi nhận hàng");
        rdoTienMat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel5.setText("Hình thức thanh toán:");

        txtDiaChiMoi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDiaChiMoi.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        txtDiaChiMoi.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Địa chỉ:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel7.setText("Địa chỉ nhận hàng:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setText("Địa chỉ:");

        txtSoDTHT.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtSoDTHT.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Số Điện Thoại", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        txtHoTenHT.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtHoTenHT.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Họ Tên", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        txtHoTenMoi.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtHoTenMoi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Họ Tên", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        txtSoDTMoi.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtSoDTMoi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)), "Số Điện Thoại", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSoDTMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rdoDiaChiMoi)
                                            .addComponent(jLabel4)
                                            .addComponent(rdoDiaChiHienTai)
                                            .addComponent(cboDiaChiHT, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDiaChiMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtHoTenHT, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtSoDTHT, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQuayLai))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(btnThemDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtHoTenMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(104, 104, 104)
                                .addComponent(lblTongTien))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoTienMat)
                                    .addComponent(rdoTheTinDung))))
                        .addGap(0, 285, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblQuayLai))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addComponent(rdoDiaChiHienTai)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoDTHT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTenHT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboDiaChiHT, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(rdoDiaChiMoi)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTenMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoDTMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(15, 15, 15)
                .addComponent(txtDiaChiMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(rdoTienMat)
                .addGap(15, 15, 15)
                .addComponent(rdoTheTinDung)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTongTien))
                .addGap(40, 40, 40)
                .addComponent(btnThemDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
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

    private void btnThemDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDonHangActionPerformed
        addDongHang();

    }//GEN-LAST:event_btnThemDonHangActionPerformed

    private void rdoDiaChiHienTaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoDiaChiHienTaiItemStateChanged
        cboDiaChiHT.setEnabled(true);
        txtSoDTHT.setEnabled(true);
        txtHoTenHT.setEnabled(true);
        txtDiaChiMoi.setEnabled(false);
        txtHoTenMoi.setEnabled(false);
        txtSoDTMoi.setEnabled(false);
    }//GEN-LAST:event_rdoDiaChiHienTaiItemStateChanged

    private void rdoDiaChiMoiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoDiaChiMoiItemStateChanged
        txtDiaChiMoi.setEnabled(true);
        txtHoTenMoi.setEnabled(true);
        txtSoDTMoi.setEnabled(true);
        cboDiaChiHT.setEnabled(false);
        txtHoTenHT.setEnabled(false);
        txtSoDTHT.setEnabled(false);
    }//GEN-LAST:event_rdoDiaChiMoiItemStateChanged

    private void lblQuayLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuayLaiMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblQuayLaiMouseClicked

    private void cboDiaChiHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiaChiHTActionPerformed

        String diaChiSelected = (String) cboDiaChiHT.getSelectedItem();
        for (DiaChi s : listdc) {
            if (s.getChiTietDiaChi().equals(diaChiSelected)) {
                txtHoTenHT.setText(s.getHoTen());
                txtSoDTHT.setText(s.getSoDienThoai());
                break;
            }
        }
    }//GEN-LAST:event_cboDiaChiHTActionPerformed

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
            java.util.logging.Logger.getLogger(frmTaoDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTaoDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTaoDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTaoDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTaoDonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGDiaChi;
    private javax.swing.ButtonGroup btnGThanhToan;
    private javax.swing.JButton btnThemDonHang;
    private javax.swing.JComboBox<String> cboDiaChiHT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQuayLai;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JRadioButton rdoDiaChiHienTai;
    private javax.swing.JRadioButton rdoDiaChiMoi;
    private javax.swing.JRadioButton rdoTheTinDung;
    private javax.swing.JRadioButton rdoTienMat;
    private javax.swing.JTextField txtDiaChiMoi;
    private javax.swing.JTextField txtHoTenHT;
    private javax.swing.JTextField txtHoTenMoi;
    private javax.swing.JTextField txtSoDTHT;
    private javax.swing.JTextField txtSoDTMoi;
    // End of variables declaration//GEN-END:variables

    public void kiemTraRong(StringBuilder sb) {
        if (txtSoDTHT.getText().equals("") && rdoDiaChiHienTai.isSelected()) {
            sb.append("Họ tên không được để trống\n");
        }
        if (txtSoDTHT.getText().equals("") && rdoDiaChiHienTai.isSelected()) {
            sb.append("Số điện thoại không được để trống\n");
        }
        if (txtSoDTHT.getText().length() == 0 && rdoDiaChiHienTai.isSelected()) {
            String soDT = txtSoDTHT.getText();
            if (StringUtils.isEmpty(soDT) || !soDT.matches("[0-9]{10}")) {
                sb.append("Số điện thoại không hợp lệ (phải là 10 chữ số)\n");
            }
        }

        if (txtHoTenMoi.getText().equals("") && rdoDiaChiMoi.isSelected()) {
            sb.append("Họ tên không được để trống\n");
        }
        if (txtDiaChiMoi.getText().equals("") && rdoDiaChiMoi.isSelected()) {
            sb.append("Địa chỉ không được để trống\n");
        }
        if (txtSoDTMoi.getText().equals("") && rdoDiaChiMoi.isSelected()) {
            sb.append("Số điện thoại không được để trống\n");
        }
        if (txtSoDTMoi.getText().length() == 0 && rdoDiaChiMoi.isSelected()) {
            String soDT = txtSoDTMoi.getText();
            if (StringUtils.isEmpty(soDT) || !soDT.matches("[0-9]{10}")) {
                sb.append("Số điện thoại không hợp lệ (phải là 10 chữ số)\n");
            }
        }

    }

    public void loadDiaChi(String TenDN) {
        listdc = dcdao.getDiaChiTenDN(TenDN);
        for (DiaChi s : listdc) {
            dc = s;
            cboDiaChiHT.addItem(s.getChiTietDiaChi());
        }
    }

    public void addDongHang() {
        StringBuilder sb = new StringBuilder();
        kiemTraRong(sb);
        if (sb.length() != 0) {
            JOptionPane.showMessageDialog(this, sb);
        } else {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String ngayHienTai = formatter.format(date);
            dh.setTenDN(this.getTenDN());

            if (rdoDiaChiHienTai.isSelected()) {
                dh.setHoTen(txtHoTenHT.getText());
                dh.setSoDienThoai(txtSoDTHT.getText());
                String dc = (String) cboDiaChiHT.getSelectedItem();
                dh.setChiTietDiaChi(dc);
            } else {
                dh.setChiTietDiaChi(txtDiaChiMoi.getText());
                dh.setHoTen(txtHoTenMoi.getText());
                dh.setSoDienThoai(txtSoDTMoi.getText());
                int k = dcdao.addDiaChi(this.getTenDN(), txtHoTenMoi.getText(), txtSoDTMoi.getText(), txtDiaChiMoi.getText());
            }
            String trangthai = "Đang xử lý";
            dh.setTrangThai(trangthai);
            dh.setNgayDat(ngayHienTai);
            if (rdoTienMat.isSelected()) {
                dh.setHinhThucThanhToan("Thanh toán khi nhận hàng");
            } else {
                dh.setHinhThucThanhToan("Thanh toán bằng thẻ tín dụng");
            }
            int rs = dhdao.addDonHang(dh);

            dh.setMaDonHang(dhdao.getMaDonHang(dh.getTenDN(), ngayHienTai));

            listgh = ghdao.getGioHang(dh.getTenDN());

            for (GioHang g : listgh) {
                ChiTietDonHang ct = new ChiTietDonHang();
                ct.setMaDonHang(dh.getMaDonHang());
                ct.setMaSanPham(g.getMaSanPham());
                ct.setSoLuong(g.getSoLuong());
                ct.setKichThuoc(g.getKichThuoc());

                rs = ctdhdao.updateCTDH(ct);
//                list.add(ct);
            }
            dhdao.update1DonHang(dh.getMaDonHang());
            rs = ghdao.deleteAllGioHang(dh.getTenDN());
            if (rs != -1) {

                JOptionPane.showMessageDialog(this, "Đặt hàng thành công!");
                if (loadForm != null) {
                    loadForm.getGioHang(getTenDN());
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Đặt hàng không thành công!");
            }
        }
    }
}