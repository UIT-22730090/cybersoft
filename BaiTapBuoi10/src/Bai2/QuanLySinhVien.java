package Bai2;

import java.util.Scanner;

public class QuanLySinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Tạo đối tượng sinh viên 1
		SinhVien sv1 = new SinhVien(101, "Nguyen Hoang Phuc", 9.3f, 8.6f);
		
		// Tạo đối tượng sinh viên 2
		SinhVien sv2 = new SinhVien(102, "Nguyen Anh Khoa", 9.5f, 7.3f);
		
		// Tạo đối tượng sinh viên 3
		SinhVien sv3 = new SinhVien();
		
		System.out.println("Nhập mã sinh viên cho sv3: ");
		int maSV3 = sc.nextInt();
		sv3.setMaSV(maSV3);
		
		System.out.println("Nhập họ tên cho sv3: ");
		sc.nextLine();
		String hoTenSV3 = sc.nextLine();
		sv3.setHoTen(hoTenSV3);
		
		System.out.print("Nhập điểm LT cho sv3: ");
		float diemLTSV3 = sc.nextFloat();
		sv3.setDiemLT(diemLTSV3);
		
		System.out.print("Nhập điểm TH cho sv3: ");
		float diemTHSV3 = sc.nextFloat();
		sv3.setDiemTH(diemTHSV3);
		
		// In thông tin các sinh viên
        System.out.println("Thông tin sinh viên 1:");
        System.out.println(sv1);

        System.out.println("Thông tin sinh viên 2:");
        System.out.println(sv2);

        System.out.println("Thông tin sinh viên 3:");
        System.out.println(sv3);
	}
}
;