import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		// Tìm số nguyên dương n nhỏ nhất sao cho: 1 + 2 +...+ n > 10000
        
		int n = 1;
		int tong = 0;
		while(tong <= 10000) {
			tong += n;
			n++;
		}
		System.out.println("n nhỏ nhất sao cho 1 + 2 +...+ n > 10000 là: " + n);
		
	}
}
