import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số tiền gửi ban đầu: ");
		double soTienBanDau = sc.nextDouble();
		
		System.out.println("Nhâp số tiền mong muốn trong tương lai: ");
		double soTienMongMuon = sc.nextDouble();
		
		System.out.println("Nhập tỷ lệ lãi xuất hàng năm "
				+ "(dưới dạng số thập phân, ví dụ: 0,06 cho 6%): ");
		double tyLeLaiXuat = sc.nextDouble();
		
		double soNamChoDoi = Math.log(soTienMongMuon / soTienBanDau)
				/ Math.log(1 + tyLeLaiXuat);
		System.out.println("Số năm bạn phải chờ đợi là: " + Math.round(soNamChoDoi));
	}
}
