import java.util.Comparator;

public class KhachHangTheoCMND implements Comparator<KhachHang> {

    @Override

    public int compare(KhachHang o1, KhachHang o2) {

        if (o1.getSoCMND().compareTo(o2.getSoCMND()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
