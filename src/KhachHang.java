import java.util.Date;

public class KhachHang {
    private String ten;
    private Date ngaySinh;
    private String soCMND;

    public KhachHang() {
    }

    public KhachHang(String ten, Date ngaySinh, String soCMND) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "Khách hàng: " +
                "Tên: " + ten + '\'' +
                ", Ngày Sinh: " + ngaySinh +
                ", Số CMND: " + soCMND + '\'';
    }
}
