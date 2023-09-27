package demo_jv04;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị 2 cạnh góc vuông: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double canhHuyen = Math.sqrt(a*a + b*b);
		System.out.println("Giá trị cạnh huyền là: " + canhHuyen);
	}
}
