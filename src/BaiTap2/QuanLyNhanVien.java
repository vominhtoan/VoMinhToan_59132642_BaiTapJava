package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Toan_Minh
 */
public class QuanLyNhanVien implements IQuanLy
{
    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    @Override
    public void them(NhanVien nv) 
    {
        danhSachNhanVien.add(nv);
    }

    @Override
    public void inDS() 
    {
        for (int i = 0; i < danhSachNhanVien.size(); i++) 
        {
            System.out.println(danhSachNhanVien.get(i).getThongTin());
        }
    }
}
