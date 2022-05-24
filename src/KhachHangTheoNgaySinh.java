import java.util.Comparator;

public class KhachHangTheoNgaySinh implements Comparator<KhachHang> {

    @Override

    public int compare(KhachHang o1, KhachHang o2) {
        if (o1.getNgaySinh().compareTo(o2.getNgaySinh()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
