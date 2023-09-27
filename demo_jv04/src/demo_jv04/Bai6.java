package demo_jv04;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số tiền USD: ");
		double usd = sc.nextDouble();
		double vnd = usd * 23.500;
		System.out.println("Giá trị VNĐ sau khi đổi: " + Math.round(vnd * 1000) + " đồng");
	}
}
