package Bai3;

public class Test {
	public static void main(String[] args) {
		Account account1 = new Account(1001, "Nguyễn Văn A");
		Account account2 = new Account(1002, "Trần Thị B");

		// In thông tin tài khoản ban đầu
		System.out.println("Thông tin tài khoản 1:");
		System.out.println(account1);

		System.out.println("Thông tin tài khoản 2:");
		System.out.println(account2);

		// Nạp tiền vào tài khoản 1 và rút tiền từ tài khoản 2
		account1.napTien(1000);
		account2.rutTien(200);

		// In thông tin sau khi thực hiện giao dịch
		System.out.println("\nThông tin tài khoản 1 sau giao dịch:");
		System.out.println(account1);

		System.out.println("Thông tin tài khoản 2 sau giao dịch:");
		System.out.println(account2);

		// Đáo hạn tài khoản 1
		account1.daoHan();

		// In thông tin sau khi đáo hạn
		System.out.println("\nThông tin tài khoản 1 sau đáo hạn:");
		System.out.println(account1);

		// Chuyển khoản từ tài khoản 1 sang tài khoản 2
		account1.chuyenKhoan(account2, 500);

		// In thông tin sau giao dịch chuyển khoản
		System.out.println("\nThông tin tài khoản 1 sau chuyển khoản:");
		System.out.println(account1);

		System.out.println("Thông tin tài khoản 2 sau chuyển khoản:");
		System.out.println(account2);
	}
}
