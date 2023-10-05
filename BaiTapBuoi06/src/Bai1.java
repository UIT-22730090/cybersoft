import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
//		Xây dựng chương trình trò chơi Oẳn Tù Tì (bao, búa, kéo). 
//		Người và máy sẽ chơi với nhau. Nhấn một số khác 0 để chơi tiếp, 
//		nhấn 0 để dừng. Tính xem ai sẽ là người thắng nhiều nhất và tỉ số là bao nhiêu.
		
		Scanner sc = new Scanner(System.in);
		int nguoiThang = 0;
		int mayThang = 0;
		
		while(true) {
			System.out.println("Lựa chọn của bạn(1. Bao, 2. Búa, 3. Kéo, 0.Dừng): ");
			int luaChonNguoi = sc.nextInt();
			if(luaChonNguoi == 0) {
				break;
			}else if(luaChonNguoi < 0 || luaChonNguoi > 3) {
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				continue;
			}
			
			int luaChonMay = (int)(Math.random()* 3 + 1);
			System.out.println("Lựa chọn của máy: " + luaChonMay);
			
			if(luaChonNguoi == luaChonMay) {
				System.out.println("Hòa.");
			} else if ((luaChonNguoi == 1 && luaChonMay == 2) ||
					   (luaChonNguoi == 2 && luaChonMay == 3) ||
					   (luaChonNguoi == 3 && luaChonMay == 1)) {
				System.out.println("Bạn thắng.");
				nguoiThang++;
			} else {
				System.out.println("Máy thắng.");
				mayThang++;
			} 
		}
		System.out.println("Tổng số trận bạn thắng: " + nguoiThang);
		System.out.println("Tổng số trận máy thắng: " + mayThang);
		if(nguoiThang == mayThang) {
			System.out.println("Trò chơi hòa!");
		} else if(nguoiThang > mayThang) {
			System.out.println("Xin chúc mừng bạn đã thắng cuộc chơi!");
		} else {
			System.out.println("Máy đã thắng cuộc. Đừng buồn nhé! ");
		}
		
	}
}
