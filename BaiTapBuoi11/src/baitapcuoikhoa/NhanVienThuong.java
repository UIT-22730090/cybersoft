package baitapcuoikhoa;

public class NhanVienThuong extends NhanVien{
    private String maTruongPhong = null;

    public NhanVienThuong() {
        setLuongMotNgay(100);
    }

    @Override
    public void nhapThongTinNhanVien(){
        super.nhapThongTinNhanVien();
        nhapSoNgayLamViec();
        tinhLuong();
    }

    @Override
    public void xuatThongTinNhanVien() {
        System.out.printf("%-10s - %-20s - %-10s - %-10d - %-10.2f - %-10.2f\n", maSoNV, hoTen, soDienThoai, soNgayLamViec, luongMotNgay, tinhLuong());
    }

    public String getMaTruongPhong() {
        return maTruongPhong;
    }

    public void setMaTruongPhong(String maTruongPhong) {
        this.maTruongPhong = maTruongPhong;
    }
}
