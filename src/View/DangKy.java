package View;

import Main.main;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DangKy extends javax.swing.JFrame {

    public DangKy() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    public static int quyen150 = 0;
    public static String ten150 = "";
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        QuayLai150 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        DangNhapNgay150 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNhanVien150 = new javax.swing.JTextField();
        txtUserName150 = new javax.swing.JTextField();
        txtPassword150 = new javax.swing.JTextField();
        txtRetypePasswword150 = new javax.swing.JTextField();
        TaoTaiKhoan150 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QuayLai150.setBackground(new java.awt.Color(0, 255, 255));
        QuayLai150.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        QuayLai150.setForeground(new java.awt.Color(255, 0, 0));
        QuayLai150.setText("Đã Có Tài Khoản");
        QuayLai150.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        QuayLai150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuayLai150ActionPerformed(evt);
            }
        });
        jPanel1.add(QuayLai150, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 160, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 255, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 220, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Liên hệ admin để cấp quyền truy cập cao hơn");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 310, -1));

        DangNhapNgay150.setBackground(new java.awt.Color(0, 255, 255));
        DangNhapNgay150.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DangNhapNgay150.setForeground(new java.awt.Color(255, 0, 0));
        DangNhapNgay150.setText("Đăng Nhập Ngay");
        DangNhapNgay150.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DangNhapNgay150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangNhapNgay150ActionPerformed(evt);
            }
        });
        jPanel1.add(DangNhapNgay150, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("Mã Nhân Viên :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("Tên Đăng Nhập :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("Mật Khẩu :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 204));
        jLabel5.setText("Nhập Lại Mật Khẩu :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        jPanel1.add(txtMaNhanVien150, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, -1));
        jPanel1.add(txtUserName150, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 130, -1));
        jPanel1.add(txtPassword150, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 130, -1));
        jPanel1.add(txtRetypePasswword150, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 130, -1));

        TaoTaiKhoan150.setBackground(new java.awt.Color(51, 255, 255));
        TaoTaiKhoan150.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TaoTaiKhoan150.setForeground(new java.awt.Color(255, 0, 0));
        TaoTaiKhoan150.setText("Tạo Tài Khoản");
        TaoTaiKhoan150.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TaoTaiKhoan150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaoTaiKhoan150ActionPerformed(evt);
            }
        });
        jPanel1.add(TaoTaiKhoan150, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG KÝ TÀI KHOẢN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nendangky.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -310, 610, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TaoTaiKhoan150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaoTaiKhoan150ActionPerformed
        // TODO add your handling code here:
        String MaNhanVien150, TenDangNhap150, Password150, NhapLai150, Quyen150 = "";

        MaNhanVien150 = txtMaNhanVien150.getText().trim();
        TenDangNhap150 = txtUserName150.getText();
        Password150 = String.valueOf(txtPassword150.getText()).trim();
        NhapLai150 = String.valueOf(txtRetypePasswword150.getText());
        String cautruyvan = "select *from Quyen ";
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next()) {
                if (rs.getString("TenQuyen").equals("New")) {
                    Quyen150 = rs.getString("MaQuyen");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        boolean kt = true;

        if (MaNhanVien150.equals("")) {
            ThongBao150("Tên đăng nhập phải từ 6-10 ký tự", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            if (TenDangNhap150.length() < 6 || TenDangNhap150.length() > 10) {
                ThongBao150("Tên đăng nhập phải từ 6-10 ký tự", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            } else if (Password150.length() < 6 || Password150.length() > 50) {
                ThongBao150("Mật khẩu phải nhập nhiều hơn 6 ký tự và ít hơn 50 ký tự", "Lỗi đăng ký", 2);
            } else if (!KiemTraChuaChuVaSo150(Password150)) {
                ThongBao150("Mật khẩu phải bao gồm chữ IN HOA, chữ thường và số", "Thông báo", 2);
            } else if (!Password150.equals(NhapLai150)) {
                ThongBao150("nhập lại mật khẩu không khớp", "Thông báo", 2);
            } else {

                String cautruyvan2 = "select * from Users where MaNhanVien= '" + MaNhanVien150 + "'";
                ResultSet rs2 = Main.main.connection.ExcuteQueryGetTable(cautruyvan2);
                try {
                    rs2.next();
                    if (rs.getString("MaNhanVien").equals(MaNhanVien150)) {
                        kt = false;
                        ThongBao150("tài khoản  của nhân viên có mã: " + MaNhanVien150 + " đã  có trong sql yêu cầu tạo tk với tên đăng nhập khác!", "Thông báo", 2);
                    }

                } catch (SQLException ex) {
                    System.out.println("không có trong sql !có thể tạo thêm");
                    kt = true;
                }
                if (kt == true) {
                    String ctv = "insert into Users values(" + MaNhanVien150
                            + " ,'" + TenDangNhap150 + "' , '" + Password150 + "' ," + Quyen150
                            + ", N' ')";
                    System.out.println(cautruyvan);
                    main.connection.ExcuteQueryUpdateDB(ctv);
                    System.out.println("Đã Thêm Thành Công");
                } else {
                    ThongBao150("Không thể Thêm tài Khoản", "lỗi", 2);
                }
            }
        }
    }//GEN-LAST:event_TaoTaiKhoan150ActionPerformed

    private void DangNhapNgay150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangNhapNgay150ActionPerformed
        // TODO add your handling code here:
        String strUsername150 = txtUserName150.getText().trim();
        String strPassword150 = String.valueOf(txtPassword150.getText()).trim();
        if (strUsername150.equals("")) {
            ThongBao150("Bạn Chưa Nhập: Tên Đăng Nhập", "Lỗi đăng nhập", 2);
        } else if (strPassword150.equals("")) {
            ThongBao150("Bạn Chưa Nhập: Mật Khẩu", "Lỗi đăng nhập", 2);
        } else if (KiemTra150(strUsername150, strPassword150)) {
            Main.main.frmTC.show();
            this.dispose();
        } else {
            ThongBao150("Bạn nhập sai tài khoản hoặc mật khẩu", "Lỗi đăng nhập", 2);
        }
    }//GEN-LAST:event_DangNhapNgay150ActionPerformed
    private void QuayLai150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuayLai150ActionPerformed
        DangNhap l = new DangNhap();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_QuayLai150ActionPerformed
    private boolean KiemTra150(String tdn, String mk) {
        boolean kq = false;
        String cautruyvan150 = "select * from Users where TenDangNhap= '" + tdn + "' and Password= '" + mk + "'";
        System.out.println(cautruyvan150);
        ResultSet rs = Main.main.connection.ExcuteQueryGetTable(cautruyvan150);
        try {
            if (rs.next()) {
                kq = true;
                quyen150 = rs.getInt("Quyen");
                ten150 = rs.getString("TenDangNhap");
                System.out.println(" " + quyen150);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi đăng nhập");
        }
        return kq;
    }

    private boolean KiemTraChuaChuVaSo150(String chuoi) {
        boolean ketqua = false;
        Pattern p = Pattern.compile("[a-zA-Z][0-9]");
        Matcher m = p.matcher(chuoi);
        if (!(chuoi == chuoi.toLowerCase())) {
            ketqua = m.find();
        }
        return ketqua;
    }

    private void ThongBao150(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DangNhapNgay150;
    private javax.swing.JButton QuayLai150;
    private javax.swing.JButton TaoTaiKhoan150;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtMaNhanVien150;
    private javax.swing.JTextField txtPassword150;
    private javax.swing.JTextField txtRetypePasswword150;
    private javax.swing.JTextField txtUserName150;
    // End of variables declaration//GEN-END:variables
}
