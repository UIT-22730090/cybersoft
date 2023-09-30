import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		// Viết chương trình nhập vào thông tin mặt hàng gồm tên, số lượng, đơn giá.
		// Tính và xuất tiền phải trả dựa theo quy tắc: nếu mua số lượng 50 đến 100
		// sẽ được giảm 8%, mua với số lượng trên 100 thì số lượng từ 100 trở đi 
		// sẽ được giảm 12%.
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên mặt hàng: ");
		String ten = sc.nextLine();
		System.out.println("Nhập số lượng mặt hàng: ");
		int soLuong = sc.nextInt();
		System.out.println("Nhập giá mặt hàng: ");
		double gia = sc.nextDouble();
		
		double giaTienPhaiTra;
		// mua số lượng 1 đến 49
		if(soLuong > 0 && soLuong < 50) {
			giaTienPhaiTra = gia * soLuong;
			System.out.println("Giá tiền phải trả cho " + ten + " là: " + giaTienPhaiTra);
		}
		// mua số lượng 50 đến 100 sẽ được giảm 8%
		else if(soLuong >= 50 && soLuong <=100) {
			giaTienPhaiTra = (gia * soLuong) * 0.92;
			System.out.println("Giá tiền phải trả cho " + ten + " là: " + giaTienPhaiTra);
		}
		// mua số lượng trên 100 thì số lượng từ 100 trở đi sẽ được giảm 12%
		else if(soLuong >= 100) {
			giaTienPhaiTra = (gia * soLuong) * 0.88;
			System.out.println("Giá tiền phải trả cho " + ten + " là: " + giaTienPhaiTra);
		}
		
	}
}
