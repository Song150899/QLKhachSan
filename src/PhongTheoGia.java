import java.util.Comparator;

public class PhongTheoGia implements Comparator<KhachSan> {

    @Override

    public int compare(KhachSan o1, KhachSan o2) {

        if (o1.getGiaPhong() > o2.getGiaPhong()) {
            return 1;
        } else {
            return -1;
        }
    }
}
