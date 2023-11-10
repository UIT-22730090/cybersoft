package baitapcuoikhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CongTy congTy = new CongTy();
        congTy.setDanhSachNhanVien(danhSachDuLieu());
        int luaChon;

        do {
            showMenu();
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập thông tin công ty ");
                    congTy.nhapThongTinCongTy();
                    System.out.println("Thông tin công ty vừa nhập là");
                    congTy.XuatThongTinCongTy();
                    break;
                case 2:
                    System.out.println("Phân bổ nhân viên vào trưởng phòng");
                    congTy.PhanBoNVVaoTruongPhong();
                    break;
                case 3:
                    System.out.println("Thêm nhân sự");
                    congTy.ThemMotNhanSu();
                    break;
                case 4:
                    System.out.println("Xóa nhân sự");
                    congTy.XoaNhanSu();
                    break;
                case 5:
                    System.out.println("Thông tin toàn bộ nhân sự trong công ty");
                    congTy.XuatThongTinToanNhanVien();
                    break;
                case 6:
                    System.out.println("Tổng lương toàn công ty: " + congTy.TongLuongToanCongTy());
                    break;
                case 7:
                    System.out.println("Nhân viên thường có lương cao nhất");
                    congTy.NhanVienThuongCoLuongCaoNhat();
                    break;
                case 8:
                    // Cần thực hiện chức năng 2
                    System.out.println("Trưởng phòng có nhiều nhân viên dưới quyền nhiều nhất");
                    congTy.TruongPhongCoNhieuNhanVienNhat();
                    break;
                case 9:
                    System.out.println("Sắp xếp nhân viên theo tên ");
                    congTy.SapXepNhanVienTheoTen();
                    break;
                case 10:
                    System.out.println("Sắp xếp nhân viên giảm dần theo lương ");
                    congTy.SapXeoNhanVienGiamDanTheoLuong();
                    break;
                case 11:
                    System.out.println("Giám đốc có phần trăm cổ phiếu nhiều nhất");
                    congTy.GiamDocCoCPNhieuNhat();
                    break;
                case 12:
                    System.out.println("Thu nhập của từng giám đốc");
                    congTy.TongThuNhapTungGiamDoc();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng chức năng: ");
                    break;
            }

        } while (luaChon != 0);
    }

    public static void showMenu() {
        System.out.println("\n------ MENU ------");
        System.out.println("1. Nhập thông tin công ty.");
        System.out.println("2. Phân bổ nhân viên vào trưởng phòng.");
        System.out.println("3. Thêm nhân sự.");
        System.out.println("4. Xóa nhân sự.");
        System.out.println("5. Xuất thông tin toàn bộ người trong công ty.");
        System.out.println("6. Tính và xuất tổng lương cho toàn công ty.");
        System.out.println("7. Tìm nhân viên thường có lương cao nhất.");
        System.out.println("8. Tìm trưởng phòng có số lương nhân viên dưới quyền nhiều nhất.");
        System.out.println("9. Sắp xếp nhân viên toàn công ty theo thứ tự abc");
        System.out.println("10. Sắp xêp nhân viên toàn công ty theo thứ tự lương giảm dần.");
        System.out.println("11. Tìm giám đốc có số lượng cổ phần nhiều nhất.");
        System.out.println("12. Tính và xuất tổng thu nhập của từng giám đốc.");
        System.out.println("0. Thoát chương trình.");
        System.out.println("Nhập lựa chọn: ");
    }


    public static ArrayList<NhanVien> danhSachDuLieu() {
        ArrayList<NhanVien> duLieu = new ArrayList<>();

        NhanVien nv1 = new NhanVienThuong();
        nv1.setMaSoNV("NV001");
        nv1.setHoTen("Nguyễn Văn A");
        nv1.setSoDienThoai("0993789789");
        nv1.setSoNgayLamViec(25);
        ((NhanVienThuong)nv1).setMaTruongPhong("NV003");
        duLieu.add(nv1);

        NhanVien nv2 = new NhanVienThuong();
        nv2.setMaSoNV("NV002");
        nv2.setHoTen("Lê Thị Phi Yến");
        nv2.setSoDienThoai("0998373686");
        nv2.setSoNgayLamViec(22);
        duLieu.add(nv2);

        NhanVien nv3 = new TruongPhong();
        nv3.setMaSoNV("NV003");
        nv3.setHoTen("Ngô Thanh Tuấn");
        nv3.setSoDienThoai("0978222306");
        nv3.setSoNgayLamViec(20);
        duLieu.add(nv3);

        NhanVien nv4 = new GiamDoc();
        nv4.setMaSoNV("NV004");
        nv4.setHoTen("Trần Quốc Huy");
        nv4.setSoDienThoai("0793232190");
        nv4.setSoNgayLamViec(18);
        ((GiamDoc)nv4).setPhanTramCoPhan(35);
        duLieu.add(nv4);

        NhanVien nv5 = new NhanVienThuong();
        nv5.setMaSoNV("NV005");
        nv5.setHoTen("Trần Minh Long");
        nv5.setSoDienThoai("0123989686");
        nv5.setSoNgayLamViec(29);
        duLieu.add(nv5);

        NhanVien nv6 = new TruongPhong();
        nv6.setMaSoNV("NV006");
        nv6.setHoTen("Phan Thị Thanh");
        nv6.setSoDienThoai("0863113114");
        nv6.setSoNgayLamViec(26);
        duLieu.add(nv6);

        NhanVien nv7 = new TruongPhong();
        nv7.setMaSoNV("NV007");
        nv7.setHoTen("Phạm Hoàng Quốc");
        nv7.setSoDienThoai("0123456789");
        nv7.setSoNgayLamViec(20);
        duLieu.add(nv7);

        NhanVien nv8 = new GiamDoc();
        nv8.setMaSoNV("NV008");
        nv8.setHoTen("Trần Quốc Tuấn");
        nv8.setSoDienThoai("0909323116");
        nv8.setSoNgayLamViec(14);
        ((GiamDoc)nv8).setPhanTramCoPhan(40);
        duLieu.add(nv8);

        NhanVien nv9 = new NhanVienThuong();
        nv9.setMaSoNV("NV009");
        nv9.setHoTen("Ngô Anh Khoa");
        nv9.setSoDienThoai("0789132321");
        nv9.setSoNgayLamViec(19);
        duLieu.add(nv9);

        return duLieu;
    }
}
