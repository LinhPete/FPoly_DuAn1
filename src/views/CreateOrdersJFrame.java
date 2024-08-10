package views;

import controller.BanHangController;
import controlls.ProductController;
import controlls.ReceiptController;
import customcellbuttonaction.TableActionCellRender;
import customcellbuttonaction.TableActionCelllEditor;
import customcellbuttonaction.TableActionEvent;
import daoImpl.ChiTietSanPhamImple;
import daoImpl.HoaDonChiTietImple;
import daoImpl.HoaDonImple;
import daoimpl.SanPhamImple;
import daoImpl.KhachHangImple;
import daoimpl.NguyenLieuImple;
import entities.ChiTietSanPham;
import entities.HoaDon;
import entities.HoaDonChiTiet;
import entities.KhachHang;
import entities.SanPham;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.XJdbc;
import utils.XDate;
import utils.XImage;
import utils.MsgBox;
import utils.SubController;
import utils.Validate;

public class CreateOrdersJFrame extends SubController implements BanHangController {

    SanPhamImple spdao = new SanPhamImple();
    List<SanPham> list;
    JLabel[][] lblImg = new JLabel[100][3];

    public CreateOrdersJFrame(String mahd) {
        initComponents();
        this.initialize(mahd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelGredient1 = new jpanelgredient.JPanelGredient();
        btnCafe = new button.ButtonCustom();
        btnAll = new button.ButtonCustom();
        btnMilkTea = new button.ButtonCustom();
        btnTea = new button.ButtonCustom();
        lblLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnInHoaDon = new button.ButtonCustom();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOder = new customjtable.CustomJTable();
        btnXoa = new button.ButtonCustom();
        jLabel12 = new javax.swing.JLabel();
        txtTienNhan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        btnTimKiemKH = new button.ButtonCustom();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        cboKhachHang = new javax.swing.JComboBox<>();
        btnTaoKH = new button.ButtonCustom();
        txtTienThoi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanelGredient2 = new jpanelgredient.JPanelGredient();
        panelRound1 = new jpanelrounded.PanelRound();
        panelRound2 = new jpanelrounded.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        scrollPaneMain = new javax.swing.JScrollPane();
        pnlMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanelGredient1.setBackground(new java.awt.Color(204, 255, 255));
        jPanelGredient1.setColorEnd(new java.awt.Color(204, 255, 255));
        jPanelGredient1.setColorStart(new java.awt.Color(0, 102, 102));
        jPanelGredient1.setPreferredSize(new java.awt.Dimension(150, 700));

        btnCafe.setText("CAFE");
        btnCafe.setBorderColor(new java.awt.Color(204, 255, 255));
        btnCafe.setColor(new java.awt.Color(204, 255, 255));
        btnCafe.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCafe.setRadius(20);
        btnCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeActionPerformed(evt);
            }
        });

        btnAll.setText("ALL ITEMS");
        btnAll.setBorderColor(new java.awt.Color(204, 255, 255));
        btnAll.setColor(new java.awt.Color(204, 255, 255));
        btnAll.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnAll.setRadius(20);
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        btnMilkTea.setText("MILK TEA");
        btnMilkTea.setBorderColor(new java.awt.Color(204, 255, 255));
        btnMilkTea.setColor(new java.awt.Color(204, 255, 255));
        btnMilkTea.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnMilkTea.setRadius(20);
        btnMilkTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMilkTeaActionPerformed(evt);
            }
        });

        btnTea.setText("TEA");
        btnTea.setBorderColor(new java.awt.Color(204, 255, 255));
        btnTea.setColor(new java.awt.Color(204, 255, 255));
        btnTea.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnTea.setRadius(20);
        btnTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGredient1Layout = new javax.swing.GroupLayout(jPanelGredient1);
        jPanelGredient1.setLayout(jPanelGredient1Layout);
        jPanelGredient1Layout.setHorizontalGroup(
            jPanelGredient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGredient1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGredient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCafe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMilkTea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnTea, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnAll, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelGredient1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGredient1Layout.setVerticalGroup(
            jPanelGredient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGredient1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMilkTea, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTea, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelGredient1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(252, 248, 248));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 700));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Current  Order");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 15, 0));

        btnInHoaDon.setBackground(new java.awt.Color(204, 255, 255));
        btnInHoaDon.setText("Thanh toán");
        btnInHoaDon.setBorderColor(new java.awt.Color(102, 102, 102));
        btnInHoaDon.setColor(new java.awt.Color(204, 255, 255));
        btnInHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnInHoaDon.setRadius(15);
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });
        jPanel4.add(btnInHoaDon);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        tblOder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SP", "S/PHẨM", "Đ/GIÁ", "SL", "T/TIỀN", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOderMouseClicked(evt);
            }
        });
        tblOder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblOderKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblOder);

        btnXoa.setBackground(new java.awt.Color(204, 255, 255));
        btnXoa.setText("Xóa tất cả");
        btnXoa.setBorderColor(new java.awt.Color(204, 255, 255));
        btnXoa.setColor(new java.awt.Color(204, 255, 255));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnXoa.setRadius(10);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Tiền nhận:");

        txtTienNhan.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtTienNhan.setForeground(new java.awt.Color(255, 0, 0));
        txtTienNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienNhanActionPerformed(evt);
            }
        });
        txtTienNhan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienNhanKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Tiền thối:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Số ĐT:");

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSDTKeyPressed(evt);
            }
        });

        btnTimKiemKH.setText("Tìm kiếm");
        btnTimKiemKH.setBorderColor(new java.awt.Color(102, 102, 102));
        btnTimKiemKH.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnTimKiemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemKHActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Trạng thái:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Khách hàng:");

        cboTrangThai.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã thanh toán", "Chưa thanh toán" }));

        cboKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        btnTaoKH.setText("Tạo KH");
        btnTaoKH.setBorderColor(new java.awt.Color(102, 102, 102));
        btnTaoKH.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnTaoKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoKHActionPerformed(evt);
            }
        });

        txtTienThoi.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtTienThoi.setForeground(new java.awt.Color(255, 0, 0));
        txtTienThoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienThoiActionPerformed(evt);
            }
        });
        txtTienThoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienThoiKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Discount:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Giảm giá:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tổng tiền:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("VNĐ");

        txtGiamGia.setEditable(false);
        txtGiamGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtGiamGia.setForeground(new java.awt.Color(255, 0, 51));
        txtGiamGia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGiamGia.setText("0.0");

        txtDiscount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDiscount.setForeground(new java.awt.Color(255, 0, 51));
        txtDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiscount.setText("0.0");
        txtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountActionPerformed(evt);
            }
        });
        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiscountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscountKeyReleased(evt);
            }
        });

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(255, 0, 51));
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrice.setText("0.0");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("%");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("VNĐ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtTienThoi, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiamGia)
                            .addComponent(txtDiscount)
                            .addComponent(txtPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addGap(8, 8, 8))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnTimKiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(cboKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTaoKH, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 4577, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimKiemKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaoKH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTienThoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanelGredient2.setColorStart(new java.awt.Color(0, 102, 102));
        jPanelGredient2.setPreferredSize(new java.awt.Dimension(886, 60));

        panelRound1.setBackground(new java.awt.Color(204, 255, 255));
        panelRound1.setRoundButtomRight(60);
        panelRound1.setRoundTopRight(60);

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundButtomRight(60);
        panelRound2.setRoundTopRight(60);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Danh sách sản phẩm");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGredient2Layout = new javax.swing.GroupLayout(jPanelGredient2);
        jPanelGredient2.setLayout(jPanelGredient2Layout);
        jPanelGredient2Layout.setHorizontalGroup(
            jPanelGredient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGredient2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanelGredient2Layout.setVerticalGroup(
            jPanelGredient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGredient2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGredient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelGredient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanelGredient2, java.awt.BorderLayout.PAGE_START);

        scrollPaneMain.setBackground(new java.awt.Color(255, 255, 255));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new java.awt.GridLayout(100, 3));
        scrollPaneMain.setViewportView(pnlMain);

        jPanel3.add(scrollPaneMain, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 5021, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeActionPerformed

        this.fillProductDetail("Cà Phê");
        this.eventClickAddProduct();
    }//GEN-LAST:event_btnCafeActionPerformed

    private void btnMilkTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMilkTeaActionPerformed

        this.fillProductDetail("Trà Sữa");
        this.eventClickAddProduct();
    }//GEN-LAST:event_btnMilkTeaActionPerformed

    private void btnTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeaActionPerformed

        this.fillProductDetail("Trà");
        this.eventClickAddProduct();
    }//GEN-LAST:event_btnTeaActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed

        this.fillProductDetail("");
        this.eventClickAddProduct();
    }//GEN-LAST:event_btnAllActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.hoanTraNguyenLieu(1);
        this.clearAll();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblOderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOderMouseClicked
        if (evt.getClickCount() == 2) {
            this.chonSoLuong();
        }
    }//GEN-LAST:event_tblOderMouseClicked

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        if (mahdUD == null) {
            this.inhoadon();
        } else {
            this.updateBills(mahdUD);
        }

    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void btnTaoKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoKHActionPerformed
        new SaveOderCustomerJDialog(this, true, txtSDT.getText()).setVisible(true);
        if (SaveOderCustomerJDialog.makh != null)
            this.fillCustomerByID(SaveOderCustomerJDialog.makh);
    }//GEN-LAST:event_btnTaoKHActionPerformed

    private void txtDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyReleased

    }//GEN-LAST:event_txtDiscountKeyReleased

    private void tblOderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOderKeyPressed

    }//GEN-LAST:event_tblOderKeyPressed

    private void txtDiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyPressed
        try {
            Double giamGia = giaGoc * Double.valueOf(txtDiscount.getText());
            Double triGia = giaGoc - giamGia;
            txtGiamGia.setText(giamGia + "");
            txtPrice.setText(triGia + "");
        } catch (NumberFormatException e) {
        }

    }//GEN-LAST:event_txtDiscountKeyPressed

    private void txtTienNhanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienNhanKeyReleased
        Double TN = Double.valueOf(txtTienNhan.getText());
        Double total = Double.valueOf(txtPrice.getText());
        Double TT = (TN - total);
        NumberFormat formatter = new DecimalFormat("####,###.#");
        txtTienThoi.setText(formatter.format(TT));
    }//GEN-LAST:event_txtTienNhanKeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        returnWindow.setVisible(true);
        ReceiptController.fillTableBills();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.hoanTraNguyenLieu(1);
    }//GEN-LAST:event_formWindowClosing

    private void txtTienNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienNhanActionPerformed

    }//GEN-LAST:event_txtTienNhanActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed

    }//GEN-LAST:event_txtSDTKeyPressed

    private void btnTimKiemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemKHActionPerformed
        this.searchKhachHang();
    }//GEN-LAST:event_btnTimKiemKHActionPerformed

    private void txtTienThoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienThoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienThoiActionPerformed

    private void txtTienThoiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienThoiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienThoiKeyReleased

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscountActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased

    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        this.fillProductDetail(txtTimKiem.getText());
        this.eventClickAddProduct();
    }//GEN-LAST:event_btnTimKiemActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CreateOrdersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CreateOrdersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CreateOrdersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CreateOrdersJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CreateOrdersJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.ButtonCustom btnAll;
    private button.ButtonCustom btnCafe;
    private button.ButtonCustom btnInHoaDon;
    private button.ButtonCustom btnMilkTea;
    private button.ButtonCustom btnTaoKH;
    private button.ButtonCustom btnTea;
    private javax.swing.JButton btnTimKiem;
    private button.ButtonCustom btnTimKiemKH;
    private button.ButtonCustom btnXoa;
    private javax.swing.JComboBox<String> cboKhachHang;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private jpanelgredient.JPanelGredient jPanelGredient1;
    private jpanelgredient.JPanelGredient jPanelGredient2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLogo;
    private jpanelrounded.PanelRound panelRound1;
    private jpanelrounded.PanelRound panelRound2;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JScrollPane scrollPaneMain;
    private customjtable.CustomJTable tblOder;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTienNhan;
    private javax.swing.JTextField txtTienThoi;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private Double giaGoc = 0.0;
    private Double discountGoc = 0.0;
    String mahdUD;

    @Override
    public void initialize(String mahd) {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.fillProductDetail("");
        this.setImageProduct("logo.jpg", lblLogo);
        this.eventClickAddProduct();
        this.updateStatus(mahd);
        this.setForm(mahd);
        this.mahdUD = mahd;

        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onDetete(int row) {
                if (tblOder.isEditing()) {
                    tblOder.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
                if (row >= 0) {
                    updateNguyenLieu(model.getValueAt(row, 0) + "", -Integer.parseInt(model.getValueAt(row, 3) + ""));
                    model.removeRow(row);
                    resetBill();
                    updatePrice();
                }

            }

        };
        tblOder.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRender());
        tblOder.getColumnModel().getColumn(5).setCellEditor(new TableActionCelllEditor(event));
    }

    private JLabel createNameProduct(String nameProduct, String IDColor) {
        JLabel lblName = new JLabel();
        lblName.setText(nameProduct);
        lblName.setFont(new Font("Arial", Font.BOLD, 18));
        lblName.setForeground(Color.decode(IDColor));
        lblName.setHorizontalAlignment(SwingConstants.CENTER);
        return lblName;
    }

    private void setImageProduct(String nameFile, JLabel nameLabel) {
        ImageIcon Icon = XImage.read("ProdImages", nameFile);
        nameLabel.setIcon(Icon);
        Image im = Icon.getImage().getScaledInstance(nameLabel.getWidth(), nameLabel.getHeight(), Image.SCALE_SMOOTH);
        try {
            Icon.setImage(im);
        } catch (Exception e) {
            MsgBox.alert(this, "Ảnh không có sẵn .");
        }

    }

    jpanelrounded.PanelRound[][] pnlProduct = new jpanelrounded.PanelRound[100][3];

    @Override
    public void fillProductDetail(String loaisp) {
        int dem = -1;
        list = spdao.getItemsByID(loaisp);
        int size = list.size();
        pnlMain.removeAll();
        pnlMain.setLayout(new GridLayout(size / 3 + 1, 3, 10, 10));
        for (int i = 0; i < size / 3 + 1; i++) {
            for (int j = 0; j < 3; j++) {
                ++dem;
                if (dem < size) {
                    SanPham sp = list.get(dem);
                    pnlProduct[i][j] = new jpanelrounded.PanelRound();
                    pnlProduct[i][j].setSize(250, 250);
                    pnlProduct[i][j].setLayout(new BorderLayout());
                    pnlProduct[i][j].setBackground(Color.decode("#FFEFD5"));
                    pnlProduct[i][j].setRoundButtomLeft(30);
                    pnlProduct[i][j].setRoundButtomRight(30);
                    pnlProduct[i][j].setRoundTopLeft(30);
                    pnlProduct[i][j].setRoundTopRight(30);
                    lblImg[i][j] = new JLabel();
                    lblImg[i][j].setSize(245, 245);
                    lblImg[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                    lblImg[i][j].setCursor(new Cursor(Cursor.HAND_CURSOR));
                    lblImg[i][j].setToolTipText(sp.getMaSP());
                    this.setImageProduct(sp.getHinh(), lblImg[i][j]);
                    pnlProduct[i][j].add(lblImg[i][j], BorderLayout.NORTH);
                    pnlProduct[i][j].add(this.createNameProduct(sp.getTenSP(), "#8B4513"), BorderLayout.CENTER);
                    pnlProduct[i][j].add(this.createNameProduct(sp.getGiaTien() + " vnđ", "#8B4513"), BorderLayout.SOUTH);
                    pnlMain.add(pnlProduct[i][j]);
                    pnlMain.scrollRectToVisible(new Rectangle(pnlMain.getSize()));
                }
            }
        }
    }

    @Override
    public void clearAll() {
        DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
        model.setRowCount(0);
        this.giaGoc = 0.0;
        this.discountGoc = 0.0;
        txtSDT.setText("");
        txtPrice.setText(this.giaGoc + "");
        txtGiamGia.setText(this.giaGoc * this.discountGoc + "");
        txtDiscount.setText(this.discountGoc + "");
        txtTienNhan.setText("");
        txtTienThoi.setText("");
        cboKhachHang.removeAllItems();
    }

    @Override
    public void resetBill() {
        DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
        this.giaGoc = 0.0;
        for (int i = 0; i < model.getRowCount(); i++) {
            Double donGia;
            Integer SLSP;
            try {
                donGia = Double.valueOf(model.getValueAt(i, 2) + "");
                SLSP = Integer.valueOf(model.getValueAt(i, 3) + "");
                model.setValueAt(donGia * SLSP, i, 4);
            } catch (NumberFormatException e) {
                MsgBox.alert(this, model.getValueAt(i, 1) + ": sai định dạng số lượng. ");
                tblOder.setRowSelectionInterval(i, i);
                return;
            }
            giaGoc += Double.parseDouble(model.getValueAt(i, 4) + "");
        }
        txtPrice.setText(giaGoc + "");
    }

    HoaDonImple hdndao = new HoaDonImple();
    String maHD;

    @Override
    public void inhoadon() {
        try {
            if (tblOder.getRowCount() != 0) {
                maHD = hdndao.taoMaHoaDon();
                KhachHang kh = (KhachHang) cboKhachHang.getSelectedItem();
                HoaDon hd = new HoaDon();
                hd.setMaHD(maHD);
                hd.setMaKH(kh == null ? null : kh.getMaKH());
                hd.setMaNV(Auth.getUser().getMaNV());
                hd.setNgayMua(new Date());
                hd.setTongTien(Double.parseDouble(txtPrice.getText()) + Double.parseDouble(txtGiamGia.getText()));
                hd.setGiamGia(Double.valueOf(txtGiamGia.getText()));
                hd.setTriGia(Double.valueOf(txtPrice.getText()));
                hd.setTrangThai(cboTrangThai.getSelectedItem() + "");
                hdndao.insertHoaDon(hd);
                this.insertCTHD(maHD);
                this.clearAll();
            } else {
                MsgBox.alert(this, "Hóa đơn trống.");
            }
        } catch (NumberFormatException e) {
            MsgBox.alert(this, "In hóa đơn thất bại !!");
        }

    }

    @Override
    public void taoHoaDon() {
        String sql = " EXEC SP_TAOMAHD ";
        try {
            XJdbc.select(sql);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CreateOrdersJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    HoaDonChiTietImple hdctdao = new HoaDonChiTietImple();

    @Override
    public void insertCTHD(String mahd) {
        DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
        try {
            for (int i = 0; i < model.getRowCount(); i++) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                System.out.println(mahd);
                hdct.setMaHD(mahd);
                hdct.setMaSP(model.getValueAt(i, 0) + "");
                hdct.setSoLuong(Integer.valueOf(model.getValueAt(i, 3) + ""));
                hdct.setDonGia(Double.valueOf(model.getValueAt(i, 2) + ""));
                hdct.setThanhTien(Double.valueOf(model.getValueAt(i, 4) + ""));
                hdct.setKhuyenMai(Double.valueOf(txtDiscount.getText()));
                hdct.setGhiChu(model.getValueAt(i, 1) + "");
                hdctdao.insertCTHoaDon(hdct);
            }
            this.updateGiaTienNL();
            this.xuatBillKhachHang();
        } catch (NumberFormatException e) {
            MsgBox.alert(this, "Thêm hóa đơn thất bại !!");
        }
    }

    @Override
    public void eventClickAddProduct() {
        int dem = -1;
        for (int i = 0; i < list.size() / 3 + 1; i++) {
            for (int j = 0; j < 3; j++) {
                ++dem;
                if (dem < list.size()) {
                    String masp = lblImg[i][j].getToolTipText();
                    DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
                    lblImg[i][j].addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            SanPham sp = spdao.getItemsByMaSP(masp);
                            int count = 0;
                            String sl = MsgBox.prompt(null, "Nhập số lượng :");
                            if (Validate.positiveInt(sl) && Integer.parseInt(sl) != 0) {
                                if (checkMaxCount(masp) <= 0) {
                                    MsgBox.inform(null, "Nguyên liệu không còn đủ ");
                                    return;
                                }
                                int sluong = Integer.parseInt(sl);
                                if (checkCountTable(masp) == -1) {
                                    if (checkNguyenLieuSanPham(masp, sluong)) {
                                        count = sluong;
                                    } else {
                                        count = checkMaxCount(masp);
                                    }
                                    Object[] row = {
                                        sp.getMaSP(),
                                        sp.getTenSP(),
                                        sp.getGiaTien(),
                                        count,
                                        sp.getGiaTien() * count
                                    };
                                    updateNguyenLieu(masp, count);
                                    model.addRow(row);
                                    tblOder.setRowSelectionInterval(model.getRowCount() - 1, model.getRowCount() - 1);
                                    resetBill();
                                    updatePrice();
                                } else {
                                    updateNguyenLieu(masp, -Integer.parseInt(model.getValueAt(checkCountTable(masp), 3) + ""));
                                    if (checkNguyenLieuSanPham(masp, sluong) == false) {
                                        count = Integer.parseInt(model.getValueAt(checkCountTable(masp), 3) + "");
                                    } else {
                                        count = sluong;
                                    }
                                    updateNguyenLieu(masp, count);
                                    model.removeRow(checkCountTable(masp));
                                    Object[] row = {
                                        sp.getMaSP(),
                                        sp.getTenSP(),
                                        sp.getGiaTien(),
                                        count,
                                        sp.getGiaTien() * count
                                    };
                                    model.addRow(row);
                                    tblOder.setRowSelectionInterval(model.getRowCount() - 1, model.getRowCount() - 1);
                                    resetBill();
                                    updatePrice();
                                }
                            } else {
                                MsgBox.inform(null, "Sai định dạng số lượng !!");
                            }
                        }
                    });
                }
            }
        }
    }

    private void setToolTipText(JLabel label) {
        label.setToolTipText("<html>\n"
                + "    <div style=\"background-color: antiquewhite; font-size: 10px; \n"
                + "        font-weight: bold; width: 80px; height: 40px; text-align: center; \n"
                + "        padding: 3px;border-radius: 60px;\">\n"
                + "        <p>TÌNH TRẠNG</p>\n"
                + "        <p style=\"font-style: italic; color: rgb(237, 80, 132);   \">Còn hàng</p>\n"
                + "    </div>\n"
                + "</html>");
    }

    private int checkCountTable(String maSP) {
        DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
        for (int i = 0; i < tblOder.getRowCount(); i++) {
            if (maSP.equals(model.getValueAt(i, 0))) {
                return i;
            }
        }
        return -1;
    }

    KhachHangImple khdao = new KhachHangImple();
    HoaDonImple hddao = new HoaDonImple();

    @Override
    public Double checkKhuyenMai() {
        Double sumMoney = 0.0;
        Double giamGia = 0.0;
        try {
            KhachHang kh = (KhachHang) cboKhachHang.getSelectedItem();
            if (kh != null) {
                sumMoney = hddao.checkCountBills(kh.getMaKH());
                if (sumMoney == null) {
                    sumMoney = 0.0;
                }
            } else {
            }
            if (sumMoney + giaGoc >= 10000000) {
                giamGia = 0.25;
            } else if (sumMoney + giaGoc >= 5000000) {
                giamGia = 0.15;
            } else if (sumMoney + giaGoc >= 2000000) {
                giamGia = 0.1;
            } else if (sumMoney + giaGoc >= 1000000) {
                giamGia = 0.05;
            } else {
                giamGia = 0.0;
            }
        } catch (Exception e) {
        }
        return giamGia;
    }

    @Override
    public void fillCustomerByID(String makh) {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhachHang.getModel();
            model.removeAllElements();
            KhachHang kh = khdao.selectByMaKH(makh);
            model.addElement(kh);
            txtSDT.setText(kh.getSDT());
            this.updatePrice();
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !!");
        }

    }

    private void updatePrice() {
        discountGoc = this.checkKhuyenMai();
        String pattern = "#.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        txtDiscount.setText(discountGoc + "");
        Double giamGia = Double.valueOf(txtDiscount.getText()) * giaGoc;
        Double triGia = giaGoc - giamGia;
        txtGiamGia.setText(decimalFormat.format(giamGia));
        txtPrice.setText(decimalFormat.format(triGia));
    }

    @Override
    public void xuatBillKhachHang() {
        String head
                = "<head>\n"
                + "    <style>\n"
                + "        div.hoadon{\n"
                + "            width: 500px;\n"
                + "            margin: auto;\n"
                + "            text-align: center;\n"
                + "        }\n"
                + "        p.title{\n"
                + "            font-weight: bolder;\n"
                + "            font-size: 25px;\n"
                + "            padding: 10px;\n"
                + "            border-bottom:  2px dashed   black;\n"
                + "        }\n"
                + "        div.hoadon> div.info{\n"
                + "            margin-top: -10px;\n"
                + "            font-size: 16px;\n"
                + "            padding-bottom: 10px;\n"
                + "        }\n"
                + "        table.sanpham{\n"
                + "            border-collapse: collapse;\n"
                + "            width: 100%;\n"
                + "        }\n"
                + "        table.sanpham th{\n"
                + "            padding: 10px;\n"
                + "            background-color: #33CCFF;\n"
                + "        }\n"
                + "        table.sanpham tr{\n"
                + "            text-align: center;\n"
                + "        }\n"
                + "        div.left{\n"
                + "            float: left; \n"
                + "            width: 50%; \n"
                + "        }\n"
                + "        div.left ,div.right{\n"
                + "            padding: 10px; \n"
                + "            font-size: 18px; font-weight: bold;\n"
                + "        }\n"
                + "\n"
                + "        table.thanhtoan{\n"
                + "            width: 100%;\n"
                + "            padding: 10px;\n"
                + "            border-top: 2px dashed black;\n"
                + "            border-bottom: 2px dashed black;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>";
        String body = "<body>\n"
                + "    <div class=\"hoadon\">\n"
                + "        <p class=\"title\">PHIẾU THANH TOÁN CINNAMON</p>\n"
                + "        <div class=\"info\">\n"
                + "            <span>MaHD : " + maHD + " - Ngày: " + XDate.toString(new Date(), "HH:mm:ss MM/dd/yyyy") + " - NV001 </span>\n"
                + "        </div>\n"
                + "        <table border=\"\" class=\"sanpham\" >\n"
                + "            <thead>\n"
                + "                <tr>\n"
                + "                    <th>Số lượng</th>\n"
                + "                    <th>Giá bán</th>\n"
                + "                    <th>Thành tiền</th>\n"
                + "                </tr>\n"
                + "            </thead>\n"
                + // Thực hiện vòng for() tại đây //
                "            <tbody>\n";
        DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
        for (int i = 0; i < tblOder.getRowCount(); i++) {

            body += "               <tr>\n";
            body += "                    <td>" + model.getValueAt(i, 1) + " <br>" + model.getValueAt(i, 3) + "</td>\n";
            body += "                    <td>" + model.getValueAt(i, 2) + "</td>\n";
            body += "                    <td>" + model.getValueAt(i, 4) + "</td>\n";
            body += "                </tr>\n";
        }

        body
                += "            </tbody>\n"
                + "        </table>\n"
                + "        <table class=\"thanhtoan\">\n"
                + "            <tfoot style=\"margin-top: 10px;\">\n"
                + "                <tr>\n"
                + "                    <th>Tổng tiền:</th>\n"
                + "                    <th></th>\n"
                + "                    <th>" + giaGoc + "</th>\n"
                + "                </tr>\n"
                + "                <tr>\n"
                + "                    <th>Giảm giá:</th>\n"
                + "                    <th>" + txtDiscount.getText() + " <span>%</span></th>\n"
                + "                    <th>" + txtGiamGia.getText() + "</th>\n"
                + "                </tr>\n"
                + "                <tr>\n"
                + "                    <th>Phải thanh toán:</th>:</th>\n"
                + "                    <th></th>\n"
                + "                    <th>" + txtPrice.getText() + "</th>\n"
                + "                </tr>\n"
                + "        </table>\n"
                + "<p style=\"text-align: right; margin-right: 50px; font-weight: bolder;\">" + cboTrangThai.getSelectedItem() + "</p>"
                + "        <p>CẢM ƠN QUÝ KHÁCH</p>\n"
                + "        <P>Đã đồng hàng cùng cửa hàng của chúng tôi</P>\n"
                + "    </div>\n"
                + "</body>";

        try {
            // Tạo một file mới
            FileWriter writer = new FileWriter("receipts/sales/"+maHD+".html");

            // Viết nội dung HTML vào file
            writer.write(head+body);

            // Đóng file
            writer.close();
            MsgBox.inform(null, "In hóa đơn thành công");
            String filePath = "receipts/sales/"+maHD+".html";
            
            // Tạo một đối tượng File từ đường dẫn
            File file = new File(filePath);
            
            // Sử dụng lớp Desktop để mở file
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            MsgBox.alert(this,"Đã xảy ra lỗi khi tạo file: " + e.getMessage());
        }        
    }

    @Override
    public void openBill(Path path) {
    }

    ChiTietSanPhamImple ctspdao = new ChiTietSanPhamImple();
    NguyenLieuImple nldao = new NguyenLieuImple();

    @Override
    public void updateNguyenLieu(String maSP, int heSo) {
        List<ChiTietSanPham> list = ctspdao.selectAllNguyenLieu(maSP);
        for (ChiTietSanPham ctsp : list) {
            Object[] values = {
                ctsp.getSoLuong() * heSo,
                ctsp.getMaNL()
            };
            try {
                nldao.updateTKNguyenLieu(values);
            } catch (Exception e) {
                MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            }
        }
    }

    public void updateGiaTienNL() {
        Double giaTien = 0.0;
        DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String masp = model.getValueAt(i, 0) + "";
            int soLuong = Integer.parseInt(model.getValueAt(i, 3) + "");
            List<ChiTietSanPham> list = ctspdao.selectAllNguyenLieu(masp);
            for (ChiTietSanPham ctsp : list) {
                giaTien = ctsp.getGiaVon();
                nldao.updateGiaTien(giaTien * soLuong, ctsp.getMaNL());
            }
        }
    }

    public int checkMaxCount(String maSP) {
        List<ChiTietSanPham> list = ctspdao.selectAllNguyenLieu(maSP);
        int maxCount = 100000;
        int count;
        for (ChiTietSanPham ctsp : list) {
            int tonKho = nldao.checkNLTonKhoByMaNL(ctsp.getMaNL());
            int soLuong = ctsp.getSoLuong();
            count = tonKho / soLuong;
            if (count < maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    public boolean checkNguyenLieuSanPham(String maSP, int count) {
        int maxCount = this.checkMaxCount(maSP);
        if (maxCount >= count) {
            return true;
        } else {
            MsgBox.alert(this, "Nguyên chỉ còn đủ cho " + maxCount + " Sản Phẩm.");
            return false;
        }
    }

    public boolean checkMaSP(String maSP) {
        DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String masp = model.getValueAt(i, 0) + "";
            if (masp.equals(maSP)) {
                return true;
            }
        }
        return false;
    }

    public void chonSoLuong() {

        DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
        String maSP = model.getValueAt(tblOder.getSelectedRow(), 0) + "";
        int soLuongCu = Integer.parseInt(model.getValueAt(tblOder.getSelectedRow(), 3) + "");
        int soLuongMoi = 0;
        String sl = MsgBox.prompt(this, "Nhập số lượng");
        if (Validate.positiveInt(sl)) {
            if (!sl.equals("0")) {
                soLuongMoi = Integer.parseInt(sl);
                this.updateNguyenLieu(maSP, -Integer.parseInt(model.getValueAt(this.checkCountTable(maSP), 3) + ""));
                int maxCount = this.checkMaxCount(maSP);
                if (maxCount < soLuongMoi) {
                    MsgBox.alert(this, "Nguyên liệu tối đa cho: " + maxCount + " sản Phẩm");
                    model.setValueAt(maxCount, tblOder.getSelectedRow(), 3);
                    this.updateNguyenLieu(maSP, maxCount);
                } else {
                    model.setValueAt(soLuongMoi, tblOder.getSelectedRow(), 3);
                    this.updateNguyenLieu(maSP, soLuongMoi);
                }
            } else {
                soLuongMoi = Integer.parseInt(sl);
                model.removeRow(tblOder.getSelectedRow());
                this.updateNguyenLieu(maSP, soLuongMoi - soLuongCu);
            }
        } else {
            MsgBox.alert(this, "Số lượng phải là nguyên dương !!");
            return;
        }
        this.resetBill();
        this.updatePrice();
    }

    public void hoanTraNguyenLieu(int heSo) {
        DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
        if (model.getRowCount() > 0) {
            for (int i = 0; i < tblOder.getRowCount(); i++) {
                String masp = model.getValueAt(i, 0) + "";
                int soLuong = Integer.parseInt(model.getValueAt(i, 3) + "");
                this.updateNguyenLieu(masp, heSo * soLuong);
            }
        }
    }

    @Override
    public void searchKhachHang() {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhachHang.getModel();
            model.removeAllElements();
            KhachHang kh = khdao.selectBySDT(txtSDT.getText());
            if (kh != null) {
                model.addElement(kh.toString());
            } else {
                if (MsgBox.confirm(this, "Khách hàng mới\nBạn có muốn thêm mới khách hàng ?")) {
                    ProductController.masp = null;
                    new SaveOderCustomerJDialog(this, true, txtSDT.getText()).setVisible(true);
                    if (SaveOderCustomerJDialog.makh != null) {
                        this.fillCustomerByID(SaveOderCustomerJDialog.makh);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void updateStatus(String mahd) {
        if (mahd != null) {
            btnTimKiemKH.setEnabled(false);
            btnTaoKH.setEnabled(false);
        }
    }

    @Override
    public void setForm(String mahd) {
        if (mahd != null) {
            DefaultTableModel model = (DefaultTableModel) tblOder.getModel();
            List<HoaDonChiTiet> list = hdctdao.selectByID(mahd);
            Double discount = null;
            for (HoaDonChiTiet hdct : list) {
                discount = hdct.getKhuyenMai();
                SanPham sp = spdao.getItemsByMaSP(hdct.getMaSP());
                Object[] row = {
                    hdct.getMaSP(),
                    sp.getTenSP(),
                    sp.getGiaTien(),
                    hdct.getSoLuong(),
                    sp.getGiaTien() * hdct.getSoLuong()
                };
                model.addRow(row);
            }
            HoaDonImple hddao = new HoaDonImple();
            HoaDon hd = hddao.selectByMaHD(mahd);
            KhachHang kh = khdao.selectByMaKH(hd.getMaKH());
            DefaultComboBoxModel modelcbo = (DefaultComboBoxModel) cboKhachHang.getModel();
            modelcbo.removeAllElements();
            if (kh != null) {
                modelcbo.addElement(kh.toString());
                txtSDT.setText(kh.getSDT() + "");
            }
            cboTrangThai.setSelectedItem(hd.getTrangThai());
            this.resetBill();
            txtDiscount.setText(discount + "");
            txtGiamGia.setText(discount * Double.parseDouble(txtPrice.getText()) + "");
        }
    }

    @Override
    public void updateBills(String mahd) {
        HoaDon hd = new HoaDon();
        HoaDon hd1 = hddao.selectByMaHD(mahd);
        hd.setMaHD(mahd);
        if (hd1 != null) {
            hd.setMaKH(hd1.getMaKH());
        }
        hd.setMaNV(Auth.getUser().getMaNV());
        hd.getNgayMua();
        hd.setTongTien(Double.parseDouble(txtPrice.getText()));
        hd.setGiamGia(Double.parseDouble(txtGiamGia.getText()));
        hd.setTriGia(Double.parseDouble(txtPrice.getText()) - Double.parseDouble(txtGiamGia.getText()));
        hd.setTrangThai(cboTrangThai.getSelectedItem() + "");
        hddao.update(hd);
        hdctdao.delete(mahd);
        this.insertCTHD(mahd);
        this.clearAll();
    }

}
