package demo_jv04;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num[] = new double[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Nhập số thứ " + (i + 1) + ": ");
			num[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += num[i];
		}
		
		double result = sum / 5;
		System.out.println("Giá trị trung bình của năm số là: " + result);
	}
}
