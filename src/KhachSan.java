import java.util.Date;

public class KhachSan {
    private String loaiPhong;
    private double giaPhong;
    private int soPhong;

    public KhachSan() {
    }

    public KhachSan(String loaiPhong, double giaPhong, int soPhong) {
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.soPhong = soPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    @Override
    public String toString() {
        return "Khách sạn: " +
                "Loại Phòng: " + loaiPhong + '\'' +
                ", Giá Phòng: " + giaPhong + '\'' +
                ", Số Phòng" + soPhong;
    }
}
