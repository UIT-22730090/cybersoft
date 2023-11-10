package baitapcuoikhoa;

import java.util.Scanner;
import condition.KiemTraDieuKien;

public class NhanVien {
    protected static final Scanner sc = new Scanner(System.in);
    protected static final KiemTraDieuKien kt = new KiemTraDieuKien();
    protected static int thangLamViec = 4;
    protected static int namLamViec = 2023;
    protected String maSoNV;
    protected String hoTen;
    protected String soDienThoai;
    protected int soNgayLamViec = 0;
    protected double luongMotNgay = 0.0;

    public NhanVien() {
    }

    public String getMaSoNV() {
        return maSoNV;
    }

    public void setMaSoNV(String maSoNV) {
        this.maSoNV = maSoNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public double getLuongMotNgay() {
        return luongMotNgay;
    }

    public void setLuongMotNgay(double luongMotNgay) {
        this.luongMotNgay = luongMotNgay;
    }

    public static int getThangLamViec() {
        return thangLamViec;
    }

    public static void setThangLamViec(int thangLamViec) {
        NhanVien.thangLamViec = thangLamViec;
    }

    public static int getNamLamViec() {
        return namLamViec;
    }

    public static void setNamLamViec(int namLamViec) {
        NhanVien.namLamViec = namLamViec;
    }

    protected double tinhLuong(){
        return soNgayLamViec * luongMotNgay;
    }

    public String LayTenNhanVien() {
        String[] hoTen = getHoTen().split(" ");
        return hoTen[hoTen.length-1];
    }

    public void nhapThongTinNhanVien(){
        nhapMaSoNV();
        nhapHoTen();
        nhapSoDienThoai();
    }

    private void nhapMaSoNV(){
        System.out.println("Nhập mã số: ");
        String maSoNV = sc.nextLine();
        while (true){
            if(kt.KiemTraChieuDaiChuoi(maSoNV, 5)){
                break;
            } else maSoNV = sc.nextLine();
        }
        setMaSoNV(maSoNV);
    }

    private void nhapHoTen(){
        System.out.println("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        while (true){
            if(kt.KiemTraChuoiRong(hoTen)){
                break;
            } else hoTen = sc.nextLine();
        }
        setHoTen(hoTen);
    }

    private void nhapSoDienThoai(){
        System.out.println("Nhập số điện thoại: ");
        String soDienThoai = sc.nextLine();
        while (true){
            if(kt.KiemTraChieuDaiChuoi(soDienThoai, 10) && kt.KiemTraChuoiSo(soDienThoai)){
                break;
            } else soDienThoai = sc.nextLine();
        }
        setSoDienThoai(soDienThoai);
    }

    protected void nhapSoNgayLamViec() {
        System.out.println("Nhập số ngày làm việc của tháng " + getThangLamViec() + " năm " + getNamLamViec() + ":");
        int soNgayLamViec = Integer.parseInt(sc.nextLine());
        while(true) {
            if (kt.KiemTraSoNgayLamViec(soNgayLamViec, getThangLamViec(), getNamLamViec())) break;
            else soNgayLamViec = Integer.parseInt(sc.nextLine());
        }
        setSoNgayLamViec(soNgayLamViec);
    }


    public void xuatThongTinNhanVien() {
        System.out.printf("%-10s - %-20s - %-10s - %-10d - %-10.2f - %-10.2f\n", maSoNV, hoTen, soDienThoai, soNgayLamViec, luongMotNgay, tinhLuong());
    }

}
