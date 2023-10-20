package Bai2;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT, diemTH;
	public SinhVien() {
		super();
	}
	public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	public float tinhDiemTB() {
		return (diemLT + diemTH) / 2;
	}
	@Override
	public String toString() {
		return "Mã sinh viên: " + maSV + "\nHọ tên: " + hoTen + "\nĐiểm LT: " + diemLT + "\nĐiểm TH: " + diemTH + "\nĐiểm trung bình: " + tinhDiemTB();
	}
	
}
