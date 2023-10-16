import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử của mảng: ");
		int n = sc.nextInt();
		while(n <= 0) {
			System.out.println("Nhập số lượng của mảng là số dương. Vui lòng nhập lại.");
			n = sc.nextInt();
		}
		int[] a = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		int luaChon;
		do {
			System.out.println(
					  "\n----- Menu -----\n"
					+ "1. Tổng các só dương\r\n"
					+ "2. Tính tổng các số lẻ\r\n"
					+ "3. Đếm có bao nhiêu số dương\r\n"
					+ "4. Tìm số nhỏ nhất trong mảng\r\n"
					+ "5. Tìm số dương nhỏ nhất trong mảng\r\n"
					+ "6. Tìm số chẵn cuối cùng \r\n"
					+ "7. Viết hàm tìm số chẵn đầu tiên\r\n"
					+ "8. Tìm số nguyên tố đầu tiên\r\n"
					+ "9. Tìm số dương cuối cùng\r\n"
					+ "10. Hãy tìm giá trị chẵn nhỏ nhất\r\n"
					+ "0. Thoát khỏi chương trình\r\n");
			System.out.print("Nhập lựa chọn của bạn: ");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			switch(luaChon) {
				case 1: 
					System.out.println("Tổng các số dương trong mảng là: " + tinhTong(a));
					break;
				case 2:
					System.out.println("Tổng các số lẻ trong mảng là: " + tinhTongSoLe(a));
					break;
				case 3:
					System.out.println("Đếm số dương trong mảng: " + demSoDuong(a));
					break;
				case 4:
					System.out.println("Số nhỏ nhất trong mảng là: " + timSoNhoNhat(a));
					break;
				case 5:
					System.out.println("Số dương nhỏ nhất trong mảng là: " + timSoDuongNhoNhat(a));
					break;
				case 6:
					System.out.println("Số chẵn cuối cùng trong mảng là: " + timSoChanCuoiCung(a));
					break;
				case 7:
					System.out.println("Số chẵn đầu tiên trong mảng là: " + timSoChanDauTien(a));
					break;
				case 8:
					System.out.println("số nguyên tố đầu tiên trong mảng là: " + timSoNguyenToDauTien(a));
					break;
				case 9:
					System.out.println("Số dương cuối cùng trong mảng là: " + timSoDuongCuoiCung(a));
					break;
				case 10:
					System.out.println("Giá trị chẵn nhỏ nhất trong mảng là: " + timSoChanNhoNhat(a));
					break;
				case 0:
					System.out.println("Thoát chương trình.");
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
					break;
			}
			
		}while(luaChon != 0);
	}
	
	// 1. Tổng các só dương
	public static int tinhTong(int[] a) {
		int tong = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				tong += a[i];				
			}
		}
		return tong;
	}
	
	// 2. Tính tổng các số lẻ
	public static int tinhTongSoLe(int[] a) {
		int tong = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 1) {
				tong += a[i];
			}
		}
		return tong;
	}
	
	// 3. Đếm có bao nhiêu số dương
	public static int demSoDuong(int[] a) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				++count;
			}
		}
		return count;
	}
	
	// 4. Tìm số nhỏ nhất trong mảng
	public static int timSoNhoNhat(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	// 5. Tìm số dương nhỏ nhất trong mảng
	public static int timSoDuongNhoNhat(int[] a) {
		int min = -1;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 0 && (a[i] < min || min == -1)) {
				min = a[i];
			}
		}
		return min;
	}
	
	// 6. Tìm số chẵn cuối cùng
	public static int timSoChanCuoiCung(int[] a) {
		int soChanCuoiCung = -1;
		for(int i = a.length - 1; i >= 0; i--) {
			if(a[i] % 2 == 0) {
				soChanCuoiCung = a[i];
				break;
			}
		}
		return soChanCuoiCung;
	}
	
	// 7. Viết hàm tìm số chẵn đầu tiên
	public static int timSoChanDauTien(int[] a) {
		int soChanDauTien = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				soChanDauTien = a[i];
				break;
			}
		}
		return soChanDauTien;
	}
	
	// Hàm kiểm tra số nguyên tố
	public static boolean timSoNguyenTo(int n) {
		if(n <= 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// 8. Tìm số nguyên tố đầu tiên
	public static int timSoNguyenToDauTien(int[] a) {
	    int soNguyenToDauTien = -1;
	    for (int i = 0; i < a.length; i++) {
	        if (timSoNguyenTo(a[i])) {
	            soNguyenToDauTien = a[i];
	            break;
	        }
	    }
	    return soNguyenToDauTien;
	}
	
	// 9. Tìm số dương cuối cùng
	public static int timSoDuongCuoiCung(int[] a) {
	    int soDuongCuoiCung = -1;
	    for (int i = a.length - 1; i >= 0; i--) {
	        if (a[i] > 0) {
	            soDuongCuoiCung = a[i];
	            break;
	        }
	    }
	    return soDuongCuoiCung;
	}
	
	//10. Hãy tìm giá trị chẵn nhỏ nhất
	public static int timSoChanNhoNhat(int[] a) {
	    int soChanNhoNhat = -1;
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] % 2 == 0 && (a[i] < soChanNhoNhat || soChanNhoNhat == -1)) {
	            soChanNhoNhat = a[i];
	        }
	    }
	    return soChanNhoNhat;
	}
	
}
