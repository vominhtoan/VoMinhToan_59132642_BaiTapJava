package BaiTap1;

/**
 *
 * @author Toan_Minh
 */
public class NhanVien 
{
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;
    
  //constructor khong co tham so:===============================================
    public NhanVien()
    {}
    
  //constructor co tham so:=====================================================
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam)
    {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }
    
  //cac ham Set=================================================================
    public void SetTen(String ten)
    {
        this.ten = ten;
    }
    
    public void SetTuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }
    
    public void SetDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    
    public void SetTienLuong(double tienLuong)
    {
        this.tienLuong = tienLuong;
    }
    
    public void SetTongSoGioLam(int tongSoGioLam)
    {
        this.tongSoGioLam = tongSoGioLam;
    }
  //cac ham Get=================================================================
    public String GetTen()
    {
        return ten;
    }
    
    public int GetTuoi()
    {
        return tuoi;
    }
    
    public String GetDiaChi()
    {
        return diaChi;
    }
    
    public double GetTienLuong()
    {
        return tienLuong;
    }
    
    public int GetTongSoGioLam()
    {
        return tongSoGioLam;
    }
    
  //cac phuong thuc=============================================================
    public String getThongTin()
    {
        return "Tên nhân viên: " + ten + 
            "\n Tuổi: " + tuoi + 
            "\n Địa chỉ: " + diaChi +
            "\n Tiền lương: " + tienLuong +
            "\n Tổng số giờ làm: " + tongSoGioLam +
            "\n Tiền thưởng: " + tinhThuong();
    }
    
    public double tinhThuong()
    {
        double tienThuong;
        if(tongSoGioLam >= 200)
            tienThuong = tienLuong * 20/100;
        else
        {
            if(tongSoGioLam < 200 && tongSoGioLam >=100)
                tienThuong = tienLuong * 10/100;
            else tienThuong = 0;
        }
        return tienThuong;
    }
}
