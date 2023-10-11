import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale lc = new Locale("vi", "VN");
		NumberFormat numf = NumberFormat.getInstance(lc);
		System.out.println("-----Chương trình tính tiền Grab-----");
		System.out.println("Chọn loại xe(1: Grab Car, 2: Grab Suv, 3: Grab Black): ");
		int loaiXe = sc.nextInt();
		System.out.println("Nhập số km đi được: ");
		double soKm = sc.nextDouble();
		System.out.println("Nhập thời gian di chuyển(phút):  ");
		int thoiGian = sc.nextInt();
		
		double giaKmDauTien = 0;
		double giaKm1Den19 = 0;
		double giaKmTren19 = 0;
		double giaThoiGian = 0;
		
		// Grab Car
		if(loaiXe == 1) {
			giaKmDauTien = 8000;
			giaKm1Den19 = 7500;
			giaKmTren19 = 7000;
			giaThoiGian = 2000 / 3;
		}
		// Grab SUV
		else if(loaiXe == 2) {
			giaKmDauTien = 9000;
			giaKm1Den19 = 8500;
			giaKmTren19 = 8000;
			giaThoiGian = 3000 / 3;
		}
		// Grab Black
		else if(loaiXe == 3) {
			giaKmDauTien = 10000;
			giaKm1Den19 = 9500;
			giaKmTren19 = 9000;
			giaThoiGian = 3500 / 3;
		}
		else {
			System.out.println("Lựa chọn không hợp lệ");
			return;
		}
		
		double tongTien = 0;
		if(soKm <= 1) {
			tongTien = giaKmDauTien * soKm;
		} else if(soKm > 1 && soKm <= 19) {
			tongTien = giaKmDauTien + (soKm - 1) * giaKm1Den19;
		} else {
			tongTien = giaKmDauTien + 18 * giaKm1Den19 + (soKm - 19) * giaKmTren19;
		}
		
		tongTien += thoiGian * giaThoiGian;
		
		System.out.println("Tổng tiền cần trả: " + numf.format(tongTien) + "đ");
	}
}
