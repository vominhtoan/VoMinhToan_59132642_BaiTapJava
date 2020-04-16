package BaiTap2;

import BaiTap1.NhanVien;


/**
 *
 * @author Toan_Minh
 */
public class BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        NhanVien nv1 = new NhanVien("Vũ Ngọc Đoàn", 21, "Nha Trang",200000, 300000);
        NhanVien nv2 = new NhanVien("Nguyễn Ngọc Châu Hoàng", 21, "Phú Yên",500000, 250000);
        NhanVien nv3 = new NhanVien("Nguyễn Hoàng Minh", 21, "Bình Tân",200000, 200000);
        NhanVien nv4 = new NhanVien("Phùng Bá Duy", 21, "Nha Trang",400000, 300000);
        NhanVien nv5 = new NhanVien("Nguyễn Túy Dũng", 21, "Cam Ranh",100000, 500000);
        //======================================================================
        
        QuanLyNhanVien QLNV = new QuanLyNhanVien();
        QLNV.them(nv1);
        QLNV.them(nv2);
        QLNV.them(nv3);
        QLNV.them(nv4);
        QLNV.them(nv5);
        
        System.out.println("Danh sach nhan vien:\n");
        QLNV.inDS();
    }
    
}
