package demo_jv04;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số thực a: ");
		double a = scanner.nextDouble();
		System.out.println("Nhập số nguyên không âm n: ");
		int n = scanner.nextInt();	
		double result = a * Math.pow(8, n);
		System.out.println("P(x) = " + result);
	}
}
