package demo_jv04;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên dương n: ");
		int n = sc.nextInt();
		int donVi = n%10;
		int hangChuc = n/10;
		int result = donVi + hangChuc;
		System.out.println("Tổng 2 kí tự của n: " + result);
	}
}
