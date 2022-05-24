import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLy {
    ArrayList<KhachSan> khachSans = new ArrayList<>();
    ArrayList<KhachHang> khachHangs = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void menu() throws ParseException {
        while (true) {
            int choice;
            System.out.println("============Menu============");
            System.out.println("1. Thêm phòng mới");
            System.out.println("2. Thêm khách hàng mới");
            System.out.println("3. Hiển thị các phòng theo giá");
            System.out.println("4. Hiển thị khách hàng");
            System.out.println("5. Tìm kiếm khách hàng theo tên");
            System.out.println("6. Thoát");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    themPhong();
                    break;

                case 2:
                    themKhachHang();
                    break;

                case 3:
                    hienThiPhong();
                    break;

                case 4:
                    hienThiKhachHang();
                    break;

                case 5:
                    hienThiKhachHangTheoTen();
                    break;

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại chức năng từ 1-6 trong Menu");
            }
        }
    }

    public void hienThiKhachHang() {

        int choice1 = -1;

        while (choice1 != 3) {

            System.out.println("=====Hiển thị Khách Hàng=====");
            System.out.println("1. Hiểm thị theo số CMND");
            System.out.println("2. Hiểm thị theo ngày sinh");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chọn");

            choice1 = Integer.parseInt(scanner.nextLine());

            switch (choice1) {
                case 1:
                    hienThiKhachTheoCMND();
                    break;

                case 2:
                    hienThiKhachHangTheoNgaySinh();
                    break;

                case 3:
                    System.out.println("Thoát");
                    break;

                default:
                    System.out.println("Nhập lại lựa chọn từ 1 - 3");
            }
        }
    }

    public void themPhong() {

        System.out.println("Nhập loại phòng");
        String loaiPhong = scanner.nextLine();

        System.out.println("Nhập giá phòng");
        double giaPhong = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số phòng");
        int soPhong = Integer.parseInt(scanner.nextLine());

        KhachSan phong = new KhachSan(loaiPhong, giaPhong, soPhong);
        khachSans.add(phong);
    }

    public void themKhachHang() throws ParseException {
        // throws ParseException ném ra ngoại lệ để ép kiểu cho date
        System.out.println(" Nhập tên khách hàng");
        String ten = scanner.nextLine();

        System.out.println(" Nhập ngày sinh khách hàng");
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        //dùng SimpleDateFormat để định dạng kiểu ngày chuyển date thành string
        Date ngaySinh = date.parse(scanner.nextLine());

        System.out.println(" Nhập số CMND khách hàng");
        String soCMND = scanner.nextLine();

        KhachHang khachHang = new KhachHang(ten, ngaySinh, soCMND);
        khachHangs.add(khachHang);
    }

    public void hienThiPhong() {

        khachSans.sort(new PhongTheoGia());

        System.out.println("Danh sách phòng hiện có: \n");

        for (KhachSan phong : khachSans) {
            System.out.println(phong);
        }
    }

    public void hienThiKhachTheoCMND() {

        khachHangs.sort(new KhachHangTheoCMND());

        System.out.println("Danh sách khách hàng theo số CMND hiện có: \n");

        for (KhachHang khachHang : khachHangs) {
            System.out.println(khachHang);
        }

    }

    public void hienThiKhachHangTheoNgaySinh() {

        khachHangs.sort(new KhachHangTheoNgaySinh());

        System.out.println(" Danh sách khách hàng theo ngày sinh hiện có: \n");

        for (KhachHang khachHang : khachHangs) {
            System.out.println(khachHang);
        }
    }

    public KhachHang timKiemKhachHangTheoTen(String ten) throws InputMismatchException {

        for (KhachHang khachHang : khachHangs) {

            if (khachHang.getTen().equals(ten)) {
                return khachHang;

            }
        }
        throw new InputMismatchException("Không có khách hàng theo tên trên");
    }

    public void hienThiKhachHangTheoTen(){
        System.out.println("Nhập tên Khách Hàng:");
        String name = scanner.nextLine();
        System.out.println(timKiemKhachHangTheoTen(name));
    }
}
