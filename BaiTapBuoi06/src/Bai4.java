import java.util.Scanner;

public class Bai4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị x: ");
		int x = sc.nextInt();
		
		System.out.println("Nhập giá trị n: ");
		int n = sc.nextInt();
		
		int tong = tinhTong(x, n);
		
		System.out.println("Tổng S(n) = " + tong);
	}
	
	public static int tinhTong(int x, int n) {
		int tong = 0;
		int cnt = 1;
		for(int i = 1; i <= n; i++) {
			cnt *= x;
			tong += cnt;
		}
		
		return tong;
	}
}
