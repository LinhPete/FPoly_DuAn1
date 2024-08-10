
package controller;

import java.nio.file.Path;

public interface BanHangController {
     void initialize(String mahd);
     void fillProductDetail(String loaisp);
     void clearAll();
     void resetBill();
     void taoHoaDon();
     void inhoadon();
     void insertCTHD(String mahd);
     void eventClickAddProduct();
     Double checkKhuyenMai();
     void fillCustomerByID(String makh);
     void xuatBillKhachHang();
     void updateNguyenLieu(String maSP ,int heSo);
     void searchKhachHang();
     void updateStatus(String mahd);
     void setForm(String mahd);
     void updateBills(String mahd);
     void openBill(Path path);
}
