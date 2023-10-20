package Bai3;

import java.text.DecimalFormat;

public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTienTrongTaiKhoan;
    private static final double LAISUAT = 0.035;

    public Account() {
        this.soTaiKhoan = 0;
        this.tenTaiKhoan = "";
        this.soTienTrongTaiKhoan = 50.0;
    }

    public Account(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = 50.0;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void napTien(double soTienNap) {
        if (soTienNap > 0) {
            soTienTrongTaiKhoan += soTienNap;
        } else {
            System.out.println("Số tiền nạp vào phải lớn hơn 0.");
        }
    }

    public void rutTien(double soTienRut) {
        if (soTienRut > 0 && soTienRut + 5 <= soTienTrongTaiKhoan) {
            soTienTrongTaiKhoan -= (soTienRut + 5); // Cộng thêm phí rút tiền
        } else {
            System.out.println("Số tiền rút phải lớn hơn 0 và không vượt quá số tiền trong tài khoản.");
        }
    }

    public void daoHan() {
        soTienTrongTaiKhoan += soTienTrongTaiKhoan * LAISUAT;
    }

    public void chuyenKhoan(Account taiKhoanNhan, double soTienChuyen) {
        if (soTienChuyen > 0 && soTienChuyen <= soTienTrongTaiKhoan) {
            soTienTrongTaiKhoan -= soTienChuyen;
            taiKhoanNhan.napTien(soTienChuyen);
        } else {
            System.out.println("Số tiền chuyển phải lớn hơn 0 và không vượt quá số tiền trong tài khoản.");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Số tài khoản: " + soTaiKhoan + "\nTên tài khoản: " + tenTaiKhoan + "\nSố tiền trong tài khoản: $" + df.format(soTienTrongTaiKhoan);
    }
}

