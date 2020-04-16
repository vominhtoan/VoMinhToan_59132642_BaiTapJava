package BaiTap1;

/**
 *
 * @author Toan_Minh
 */
public class BaiTap1 
{
    public static void main(String[] args)
    {
        NhanVien nv1, nv2;
        nv1 = new NhanVien("Nguyễn Hoàng Minh", 21, "Bình Tân", 200000, 200);
        nv2 = new NhanVien("Nguyễn Túy Dũng", 21, "Cam Ranh", 300000, 90);
        System.out.println("Thông tin nhân viên 1:");
        System.out.println(nv1.getThongTin());
        System.out.println("Thông tin nhân viên 2:");
        System.out.println(nv2.getThongTin());
    }
}
