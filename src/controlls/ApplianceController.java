
package controlls;

import daoImpl.NguyenLieuDao;
import daoImpl.HoaDonNhapImple;
import daoImpl.CTHDNhapImple;
import entities.ChiTietHDNhap;
import entities.HoaDonNhap;
import entities.INFOHDXUAT;
import entities.NguyenLieu;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;
import utils.Validate;
import utils.XDate;
import utils.XImage;
import utils.XTable;
import views.CreateOrdersJFrame;


public class ApplianceController {

    private static int curr = -1;
    private static final NguyenLieuDao dao = new NguyenLieuDao();
    private static final HoaDonNhapImple hdndao = new HoaDonNhapImple();
    private static final CTHDNhapImple cthdndao = new CTHDNhapImple();
    public static JFrame frame;
    public static JTable tblNL_SP;
    public static JTextField txtmasp_KH;
    public static JTextField txtTSP_KH;
    public static JTextField txtDonVI_SP;
    public static JTextField txtGT_SP;
    public static JTextField txtTKHo_SP;
    public static JTextField txtTThieu_SP;
    public static JTextField txtSLDatThem;
    public static JTextArea txtGhiChu;
    public static JLabel lblhhinh_SP;
    public static JButton btndatlai_SP;
    public static JButton btnthem_SP;
    public static JButton btnsua_SP;
//    public static JButton btnxoa_SP;
    public static JButton btnThemNL; 
    private static File img;

    public static void initialize(JFrame frame, JTable tblNL_SP, JTextField txtmasp_KH, JTextField txtTSP_KH, JTextField txtDonVI_SP,
            JTextField txtGT_SP, JTextField txtTKHo_SP, JTextField txtTThieu_SP, JLabel lblhhinh_SP,
            JButton btndatlai_SP, JButton btnthem_SP, JButton btnsua_SP,JTextField txtSLDatThem,JButton btnThemNL,JTextArea txtGhiChu) {
        ApplianceController.frame = frame;
        ApplianceController.tblNL_SP = tblNL_SP;
        ApplianceController.txtmasp_KH = txtmasp_KH;
        ApplianceController.txtTSP_KH = txtTSP_KH;
        ApplianceController.txtDonVI_SP = txtDonVI_SP;
        ApplianceController.txtGT_SP = txtGT_SP;
        ApplianceController.txtTKHo_SP = txtTKHo_SP;
        ApplianceController.txtTThieu_SP = txtTThieu_SP;
        ApplianceController.lblhhinh_SP = lblhhinh_SP;
        ApplianceController.btndatlai_SP = btndatlai_SP;
        ApplianceController.btnthem_SP = btnthem_SP;
        ApplianceController.btnsua_SP = btnsua_SP;
//        ApplianceController.btnxoa_SP = btnxoa_SP;
        ApplianceController.txtSLDatThem = txtSLDatThem;
        ApplianceController.btnThemNL = btnThemNL;
        ApplianceController.txtGhiChu = txtGhiChu;
    }

    public static void getComponents(JFrame frame, JTable tblNL_SP, JTextField txtmasp_KH, JTextField txtTSP_KH, JTextField txtDonVI_SP,
            JTextField txtGT_SP, JTextField txtTKHo_SP, JTextField txtTThieu_SP, JLabel lblhhinh_SP,
            JButton btndatlai_SP, JButton btnthem_SP, JButton btnsua_SP,JTextField txtSLDatThem , JButton btnThemNL,JTextArea txtGhiChu) {
        frame = ApplianceController.frame;
        tblNL_SP = ApplianceController.tblNL_SP;
        txtmasp_KH = ApplianceController.txtmasp_KH;
        txtTSP_KH = ApplianceController.txtTSP_KH;
        txtDonVI_SP = ApplianceController.txtDonVI_SP;
        txtGT_SP = ApplianceController.txtGT_SP;
        txtTKHo_SP = ApplianceController.txtTKHo_SP;
        txtTThieu_SP = ApplianceController.txtTThieu_SP;
        lblhhinh_SP = ApplianceController.lblhhinh_SP;
        btndatlai_SP = ApplianceController.btndatlai_SP;
        btnthem_SP = ApplianceController.btnthem_SP;
        btnsua_SP = ApplianceController.btnsua_SP;
//        btnxoa_SP = ApplianceController.btnxoa_SP;
        txtSLDatThem = ApplianceController.txtSLDatThem;
        btnThemNL = ApplianceController.btnThemNL;
        txtGhiChu = ApplianceController.txtGhiChu;
    }

    public static void init() {
        fillTable();
        curr = -1;
    }

    public static void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNL_SP.getModel();
        model.setRowCount(0);
        try {
            List<NguyenLieu> list = dao.selectAll();
            for (NguyenLieu sp : list) {
                Object[] row = {
                    sp.getHinh(),
                    sp.getMaNL(),
                    sp.getTenNL(),
                    sp.getGiaTien(),
                    sp.getTonKho(),
                    sp.getToiThieu(),
                    sp.getDonVi()
                };
                model.addRow(row);
            }
            tblNL_SP.setModel(model);
            curr = 0;
            tblNL_SP.setRowSelectionInterval(0, 0);
            edit();
            updateStaus();
            XTable.insertImage(tblNL_SP, 0, 100, 100, "IngriImages");
            tblNL_SP.getColumnModel().getColumn(4).setCellRenderer(new XTable.ColoredCellRenderer(Color.red));
        } catch (Exception e) {
            MsgBox.alert(frame, "Lỗi truy vấn dữ liệu!");
        }
    }

    public static void tableClick() {
        curr = tblNL_SP.getSelectedRow();
        updateStaus();
        if (curr >= 0) {
            edit();
        } else {
            MsgBox.alert(frame, "Dữ liệu không có sẳn!");
        }
    }

    public static void insert(String maHDN) {
        if(dao.selectByID(getForm().getMaNL()) != null){
            MsgBox.inform(null, "Nguyên liệu đã tồn tại!!");
            return;
        }
        if (getForm() == null) {
            return;
        }
        NguyenLieu model = getForm();
        try {
            File file = new File("IngriImages", model.getHinh());
            if (!file.exists()) {
                XImage.save("IngriImages", img);
            } else {
                MsgBox.alert(frame, "Ảnh đã tồn tại");
                return;
            }
            dao.insert(model);
            insertHDNhap(maHDN);
            insertCTHDNhap(maHDN,model);
            saveHDN(maHDN, model.getTonKho());
            fillTable();
            clearForm();
            MsgBox.alert(frame, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(frame, "Thêm mới thất bại!");
        }
    }
    
    public static void insertAdd(String maHDN) {
        NguyenLieu model = getForm();
        if (getForm() == null) {
            return;
        }
        try {
            model.setTonKho(Integer.parseInt(txtSLDatThem.getText()));
            dao.datThem(model);
            insertHDNhap(maHDN);
            insertCTHDNhap(maHDN,model);
            saveHDN(maHDN, model.getTonKho());
            MsgBox.alert(frame, "Thêm nguyên liệu thành công!");
            fillTable();
        } catch (Exception e) {
            MsgBox.inform(null, "Sai định dạng số !!");
            return;
        }
        
    }

    public static void update() {
        if(getForm() == null)
            return;
        NguyenLieu model = getForm();
        NguyenLieu og = dao.selectByID(model.getMaNL());
        if (!og.getHinh().equals(model.getHinh())) {
            File ogFile = new File("IngriImages", og.getHinh());
            ogFile.delete();
            if (img != null) {
                XImage.save("IngriImages", img);
            }
        }
        dao.update(model);
        fillTable();
        MsgBox.alert(frame, "Cập nhật thành công!");
    }
    
    public static void delete() {
        String Manl = txtmasp_KH.getText();
        try {
            File file = new File("IngriImages", lblhhinh_SP.getToolTipText());
            if (file.exists()) {
                file.delete();
            }
            dao.delete(Manl);
            fillTable();
            clearForm();
            MsgBox.alert(frame, "Xóa thành công!");
        } catch (Exception e) {
            MsgBox.alert(frame, "Xóa thất bại!");
        }
    }

    public static void clearForm() {
        txtmasp_KH.setText(dao.createIDIngre());
        txtTSP_KH.setText("");
        txtGT_SP.setText("0");
        txtTKHo_SP.setText("0");
        txtTThieu_SP.setText("0");
        txtDonVI_SP.setText("gam");
        txtSLDatThem.setText("0");
        txtGhiChu.setText("");
        lblhhinh_SP.setText("");
        lblhhinh_SP.setIcon(null);
        curr = -1;
        tblNL_SP.clearSelection();
        updateStaus();
   
    }
    
    public static void updateStaus(){
        if(curr == -1 ){
//            btnxoa_SP.setEnabled(false);
            btnsua_SP.setEnabled(false);
            btnthem_SP.setEnabled(false);
            btnThemNL.setEnabled(true);
            txtSLDatThem.setEnabled(false);
            txtTKHo_SP.setEnabled(true);
        }else{
//            btnxoa_SP.setEnabled(true);
            btnsua_SP.setEnabled(true);
            btnthem_SP.setEnabled(true);
            btnThemNL.setEnabled(false);
            txtSLDatThem.setEnabled(true);
            txtTKHo_SP.setEnabled(false);
        }
    }

    public static void edit() {
        if (curr >= 0) {
            String MaNL = (String) tblNL_SP.getValueAt(curr, 1);
            NguyenLieu cd = dao.selectByID(MaNL);
            setForm(cd);
        }
    }
    
    private static List <INFOHDXUAT> list = new ArrayList<>();
    private static void saveHDN(String soHDN ,int soLuong){
        INFOHDXUAT hdn = new INFOHDXUAT();
        NguyenLieu nl = getForm();
        hdn.setSoHDN(soHDN);
        hdn.setMaNV(Auth.getUser().getMaNV());
        hdn.setNgay(new Date());
        hdn.setMaNl(nl.getMaNL());
        hdn.setTenNl(nl.getTenNL());
        hdn.setGia(nl.getGiaTien());
        hdn.setSoLuong(soLuong);
        hdn.setDonvi(nl.getDonVi());
        list.add(hdn);
    }

    public static void setForm(NguyenLieu nl) {
        txtmasp_KH.setText(nl.getMaNL());
        txtTSP_KH.setText(nl.getTenNL());
        txtGT_SP.setText(String.valueOf(nl.getGiaTien()));
        txtTKHo_SP.setText(String.valueOf(nl.getTonKho()));
        txtTThieu_SP.setText(String.valueOf(nl.getToiThieu()));
        File file = new File("IngriImages", nl.getHinh());
        if (file.exists()) {
            lblhhinh_SP.setText("");
            lblhhinh_SP.setIcon(XImage.getResized(XImage.read("IngriImages", nl.getHinh()), lblhhinh_SP.getWidth(), lblhhinh_SP.getHeight()));
            lblhhinh_SP.setToolTipText(nl.getHinh());
        }
        else{
            lblhhinh_SP.setIcon(null);
            lblhhinh_SP.setText("NONE");
        }
        txtDonVI_SP.setText(nl.getDonVi());
    }

    public static NguyenLieu getForm() {
        NguyenLieu nl = new NguyenLieu();
        try {
            nl.setMaNL(txtmasp_KH.getText());
            nl.setTenNL(txtTSP_KH.getText());
            nl.setGiaTien(Double.parseDouble(txtGT_SP.getText()));
            nl.setTonKho(Integer.parseInt(txtTKHo_SP.getText()));
            nl.setToiThieu(Integer.parseInt(txtTThieu_SP.getText()));
            nl.setHinh(lblhhinh_SP.getToolTipText());
            nl.setDonVi(txtDonVI_SP.getText());
            if(nl.getMaNL().equals("")|| nl.getTenNL().equals("")|| nl.getHinh().equals("")){
                MsgBox.alert(null, "Không được để trống thông tin !!");
                return null;
            }
            if(!Validate.positiveInt(nl.getToiThieu()+"")){
                MsgBox.inform(null, "Số lượng tối thiểu không được âm !!");
                return null;
            }
            if(!Validate.positiveInt(nl.getTonKho()+"")){
                MsgBox.inform(null, "Tồn kho không được âm !!");
                return null;
            }
            if(!Validate.positiveNumb(nl.getGiaTien()+"")){
                MsgBox.inform(null, "Giá tiền không được âm !!");
                return null;
            }
        } catch (Exception e) {
          MsgBox.alert(null, "Sai định dạng số !!");
          return null;
        }
        return nl;
    }

    public static void chonAnh() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        // Thiết lập bộ lọc để chỉ chọn các tệp ảnh
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                String ext = getFileExtension(f);
                return ext.equals("jpg") || ext.equals("jpeg") || ext.equals("png") || ext.equals("gif");
            }

            @Override
            public String getDescription() {
                return "Image files (*.jpg, *.jpeg, *.png, *.gif)";
            }

            private String getFileExtension(File f) {
                String name = f.getName();
                int lastIndex = name.lastIndexOf('.');
                if (lastIndex == -1) {
                    return "";
                }
                return name.substring(lastIndex + 1).toLowerCase();
            }
        });

        // Hiển thị hộp thoại chọn tệp
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Hiển thị hình ảnh được chọn
            lblhhinh_SP.setIcon(XImage.getResized(new ImageIcon(selectedFile.getAbsolutePath()), lblhhinh_SP.getWidth(), lblhhinh_SP.getHeight()));
            lblhhinh_SP.setToolTipText(selectedFile.getName());
            ApplianceController.img = selectedFile;
        }
    }
    
    
    public static void insertHDNhap(String maHDN){
        System.out.println("chay hdnhap");
        HoaDonNhap hdn = new HoaDonNhap();
        hdn.setSoHD(maHDN);
        hdn.setMaNV(Auth.getUser().getMaNV());
        System.out.println(Auth.getUser().getMaNV());
        hdn.setNgayNH(new Date());
        try {
            hdndao.insert(hdn);    
        } catch (Exception e) {
            MsgBox.inform(null, "Lỗi");
        }
    }
    public static void insertCTHDNhap(String maHDN, NguyenLieu Entity){
        ChiTietHDNhap cthdhdn = new ChiTietHDNhap();
        cthdhdn.setSoHDN(maHDN);
        cthdhdn.setMaNL(Entity.getMaNL());
        cthdhdn.setSoLuong(Entity.getTonKho());
        cthdhdn.setGhiChu(txtGhiChu.getText());
        try {
            cthdndao.insert(cthdhdn);           
        } catch (Exception e) {
            MsgBox.inform(null, "Lỗi");
        }
    }
    
    public static void inHoaDon(){
        String text = "";
        text += "<head>\n" +
"        <style>\n" +
"            div.hoadon{\n" +
"                width: 800px;\n" +
"                margin: auto;\n" +
"                text-align: center;\n" +
"            }\n" +
"            p.title{\n" +
"                font-weight: bolder;\n" +
"                font-size: 25px;\n" +
"                padding: 10px;\n" +
"                border-bottom:  2px dashed   black;\n" +
"            }\n" +
"            div.hoadon> div.info{\n" +
"                margin-top: -10px;\n" +
"                font-size: 16px;\n" +
"                padding-bottom: 10px;\n" +
"            }\n" +
"            table.sanpham{\n" +
"                border-collapse: collapse;\n" +
"                border: none;\n" +
"                width: 100%;\n" +
"            }\n" +
"            table.sanpham th{\n" +
"                padding: 10px;\n" +
"            }\n" +
"            table.sanpham tr{\n" +
"                text-align: center;\n" +
"            }\n" +
"            div.left{\n" +
"                float: left; \n" +
"                width: 50%; \n" +
"            }\n" +
"            div.left ,div.right{\n" +
"                padding: 10px; \n" +
"                font-size: 18px; font-weight: bold;\n" +
"            }\n" +
"    \n" +
"            table.thanhtoan{\n" +
"                width: 100%;\n" +
"                padding: 10px;\n" +
"                border-top: 2px dashed black;\n" +
"                border-bottom: 2px dashed black;\n" +
"            }\n" +
"        </style>\n" +
"    </head><body>\n" +
"        <div class=\"hoadon\">\n" +
"            <p class=\"title\">HÓA ĐƠN NHẬP HÀNG CINNAMON</p>\n" +
"            <div class=\"info\">\n" +
"                <span>MaHD : "+list.get(0).getSoHDN()+" - Ngày: " + XDate.toString(new Date(), "HH:mm:ss MM/dd/yyyy") + " - "+list.get(0).getMaNV()+" </span>\n" +
"            </div>\n" +
"            <table  class=\"sanpham\" border=\"\" style=\"border-collapse: collapse;\">\n" +
"                <thead>\n" +
"                    <tr style=\"background-color: aqua;\">\n" +
"                        <th>MÃ NGUYÊN LIỆU</th>\n" +
"                        <th>TÊN NGUYÊN LIỆU</th>\n" +
"                        <th>GIÁ TIỀN</th>\n" +
"                        <th>SỐ LƯỢNG</th>\n" +
"                        <th>ĐƠN VỊ</th>\n" +
"                    </tr>\n" +
"                </thead>\n" +
"                <tbody>\n" ;
        Double total = 0.0;
                for(INFOHDXUAT HDN : list){
                    text += "<tr>\n";
                    text += "<td>"+HDN.getMaNl()+"</td>\n";
                    text += "<td>"+HDN.getTenNl()+"</td>\n";
                    text += "<td>"+HDN.getGia()+"</td>\n";
                    text += "<td>"+HDN.getSoLuong()+"</td>\n";
                    text += "<td>"+HDN.getDonvi()+"</td>\n";
                    text += "</tr>\n";
                    total += HDN.getGia();
                };
text += "                </tbody>\n" +
"            </table>\n" +
"            <table class=\"thanhtoan\">\n" +
"                <tfoot style=\"margin-top: 10px;\">\n" +
"                    <tr>\n" +
"                        <th colspan=\"3\">TỔNG TIỀN THANH TOÁN:</th>\n" +
"                        <th>"+total+"<span> VNĐ</span></th>\n" +
"                    </tr>\n" +
"            </table>\n" +
"        </div>\n" +
"    </body>";
        try {
            // Tạo một file mới
            FileWriter writer = new FileWriter("receipts/imports/"+list.get(0).getSoHDN()+".html");

            // Viết nội dung HTML vào file
            writer.write(text);

            // Đóng file
            writer.close();
            String filePath = "receipts/imports/"+list.get(0).getSoHDN()+".html";
            
            // Tạo một đối tượng File từ đường dẫn
            File file = new File(filePath);
            
            // Sử dụng lớp Desktop để mở file
            Desktop.getDesktop().open(file);
            MsgBox.inform(null, "In hóa đơn thành công");
        } catch (IOException e) {
            MsgBox.alert(null,"Đã xảy ra lỗi khi tạo hóa đơn: " + e.getMessage());
        }        
    }
}
