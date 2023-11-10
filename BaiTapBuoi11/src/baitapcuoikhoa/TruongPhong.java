package baitapcuoikhoa;

import java.util.ArrayList;

public class TruongPhong extends NhanVien{
    private int soLuongNV;
    ArrayList<NhanVienThuong> danhSachNhanVien;


    public TruongPhong() {
        danhSachNhanVien = new ArrayList<>();
        setLuongMotNgay(200);
    }

    public int getSoLuongNV() {
        return soLuongNV;
    }

    public void setSoLuongNV(int soLuongNV) {
        this.soLuongNV = soLuongNV;
    }

    public ArrayList<NhanVienThuong> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(ArrayList<NhanVienThuong> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    @Override
    public void nhapThongTinNhanVien(){
        super.nhapThongTinNhanVien();
        nhapSoNgayLamViec();
        tinhLuong();
    }

    @Override
    public double tinhLuong(){
        return super.tinhLuong() + 100 * danhSachNhanVien.size();
    }

    public void tiepNhanNhanVien(NhanVienThuong nv){
        danhSachNhanVien.add(nv);
        setSoLuongNV(getDanhSachNhanVien().size());
    }

    public void xoaNhanVien(NhanVienThuong nv){
        danhSachNhanVien.remove(nv);
        setSoLuongNV(getDanhSachNhanVien().size());
    }
}
