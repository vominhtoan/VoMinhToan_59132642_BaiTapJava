package BaiTap1;

/**
 *
 * @author Toan_Minh
 */
public class NhanVien 
{
    private String Ten;
    private int Tuoi;
    private String DiaChi;
    private double TienLuong;
    private int TongSoGioLam;
    
  //constructor khong co tham so:===============================================
    public NhanVien()
    {}
    
  //constructor co tham so:=====================================================
    public NhanVien(String Ten, int Tuoi, String DiaChi, double TienLuong, int TongSoGioLam)
    {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TienLuong = TienLuong;
        this.TongSoGioLam = TongSoGioLam;
    }
    
  //cac ham Set=================================================================
    public void setTen(String Ten)
    {
        this.Ten = Ten;
    }
    
    public void setTuoi(int Tuoi)
    {
        this.Tuoi = Tuoi;
    }
    
    public void setDiaChi(String DiaChi)
    {
        this.DiaChi = DiaChi;
    }
    
    public void setTienLuong(double TienLuong)
    {
        this.TienLuong = TienLuong;
    }
    
    public void setTongSoGioLam(int TongSoGioLam)
    {
        this.TongSoGioLam = TongSoGioLam;
    }
  //cac ham Get=================================================================
    public String getTen()
    {
        return Ten;
    }
    
    public int getTuoi()
    {
        return Tuoi;
    }
    
    public String getDiaChi()
    {
        return DiaChi;
    }
    
    public double getTienLuong()
    {
        return TienLuong;
    }
    
    public int getTongSoGioLam()
    {
        return TongSoGioLam;
    }
    
  //cac phuong thuc=============================================================
    public String getThongTin()
    {
        return "Tên nhân viên: " + Ten + 
            "\n Tuổi: " + Tuoi + 
            "\n Địa chỉ: " + DiaChi +
            "\n Tiền lương: " + TienLuong +
            "\n Tổng số giờ làm: " + TongSoGioLam +
            "\n Tiền thưởng: " + tinhThuong();
    }
    
    public double tinhThuong()
    {
        double TienThuong;
        if(TongSoGioLam >= 200)
            TienThuong = TienLuong * 20/100;
        else
        {
            if(TongSoGioLam < 200 && TongSoGioLam >=100)
                TienThuong = TienLuong * 10/100;
            else TienThuong = 0;
        }
        return TienThuong;
    }
}
