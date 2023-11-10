package baitapcuoikhoa;

import condition.KiemTraDieuKien;

import java.util.*;

public class CongTy {
    private static final Scanner sc = new Scanner(System.in);
    private static final KiemTraDieuKien kt = new KiemTraDieuKien();
    private String tenCongTy;
    private String maSoThue;
    private double doanhThuThang = 100000;
    private List<NhanVien> danhSachNhanVien;

    public CongTy(){
        danhSachNhanVien = new ArrayList<>();
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public double getDoanhThuThang() {
        return doanhThuThang;
    }

    public void setDoanhThuThang(double doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }

    public List<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(List<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    private void nhapTenCongTy(){
        System.out.println("Nhập tên công ty: ");
        String tenCongTy = sc.nextLine();
        while (true){
            if(kt.KiemTraChuoiRong(tenCongTy)) break;
            else tenCongTy = sc.nextLine();
        }
        setTenCongTy(tenCongTy);
    }

    private  void nhapMaSoThue(){
        System.out.println("Nhập mã số thuế: ");
        String maSoThue = sc.nextLine();
        while (true){
            if(kt.KiemTraChuoiRong(maSoThue)) break;
            else maSoThue = sc.nextLine();
        }
        setMaSoThue(maSoThue);
    }

    private void nhapDoanhThuThang(){
        System.out.println("Nhập doanh thu tháng: ");
        double doanhThuThang = sc.nextDouble();
        while (true){
            if(kt.KiemTraLaSoDuong(doanhThuThang)) break;
            else doanhThuThang = sc.nextDouble();
        }
        setDoanhThuThang(doanhThuThang);
    }

    // 1. Nhập thông tin công ty
    public void nhapThongTinCongTy(){
        nhapTenCongTy();
        nhapMaSoThue();
        nhapDoanhThuThang();
    }

    public void XuatThongTinCongTy() {
        System.out.printf("%-20s - %-20s - %-20s\n", "Tên công ty", "Mã số thuế", "Doanh thu tháng");
        System.out.printf("%-20s - %-20s - %-20.2f", tenCongTy, maSoThue, doanhThuThang);
    }

    // 2. Phân bổ nhân viên vào trưởng phòng
    public void PhanBoNVVaoTruongPhong() {
        DSNhanVienChuaCoTruongPhong();
        System.out.println("Nhập mã nhân viên cần phần bổ: ");
        String maNVThuong = sc.nextLine();
        NhanVienThuong nvtTimDuoc = (NhanVienThuong) TimNVThuongTheoMa(maNVThuong);
        if(nvtTimDuoc == null) {
            System.out.println("Không tìm thấy nhân viên thường có mã là: " + maNVThuong);
        } else {
            DSTruongPhong();
            System.out.println("Nhập mã trưởng phòng tiếp nhận: ");
            String maTrP = sc.nextLine();
            TruongPhong trPTimDuoc = (TruongPhong) TimTruongPhongTheoMa(maTrP);
            if(trPTimDuoc == null) {
                System.out.println("Không tìm thấy trưởng phòng có mã là: " + maTrP);
            } else {
                nvtTimDuoc.setMaTruongPhong(maTrP);
                trPTimDuoc.tiepNhanNhanVien(nvtTimDuoc);
            }
        }

    }

    private void DSNhanVienChuaCoTruongPhong() {
        System.out.println("Danh sách nhân viên thường");
        System.out.printf("%-10s - %-20s - %-10s - %-10s\n", "Mã Số", "Họ Tên", "SDT", "Mã Trưởng Phòng");
        for (NhanVien nv: danhSachNhanVien)
            if(nv instanceof NhanVienThuong)
                System.out.printf("%-10s - %-20s - %-10s - %-10s\n", nv.getMaSoNV(), nv.getHoTen(), nv.getSoDienThoai(), ((NhanVienThuong) nv).getMaTruongPhong());
    }

    private void DSTruongPhong() {
        System.out.println("Danh sách trưởng phòng");
        System.out.printf("%-10s - %-20s - %-10s\n", "Mã Số", "Họ Tên", "SDT");
        for (NhanVien nv: danhSachNhanVien)
            if(nv instanceof TruongPhong)
                System.out.printf("%-10s - %-20s - %-10s\n", nv.getMaSoNV(), nv.getHoTen(), nv.getSoDienThoai());
    }

    private NhanVien TimNVThuongTheoMa(String maNV) {
        for (NhanVien nv: danhSachNhanVien)
            if(nv instanceof NhanVienThuong && nv.getMaSoNV().equalsIgnoreCase(maNV))
                return nv;
        return null;
    }

    private NhanVien TimTruongPhongTheoMa(String maNV) {
        for (NhanVien nv: danhSachNhanVien)
            if(nv instanceof TruongPhong && nv.getMaSoNV().equalsIgnoreCase(maNV))
                return nv;
        return null;
    }

    // 3. Thêm thông tin một nhân sự
    public void ThemMotNhanSu() {
        NhanVien nvThem;
        int luaChon;
        System.out.println("Lựa chọn loại nhân viên muốn thêm");
        System.out.println("1. Nhân viên thường.");
        System.out.println("2. Trưởng phòng.");
        System.out.println("3. Giám đốc.");
        System.out.println("Nhập lựa chọn: ");
        luaChon = Integer.parseInt(sc.nextLine());
        switch (luaChon) {
            case 1:
                nvThem = new NhanVienThuong();
                ((NhanVienThuong)nvThem).nhapThongTinNhanVien();
                if(KiemTraNhanVienTonTai(nvThem)){
                    System.out.println("Nhân viên có mã " + nvThem.getMaSoNV() + " đã tồn tại.");
                }
                else{
                    danhSachNhanVien.add(nvThem);
                }
                break;
            case 2:
                nvThem = new TruongPhong();
                ((TruongPhong)nvThem).nhapThongTinNhanVien();
                if(KiemTraNhanVienTonTai(nvThem)){
                    System.out.println("Nhân viên có mã " + nvThem.getMaSoNV() + " đã tồn tại.");
                }
                else{
                    danhSachNhanVien.add(nvThem);
                }
                break;
            case 3:
                nvThem = new GiamDoc();
                ((GiamDoc)nvThem).nhapThongTinNhanVien();
                if(KiemTraNhanVienTonTai(nvThem)){
                    System.out.println("Nhân viên có mã " + nvThem.getMaSoNV() + " đã tồn tại.");
                }
                else{
                    danhSachNhanVien.add(nvThem);
                }
                break;
            default:
                System.out.println("Không có loại nhân viên bạn chọn.");
                break;
        }
    }

    private boolean KiemTraNhanVienTonTai(NhanVien nvKT) {
        for (NhanVien nv: danhSachNhanVien){
            if(nv.getMaSoNV().equalsIgnoreCase(nvKT.getMaSoNV())){
                return true;
            }
        }
        return false;
    }

    // 4. Xóa thông tin một nhân sự
    public void XoaNhanSu() {
        System.out.println("Nhập mã nhân sự cần xóa: ");
        String maSoXoa = sc.nextLine();
        NhanVien nvXoa = TimNhanVienTheoMa(maSoXoa);
        if(nvXoa == null) {
            System.out.println("Không tìm thấy nhân sự có mã " + maSoXoa);
        } else {
            if(nvXoa instanceof TruongPhong) {
                XoaTruongPhong((TruongPhong) nvXoa);
            } else if (nvXoa instanceof NhanVienThuong) {
                XoaNhanVienThuong((NhanVienThuong) nvXoa);
            } else {
                XoaGiamDoc((GiamDoc) nvXoa);
            }
        }
    }

    private NhanVien TimNhanVienTheoMa(String maNV) {
        for (NhanVien nv: danhSachNhanVien)
            if(nv.getMaSoNV().equalsIgnoreCase(maNV)){
                return nv;
            }
        return null;
    }

    private void XoaTruongPhong(TruongPhong truongPhong) {
        for (NhanVien nv: danhSachNhanVien)
            if(nv instanceof NhanVienThuong && ((NhanVienThuong) nv).getMaTruongPhong() != null
                    && ((NhanVienThuong) nv).getMaTruongPhong().equalsIgnoreCase(truongPhong.getMaSoNV())){
                ((NhanVienThuong) nv).setMaTruongPhong(null);
            }
        danhSachNhanVien.remove(truongPhong);
    }

    private void XoaNhanVienThuong(NhanVienThuong nhanVienThuong) {
        if(nhanVienThuong.getMaTruongPhong() != null) {
            TruongPhong truongPhongQL = (TruongPhong) TimTruongPhongTheoMa(nhanVienThuong.getMaTruongPhong());
            if (truongPhongQL != null){
                truongPhongQL.xoaNhanVien(nhanVienThuong);
            }
        }
        danhSachNhanVien.remove(nhanVienThuong);
    }

    private void XoaGiamDoc(GiamDoc giamDoc) {
        danhSachNhanVien.remove(giamDoc);
    }

    // 5. Xuất thông tin toàn bộ người trong công ty
    public void XuatThongTinToanNhanVien() {
        System.out.printf("%-10s - %-20s - %-10s - %-10s - %-10s - %-10s\n", "Mã Số", "Họ Tên", "SDT", "Số Ngày", "Lương Một Ngày", "Lương Tháng");
        for (NhanVien nv: danhSachNhanVien) {
            nv.xuatThongTinNhanVien();
        }
    }

    // 6. Tính và xuất tổng lương cho toàn bộ công ty
    public double TongLuongToanCongTy() {
        double tongLuongCongTy = 0;
        for (NhanVien nv: danhSachNhanVien){
            tongLuongCongTy += nv.tinhLuong();
        }
        return tongLuongCongTy;
    }

    // 7. Tìm nhân viên có lương thưởng cao nhất
    public void NhanVienThuongCoLuongCaoNhat() {
        System.out.printf("%-10s - %-20s - %-10s - %-10s - %-10s - %-10s\n", "Mã Số", "Họ Tên", "SDT", "Số Ngày", "Lương Một Ngày", "Tổng Lương");
        for (NhanVien nv: danhSachNhanVien){
            if(nv instanceof NhanVienThuong && ((NhanVienThuong)nv).tinhLuong() == luongNhanVienThuongCaoNhat()){
                nv.xuatThongTinNhanVien();
            }
        }
        System.out.println("Nhân viên thường có lương cao nhất là:" + luongNhanVienThuongCaoNhat());
    }

    private Double luongNhanVienThuongCaoNhat() {
        double luongNVTCaoNhat = 0;
        for (NhanVien nv: danhSachNhanVien){
            if(nv instanceof NhanVienThuong && ((NhanVienThuong)nv).tinhLuong() > luongNVTCaoNhat){
                luongNVTCaoNhat = nv.tinhLuong();
            }
        }
        return luongNVTCaoNhat;
    }

    // 8. Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất
    public void TruongPhongCoNhieuNhanVienNhat() {
        System.out.printf("%-10s - %-20s - %-10s - %-10s - %-10s - %-10s\n", "Mã Số", "Họ Tên", "SDT", "Số Ngày", "Lương Một Ngày", "Tổng Lương");
        for (NhanVien nv: danhSachNhanVien){
            if(nv instanceof TruongPhong && ((TruongPhong)nv).getSoLuongNV() == soLuongNhanVienDuoiQuyenNhieuNhat()){
                nv.xuatThongTinNhanVien();
            }
        }
        System.out.println("Trưởng phòng có số lượnng nhân viên dưới quyền nhiều nhất là: " + soLuongNhanVienDuoiQuyenNhieuNhat());
    }

    private int soLuongNhanVienDuoiQuyenNhieuNhat() {
        int soLuongNhieuNhat = 0;
        for (NhanVien nv: danhSachNhanVien){
            if(nv instanceof TruongPhong && ((TruongPhong) nv).getSoLuongNV() > soLuongNhieuNhat){
                soLuongNhieuNhat = ((TruongPhong) nv).getSoLuongNV();
            }
        }
        return soLuongNhieuNhat;
    }

    // 9. Sắp xếp nhân viên toàn công ty theo tên
    public void SapXepNhanVienTheoTen() {
        Collections.sort(danhSachNhanVien, (nv1, nv2) -> nv1.LayTenNhanVien().compareTo(nv2.LayTenNhanVien()));
        XuatThongTinToanNhanVien();
    }

    // 10. Sắp xếp nhân viên toàn công ty theo lương giảm dần
    public void SapXeoNhanVienGiamDanTheoLuong() {
        Collections.sort(danhSachNhanVien, (nv2, nv1) -> (int) (nv1.tinhLuong() - nv2.tinhLuong()));
        XuatThongTinToanNhanVien();
    }

    // 11. Tìm giám đốc có cổ phần nhiều nhất
    public void GiamDocCoCPNhieuNhat() {
        System.out.printf("%-10s - %-20s - %-10s - %-10s - %-10s - %-10s\n", "Mã Số", "Họ Tên", "SDT", "Số Ngày", "Lương Một Ngày", "Tổng Lương");
        for (NhanVien nv: danhSachNhanVien)
            if(nv instanceof GiamDoc && ((GiamDoc)nv).getPhanTramCoPhan() == phanTramCoPhanNhieuNhat())
                nv.xuatThongTinNhanVien();
        System.out.println("Giám đốc có phần trăm cổ phần nhiều nhất là " + phanTramCoPhanNhieuNhat());
    }

    private float phanTramCoPhanNhieuNhat() {
        float ptNhieuNhat = 0;
        for (NhanVien nv: danhSachNhanVien)
            if(nv instanceof GiamDoc && ((GiamDoc) nv).getPhanTramCoPhan() > ptNhieuNhat)
                ptNhieuNhat = ((GiamDoc) nv).getPhanTramCoPhan();
        return ptNhieuNhat;
    }

    // 12. Tính tổng thu nhập từng giám đốc.
    public void TongThuNhapTungGiamDoc() {
        System.out.printf("%-10s - %-20s - %-10s - %-10s\n", "Mã Số", "Họ Tên", "SDT", "Thu nhập");
        for (NhanVien nv: danhSachNhanVien) {
            if(nv instanceof GiamDoc) {
                System.out.printf("%-10s - %-20s - %-10s - %-10.2f\n", nv.getMaSoNV(), nv.getHoTen(), nv.getSoDienThoai(), nv.tinhLuong() + ((GiamDoc) nv).getPhanTramCoPhan()/100*LoiNhuanCongTy());
            }
        }
    }

    private double LoiNhuanCongTy() {
        return getDoanhThuThang() - TongLuongToanCongTy();
    }

}
